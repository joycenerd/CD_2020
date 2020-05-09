grammar myparser;

options {
    language=Java;
}

@header {

}

@members {
boolean=TRACEON=true;
}

// main program
program: (VOID|INT) MAIN '(' .* ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println(program:(VOID|INT) MAIN '(' .* ')' '{' declarations statements '}'");};

// declaration ex: int a;
declarations: type dec_ids ';' declarations
            {if (TRACEON) System.out.println("declarations: type dec_ids ';' declarations");}
        |   {if (TRACEON) System.out.println("declarations: ");};

// constants ex: 1 2.4 'a'
constants: Integer_constant {if (TRACEON) System.out.println("constants: Integer_constant");}
        |  Floating_point_constant {if (TRACEON) System.out.println("constants: Floating_point_constant")}
        |  Character_constant {if (TRACEON) System.out.println("constants: Character_constant")};

// dec_ids ex: a a=1 a,b=2 a=1,b=2
dec_ids: Identifier {if (TRACEON) System.out.println("dec_ids: Identifier ( " $Identifier.text " )");} 
    |   Identifier '=' constants {if (TRACEON) System.out.println("dec_ids: Identifier '=' constants" + " ( " + $Identifier.text + " : " + $constants.text + " )");}   
    |   Identifier ',' dec_ids {if (TRACEON) System.out.println("dec_ids: Identifier ',' dec_ids ( " + $Identifier.text + " )");}
    |   Identifier '=' constants ',' dec_ids {if (TRACEON) System.out.println(if (TRACEON) System.out.println("dec_ids: Identifier '=' constants ',' dec_ids ( " + $Identifier.text + " : " + $constants.text + " )" );};

// datatype: int float char void
type: INT {if (TRACEON) System.out.println("type: INT);}
    |   FLOAT {if (TRACEON) System.out.println("type: FLOAT");}
    |   CHAR {if (TRACEON) System.out.println("type: CHAR");}
    |   VOID {if (TRACEON) System.out.println("type: VOID");};

// statements can be statements after another or epsilon
statements: statement statements {if (TRACEON) System.out.println("statements: statements statements);}
        |;

// arithmetic expression: + - * / == <= >= != < >
arithmetic_expression: multi_expr (
                        ADD_OP multi_expr   // +
                    |   SUB_OP multi_expr   // -
                    |   EQ_OP multi_expr    // ==
                    |   LE_OP multi_expr    // <=
                    |   GE_OP multi_expr    // >=
                    |   NE_OP multi_expr    // !=
                    |   GREATER_OP multi_expr   // >
                    |   LESS_OP multi_expr  //<
                )* {if (TRACEON) System.out.println("arith_expression: multExpr ( ADD_OP mult_expr| SUB_OP mult_expr | EQ_OP mult_expr | LE_OP mult_expr | GE_OP mult_expr | NE_OP mult_expr | GREATER_OP mult_expr | LESS_OP mult_expr)*");};

// unary operation: ++ --
unary_op: increment_op {if (TRACEON) System.out.println("unary: incrment_op");}
        |   decrement_op {if (TRACEON) System.out.println("unary: decrement_op");};

// increment: ex: a++ ++a
increment_op: ADD_ADD_OP Identifier {if (TRACEON) System.out,println("increment_op: ADD_ADD_OP Identifier");}
            |   Identifier ADD_ADD_OP {if (TRACEON) System.out.println("increment_op: Identifier ADD_ADD_OP");};

// increment: ex: a-- --a
decrement_op: SUB_SUB_OP Identifier {if (TRACEON) System.out,println("increment_op: SUB_SUB_OP Identifier");}
            |   Identifier SUB_SUB_OP {if (TRACEON) System.out.println("increment_op: Identifier SUB_SUB_OP");};

// multiplication and division: ex: (+-8)*(+-2) (+-8)/(+-2)
multi_expr: sign_expr (MUL_OP sign_expr | DIV_OP sign_expr)* {if (TRACEON) System.out.println("multi_expr: sign_expr (MUL_OP sign_expr | DIV_OP sign_expr)*");};


// sign of the number ex: +1 -1
sign_expr: primary_expr {if (TRACEON) System.out.println("sign_expr: primary_expr");}
        |   SUB_OP primary_expr {if (TRACEON) System.out.println("sign_expr: SUB_OP primary_expr");};

// expressions ex: 1 1.5 a (a==b)  
primary_expr: Integer_constant {if (TRACEON) System.out.println("primary_expr: Integer_constant");}
            |   Floating_constant {if (TRACON) System.out.println("primary_expr: Floating_constant");}
            |   Identifier {if (TRACEON) System.out.println("primary_expr: Identifier");}
            |   '(' arithmetic_expression ')' {if (TRACEON) System.out.println("primary_expr: '(' arithmetic_expression ')'")};

//  small statements ex: ++ -- a+b c=a+b
sub_statement: unary_op {if (TRACEON) System.out.println("sub_statement: unary_op");}
            |    arithmetic_expression {if (TRACEON) System.out.println("sub_statement: arith_expression");}
            |   Identifier ASSIGN_OP arithmetic_expression {if (TRACEON) System.out.println("sub_statement: Identifier ASSIGN_OP arith_expression ( " + $Identifier.text + " = " + $arith_expression.text + " )");};
    
// statement ex: a=b+c; if-else for-loop return 0;
statement: sub_statement ';' {if (TRACEON) System.out.println("statement: sub_statement ';'");}
        |   ifelse_statement {if (TRACEON) System.out.println("statement: ifelse_statement");}
        |   for_statements {if (TRACEON) System.out.println("statement: for_statement");}
        |   RETURN sub_statement ';' {if (TRACEON) System.out.println("statement: RETURN sub_statement ';'");};

// if statement ex: if (a==b) c=1; else c=2
ifelse_statements: IF '(' arithmetic_expression ')' block_of_statements (ELSE block_of_statements)? {if (TRACEON) System.out.println("ifelse_statements: IF '(' arithmetic_expression ')' block_of_statements (ELSE block_of_statements)?")};

// for statement ex: for(i=0;i<10;i++) a++
for_statements: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_statements {IF (TRACEON) System.out.println("for_statements: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_statements")};

block_of_statements: statement {if (TRACEON) System.out.println("block_of_statements: statement");}
                    |   '{' statements '}' {if (TRACEON) System.out.println("block_of_statements: '{' statements '}'");};