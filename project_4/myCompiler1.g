grammar myCompiler;

options {
    language = Java;
}

@header {
    // import packages here
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    List<String> DataCode =  new ArrayList<String>();
    List <String> TextCode = new ArrayList<String>();
    HashMap<String, Integer> symtab = new HashMap<String, Integer>();
    ArrayList<String> regTextLookUp = new ArrayList<String>();
    
    boolean TRACEON =  false;
    int labelCount =  0;

    /* attribute type:
        1 => integer,
        2 => float,
        3 => string constant,
        -1 => do not exist,
        -2 => error 
     */

     public static register reg = new register(0,9);
    
     // output prologue
     void prologue(String id) {
         TextCode.add("\n\n/* Text Section */");
         TextCode.add("\t.section .text");
         TextCode.add("\t.global " + id);
         TextCode.add("\t.type " + id + ",@function");
         TextCode.add(id + ":");

        // Follow x86 calling convention
        TextCode.add("\t pushq \%rbp");
        TextCode.add("\t movq \%rsp,\%rbp");
        TextCode.add("\t pushq \%rbx"); //callee saved registers.
        TextCode.add("\t pushq \%r12"); //callee saved registers.
        TextCode.add("\t pushq \%r13"); //callee saved registers.
        TextCode.add("\t pushq \%r14"); //callee saved registers.
        TextCode.add("\t pushq \%r15"); //callee saved registers.
        TextCode.add("\t subq $8,\%rsp\n"); // aligned 16-byte boundary.
     }
    
    // output epilogue
    void epilogue() {
       // handle epilogue 
       
       // Follow x86 calling convention
       TextCode.add("\n\t addq $8,\%rsp");
       TextCode.add("\t popq \%r15");
       TextCode.add("\t popq \%r14");
       TextCode.add("\t popq \%r13");
       TextCode.add("\t popq \%r12");
       TextCode.add("\t popq \%rbx");
       TextCode.add("\t popq \%rbp");
       TextCode.add("\t movl $0, \%eax");
	   TextCode.add("\t ret");
    }

    // generate a new label
    String newLabel() {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    }

    public List<String> getDataCode() {
       return DataCode;
    } 

    public List<String> getTextCode() {
       return TextCode;
    }  
}


// main program
program: {
    for(int i=8;i<16;i++) regTextLookUp.add("r"+i+"d");
} declarations functions;

functions : function functions
|;

function: type Identifier '(' ')' '{' {
        prologue($Identifier.text);  // output function prologue
    } l_declarations statements '}' {
	    if (TRACEON) System.out.println("type Identifier () {l_declarations statements}");	  
	     epilogue();    // output function epilogue
	    };

// global declarations
declarations: 
  type Identifier ';' declarations {
	   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
  	   if (symtab.containsKey($Identifier.text)) {
		      System.out.println("Type Error: line: " + $Identifier.getLine() + ": Redeclared identifier: " + $Identifier.text );
	      } 
        else {
		      symtab.put($Identifier.text, $type.attr_type);	   
	      }

        // code generation
        switch($type.attr_type) {
		case 1: // Type: integer, size=> 4 bytes, alignment=> 4 byte boundary
		    DataCode.add("\t.common " + $Identifier.text + ",4,4\n");
			break;
		default:
		}
	}
	| { if (TRACEON) System.out.println("declarations: "); };

l_declarations: type Identifier ';' l_declarations {
      if (TRACEON) System.out.println("l_declarations: type Identifier ';' l_declarations");
    }
    |;

// datatype: int float
type returns [int attr_type]: 
    INT { 
        if (TRACEON) System.out.println("type: INT");
        $attr_type=1; 
    }
  | FLOAT {
      if (TRACEON) System.out.println("type: FLOAT");
  };

// statements can be statements after another or epsilon
statements :statement statements
	|;

// statement ex: a=b+c; if-else while-loop printf ;
statement returns [int attr_type]: 
    Identifier '=' (case_assign = arith_expression) ';' { 
        if(TRACEON) System.out.println("statement: Identifier '=' (case_assign = arith_expression) ';'");
	    if (symtab.containsKey($Identifier.text)) {
            $attr_type = symtab.get($Identifier.text);
        } 
        else { // error
            System.out.println("Type Error: " + $arith_expression.start.getLine() + ": " + $Identifier.text + ": Not declared.");
            $attr_type = -2;
        }
        if ($attr_type != $arith_expression.attr_type) {
            System.out.println("Type Error: " + $arith_expression.start.getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
            $attr_type = -2;
        }
        TextCode.add("\t movl " + "\%" + regTextLookUp.get($case_assign.reg_num) + "," + $Identifier.text + "(\%rip)");
    }
  | IF '(' (case_if = arith_expression) ')' {
        if(TRACEON) System.out.println("statement: IF '(' (case_if = arith_expression) ')'"); 
        TextCode.add("\t cmpl " + "$0, " + "\%" + regTextLookUp.get($case_if.reg_num));
        String L = newLabel();
        TextCode.add("\t je " + L);
      } ifelse_statements {
        TextCode.add(L + ":");
      }
  | WHILE '(' Identifier ')' {
        if(TRACEON) System.out.println("statement: WHILE '(' Identifier ')'");
        String L_loop_start = newLabel();
        String L_loop_break = newLabel();
        TextCode.add(L_loop_start + ":");
        TextCode.add("\t cmpl " + "$0, " + $Identifier.text + "(\%rip)");
        TextCode.add("\t je " + L_loop_break);
      } ifelse_statements {
        TextCode.add("\t jmp " + L_loop_start);
        TextCode.add(L_loop_break + ":");
      }
  | print_statement {
      if(TRACEON) System.out.println("statement: print_statement");
  };

// arithmetic expression: + - * /
arith_expression returns [int attr_type, int reg_num, String str]: a = multExpr { 
    if (TRACEON) System.out.println("arith_expression: multExpr ( ADD_OP multExpr| SUB_OP multExpr | EQ_OP multExpr | LE_OP multExpr | GE_OP multExpr | NE_OP multExpr | GREATER_OP multExpr | LESS_OP multExpr)*");
    $attr_type = $a.attr_type;
	$reg_num = $a.reg_num;
	$str = $a.str; 
}
    ( ADD_OP b = multExpr { 
        if ($a.attr_type != $b.attr_type) {
			System.out.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator + in an expression.");
		    $attr_type = -2;
        }
        TextCode.add("\t addl " + "\%" + regTextLookUp.get($b.reg_num) + ", \%" + regTextLookUp.get($reg_num)); // code generation
    }
    | SUB_OP c = multExpr {
        if ($a.attr_type != $c.attr_type) {
			System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator + in an expression.");
		    $attr_type = -2;
		}
        TextCode.add("\t subl " + "\%" + regTextLookUp.get($c.reg_num) + ", \%" + regTextLookUp.get($reg_num));
    }
)* ;

// multiplication and division: ex: (+-8)*(+-2) (+-8)/(+-2)
multExpr returns [int attr_type, int reg_num, String str]: a = signExpr { 
    if (TRACEON) System.out.println("multExpr: signExpr ( MUL_OP signExpr | DIV_OP signExpr )*");
    $attr_type = $a.attr_type;
	$reg_num = $a.reg_num;
	$str = $a.str; 
}( MUL_OP b = signExpr {
        TextCode.add("\t imul \%" + regTextLookUp.get($b.reg_num) + ", \%" + regTextLookUp.get($a.reg_num));
    }
 | DIV_OP c = signExpr {
        TextCode.add("\t movl \%" + regTextLookUp.get($a.reg_num) + ", \%eax");
        TextCode.add("\t movl \%" + regTextLookUp.get($c.reg_num) + ", \%ecx");
        TextCode.add("\t cltd");
        TextCode.add("\t idivl \%ecx");
        TextCode.add("\t movl \%eax, \%" + regTextLookUp.get($a.reg_num));
    }
)*;

// sign of the number ex: +1 -1
signExpr returns [int attr_type, int reg_num, String str]: 
    primaryExpr { 
        if (TRACEON) System.out.println("signExpr: primaryExpr");
        $attr_type = $primaryExpr.attr_type;
        $reg_num = $primaryExpr.reg_num;
        $str = $primaryExpr.str;
    }
 | '-' primaryExpr { 
        if (TRACEON) System.out.println("signExpr: SUB_OP primaryExpr");
        TextCode.add("\t negl \%" + regTextLookUp.get($primaryExpr.reg_num));
        $attr_type = $primaryExpr.attr_type;
	    $reg_num = $primaryExpr.reg_num;
	    $str = $primaryExpr.str; 
    };

// expressions ex: 1 1.5 a (a==b)	  
primaryExpr returns [int attr_type, int reg_num, String str] : 
    Integer_constant { 
        if (TRACEON) System.out.println("primaryExpr: Integer_constant");
        $attr_type = -1;
        $str = null;
            
        // code generation
        $reg_num = reg.get();  // get an register
        TextCode.add("\t movl " + "\$" + $Integer_constant.text + ", \%" + regTextLookUp.get($reg_num)); 
    }
  | STRING_LITERAL {
        $attr_type =  3;
        $str =  $STRING_LITERAL.text;
    }
  | Identifier {
       if (TRACEON) System.out.println("primaryExpr: Identifier");
       if (symtab.containsKey($Identifier.text)) {
            $attr_type = symtab.get($Identifier.text);
            $str = null;
         
            /* code generation */
            $reg_num = reg.get(); /* get an register */
            TextCode.add("\t movl " + $Identifier.text + "(\%rip), \%" + regTextLookUp.get($reg_num));
	    } 
        else {
            System.out.println("Type Error: line: " + $Identifier.getLine() + ": " + $Identifier.text + ": not declared.");
            $attr_type = 0;
        }
    }
  | '(' arith_expression ')' { 
        if (TRACEON) System.out.println("primaryExpr: '(' arith_expression ')'");
        $attr_type = $arith_expression.attr_type; 
    };

// if statement ex: if (a==b) c=1; else c=2
ifelse_statements:
    statement
 | '{' statements '}';

// print function ex: printf("%d",a);
print_statement:
    'printf' '(' a=STRING_LITERAL ',' arith_expression  ')' ';' {
        String LC = newLabel();
        DataCode.add(LC + ":");
        DataCode.add("\t.string " + $a.text);
        TextCode.add("\t movl \%" + regTextLookUp.get($arith_expression.reg_num) + ", \%esi");
        TextCode.add("\t leaq " + LC + "(\%rip), \%rdi");
        TextCode.add("\t movl $0, \%eax");
        TextCode.add("\t call printf@PLT");
    } 
  |'printf' '(' b=STRING_LITERAL ')' ';' {
        String LC = newLabel();
        DataCode.add(LC + ":");
        DataCode.add("\t.string " + $b.text);
        TextCode.add("\t leaq " + LC + "(\%rip), \%rdi");
        TextCode.add("\t movl $0, \%eax");
        TextCode.add("\t call printf@PLT");
    };

/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR:'char';
CONST: 'const';
MAIN: 'main';
PRINTF: 'printf';
VOID: 'void';
IF: 'if';
ELSE_IF: 'else if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
BREAK:'break';
RETURN: 'return';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
ADD_ASS_OP : '+=';
SUB_ASS_OP : '-=';
MUL_ASS_OP : '*=';
DIV_ASS_OP : '/=';
MOD_ASS_OP : '%=';
AND_ASS_OP : '&=';
OR_ASS_OP  : '|=';
XOR_ASS_OP : '^=';
PP_OP : '++';
MM_OP : '--'; 
AND_OP : '&&'; 
OR_OP : '||'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
ARROW_OP: '->';
ASSIGN_OP : '=';
LESS_OP : '<';
GREATER_OP : '>';
BIT_AND_OP : '&';
BIT_OR_OP  : '|';
BIT_XOR_OP : '^';
ADD_OP  : '+';
SUB_OP  : '-';
DIV_OP  : '/';
MUL_OP  : '*';
MOD_OP  : '%';
COMMA_OP: ',';
DOT_OP: '.';
TRINARY_OP1: '?';
TRINARY_OP2: ':';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
// Literal_constant: '\"'(.)*'\"';
Character_constant: '\''(.)'\'';
STRING_LITERAL:  '"' ( EscapeSequence | ~('\\'|'"') )* '"';

fragment EscapeSequence:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT: ('/*' (options{greedy=false;}: .)* '*/') {$channel=HIDDEN;} | ('//'(.)*'\n') {$channel=HIDDEN;};
MACRO: '#'(.)*'\n' {$channel=HIDDEN;}; // Begin with '#' and end with \n
