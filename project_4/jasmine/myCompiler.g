grammar myCompiler;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;

    // ============================================
    // Create a symbol table.
	// ArrayList is easy to extend to add more info. into symbol table.
	//
	// The structure of symbol table:
	// <variable ID, type, memory location>
	//    - type: the variable type   (please check "enum Type")
	//    - memory location: the location (locals in VM) the variable will be stored at.
    // ============================================
    HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();

    int labelCount = 0;
	
	
	// storageIndex is used to represent/index the location (locals) in VM.
	// The first index is 0.
	int storageIndex = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();

    // Type information.
    public enum Type{
       INT, FLOAT, CHAR;
    }


    /*
     * Output prologue.
     */
    void prologue()
    {
       TextCode.add(";.source");
       TextCode.add(".class public static myResult");
       TextCode.add(".super java/lang/Object");
       TextCode.add(".method public static main([Ljava/lang/String;)V");

       /* The size of stack and locals should be properly set. */
       TextCode.add(".limit stack 100");
       TextCode.add(".limit locals 100");
    }
    
	
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       TextCode.add("return");
       TextCode.add(".end method");
    }
    
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getTextCode()
    {
       return TextCode;
    }			
}

program: INT MAIN '(' ')'
        {
           /* Output function prologue */
           prologue();
        }

        '{' 
           declarations
           statements
        '}'
        {
		   if (TRACEON)
		      System.out.println("VOID MAIN () {declarations statements}");

           /* output function epilogue */	  
           epilogue();
        }
        ;


// int a = 0; float b = 3.1415
declarations
    :   type Identifier
            {
                if (TRACEON)
                System.out.println("declarations: type Identifier : declarations");

                if (symtab.containsKey($Identifier.text)) {
                // variable re-declared.
                System.out.println("Type Error: " + 
                                    $Identifier.getLine() + 
                                    ": Redeclared identifier.");
                System.exit(0);
                }
                
                /* Add ID and its attr_type into the symbol table. */
                ArrayList the_list = new ArrayList();
                the_list.add($type.attr_type);
                the_list.add(storageIndex); /*position*/
                storageIndex = storageIndex + 1;
                symtab.put($Identifier.text, the_list);
            } 
        ('=' arith_expression
            {
                //type checking   
                if ($type.attr_type!=$arith_expression.attr_type) {
                    System.out.println($type.attr_type+" "+ $arith_expression.attr_type);

                    System.out.println("assign_stmt:Type error!\n");
                    System.exit(0);
                }
                
                // issue store insruction:
                // => store the top element of the operand stack into the locals.

                switch ($type.attr_type) {
                case INT:
                    TextCode.add("  istore " + (storageIndex - 1));
                    break;
                case FLOAT:
                    TextCode.add("  fstore " + (storageIndex - 1));
                    break;
                }
            }
        )? ';' declarations
    | 
        {
            if (TRACEON)
            System.out.println("declarations: ");
        }
    ;


type
returns [Type attr_type]
    : INT { if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; }
    | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; }
	;

statements
    :statement statements
    |
    ;


// a>b a>=b a<b a<=b a==b a!=b	   
cond_expression
[String label]
returns [boolean truth]
    : a=arith_expression
        {
            if ($a.attr_type.ordinal() != 0)
                truth = true;
            else
                truth = false;
        }
    ( RelationOP b=arith_expression
        { 
            if($a.attr_type!=$b.attr_type){
                System.out.println("cond_expression:Type error!\n");
                System.exit(0);
            }
            
            
            if($a.attr_type==Type.INT){
                if($RelationOP.text.equals(">")){
                    TextCode.add("  if_icmple "+label);
                }else if($RelationOP.text.equals(">=")){
                    TextCode.add("  if_icmplt "+label);
                }else if($RelationOP.text.equals("<")){
                    TextCode.add("  if_icmpge "+label);
                }else if($RelationOP.text.equals("<=")){
                    TextCode.add("  if_icmpgt "+label);
                }else if($RelationOP.text.equals("==")){
                    TextCode.add("  if_icmpne "+label);
                }else if($RelationOP.text.equals("!=")){
                    TextCode.add("  if_icmpeq "+label);
                }
            }else if($a.attr_type==Type.FLOAT){
                TextCode.add("  fcmpl");
                if($RelationOP.text.equals(">")){
                    TextCode.add("  ifle "+label);
                }else if($RelationOP.text.equals(">=")){
                    TextCode.add("  iflt "+label);
                }else if($RelationOP.text.equals("<")){
                    TextCode.add("  ifge "+label);
                }else if($RelationOP.text.equals("<=")){
                    TextCode.add("  ifgt "+label);
                }else if($RelationOP.text.equals("==")){
                    TextCode.add("  ifne "+label);
                }else if($RelationOP.text.equals("!=")){
                    TextCode.add("  ifeq "+label);
                }
            }

        }
    )*
    ;


// a>>1: a right shift one bit (multiple) a<<1: a left shift one bit (division)		   
arith_expression
returns [Type attr_type]
    : a=addExpr { $attr_type = $a.attr_type; }
        ( '<<' b=addExpr
            {
                // We need to do type checking first.
                // ...
                if ($attr_type != $b.attr_type) {
                    System.out.println("＋:Type error!\n");
                    System.exit(0);
                }
                
                // code generation.
                if (($attr_type == Type.INT) && ($b.attr_type == Type.INT)){
                    TextCode.add("  ldc 2");
                    TextCode.add("  imul");
                    TextCode.add("  imul");
                }
                else if(($attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT)){
                    TextCode.add("  ldc 2");
                    TextCode.add("  fmul");
                    TextCode.add("  fdiv");
                }
            
            }
        | '>>' c=addExpr
        {
                // We need to do type checking first.
                if ($attr_type != $c.attr_type) {
                    System.out.println("-:Type error!\n");
                    System.exit(0);
                }
                
                // code generation.
                if (($attr_type == Type.INT) && ($c.attr_type == Type.INT))
                    TextCode.add("  isub");
                else if(($attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                    TextCode.add("  fsub");
            
            }
        )*
    ;


// a+b a-b
addExpr
returns [Type attr_type]
    : a=multExpr { $attr_type = $a.attr_type; }
        ( '+' b=multExpr
            {
                // We need to do type checking first.
                // ...
                if ($attr_type != $b.attr_type) {
                    System.out.println("＋:Type error!\n");
                    System.exit(0);
                }
                
                // code generation.
                if (($attr_type == Type.INT) && ($b.attr_type == Type.INT))
                    TextCode.add("  iadd");
                else if(($attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                    TextCode.add("  fadd");
            
            }
        | '-' c=multExpr
        {
                // We need to do type checking first.
                if ($attr_type != $c.attr_type) {
                    System.out.println("-:Type error!\n");
                    System.exit(0);
                }
                
                // code generation.
                if (($attr_type == Type.INT) && ($c.attr_type == Type.INT))
                    TextCode.add("  isub");
                else if(($attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                    TextCode.add("  fsub");
            
            }
        )*
    ;


// a*b a*b a%b
multExpr
returns [Type attr_type]
    : a=signExpr { $attr_type=$a.attr_type; }
    ( '*' b=signExpr
        {
            if ($attr_type != $b.attr_type) {
                System.out.println("*:Type error!\n");
                System.exit(0);
            }
            if (($attr_type == Type.INT) && ($b.attr_type == Type.INT))
                TextCode.add("  imul");
            else if(($attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                TextCode.add("  fmul");
        }
    | '/' c=signExpr
        {
            if ($attr_type != $c.attr_type) {
                System.out.println("/:Type error!\n");
                System.exit(0);
            }
            if (($attr_type == Type.INT) && ($c.attr_type == Type.INT))
                TextCode.add("  idiv");
            else if(($attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                TextCode.add("  fdiv");
        }
    |   '\%' c=signExpr
        {
            if ($attr_type != $c.attr_type) {
                System.out.println("/:Type error!\n");
                System.exit(0);
            }
            if (($attr_type == Type.INT) && ($c.attr_type == Type.INT))
                TextCode.add("  irem");
            else if(($attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                TextCode.add("  frem");
        }
    )*
    ;

// a -a
signExpr
returns [Type attr_type]
    : a=primaryExpr { $attr_type=$a.attr_type; } 
    | '-' b=primaryExpr
        {
            if ($attr_type != $b.attr_type) {
                System.out.println("sign:Type error!\n");
                System.exit(0);
            }
            if (($attr_type == Type.INT) && ($b.attr_type == Type.INT))
                TextCode.add("  ineg");
            else if(($attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                TextCode.add("  fneg");
        }
    ;
		  
primaryExpr
returns [Type attr_type] 
    : Floating_point_constant
        {
            $attr_type = Type.FLOAT;
            TextCode.add("  ldc " + $Floating_point_constant.text);
        }
    | Integer_constant
        {
            $attr_type = Type.INT;
            TextCode.add("  ldc " + $Integer_constant.text);
        }
    
    | Identifier
        {
            // get type information from symtab.
            $attr_type = (Type) symtab.get($Identifier.text).get(0);
            switch ($attr_type) {
            case INT: 
                        // load the variable into the operand stack.
                        TextCode.add("  iload " + symtab.get($Identifier.text).get(1));
                        break;
            case FLOAT:
                        TextCode.add("  fload " + symtab.get($Identifier.text).get(1));
                        break;
            
            }
        }
    | '&' Identifier
        {
            $attr_type = (Type) symtab.get($Identifier.text).get(0);
            TextCode.add("  ldc " + symtab.get($Identifier.text).get(1));
        }
    | '(' arith_expression ')'
        {
            $attr_type = (Type)$arith_expression.attr_type;
        }
    ;


statement
    : assign_stmt { TextCode.add($assign_stmt.code); } ';'
    | if_stmt
    | func_no_return_stmt ';'
    | for_stmt
    | while_stmt
    | printf
    | RETURN Integer_constant ';'
    ;


// a=b+c a++ a-- ++a --a
assign_stmt
returns [String code]
:   Identifier '=' arith_expression
        {

            Type the_type;
            int the_mem;
            
            // get the ID's location and type from symtab.			   
            the_type = (Type) symtab.get($Identifier.text).get(0);
            the_mem = (int) symtab.get($Identifier.text).get(1);
            
            if (the_type!=$arith_expression.attr_type) {
                System.out.println(the_type+" "+ $arith_expression.attr_type);

                System.out.println("assign_stmt:Type error!\n");
                System.exit(0);
            }
            // issue store insruction:
            // => store the top element of the operand stack into the locals.
            switch (the_type) {
            case INT:
                code="  istore " + the_mem;
                break;
            case FLOAT:
                code="  fstore " + the_mem;
                break;
            }
            
        }
    | '++' Identifier
        {
            // get type information from symtab.
            Type the_type = (Type) symtab.get($Identifier.text).get(0);
            int the_mem = (int) symtab.get($Identifier.text).get(1);

            code="  ldc 1";
            switch (the_type) {
            case INT: 
                        // load the variable into the operand stack.
                        code+="\n  iload " + symtab.get($Identifier.text).get(1);
                        code+="\n  iadd";
                        break;
            case FLOAT:
                        code+="\n  fload " + symtab.get($Identifier.text).get(1);
                        code+="\n  fadd";
                        break;
            }
            code+="\n  istore " + the_mem;
        }
    | '--' Identifier
        {
            // get type information from symtab.
            Type the_type = (Type) symtab.get($Identifier.text).get(0);
            int the_mem = (int) symtab.get($Identifier.text).get(1);

            switch (the_type) {
            case INT: 
                        // load the variable into the operand stack.
                        code="  iload " + symtab.get($Identifier.text).get(1);
                        code+="\n  ldc 1";
                        code+="\n  isub";
                        break;
            case FLOAT:
                        code="  fload " + symtab.get($Identifier.text).get(1);
                        code+="\n  ldc 1";
                        code+="\n  fsub";
                        break;
            }
            code+="\n  istore " + the_mem;
        }
    | Identifier '++'
        {
            // get type information from symtab.
            Type the_type = (Type) symtab.get($Identifier.text).get(0);
            int the_mem = (int) symtab.get($Identifier.text).get(1);

            code="  ldc 1";
            switch (the_type) {
            case INT: 
                        // load the variable into the operand stack.
                        code+="\n  iload " + symtab.get($Identifier.text).get(1);
                        code+="\n  iadd";
                        break;
            case FLOAT:
                        code+="\n  fload " + symtab.get($Identifier.text).get(1);
                        code+="\n  fadd";
                        break;
            }
            code+="\n  istore " + the_mem;
        }
    |  Identifier '--'
        {
            // get type information from symtab.
            Type the_type = (Type) symtab.get($Identifier.text).get(0);
            int the_mem = (int) symtab.get($Identifier.text).get(1);

            switch (the_type) {
            case INT: 
                        // load the variable into the operand stack.
                        code="  iload " + symtab.get($Identifier.text).get(1);
                        code+="\n  ldc 1";
                        code+="\n  isub";
                        break;
            case FLOAT:
                        code="  fload " + symtab.get($Identifier.text).get(1);
                        code+="\n  ldc 1";
                        code+="\n  fsub";
                        break;
            }
            code+="\n  istore " + the_mem;
        }
    ;


// if (a>0) statemens else
if_stmt
@init{ String next; String elseLable;}
    :   { next=newLabel(); elseLable=newLabel(); }
        IF '(' cond_expression[elseLable] ')' 
        block_stmt { TextCode.add("  goto "+next);TextCode.add(elseLable+":");}
        (ELSE block_stmt)? 
        { TextCode.add(next+":"); } 
    ;


func_no_return_stmt: Identifier '(' argument ')'
                   ;



// for(i=0;i<10;i++)
for_stmt
@init{ String next; String loopLable;}
    :   { next=newLabel(); loopLable=newLabel();}
        FOR '(' a=assign_stmt {TextCode.add($a.code);} ';' { TextCode.add(loopLable+":");}
        cond_expression[next] ';'
        b=assign_stmt')'
        block_stmt
        { TextCode.add($b.code); TextCode.add("  goto "+loopLable); TextCode.add(next+":");}
    ;

// while(i<10)
while_stmt
@init{ String next; String loopLable;}
:   { next=newLabel(); loopLable=newLabel(); TextCode.add(loopLable+":");}
        'while' '(' cond_expression[next] ')' block_stmt
        { TextCode.add("  goto "+loopLable); TextCode.add(next+":");}
    ;


// multiple statements		  
block_stmt
    : '{' statements '}' 
	;


// printf("this is an integer: %d\n",a); printf("this is pi: %f\n", b);
printf
@init {String str;int ind_prev;int len;}
    :   'printf' '(' STRING_LITERAL {  ind_prev=1; str=$STRING_LITERAL.text;len=str.length();}
         (',' {TextCode.add("  getstatic java/lang/System/out Ljava/io/PrintStream;");} 
        a=arith_expression 
            {
                //type checking
                Type expType;

                //find \%
                int ind=str.indexOf('\%',ind_prev);

                //print String
                if(ind-ind_prev>0 && ind<len-1 ){
                    String s=str.substring(ind_prev,ind);
                    TextCode.add("  getstatic java/lang/System/out Ljava/io/PrintStream;");
                    TextCode.add("  ldc \""+s+"\"");
                    TextCode.add("  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
                }

                //print variable
                ind_prev=ind+2;
                switch(str.charAt(ind+1)){
                    case 'd':
                        if($a.attr_type!=Type.INT){
                            System.out.println("printf:Type error!\n");
                            System.exit(0);
                        }
                        TextCode.add("  invokevirtual java/io/PrintStream/print(I)V");
                        break;
                    case 'f':
                        if($a.attr_type!=Type.FLOAT){
                            System.out.println("printf:Type error!\n");
                            System.exit(0);
                        }
                        TextCode.add("  invokevirtual java/io/PrintStream/print(F)V");
                        break;
                }
            } 
     )* ')' ';'
     {
        if(ind_prev<(len-1)){
            String s=str.substring(ind_prev,len-1);
            TextCode.add("  getstatic java/lang/System/out Ljava/io/PrintStream;");
            TextCode.add("  ldc \""+s+"\"");
            TextCode.add("  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        }
     }
    ;



argument: arg (',' arg)*
        ;

arg: arith_expression
   | STRING_LITERAL
   ;

		   
/* description of the tokens */
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
   	;


FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
Integer_constant:'0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};



fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;