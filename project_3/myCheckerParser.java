// $ANTLR 3.5.2 myChecker.g 2020-05-24 19:56:02

// import packages here.
    import java.util.HashMap;
    import java.lang.Math;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_ASS_OP", "ADD_OP", "AND_ASS_OP", 
		"AND_OP", "ARROW_OP", "ASSIGN_OP", "BIT_AND_OP", "BIT_OR_OP", "BIT_XOR_OP", 
		"BREAK", "CHAR", "COMMA_OP", "COMMENT", "CONST", "Character_constant", 
		"DIV_ASS_OP", "DIV_OP", "DOT_OP", "ELSE", "ELSE_IF", "EQ_OP", "FLOAT", 
		"FOR", "Floating_point_constant", "GE_OP", "GREATER_OP", "IF", "INT", 
		"Identifier", "Integer_constant", "LESS_OP", "LE_OP", "LSHIFT_OP", "Literal_constant", 
		"MACRO", "MAIN", "MM_OP", "MOD_ASS_OP", "MOD_OP", "MUL_ASS_OP", "MUL_OP", 
		"NE_OP", "OR_ASS_OP", "OR_OP", "PP_OP", "PRINTF", "RETURN", "RSHIFT_OP", 
		"SUB_ASS_OP", "SUB_OP", "TRINARY_OP1", "TRINARY_OP2", "VOID", "WHILE", 
		"WS", "XOR_ASS_OP", "'('", "')'", "');'", "';'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int ADD_ASS_OP=4;
	public static final int ADD_OP=5;
	public static final int AND_ASS_OP=6;
	public static final int AND_OP=7;
	public static final int ARROW_OP=8;
	public static final int ASSIGN_OP=9;
	public static final int BIT_AND_OP=10;
	public static final int BIT_OR_OP=11;
	public static final int BIT_XOR_OP=12;
	public static final int BREAK=13;
	public static final int CHAR=14;
	public static final int COMMA_OP=15;
	public static final int COMMENT=16;
	public static final int CONST=17;
	public static final int Character_constant=18;
	public static final int DIV_ASS_OP=19;
	public static final int DIV_OP=20;
	public static final int DOT_OP=21;
	public static final int ELSE=22;
	public static final int ELSE_IF=23;
	public static final int EQ_OP=24;
	public static final int FLOAT=25;
	public static final int FOR=26;
	public static final int Floating_point_constant=27;
	public static final int GE_OP=28;
	public static final int GREATER_OP=29;
	public static final int IF=30;
	public static final int INT=31;
	public static final int Identifier=32;
	public static final int Integer_constant=33;
	public static final int LESS_OP=34;
	public static final int LE_OP=35;
	public static final int LSHIFT_OP=36;
	public static final int Literal_constant=37;
	public static final int MACRO=38;
	public static final int MAIN=39;
	public static final int MM_OP=40;
	public static final int MOD_ASS_OP=41;
	public static final int MOD_OP=42;
	public static final int MUL_ASS_OP=43;
	public static final int MUL_OP=44;
	public static final int NE_OP=45;
	public static final int OR_ASS_OP=46;
	public static final int OR_OP=47;
	public static final int PP_OP=48;
	public static final int PRINTF=49;
	public static final int RETURN=50;
	public static final int RSHIFT_OP=51;
	public static final int SUB_ASS_OP=52;
	public static final int SUB_OP=53;
	public static final int TRINARY_OP1=54;
	public static final int TRINARY_OP2=55;
	public static final int VOID=56;
	public static final int WHILE=57;
	public static final int WS=58;
	public static final int XOR_ASS_OP=59;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCheckerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myChecker.g"; }


	    // boolean TRACEON = true;
	    boolean TRACEON = false;
	    HashMap<String,Integer> symtab = new HashMap<String, Integer>();
	    final String[] type_dict = {"err", "int", "float", "char"};
	    public boolean match_operands(int a, int b, int a_line, String op) {
	        if (a==0 || b==0 || Math.abs(a) != Math.abs(b)) { 
				  System.out.println("Type Error: line: " + 
					                 a_line +
							         ": Type mismatch for the operator " + op + " in an expression. (" +
	                                 type_dict[Math.abs(a)] + " vs " +
	                                 type_dict[Math.abs(b)] + ")"
	                                 );
	              return false;
	        }
	        return true;
	    }

		/* abs(attr_type):
	       0 => error,
	       1 => integer,
	       2 => float
	       3 => char,

	       sign(attr_type):
	       <0: const
	       >0: variable
	    */	   



	// $ANTLR start "program"
	// myChecker.g:39:1: program : ( VOID | INT ) MAIN '(' ( . )* ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myChecker.g:39:8: ( ( VOID | INT ) MAIN '(' ( . )* ')' '{' declarations statements '}' )
			// myChecker.g:39:9: ( VOID | INT ) MAIN '(' ( . )* ')' '{' declarations statements '}'
			{
			if ( input.LA(1)==INT||input.LA(1)==VOID ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,MAIN,FOLLOW_MAIN_in_program26); 
			match(input,60,FOLLOW_60_in_program28); 
			// myChecker.g:39:29: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==61) ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= ADD_ASS_OP && LA1_0 <= 60)||(LA1_0 >= 62 && LA1_0 <= 65)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:39:29: .
					{
					matchAny(input); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,61,FOLLOW_61_in_program33); 
			match(input,64,FOLLOW_64_in_program35); 
			pushFollow(FOLLOW_declarations_in_program37);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program39);
			statements();
			state._fsp--;

			match(input,65,FOLLOW_65_in_program41); 
			if (TRACEON) System.out.println("program:(VOID|INT) MAIN '(' .* ')' '{' declarations statements '}'");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// myChecker.g:43:1: declarations : ( const_type type Identifier ( ASSIGN_OP arith_expression )? ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		int type2 =0;
		int const_type3 =0;
		ParserRuleReturnScope arith_expression4 =null;

		try {
			// myChecker.g:43:13: ( const_type type Identifier ( ASSIGN_OP arith_expression )? ';' declarations |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CHAR||LA3_0==CONST||LA3_0==FLOAT||LA3_0==INT) ) {
				alt3=1;
			}
			else if ( (LA3_0==BREAK||LA3_0==Character_constant||(LA3_0 >= FOR && LA3_0 <= Floating_point_constant)||LA3_0==IF||(LA3_0 >= Identifier && LA3_0 <= Integer_constant)||LA3_0==MM_OP||(LA3_0 >= PP_OP && LA3_0 <= RETURN)||LA3_0==SUB_OP||LA3_0==WHILE||LA3_0==60||LA3_0==65) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myChecker.g:44:3: const_type type Identifier ( ASSIGN_OP arith_expression )? ';' declarations
					{
					pushFollow(FOLLOW_const_type_in_declarations62);
					const_type3=const_type();
					state._fsp--;

					pushFollow(FOLLOW_type_in_declarations64);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations66); 

						   if (TRACEON) System.out.println("declarations: const_type type Identifier : declarations");
					  	   if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
							      System.out.println("Type Error: line: " + Identifier1.getLine() + ": Redeclared identifier: " + (Identifier1!=null?Identifier1.getText():null) );
						      } 
					        else {
							      symtab.put((Identifier1!=null?Identifier1.getText():null), type2 * const_type3);	   
						      }
						
					// myChecker.g:53:3: ( ASSIGN_OP arith_expression )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ASSIGN_OP) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// myChecker.g:53:5: ASSIGN_OP arith_expression
							{
							match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_declarations75); 
							pushFollow(FOLLOW_arith_expression_in_declarations77);
							arith_expression4=arith_expression();
							state._fsp--;


							          int temp = symtab.get((Identifier1!=null?Identifier1.getText():null));
							          if (temp==0 || (arith_expression4!=null?((myCheckerParser.arith_expression_return)arith_expression4).attr_type:0)==0 || Math.abs(temp) != Math.abs((arith_expression4!=null?((myCheckerParser.arith_expression_return)arith_expression4).attr_type:0))) {
							          System.out.println("Type Error: line: " + (arith_expression4!=null?(arith_expression4.start):null).getLine() +
													                ": Initialization failed. Type mismatch for the two silde operands in an assignment statement. (" +
							                            type_dict[Math.abs(temp)] + " vs " + type_dict[Math.abs((arith_expression4!=null?((myCheckerParser.arith_expression_return)arith_expression4).attr_type:0))] + ")" );
							          }
							      
							}
							break;

					}

					match(input,63,FOLLOW_63_in_declarations84); 
					pushFollow(FOLLOW_declarations_in_declarations86);
					declarations();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:61:6: 
					{
					 if (TRACEON) System.out.println("declarations: "); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "const_type"
	// myChecker.g:63:1: const_type returns [int attr_constant] : ( CONST |);
	public final int const_type() throws RecognitionException {
		int attr_constant = 0;


		try {
			// myChecker.g:64:5: ( CONST |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CONST) ) {
				alt4=1;
			}
			else if ( (LA4_0==CHAR||LA4_0==FLOAT||LA4_0==INT) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myChecker.g:64:7: CONST
					{
					match(input,CONST,FOLLOW_CONST_in_const_type122); 
					 if (TRACEON) System.out.println("type: constant: "); attr_constant = -1; 
					}
					break;
				case 2 :
					// myChecker.g:65:7: 
					{
					 if (TRACEON) System.out.println("type: variable: "); attr_constant = 1; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_constant;
	}
	// $ANTLR end "const_type"



	// $ANTLR start "type"
	// myChecker.g:68:1: type returns [int attr_type] : ( INT | FLOAT | CHAR );
	public final int type() throws RecognitionException {
		int attr_type = 0;


		try {
			// myChecker.g:69:2: ( INT | FLOAT | CHAR )
			int alt5=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case FLOAT:
				{
				alt5=2;
				}
				break;
			case CHAR:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// myChecker.g:69:4: INT
					{
					match(input,INT,FOLLOW_INT_in_type146); 
					 
					    if (TRACEON) System.out.println("type: INT");  
					    attr_type = 1; 
					    
					}
					break;
				case 2 :
					// myChecker.g:73:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type156); 
					 
					    if (TRACEON) System.out.println("type: FLOAT");  
					    attr_type = 2; 
					    
					}
					break;
				case 3 :
					// myChecker.g:77:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type163); 
					 
					    if (TRACEON) System.out.println("type: CHAR");  
					    attr_type = 3; 
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myChecker.g:83:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myChecker.g:84:2: ( statement statements |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BREAK||LA6_0==Character_constant||(LA6_0 >= FOR && LA6_0 <= Floating_point_constant)||LA6_0==IF||(LA6_0 >= Identifier && LA6_0 <= Integer_constant)||LA6_0==MM_OP||(LA6_0 >= PP_OP && LA6_0 <= RETURN)||LA6_0==SUB_OP||LA6_0==WHILE||LA6_0==60) ) {
				alt6=1;
			}
			else if ( (LA6_0==65) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myChecker.g:84:3: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements173);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements175);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:85:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"


	public static class arith_expression_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "arith_expression"
	// myChecker.g:88:1: arith_expression returns [int attr_type] : a= multExpr ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )* ;
	public final myCheckerParser.arith_expression_return arith_expression() throws RecognitionException {
		myCheckerParser.arith_expression_return retval = new myCheckerParser.arith_expression_return();
		retval.start = input.LT(1);

		Token ADD_OP5=null;
		Token SUB_OP6=null;
		Token EQ_OP7=null;
		Token LE_OP8=null;
		Token GE_OP9=null;
		Token NE_OP10=null;
		Token GREATER_OP11=null;
		Token LESS_OP12=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			// myChecker.g:88:41: (a= multExpr ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )* )
			// myChecker.g:88:43: a= multExpr ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression194);
			a=multExpr();
			state._fsp--;

			 
			  if (TRACEON) System.out.println("arith_expression: multExpr ( ADD_OP multExpr| SUB_OP multExpr | EQ_OP multExpr | LE_OP multExpr | GE_OP multExpr | NE_OP multExpr | GREATER_OP multExpr | LESS_OP multExpr)*");
			  retval.attr_type = Math.abs((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0)); 
			  
			// myChecker.g:92:7: ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )*
			loop7:
			while (true) {
				int alt7=9;
				switch ( input.LA(1) ) {
				case ADD_OP:
					{
					alt7=1;
					}
					break;
				case SUB_OP:
					{
					alt7=2;
					}
					break;
				case EQ_OP:
					{
					alt7=3;
					}
					break;
				case LE_OP:
					{
					alt7=4;
					}
					break;
				case GE_OP:
					{
					alt7=5;
					}
					break;
				case NE_OP:
					{
					alt7=6;
					}
					break;
				case GREATER_OP:
					{
					alt7=7;
					}
					break;
				case LESS_OP:
					{
					alt7=8;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// myChecker.g:92:9: ADD_OP b= multExpr
					{
					ADD_OP5=(Token)match(input,ADD_OP,FOLLOW_ADD_OP_in_arith_expression206); 
					pushFollow(FOLLOW_multExpr_in_arith_expression212);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (ADD_OP5!=null?ADD_OP5.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 2 :
					// myChecker.g:95:6: SUB_OP b= multExpr
					{
					SUB_OP6=(Token)match(input,SUB_OP,FOLLOW_SUB_OP_in_arith_expression221); 
					pushFollow(FOLLOW_multExpr_in_arith_expression227);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (SUB_OP6!=null?SUB_OP6.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 3 :
					// myChecker.g:98:9: EQ_OP b= multExpr
					{
					EQ_OP7=(Token)match(input,EQ_OP,FOLLOW_EQ_OP_in_arith_expression239); 
					pushFollow(FOLLOW_multExpr_in_arith_expression245);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (EQ_OP7!=null?EQ_OP7.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 4 :
					// myChecker.g:101:9: LE_OP b= multExpr
					{
					LE_OP8=(Token)match(input,LE_OP,FOLLOW_LE_OP_in_arith_expression257); 
					pushFollow(FOLLOW_multExpr_in_arith_expression263);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (LE_OP8!=null?LE_OP8.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 5 :
					// myChecker.g:104:9: GE_OP b= multExpr
					{
					GE_OP9=(Token)match(input,GE_OP,FOLLOW_GE_OP_in_arith_expression275); 
					pushFollow(FOLLOW_multExpr_in_arith_expression281);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (GE_OP9!=null?GE_OP9.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 6 :
					// myChecker.g:107:9: NE_OP b= multExpr
					{
					NE_OP10=(Token)match(input,NE_OP,FOLLOW_NE_OP_in_arith_expression293); 
					pushFollow(FOLLOW_multExpr_in_arith_expression299);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (NE_OP10!=null?NE_OP10.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 7 :
					// myChecker.g:110:9: GREATER_OP b= multExpr
					{
					GREATER_OP11=(Token)match(input,GREATER_OP,FOLLOW_GREATER_OP_in_arith_expression311); 
					pushFollow(FOLLOW_multExpr_in_arith_expression317);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (GREATER_OP11!=null?GREATER_OP11.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 8 :
					// myChecker.g:113:9: LESS_OP b= multExpr
					{
					LESS_OP12=(Token)match(input,LESS_OP,FOLLOW_LESS_OP_in_arith_expression329); 
					pushFollow(FOLLOW_multExpr_in_arith_expression335);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (LESS_OP12!=null?LESS_OP12.getText():null))) retval.attr_type = 0;
					        
					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith_expression"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "multExpr"
	// myChecker.g:119:1: multExpr returns [int attr_type] : a= signExpr ( MUL_OP signExpr | DIV_OP signExpr )* ;
	public final myCheckerParser.multExpr_return multExpr() throws RecognitionException {
		myCheckerParser.multExpr_return retval = new myCheckerParser.multExpr_return();
		retval.start = input.LT(1);

		int a =0;

		try {
			// myChecker.g:119:33: (a= signExpr ( MUL_OP signExpr | DIV_OP signExpr )* )
			// myChecker.g:119:35: a= signExpr ( MUL_OP signExpr | DIV_OP signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr360);
			a=signExpr();
			state._fsp--;

			 
			    if (TRACEON) System.out.println("multExpr: signExpr ( MUL_OP signExpr | DIV_OP signExpr )*");
			    retval.attr_type = Math.abs(a); 
			    
			// myChecker.g:123:7: ( MUL_OP signExpr | DIV_OP signExpr )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==MUL_OP) ) {
					alt8=1;
				}
				else if ( (LA8_0==DIV_OP) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// myChecker.g:123:9: MUL_OP signExpr
					{
					match(input,MUL_OP,FOLLOW_MUL_OP_in_multExpr372); 
					pushFollow(FOLLOW_signExpr_in_multExpr374);
					signExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:124:9: DIV_OP signExpr
					{
					match(input,DIV_OP,FOLLOW_DIV_OP_in_multExpr384); 
					pushFollow(FOLLOW_signExpr_in_multExpr386);
					signExpr();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myChecker.g:129:1: signExpr returns [int attr_type] : ( primaryExpr | '-' primaryExpr );
	public final int signExpr() throws RecognitionException {
		int attr_type = 0;


		int primaryExpr13 =0;
		int primaryExpr14 =0;

		try {
			// myChecker.g:129:33: ( primaryExpr | '-' primaryExpr )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Character_constant||LA9_0==Floating_point_constant||(LA9_0 >= Identifier && LA9_0 <= Integer_constant)||LA9_0==60) ) {
				alt9=1;
			}
			else if ( (LA9_0==SUB_OP) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myChecker.g:129:35: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr406);
					primaryExpr13=primaryExpr();
					state._fsp--;

					 
					  if (TRACEON) System.out.println("signExpr: primaryExpr");
					  attr_type = Math.abs(primaryExpr13); 
					  
					}
					break;
				case 2 :
					// myChecker.g:133:4: '-' primaryExpr
					{
					match(input,SUB_OP,FOLLOW_SUB_OP_in_signExpr413); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr415);
					primaryExpr14=primaryExpr();
					state._fsp--;

					 
					    if (TRACEON) System.out.println("signExpr: SUB_OP primaryExpr");
					    attr_type = Math.abs(primaryExpr14); 
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myChecker.g:140:1: primaryExpr returns [int attr_type] : ( Integer_constant | Floating_point_constant | Character_constant | Identifier | '(' arith_expression ')' );
	public final int primaryExpr() throws RecognitionException {
		int attr_type = 0;


		Token Identifier15=null;
		ParserRuleReturnScope arith_expression16 =null;

		try {
			// myChecker.g:140:37: ( Integer_constant | Floating_point_constant | Character_constant | Identifier | '(' arith_expression ')' )
			int alt10=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt10=1;
				}
				break;
			case Floating_point_constant:
				{
				alt10=2;
				}
				break;
			case Character_constant:
				{
				alt10=3;
				}
				break;
			case Identifier:
				{
				alt10=4;
				}
				break;
			case 60:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myChecker.g:141:3: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr435); 
					 
					    if (TRACEON) System.out.println("primaryExpr: Integer_constant");
					    attr_type = -1; 
					    
					}
					break;
				case 2 :
					// myChecker.g:145:4: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr442); 
					 
					    if (TRACEON) System.out.println("primaryExpr: Floating_point_constant");
					    attr_type = -2; 
					    
					}
					break;
				case 3 :
					// myChecker.g:149:4: Character_constant
					{
					match(input,Character_constant,FOLLOW_Character_constant_in_primaryExpr449); 
					 
					    if (TRACEON) System.out.println("primaryExpr: Character_constant");
					    attr_type = -3; 
					    
					}
					break;
				case 4 :
					// myChecker.g:153:4: Identifier
					{
					Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr456); 

					       if (TRACEON) System.out.println("primaryExpr: Identifier");
					       if (symtab.containsKey((Identifier15!=null?Identifier15.getText():null))) {
						       attr_type = symtab.get((Identifier15!=null?Identifier15.getText():null));
						   } 
					     else {
					        System.out.println("Type Error: line: " + Identifier15.getLine() + ": " + (Identifier15!=null?Identifier15.getText():null) + ": not declared.");
						      attr_type = 0;
					       }
					    
					}
					break;
				case 5 :
					// myChecker.g:163:4: '(' arith_expression ')'
					{
					match(input,60,FOLLOW_60_in_primaryExpr463); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr465);
					arith_expression16=arith_expression();
					state._fsp--;

					match(input,61,FOLLOW_61_in_primaryExpr467); 
					 
					    if (TRACEON) System.out.println("primaryExpr: '(' arith_expression ')'");
					    attr_type = (arith_expression16!=null?((myCheckerParser.arith_expression_return)arith_expression16).attr_type:0); 
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "uniry_op"
	// myChecker.g:169:1: uniry_op returns [int attr_type] : uniry_op_ ;
	public final int uniry_op() throws RecognitionException {
		int attr_type = 0;


		ParserRuleReturnScope uniry_op_17 =null;

		try {
			// myChecker.g:169:33: ( uniry_op_ )
			// myChecker.g:169:35: uniry_op_
			{
			pushFollow(FOLLOW_uniry_op__in_uniry_op485);
			uniry_op_17=uniry_op_();
			state._fsp--;


			    if (symtab.containsKey((uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null))) {
				       attr_type = symtab.get((uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null));
				  } 
			    else {
			      System.out.println("Type Error: line: " + (uniry_op_17!=null?(uniry_op_17.start):null).getLine() + ": " + (uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null) + ": not declared.");
				    attr_type = 0;
			    }
			    if (attr_type<0) { 
			      System.out.println("Type Error: line: " + (uniry_op_17!=null?(uniry_op_17.start):null).getLine() + ": " + (uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null) + ": is constant.");
			    }

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "uniry_op"


	public static class uniry_op__return extends ParserRuleReturnScope {
		public String id_;
	};


	// $ANTLR start "uniry_op_"
	// myChecker.g:183:1: uniry_op_ returns [String id_] : ( PP_OP Identifier | Identifier PP_OP | MM_OP Identifier | Identifier MM_OP );
	public final myCheckerParser.uniry_op__return uniry_op_() throws RecognitionException {
		myCheckerParser.uniry_op__return retval = new myCheckerParser.uniry_op__return();
		retval.start = input.LT(1);

		Token Identifier18=null;
		Token Identifier19=null;
		Token Identifier20=null;
		Token Identifier21=null;

		try {
			// myChecker.g:183:31: ( PP_OP Identifier | Identifier PP_OP | MM_OP Identifier | Identifier MM_OP )
			int alt11=4;
			switch ( input.LA(1) ) {
			case PP_OP:
				{
				alt11=1;
				}
				break;
			case Identifier:
				{
				int LA11_2 = input.LA(2);
				if ( (LA11_2==PP_OP) ) {
					alt11=2;
				}
				else if ( (LA11_2==MM_OP) ) {
					alt11=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MM_OP:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myChecker.g:184:5: PP_OP Identifier
					{
					match(input,PP_OP,FOLLOW_PP_OP_in_uniry_op_503); 
					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_505); 

					      if(TRACEON) System.out.println("uniry_op_: PP_OP Identidier");
					      retval.id_ = (Identifier18!=null?Identifier18.getText():null);
					      
					}
					break;
				case 2 :
					// myChecker.g:188:7: Identifier PP_OP
					{
					Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_515); 
					match(input,PP_OP,FOLLOW_PP_OP_in_uniry_op_517); 

					      if(TRACEON) System.out.println("uniry_op_: Identifier PP_OP");
					      retval.id_ = (Identifier19!=null?Identifier19.getText():null);
					      
					}
					break;
				case 3 :
					// myChecker.g:192:7: MM_OP Identifier
					{
					match(input,MM_OP,FOLLOW_MM_OP_in_uniry_op_527); 
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_529); 

					      if(TRACEON) System.out.println("uniry_op_: MM_OP Identidier");
					      retval.id_ = (Identifier20!=null?Identifier20.getText():null);
					      
					}
					break;
				case 4 :
					// myChecker.g:196:7: Identifier MM_OP
					{
					Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_539); 
					match(input,MM_OP,FOLLOW_MM_OP_in_uniry_op_541); 

					      if(TRACEON) System.out.println("uniry_op_: Identifier MM_OP");
					      retval.id_ = (Identifier21!=null?Identifier21.getText():null);
					      
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniry_op_"



	// $ANTLR start "sub_statement"
	// myChecker.g:202:1: sub_statement returns [int attr_type] : ( uniry_op | Identifier ASSIGN_OP arith_expression | arith_expression );
	public final int sub_statement() throws RecognitionException {
		int attr_type = 0;


		Token Identifier23=null;
		int uniry_op22 =0;
		ParserRuleReturnScope arith_expression24 =null;
		ParserRuleReturnScope arith_expression25 =null;

		try {
			// myChecker.g:202:38: ( uniry_op | Identifier ASSIGN_OP arith_expression | arith_expression )
			int alt12=3;
			switch ( input.LA(1) ) {
			case MM_OP:
			case PP_OP:
				{
				alt12=1;
				}
				break;
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case MM_OP:
				case PP_OP:
					{
					alt12=1;
					}
					break;
				case ASSIGN_OP:
					{
					alt12=2;
					}
					break;
				case ADD_OP:
				case DIV_OP:
				case EQ_OP:
				case GE_OP:
				case GREATER_OP:
				case LESS_OP:
				case LE_OP:
				case MUL_OP:
				case NE_OP:
				case SUB_OP:
				case 61:
				case 63:
					{
					alt12=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Character_constant:
			case Floating_point_constant:
			case Integer_constant:
			case SUB_OP:
			case 60:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myChecker.g:203:5: uniry_op
					{
					pushFollow(FOLLOW_uniry_op_in_sub_statement560);
					uniry_op22=uniry_op();
					state._fsp--;


					        if (TRACEON) System.out.println("sub_statement: uniry_op");
					        attr_type = uniry_op22;
					        
					}
					break;
				case 2 :
					// myChecker.g:207:7: Identifier ASSIGN_OP arith_expression
					{
					Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_sub_statement570); 
					match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_sub_statement572); 
					pushFollow(FOLLOW_arith_expression_in_sub_statement574);
					arith_expression24=arith_expression();
					state._fsp--;


					        if (TRACEON) System.out.println("sub_statement: Identifier ASSIGN_OP arith_expression ( " + (Identifier23!=null?Identifier23.getText():null) + " = " + (arith_expression24!=null?input.toString(arith_expression24.start,arith_expression24.stop):null) + " )");
					        if (symtab.containsKey((Identifier23!=null?Identifier23.getText():null))) {
						          attr_type = symtab.get((Identifier23!=null?Identifier23.getText():null));
						      } 
					        else {
					            System.out.println("Type Error: line: " + (arith_expression24!=null?(arith_expression24.start):null).getLine() + ": " 
					                              + (Identifier23!=null?Identifier23.getText():null) + ": not declared.");
						          attr_type = 0;
						      }
					        if (attr_type < 0) {
					           System.out.println("Type Error: line: " + (arith_expression24!=null?(arith_expression24.start):null).getLine()  + ": Assign value to constant: " + (Identifier23!=null?Identifier23.getText():null));
					        }
						      if (attr_type==0 || (arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0)==0 || Math.abs(attr_type) != Math.abs((arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0))) {
					            System.out.println("Type Error: line: " + (arith_expression24!=null?(arith_expression24.start):null).getLine() +
					                              ": Type mismatch for the two silde operands in an assignment statement. (" +
					                              type_dict[Math.abs(attr_type)] + " vs " +
					                              type_dict[Math.abs((arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0))] + ")");
							        attr_type = 0;
					        }
						    
					}
					break;
				case 3 :
					// myChecker.g:228:8: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_sub_statement586);
					arith_expression25=arith_expression();
					state._fsp--;


					       if (TRACEON) System.out.println("sub_statement: arith_expression");
					       attr_type = (arith_expression25!=null?((myCheckerParser.arith_expression_return)arith_expression25).attr_type:0);
					       
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "sub_statement"



	// $ANTLR start "statement"
	// myChecker.g:234:1: statement returns [int attr_type] : ( sub_statement ';' | ifelse_statements | for_statements | while_statements | print_statement | BREAK | RETURN ( Identifier | Character_constant | Integer_constant | Floating_point_constant ) ';' );
	public final int statement() throws RecognitionException {
		int attr_type = 0;


		int sub_statement26 =0;

		try {
			// myChecker.g:234:34: ( sub_statement ';' | ifelse_statements | for_statements | while_statements | print_statement | BREAK | RETURN ( Identifier | Character_constant | Integer_constant | Floating_point_constant ) ';' )
			int alt13=7;
			switch ( input.LA(1) ) {
			case Character_constant:
			case Floating_point_constant:
			case Identifier:
			case Integer_constant:
			case MM_OP:
			case PP_OP:
			case SUB_OP:
			case 60:
				{
				alt13=1;
				}
				break;
			case IF:
				{
				alt13=2;
				}
				break;
			case FOR:
				{
				alt13=3;
				}
				break;
			case WHILE:
				{
				alt13=4;
				}
				break;
			case PRINTF:
				{
				alt13=5;
				}
				break;
			case BREAK:
				{
				alt13=6;
				}
				break;
			case RETURN:
				{
				alt13=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myChecker.g:235:3: sub_statement ';'
					{
					pushFollow(FOLLOW_sub_statement_in_statement603);
					sub_statement26=sub_statement();
					state._fsp--;

					match(input,63,FOLLOW_63_in_statement605); 

					    if (TRACEON) System.out.println("statement: sub_statement ';'");
					    attr_type = sub_statement26;
					    
					}
					break;
				case 2 :
					// myChecker.g:239:4: ifelse_statements
					{
					pushFollow(FOLLOW_ifelse_statements_in_statement612);
					ifelse_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: ifelse_statements"); 
					}
					break;
				case 3 :
					// myChecker.g:240:5: for_statements
					{
					pushFollow(FOLLOW_for_statements_in_statement620);
					for_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: for_statements"); 
					}
					break;
				case 4 :
					// myChecker.g:241:5: while_statements
					{
					pushFollow(FOLLOW_while_statements_in_statement631);
					while_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: while_statements"); 
					}
					break;
				case 5 :
					// myChecker.g:242:5: print_statement
					{
					pushFollow(FOLLOW_print_statement_in_statement640);
					print_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: print_statement"); 
					}
					break;
				case 6 :
					// myChecker.g:243:5: BREAK
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement650); 
					if (TRACEON) System.out.println("statement: BREAK"); 
					}
					break;
				case 7 :
					// myChecker.g:244:5: RETURN ( Identifier | Character_constant | Integer_constant | Floating_point_constant ) ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement670); 
					if ( input.LA(1)==Character_constant||input.LA(1)==Floating_point_constant||(input.LA(1) >= Identifier && input.LA(1) <= Integer_constant) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,63,FOLLOW_63_in_statement682); 

					    if (TRACEON) System.out.println("statement: RETURN (Identifier|Character_constant|Integer_constant|Floating_point_constant) ';'");
					  
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "statement"



	// $ANTLR start "ifelse_statements"
	// myChecker.g:249:1: ifelse_statements : IF '(' arith_expression ')' block_of_statements ( ELSE_IF '(' arith_expression ')' block_of_statements )* ( ELSE block_of_statements )? ;
	public final void ifelse_statements() throws RecognitionException {
		try {
			// myChecker.g:249:18: ( IF '(' arith_expression ')' block_of_statements ( ELSE_IF '(' arith_expression ')' block_of_statements )* ( ELSE block_of_statements )? )
			// myChecker.g:250:5: IF '(' arith_expression ')' block_of_statements ( ELSE_IF '(' arith_expression ')' block_of_statements )* ( ELSE block_of_statements )?
			{
			match(input,IF,FOLLOW_IF_in_ifelse_statements696); 
			match(input,60,FOLLOW_60_in_ifelse_statements698); 
			pushFollow(FOLLOW_arith_expression_in_ifelse_statements700);
			arith_expression();
			state._fsp--;

			match(input,61,FOLLOW_61_in_ifelse_statements702); 
			pushFollow(FOLLOW_block_of_statements_in_ifelse_statements704);
			block_of_statements();
			state._fsp--;

			// myChecker.g:250:53: ( ELSE_IF '(' arith_expression ')' block_of_statements )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ELSE_IF) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// myChecker.g:250:54: ELSE_IF '(' arith_expression ')' block_of_statements
					{
					match(input,ELSE_IF,FOLLOW_ELSE_IF_in_ifelse_statements707); 
					match(input,60,FOLLOW_60_in_ifelse_statements709); 
					pushFollow(FOLLOW_arith_expression_in_ifelse_statements711);
					arith_expression();
					state._fsp--;

					match(input,61,FOLLOW_61_in_ifelse_statements713); 
					pushFollow(FOLLOW_block_of_statements_in_ifelse_statements715);
					block_of_statements();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			// myChecker.g:250:109: ( ELSE block_of_statements )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ELSE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// myChecker.g:250:110: ELSE block_of_statements
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifelse_statements720); 
					pushFollow(FOLLOW_block_of_statements_in_ifelse_statements722);
					block_of_statements();
					state._fsp--;

					}
					break;

			}


			      if (TRACEON) System.out.println("ifelse_statements: IF '(' arith_expression ')' block_of_statements (ELSE_IF '(' arith_expression ')' block_of_statements)* (ELSE block_of_statements)?"); 
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifelse_statements"



	// $ANTLR start "for_statements"
	// myChecker.g:255:1: for_statements : FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_of_statements ;
	public final void for_statements() throws RecognitionException {
		try {
			// myChecker.g:255:15: ( FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_of_statements )
			// myChecker.g:255:17: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_of_statements
			{
			match(input,FOR,FOLLOW_FOR_in_for_statements734); 
			match(input,60,FOLLOW_60_in_for_statements736); 
			pushFollow(FOLLOW_sub_statement_in_for_statements738);
			sub_statement();
			state._fsp--;

			match(input,63,FOLLOW_63_in_for_statements740); 
			pushFollow(FOLLOW_sub_statement_in_for_statements742);
			sub_statement();
			state._fsp--;

			match(input,63,FOLLOW_63_in_for_statements744); 
			pushFollow(FOLLOW_sub_statement_in_for_statements746);
			sub_statement();
			state._fsp--;

			match(input,61,FOLLOW_61_in_for_statements748); 
			pushFollow(FOLLOW_block_of_statements_in_for_statements751);
			block_of_statements();
			state._fsp--;


			  if (TRACEON) System.out.println("statement: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')'  block_of_statements");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_statements"



	// $ANTLR start "while_statements"
	// myChecker.g:260:1: while_statements : WHILE '(' sub_statement ')' block_of_statements ;
	public final void while_statements() throws RecognitionException {
		try {
			// myChecker.g:260:17: ( WHILE '(' sub_statement ')' block_of_statements )
			// myChecker.g:260:19: WHILE '(' sub_statement ')' block_of_statements
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statements761); 
			match(input,60,FOLLOW_60_in_while_statements763); 
			pushFollow(FOLLOW_sub_statement_in_while_statements765);
			sub_statement();
			state._fsp--;

			match(input,61,FOLLOW_61_in_while_statements767); 
			pushFollow(FOLLOW_block_of_statements_in_while_statements769);
			block_of_statements();
			state._fsp--;


			  if (TRACEON) System.out.println("while_statements: WHILE '('sub_statement ')' block_of_statements");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_statements"



	// $ANTLR start "block_of_statements"
	// myChecker.g:265:1: block_of_statements : ( statement | '{' statements '}' );
	public final void block_of_statements() throws RecognitionException {
		try {
			// myChecker.g:265:20: ( statement | '{' statements '}' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BREAK||LA16_0==Character_constant||(LA16_0 >= FOR && LA16_0 <= Floating_point_constant)||LA16_0==IF||(LA16_0 >= Identifier && LA16_0 <= Integer_constant)||LA16_0==MM_OP||(LA16_0 >= PP_OP && LA16_0 <= RETURN)||LA16_0==SUB_OP||LA16_0==WHILE||LA16_0==60) ) {
				alt16=1;
			}
			else if ( (LA16_0==64) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// myChecker.g:265:22: statement
					{
					pushFollow(FOLLOW_statement_in_block_of_statements779);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:265:33: '{' statements '}'
					{
					match(input,64,FOLLOW_64_in_block_of_statements782); 
					pushFollow(FOLLOW_statements_in_block_of_statements784);
					statements();
					state._fsp--;

					match(input,65,FOLLOW_65_in_block_of_statements786); 
					if (TRACEON) System.out.println("block_of_statements: {statements}");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_of_statements"



	// $ANTLR start "print_statement"
	// myChecker.g:268:1: print_statement : PRINTF '(' Literal_constant ( ',' Identifier )? ');' ;
	public final void print_statement() throws RecognitionException {
		try {
			// myChecker.g:268:16: ( PRINTF '(' Literal_constant ( ',' Identifier )? ');' )
			// myChecker.g:268:18: PRINTF '(' Literal_constant ( ',' Identifier )? ');'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_print_statement796); 
			match(input,60,FOLLOW_60_in_print_statement798); 
			match(input,Literal_constant,FOLLOW_Literal_constant_in_print_statement800); 
			// myChecker.g:268:46: ( ',' Identifier )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COMMA_OP) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// myChecker.g:268:47: ',' Identifier
					{
					match(input,COMMA_OP,FOLLOW_COMMA_OP_in_print_statement803); 
					match(input,Identifier,FOLLOW_Identifier_in_print_statement805); 
					}
					break;

			}

			match(input,62,FOLLOW_62_in_print_statement809); 
			if (TRACEON) System.out.println("PRINTF '(' Literal_constant (',' Identifier)? ');'");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print_statement"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_program20 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_MAIN_in_program26 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_program28 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000003L});
	public static final BitSet FOLLOW_61_in_program33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_program35 = new BitSet(new long[]{0x12270103CE066000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_program37 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_program39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_program41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_type_in_declarations62 = new BitSet(new long[]{0x0000000082004000L});
	public static final BitSet FOLLOW_type_in_declarations64 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Identifier_in_declarations66 = new BitSet(new long[]{0x8000000000000200L});
	public static final BitSet FOLLOW_ASSIGN_OP_in_declarations75 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_arith_expression_in_declarations77 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_declarations84 = new BitSet(new long[]{0x0000000082024000L});
	public static final BitSet FOLLOW_declarations_in_declarations86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_const_type122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements173 = new BitSet(new long[]{0x122701034C042000L});
	public static final BitSet FOLLOW_statements_in_statements175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression194 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_ADD_OP_in_arith_expression206 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression212 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_SUB_OP_in_arith_expression221 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression227 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_EQ_OP_in_arith_expression239 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression245 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_LE_OP_in_arith_expression257 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression263 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_GE_OP_in_arith_expression275 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression281 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_NE_OP_in_arith_expression293 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression299 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_GREATER_OP_in_arith_expression311 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression317 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_LESS_OP_in_arith_expression329 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression335 = new BitSet(new long[]{0x0020200C31000022L});
	public static final BitSet FOLLOW_signExpr_in_multExpr360 = new BitSet(new long[]{0x0000100000100002L});
	public static final BitSet FOLLOW_MUL_OP_in_multExpr372 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr374 = new BitSet(new long[]{0x0000100000100002L});
	public static final BitSet FOLLOW_DIV_OP_in_multExpr384 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr386 = new BitSet(new long[]{0x0000100000100002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_OP_in_signExpr413 = new BitSet(new long[]{0x1000000308040000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_constant_in_primaryExpr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_primaryExpr463 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr465 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_primaryExpr467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniry_op__in_uniry_op485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PP_OP_in_uniry_op_503 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_515 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_PP_OP_in_uniry_op_517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MM_OP_in_uniry_op_527 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_539 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_MM_OP_in_uniry_op_541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniry_op_in_sub_statement560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_sub_statement570 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ASSIGN_OP_in_sub_statement572 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_arith_expression_in_sub_statement574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_sub_statement586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_statement_in_statement603 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_statement605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelse_statements_in_statement612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statements_in_statement620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statements_in_statement631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_statement640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement670 = new BitSet(new long[]{0x0000000308040000L});
	public static final BitSet FOLLOW_set_in_statement672 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_statement682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelse_statements696 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifelse_statements698 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_arith_expression_in_ifelse_statements700 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_ifelse_statements702 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_of_statements_in_ifelse_statements704 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_ELSE_IF_in_ifelse_statements707 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifelse_statements709 = new BitSet(new long[]{0x1020000308040000L});
	public static final BitSet FOLLOW_arith_expression_in_ifelse_statements711 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_ifelse_statements713 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_of_statements_in_ifelse_statements715 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_ELSE_in_ifelse_statements720 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_of_statements_in_ifelse_statements722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_statements734 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_for_statements736 = new BitSet(new long[]{0x1021010308040000L});
	public static final BitSet FOLLOW_sub_statement_in_for_statements738 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_for_statements740 = new BitSet(new long[]{0x1021010308040000L});
	public static final BitSet FOLLOW_sub_statement_in_for_statements742 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_for_statements744 = new BitSet(new long[]{0x1021010308040000L});
	public static final BitSet FOLLOW_sub_statement_in_for_statements746 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_for_statements748 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_of_statements_in_for_statements751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statements761 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_while_statements763 = new BitSet(new long[]{0x1021010308040000L});
	public static final BitSet FOLLOW_sub_statement_in_while_statements765 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_while_statements767 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000001L});
	public static final BitSet FOLLOW_block_of_statements_in_while_statements769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block_of_statements779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_block_of_statements782 = new BitSet(new long[]{0x122701034C042000L,0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_block_of_statements784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_block_of_statements786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_print_statement796 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_print_statement798 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Literal_constant_in_print_statement800 = new BitSet(new long[]{0x4000000000008000L});
	public static final BitSet FOLLOW_COMMA_OP_in_print_statement803 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Identifier_in_print_statement805 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_print_statement809 = new BitSet(new long[]{0x0000000000000002L});
}
