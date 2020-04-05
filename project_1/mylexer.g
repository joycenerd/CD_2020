lexer grammar mylexer;

options {
    language=Java;
}


/*---------- */
/* Keywords  */
/*---------- */

INT_TYPE:'int';
CHAR_TYPE:'char';
VOID_TYPE:'void';
UNSIGNED_TYPE:'unsigned';
LONG_TYPE:'long';
CONST_TYPE:'const';
FLOAT_TYPE:'float';
DOUBLE_TYPE:'double';
IF_:'if';
ELSE_:'else';
FOR_:'for';
WHILE_:'while';
DO_:'do';
GOTO_:'goto';
STRUCT_:'struct';
TYPEDEF_:'typedef';


/*------------------- */
/* Compound Operators */
/*------------------- */

LE_OP:'<=';
GE_OP:'>=';
EQ_OP:'==';
NE_OP:'!=';
ADDEQ_OP:'+=';
ADD_ADD_OP:'++';
SUBEQ_OP:'-=';
SUB_SUB_OP:'--';
MULEQ_OP:'*=';
DIVEQ_OP:'/=';
MODEQ_OP:'%=';
AND_OP:'&&';
OR_OP:'||';
ANDEQ_OP:'&=';
OREQ_OP:'|=';
XOREQ_OP:'^=';
RSHIFT_OP:'<<';
LSHIFT_OP:'>>';
MEM_SELECT_OP:'->';
ASSIGN_OP:'=';
LESS_OP:'<';
GREATER_OP:'>';
ADD_OP:'+';
SUB_OP:'-';
MUL_OP:'*';
DIV_OP:'/';
MOD_OP:'%';
BIT_AND_OP:'&';
BIT_OR_OP:'|';
BIT_XOR_OP:'^';
DOT_OP:'.';
COMMA_OP:',';
TERNARY_OP1:'?';
TERNARY_OP2:':';


/* ---------------------- */
/* Structure and Indexing */
/* ---------------------- */

L_PARANTHESIS:'(';
R_PARANTHESIS:')';
L_BRACKET:'{';
R_BRACKET:'}';
L_SQUARE_RBRACKET:'[';
R_SQUARE_BRACKET:']';


/*-------------------*/
/* Numeric Constants */
/*-------------------*/

ID:(LETTER)(LETTER | DIGIT)*; 
INT_NUM:ZERO | (POSITIVE_DIGIT)(DIGIT)*; // e.g. 1, 100, 0
FLOAT_NUM:(FLOAT_NUM1 | FLOAT_NUM2)(LETTER)*; // e.g. 0.1f, 1.0L
DEC_NUM : ('0' | ('1'..'9')(DIGIT)*)(LETTER)*; // e.g. 0LL, 0uLL

fragment FLOAT_NUM1:(DIGIT)+'.'(DIGIT)*;    // e.g. 1.2, 1.
fragment FLOAT_NUM2: '.'(DIGIT)+;   // e.g. .2


/* ----------------- */
/* Literal Constants */
/* ----------------- */

LITERAL: '\"'(.)*'\"';
CHARACTER:'\''(.)'\'';


/* ------------ */
/* Common Words */
/* ------------ */

SEMICOLON:';';
NEW_LINE:'\n' {skip();};
WS:(' ' | '\r' | '\t') + {skip();};

fragment LETTER:'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT:'0'..'9';
fragment ZERO:'0';
fragment POSITIVE_DIGIT:'1'..'9';


/* -------- */
/* Comments */
/* -------- */

COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


/* C macro */

MACRO : '#'(.)*'\n';    // e.g. #include, #define