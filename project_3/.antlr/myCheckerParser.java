// Generated from /Users/joycechin/CD_2020/project_3/myChecker.g by ANTLR 4.7.1

// import packages here.
    import java.util.HashMap;
    import java.lang.Math;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCheckerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FLOAT=7, INT=8, CHAR=9, 
		CONST=10, MAIN=11, PRINTF=12, VOID=13, IF=14, ELSE_IF=15, ELSE=16, FOR=17, 
		WHILE=18, BREAK=19, RETURN=20, EQ_OP=21, LE_OP=22, GE_OP=23, NE_OP=24, 
		ADD_ASS_OP=25, SUB_ASS_OP=26, MUL_ASS_OP=27, DIV_ASS_OP=28, MOD_ASS_OP=29, 
		AND_ASS_OP=30, OR_ASS_OP=31, XOR_ASS_OP=32, PP_OP=33, MM_OP=34, AND_OP=35, 
		OR_OP=36, RSHIFT_OP=37, LSHIFT_OP=38, ARROW_OP=39, ASSIGN_OP=40, LESS_OP=41, 
		GREATER_OP=42, BIT_AND_OP=43, BIT_OR_OP=44, BIT_XOR_OP=45, ADD_OP=46, 
		SUB_OP=47, DIV_OP=48, MUL_OP=49, MOD_OP=50, COMMA_OP=51, DOT_OP=52, TRINARY_OP1=53, 
		TRINARY_OP2=54, Identifier=55, Integer_constant=56, Floating_point_constant=57, 
		Literal_constant=58, Character_constant=59, WS=60, COMMENT=61, MACRO=62;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_const_type = 2, RULE_type = 3, 
		RULE_statements = 4, RULE_arith_expression = 5, RULE_multExpr = 6, RULE_signExpr = 7, 
		RULE_primaryExpr = 8, RULE_uniry_op = 9, RULE_uniry_op_ = 10, RULE_sub_statement = 11, 
		RULE_statement = 12, RULE_ifelse_statements = 13, RULE_for_statements = 14, 
		RULE_while_statements = 15, RULE_block_of_statements = 16, RULE_print_statement = 17;
	public static final String[] ruleNames = {
		"program", "declarations", "const_type", "type", "statements", "arith_expression", 
		"multExpr", "signExpr", "primaryExpr", "uniry_op", "uniry_op_", "sub_statement", 
		"statement", "ifelse_statements", "for_statements", "while_statements", 
		"block_of_statements", "print_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "');'", "'float'", "'int'", "'char'", 
		"'const'", "'main'", "'printf'", "'void'", "'if'", "'else if'", "'else'", 
		"'for'", "'while'", "'break'", "'return'", "'=='", "'<='", "'>='", "'!='", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'++'", 
		"'--'", "'&&'", "'||'", "'<<'", "'>>'", "'->'", "'='", "'<'", "'>'", "'&'", 
		"'|'", "'^'", "'+'", "'-'", "'/'", "'*'", "'%'", "','", "'.'", "'?'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "FLOAT", "INT", "CHAR", "CONST", 
		"MAIN", "PRINTF", "VOID", "IF", "ELSE_IF", "ELSE", "FOR", "WHILE", "BREAK", 
		"RETURN", "EQ_OP", "LE_OP", "GE_OP", "NE_OP", "ADD_ASS_OP", "SUB_ASS_OP", 
		"MUL_ASS_OP", "DIV_ASS_OP", "MOD_ASS_OP", "AND_ASS_OP", "OR_ASS_OP", "XOR_ASS_OP", 
		"PP_OP", "MM_OP", "AND_OP", "OR_OP", "RSHIFT_OP", "LSHIFT_OP", "ARROW_OP", 
		"ASSIGN_OP", "LESS_OP", "GREATER_OP", "BIT_AND_OP", "BIT_OR_OP", "BIT_XOR_OP", 
		"ADD_OP", "SUB_OP", "DIV_OP", "MUL_OP", "MOD_OP", "COMMA_OP", "DOT_OP", 
		"TRINARY_OP1", "TRINARY_OP2", "Identifier", "Integer_constant", "Floating_point_constant", 
		"Literal_constant", "Character_constant", "WS", "COMMENT", "MACRO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myChecker.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public myCheckerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(myCheckerParser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode VOID() { return getToken(myCheckerParser.VOID, 0); }
		public TerminalNode INT() { return getToken(myCheckerParser.INT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
			match(MAIN);
			setState(38);
			match(T__0);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					matchWildcard();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			declarations();
			setState(48);
			statements();
			setState(49);
			match(T__3);
			if (TRACEON) System.out.println("program:(VOID|INT) MAIN '(' .* ')' '{' declarations statements '}'");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(myCheckerParser.ASSIGN_OP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case CHAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				const_type();
				setState(53);
				type();
				setState(54);
				match(Identifier);

					   if (TRACEON) System.out.println("declarations: const_type type Identifier : declarations");
				  	   if (symtab.containsKey((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null))) {
						      System.out.println("Type Error: line: " + ((DeclarationsContext)_localctx).Identifier.getLine() + ": Redeclared identifier: " + (((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null) );
					      } 
				        else {
						      symtab.put((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null), ((DeclarationsContext)_localctx).type.attr_type * ((DeclarationsContext)_localctx).const_type.attr_constant);	   
					      }
					
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP) {
					{
					setState(56);
					match(ASSIGN_OP);
					setState(57);
					arith_expression();

					          int temp = symtab.get((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null));
					          if (temp==0 || ((DeclarationsContext)_localctx).arith_expression.attr_type==0 || Math.abs(temp) != Math.abs(((DeclarationsContext)_localctx).arith_expression.attr_type)) {
					          System.out.println("Type Error: line: " + (((DeclarationsContext)_localctx).arith_expression!=null?(((DeclarationsContext)_localctx).arith_expression.start):null).getLine() +
											                ": Initialization failed. Type mismatch for the two silde operands in an assignment statement. (" +
					                            type_dict[Math.abs(temp)] + " vs " + type_dict[Math.abs(((DeclarationsContext)_localctx).arith_expression.attr_type)] + ")" );
					          }
					      
					}
				}

				setState(62);
				match(T__4);
				setState(63);
				declarations();
				}
				break;
			case T__0:
			case T__3:
			case PRINTF:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case RETURN:
			case PP_OP:
			case MM_OP:
			case SUB_OP:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case Character_constant:
				enterOuterAlt(_localctx, 2);
				{
				 if (TRACEON) System.out.println("declarations: "); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_typeContext extends ParserRuleContext {
		public int attr_constant;
		public TerminalNode CONST() { return getToken(myCheckerParser.CONST, 0); }
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_const_type);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CONST);
				 if (TRACEON) System.out.println("type: constant: "); ((Const_typeContext)_localctx).attr_constant =  -1; 
				}
				break;
			case FLOAT:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				 if (TRACEON) System.out.println("type: variable: "); ((Const_typeContext)_localctx).attr_constant =  1; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public int attr_type;
		public TerminalNode INT() { return getToken(myCheckerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myCheckerParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(myCheckerParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(INT);
				 
				    if (TRACEON) System.out.println("type: INT");  
				    ((TypeContext)_localctx).attr_type =  1; 
				    
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(FLOAT);
				 
				    if (TRACEON) System.out.println("type: FLOAT");  
				    ((TypeContext)_localctx).attr_type =  2; 
				    
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(CHAR);
				 
				    if (TRACEON) System.out.println("type: CHAR");  
				    ((TypeContext)_localctx).attr_type =  3; 
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PRINTF:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case RETURN:
			case PP_OP:
			case MM_OP:
			case SUB_OP:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case Character_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				statement();
				setState(82);
				statements();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_expressionContext extends ParserRuleContext {
		public int attr_type;
		public MultExprContext a;
		public MultExprContext b;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> ADD_OP() { return getTokens(myCheckerParser.ADD_OP); }
		public TerminalNode ADD_OP(int i) {
			return getToken(myCheckerParser.ADD_OP, i);
		}
		public List<TerminalNode> SUB_OP() { return getTokens(myCheckerParser.SUB_OP); }
		public TerminalNode SUB_OP(int i) {
			return getToken(myCheckerParser.SUB_OP, i);
		}
		public List<TerminalNode> EQ_OP() { return getTokens(myCheckerParser.EQ_OP); }
		public TerminalNode EQ_OP(int i) {
			return getToken(myCheckerParser.EQ_OP, i);
		}
		public List<TerminalNode> LE_OP() { return getTokens(myCheckerParser.LE_OP); }
		public TerminalNode LE_OP(int i) {
			return getToken(myCheckerParser.LE_OP, i);
		}
		public List<TerminalNode> GE_OP() { return getTokens(myCheckerParser.GE_OP); }
		public TerminalNode GE_OP(int i) {
			return getToken(myCheckerParser.GE_OP, i);
		}
		public List<TerminalNode> NE_OP() { return getTokens(myCheckerParser.NE_OP); }
		public TerminalNode NE_OP(int i) {
			return getToken(myCheckerParser.NE_OP, i);
		}
		public List<TerminalNode> GREATER_OP() { return getTokens(myCheckerParser.GREATER_OP); }
		public TerminalNode GREATER_OP(int i) {
			return getToken(myCheckerParser.GREATER_OP, i);
		}
		public List<TerminalNode> LESS_OP() { return getTokens(myCheckerParser.LESS_OP); }
		public TerminalNode LESS_OP(int i) {
			return getToken(myCheckerParser.LESS_OP, i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((Arith_expressionContext)_localctx).a = multExpr();
			 
			  if (TRACEON) System.out.println("arith_expression: multExpr ( ADD_OP multExpr| SUB_OP multExpr | EQ_OP multExpr | LE_OP multExpr | GE_OP multExpr | NE_OP multExpr | GREATER_OP multExpr | LESS_OP multExpr)*");
			  ((Arith_expressionContext)_localctx).attr_type =  Math.abs(((Arith_expressionContext)_localctx).a.attr_type); 
			  
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << LE_OP) | (1L << GE_OP) | (1L << NE_OP) | (1L << LESS_OP) | (1L << GREATER_OP) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) {
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD_OP:
					{
					setState(89);
					match(ADD_OP);
					setState(90);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).ADD_OP!=null?((Arith_expressionContext)_localctx).ADD_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case SUB_OP:
					{
					setState(93);
					match(SUB_OP);
					setState(94);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).SUB_OP!=null?((Arith_expressionContext)_localctx).SUB_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case EQ_OP:
					{
					setState(97);
					match(EQ_OP);
					setState(98);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).EQ_OP!=null?((Arith_expressionContext)_localctx).EQ_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case LE_OP:
					{
					setState(101);
					match(LE_OP);
					setState(102);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).LE_OP!=null?((Arith_expressionContext)_localctx).LE_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case GE_OP:
					{
					setState(105);
					match(GE_OP);
					setState(106);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).GE_OP!=null?((Arith_expressionContext)_localctx).GE_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case NE_OP:
					{
					setState(109);
					match(NE_OP);
					setState(110);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).NE_OP!=null?((Arith_expressionContext)_localctx).NE_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case GREATER_OP:
					{
					setState(113);
					match(GREATER_OP);
					setState(114);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).GREATER_OP!=null?((Arith_expressionContext)_localctx).GREATER_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				case LESS_OP:
					{
					setState(117);
					match(LESS_OP);
					setState(118);
					((Arith_expressionContext)_localctx).b = multExpr();
					 
					          if (!match_operands(((Arith_expressionContext)_localctx).a.attr_type, ((Arith_expressionContext)_localctx).b.attr_type, (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine(), (((Arith_expressionContext)_localctx).LESS_OP!=null?((Arith_expressionContext)_localctx).LESS_OP.getText():null))) ((Arith_expressionContext)_localctx).attr_type =  0;
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public int attr_type;
		public SignExprContext a;
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public List<TerminalNode> MUL_OP() { return getTokens(myCheckerParser.MUL_OP); }
		public TerminalNode MUL_OP(int i) {
			return getToken(myCheckerParser.MUL_OP, i);
		}
		public List<TerminalNode> DIV_OP() { return getTokens(myCheckerParser.DIV_OP); }
		public TerminalNode DIV_OP(int i) {
			return getToken(myCheckerParser.DIV_OP, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((MultExprContext)_localctx).a = signExpr();
			 
			    if (TRACEON) System.out.println("multExpr: signExpr ( MUL_OP signExpr | DIV_OP signExpr )*");
			    ((MultExprContext)_localctx).attr_type =  Math.abs(((MultExprContext)_localctx).a.attr_type); 
			    
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV_OP || _la==MUL_OP) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL_OP:
					{
					setState(128);
					match(MUL_OP);
					setState(129);
					signExpr();
					}
					break;
				case DIV_OP:
					{
					setState(130);
					match(DIV_OP);
					setState(131);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignExprContext extends ParserRuleContext {
		public int attr_type;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signExpr);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case Character_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				primaryExpr();
				 
				  if (TRACEON) System.out.println("signExpr: primaryExpr");
				  ((SignExprContext)_localctx).attr_type =  Math.abs(((SignExprContext)_localctx).primaryExpr.attr_type); 
				  
				}
				break;
			case SUB_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(SUB_OP);
				setState(141);
				primaryExpr();
				 
				    if (TRACEON) System.out.println("signExpr: SUB_OP primaryExpr");
				    ((SignExprContext)_localctx).attr_type =  Math.abs(((SignExprContext)_localctx).primaryExpr.attr_type); 
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public int attr_type;
		public TerminalNode Integer_constant() { return getToken(myCheckerParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myCheckerParser.Floating_point_constant, 0); }
		public TerminalNode Character_constant() { return getToken(myCheckerParser.Character_constant, 0); }
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primaryExpr);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(Integer_constant);
				 
				    if (TRACEON) System.out.println("primaryExpr: Integer_constant");
				    ((PrimaryExprContext)_localctx).attr_type =  -1; 
				    
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(Floating_point_constant);
				 
				    if (TRACEON) System.out.println("primaryExpr: Floating_point_constant");
				    ((PrimaryExprContext)_localctx).attr_type =  -2; 
				    
				}
				break;
			case Character_constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(Character_constant);
				 
				    if (TRACEON) System.out.println("primaryExpr: Character_constant");
				    ((PrimaryExprContext)_localctx).attr_type =  -3; 
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(Identifier);

				       if (TRACEON) System.out.println("primaryExpr: Identifier");
				       if (symtab.containsKey((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null))) {
					       ((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null));
					   } 
				     else {
				        System.out.println("Type Error: line: " + ((PrimaryExprContext)_localctx).Identifier.getLine() + ": " + (((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null) + ": not declared.");
					      ((PrimaryExprContext)_localctx).attr_type =  0;
				       }
				    
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(T__0);
				setState(155);
				arith_expression();
				setState(156);
				match(T__1);
				 
				    if (TRACEON) System.out.println("primaryExpr: '(' arith_expression ')'");
				    ((PrimaryExprContext)_localctx).attr_type =  ((PrimaryExprContext)_localctx).arith_expression.attr_type; 
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uniry_opContext extends ParserRuleContext {
		public int attr_type;
		public Uniry_op_Context uniry_op_() {
			return getRuleContext(Uniry_op_Context.class,0);
		}
		public Uniry_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniry_op; }
	}

	public final Uniry_opContext uniry_op() throws RecognitionException {
		Uniry_opContext _localctx = new Uniry_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_uniry_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			uniry_op_();

			    if (symtab.containsKey(((Uniry_opContext)_localctx).uniry_op_.id_)) {
				       ((Uniry_opContext)_localctx).attr_type =  symtab.get(((Uniry_opContext)_localctx).uniry_op_.id_);
				  } 
			    else {
			      System.out.println("Type Error: line: " + (((Uniry_opContext)_localctx).uniry_op_!=null?(((Uniry_opContext)_localctx).uniry_op_.start):null).getLine() + ": " + ((Uniry_opContext)_localctx).uniry_op_.id_ + ": not declared.");
				    ((Uniry_opContext)_localctx).attr_type =  0;
			    }
			    if (_localctx.attr_type<0) { 
			      System.out.println("Type Error: line: " + (((Uniry_opContext)_localctx).uniry_op_!=null?(((Uniry_opContext)_localctx).uniry_op_.start):null).getLine() + ": " + ((Uniry_opContext)_localctx).uniry_op_.id_ + ": is constant.");
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uniry_op_Context extends ParserRuleContext {
		public String id_;
		public TerminalNode PP_OP() { return getToken(myCheckerParser.PP_OP, 0); }
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode MM_OP() { return getToken(myCheckerParser.MM_OP, 0); }
		public Uniry_op_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniry_op_; }
	}

	public final Uniry_op_Context uniry_op_() throws RecognitionException {
		Uniry_op_Context _localctx = new Uniry_op_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_uniry_op_);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(PP_OP);
				setState(165);
				match(Identifier);

				      if(TRACEON) System.out.println("uniry_op_: PP_OP Identidier");
				      ((Uniry_op_Context)_localctx).id_ =  (((Uniry_op_Context)_localctx).Identifier!=null?((Uniry_op_Context)_localctx).Identifier.getText():null);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(Identifier);
				setState(168);
				match(PP_OP);

				      if(TRACEON) System.out.println("uniry_op_: Identifier PP_OP");
				      ((Uniry_op_Context)_localctx).id_ =  (((Uniry_op_Context)_localctx).Identifier!=null?((Uniry_op_Context)_localctx).Identifier.getText():null);
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(MM_OP);
				setState(171);
				match(Identifier);

				      if(TRACEON) System.out.println("uniry_op_: MM_OP Identidier");
				      ((Uniry_op_Context)_localctx).id_ =  (((Uniry_op_Context)_localctx).Identifier!=null?((Uniry_op_Context)_localctx).Identifier.getText():null);
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(Identifier);
				setState(174);
				match(MM_OP);

				      if(TRACEON) System.out.println("uniry_op_: Identifier MM_OP");
				      ((Uniry_op_Context)_localctx).id_ =  (((Uniry_op_Context)_localctx).Identifier!=null?((Uniry_op_Context)_localctx).Identifier.getText():null);
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_statementContext extends ParserRuleContext {
		public int attr_type;
		public Uniry_opContext uniry_op() {
			return getRuleContext(Uniry_opContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(myCheckerParser.ASSIGN_OP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Sub_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_statement; }
	}

	public final Sub_statementContext sub_statement() throws RecognitionException {
		Sub_statementContext _localctx = new Sub_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sub_statement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				uniry_op();

				        if (TRACEON) System.out.println("sub_statement: uniry_op");
				        ((Sub_statementContext)_localctx).attr_type =  ((Sub_statementContext)_localctx).uniry_op.attr_type;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(Identifier);
				setState(182);
				match(ASSIGN_OP);
				setState(183);
				arith_expression();

				        if (TRACEON) System.out.println("sub_statement: Identifier ASSIGN_OP arith_expression ( " + (((Sub_statementContext)_localctx).Identifier!=null?((Sub_statementContext)_localctx).Identifier.getText():null) + " = " + (((Sub_statementContext)_localctx).arith_expression!=null?_input.getText(((Sub_statementContext)_localctx).arith_expression.start,((Sub_statementContext)_localctx).arith_expression.stop):null) + " )");
				        if (symtab.containsKey((((Sub_statementContext)_localctx).Identifier!=null?((Sub_statementContext)_localctx).Identifier.getText():null))) {
					          ((Sub_statementContext)_localctx).attr_type =  symtab.get((((Sub_statementContext)_localctx).Identifier!=null?((Sub_statementContext)_localctx).Identifier.getText():null));
					      } 
				        else {
				            System.out.println("Type Error: line: " + (((Sub_statementContext)_localctx).arith_expression!=null?(((Sub_statementContext)_localctx).arith_expression.start):null).getLine() + ": " 
				                              + (((Sub_statementContext)_localctx).Identifier!=null?((Sub_statementContext)_localctx).Identifier.getText():null) + ": not declared.");
					          ((Sub_statementContext)_localctx).attr_type =  0;
					      }
				        if (_localctx.attr_type < 0) {
				           System.out.println("Type Error: line: " + (((Sub_statementContext)_localctx).arith_expression!=null?(((Sub_statementContext)_localctx).arith_expression.start):null).getLine()  + ": Assign value to constant: " + (((Sub_statementContext)_localctx).Identifier!=null?((Sub_statementContext)_localctx).Identifier.getText():null));
				        }
					      if (_localctx.attr_type==0 || ((Sub_statementContext)_localctx).arith_expression.attr_type==0 || Math.abs(_localctx.attr_type) != Math.abs(((Sub_statementContext)_localctx).arith_expression.attr_type)) {
				            System.out.println("Type Error: line: " + (((Sub_statementContext)_localctx).arith_expression!=null?(((Sub_statementContext)_localctx).arith_expression.start):null).getLine() +
				                              ": Type mismatch for the two silde operands in an assignment statement. (" +
				                              type_dict[Math.abs(_localctx.attr_type)] + " vs " +
				                              type_dict[Math.abs(((Sub_statementContext)_localctx).arith_expression.attr_type)] + ")");
						        ((Sub_statementContext)_localctx).attr_type =  0;
				        }
					    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				arith_expression();

				       if (TRACEON) System.out.println("sub_statement: arith_expression");
				       ((Sub_statementContext)_localctx).attr_type =  ((Sub_statementContext)_localctx).arith_expression.attr_type;
				       
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public int attr_type;
		public Sub_statementContext sub_statement() {
			return getRuleContext(Sub_statementContext.class,0);
		}
		public Ifelse_statementsContext ifelse_statements() {
			return getRuleContext(Ifelse_statementsContext.class,0);
		}
		public For_statementsContext for_statements() {
			return getRuleContext(For_statementsContext.class,0);
		}
		public While_statementsContext while_statements() {
			return getRuleContext(While_statementsContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(myCheckerParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(myCheckerParser.RETURN, 0); }
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode Character_constant() { return getToken(myCheckerParser.Character_constant, 0); }
		public TerminalNode Integer_constant() { return getToken(myCheckerParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myCheckerParser.Floating_point_constant, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PP_OP:
			case MM_OP:
			case SUB_OP:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case Character_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				sub_statement();
				setState(192);
				match(T__4);

				    if (TRACEON) System.out.println("statement: sub_statement ';'");
				    ((StatementContext)_localctx).attr_type =  ((StatementContext)_localctx).sub_statement.attr_type;
				    
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				ifelse_statements();
				if (TRACEON) System.out.println("statement: ifelse_statements"); 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				for_statements();
				if (TRACEON) System.out.println("statement: for_statements"); 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				while_statements();
				if (TRACEON) System.out.println("statement: while_statements"); 
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				print_statement();
				if (TRACEON) System.out.println("statement: print_statement"); 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(BREAK);
				if (TRACEON) System.out.println("statement: BREAK"); 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(RETURN);
				setState(210);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Integer_constant) | (1L << Floating_point_constant) | (1L << Character_constant))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				match(T__4);

				    if (TRACEON) System.out.println("statement: RETURN (Identifier|Character_constant|Integer_constant|Floating_point_constant) ';'");
				  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ifelse_statementsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myCheckerParser.IF, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public List<Block_of_statementsContext> block_of_statements() {
			return getRuleContexts(Block_of_statementsContext.class);
		}
		public Block_of_statementsContext block_of_statements(int i) {
			return getRuleContext(Block_of_statementsContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(myCheckerParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(myCheckerParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(myCheckerParser.ELSE, 0); }
		public Ifelse_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_statements; }
	}

	public final Ifelse_statementsContext ifelse_statements() throws RecognitionException {
		Ifelse_statementsContext _localctx = new Ifelse_statementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifelse_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF);
			setState(216);
			match(T__0);
			setState(217);
			arith_expression();
			setState(218);
			match(T__1);
			setState(219);
			block_of_statements();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(ELSE_IF);
					setState(221);
					match(T__0);
					setState(222);
					arith_expression();
					setState(223);
					match(T__1);
					setState(224);
					block_of_statements();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(231);
				match(ELSE);
				setState(232);
				block_of_statements();
				}
				break;
			}

			      if (TRACEON) System.out.println("ifelse_statements: IF '(' arith_expression ')' block_of_statements (ELSE_IF '(' arith_expression ')' block_of_statements)* (ELSE block_of_statements)?"); 
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementsContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(myCheckerParser.FOR, 0); }
		public List<Sub_statementContext> sub_statement() {
			return getRuleContexts(Sub_statementContext.class);
		}
		public Sub_statementContext sub_statement(int i) {
			return getRuleContext(Sub_statementContext.class,i);
		}
		public Block_of_statementsContext block_of_statements() {
			return getRuleContext(Block_of_statementsContext.class,0);
		}
		public For_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statements; }
	}

	public final For_statementsContext for_statements() throws RecognitionException {
		For_statementsContext _localctx = new For_statementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(FOR);
			setState(238);
			match(T__0);
			setState(239);
			sub_statement();
			setState(240);
			match(T__4);
			setState(241);
			sub_statement();
			setState(242);
			match(T__4);
			setState(243);
			sub_statement();
			setState(244);
			match(T__1);
			setState(245);
			block_of_statements();

			  if (TRACEON) System.out.println("statement: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')'  block_of_statements");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementsContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(myCheckerParser.WHILE, 0); }
		public Sub_statementContext sub_statement() {
			return getRuleContext(Sub_statementContext.class,0);
		}
		public Block_of_statementsContext block_of_statements() {
			return getRuleContext(Block_of_statementsContext.class,0);
		}
		public While_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statements; }
	}

	public final While_statementsContext while_statements() throws RecognitionException {
		While_statementsContext _localctx = new While_statementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(WHILE);
			setState(249);
			match(T__0);
			setState(250);
			sub_statement();
			setState(251);
			match(T__1);
			setState(252);
			block_of_statements();

			  if (TRACEON) System.out.println("while_statements: WHILE '('sub_statement ')' block_of_statements");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_of_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Block_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_of_statements; }
	}

	public final Block_of_statementsContext block_of_statements() throws RecognitionException {
		Block_of_statementsContext _localctx = new Block_of_statementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block_of_statements);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PRINTF:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case RETURN:
			case PP_OP:
			case MM_OP:
			case SUB_OP:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case Character_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				statement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__2);
				setState(257);
				statements();
				setState(258);
				match(T__3);
				if (TRACEON) System.out.println("block_of_statements: {statements}");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(myCheckerParser.PRINTF, 0); }
		public TerminalNode Literal_constant() { return getToken(myCheckerParser.Literal_constant, 0); }
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(PRINTF);
			setState(264);
			match(T__0);
			setState(265);
			match(Literal_constant);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_OP) {
				{
				setState(266);
				match(COMMA_OP);
				setState(267);
				match(Identifier);
				}
			}

			setState(270);
			match(T__5);
			if (TRACEON) System.out.println("PRINTF '(' Literal_constant (',' Identifier)? ');'");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3\3\5\3"+
		"E\n\3\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3"+
		"\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0087"+
		"\n\b\f\b\16\b\u008a\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c0\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d8\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e5\n\17\f\17\16\17\u00e8\13\17"+
		"\3\17\3\17\5\17\u00ec\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0108\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u010f\n"+
		"\23\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\4\4\2\n\n\17\17\4\29;==\2\u0126\2&\3\2\2\2\4D\3\2\2\2\6I\3\2\2"+
		"\2\bQ\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16\u0080\3\2\2\2\20\u0092\3\2\2\2"+
		"\22\u00a1\3\2\2\2\24\u00a3\3\2\2\2\26\u00b2\3\2\2\2\30\u00bf\3\2\2\2\32"+
		"\u00d7\3\2\2\2\34\u00d9\3\2\2\2\36\u00ef\3\2\2\2 \u00fa\3\2\2\2\"\u0107"+
		"\3\2\2\2$\u0109\3\2\2\2&\'\t\2\2\2\'(\7\r\2\2(,\7\3\2\2)+\13\2\2\2*)\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\4\2\2\60"+
		"\61\7\5\2\2\61\62\5\4\3\2\62\63\5\n\6\2\63\64\7\6\2\2\64\65\b\2\1\2\65"+
		"\3\3\2\2\2\66\67\5\6\4\2\678\5\b\5\289\79\2\29>\b\3\1\2:;\7*\2\2;<\5\f"+
		"\7\2<=\b\3\1\2=?\3\2\2\2>:\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\7\2\2AB\5\4"+
		"\3\2BE\3\2\2\2CE\b\3\1\2D\66\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\f\2\2GJ"+
		"\b\4\1\2HJ\b\4\1\2IF\3\2\2\2IH\3\2\2\2J\7\3\2\2\2KL\7\n\2\2LR\b\5\1\2"+
		"MN\7\t\2\2NR\b\5\1\2OP\7\13\2\2PR\b\5\1\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2"+
		"\2R\t\3\2\2\2ST\5\32\16\2TU\5\n\6\2UX\3\2\2\2VX\3\2\2\2WS\3\2\2\2WV\3"+
		"\2\2\2X\13\3\2\2\2YZ\5\16\b\2Z}\b\7\1\2[\\\7\60\2\2\\]\5\16\b\2]^\b\7"+
		"\1\2^|\3\2\2\2_`\7\61\2\2`a\5\16\b\2ab\b\7\1\2b|\3\2\2\2cd\7\27\2\2de"+
		"\5\16\b\2ef\b\7\1\2f|\3\2\2\2gh\7\30\2\2hi\5\16\b\2ij\b\7\1\2j|\3\2\2"+
		"\2kl\7\31\2\2lm\5\16\b\2mn\b\7\1\2n|\3\2\2\2op\7\32\2\2pq\5\16\b\2qr\b"+
		"\7\1\2r|\3\2\2\2st\7,\2\2tu\5\16\b\2uv\b\7\1\2v|\3\2\2\2wx\7+\2\2xy\5"+
		"\16\b\2yz\b\7\1\2z|\3\2\2\2{[\3\2\2\2{_\3\2\2\2{c\3\2\2\2{g\3\2\2\2{k"+
		"\3\2\2\2{o\3\2\2\2{s\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\r\3\2\2\2\177}\3\2\2\2\u0080\u0081\5\20\t\2\u0081\u0088\b\b\1\2\u0082"+
		"\u0083\7\63\2\2\u0083\u0087\5\20\t\2\u0084\u0085\7\62\2\2\u0085\u0087"+
		"\5\20\t\2\u0086\u0082\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\17\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\5\22\n\2\u008c\u008d\b\t\1\2\u008d\u0093\3\2\2\2"+
		"\u008e\u008f\7\61\2\2\u008f\u0090\5\22\n\2\u0090\u0091\b\t\1\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008e\3\2\2\2\u0093\21\3\2\2\2\u0094"+
		"\u0095\7:\2\2\u0095\u00a2\b\n\1\2\u0096\u0097\7;\2\2\u0097\u00a2\b\n\1"+
		"\2\u0098\u0099\7=\2\2\u0099\u00a2\b\n\1\2\u009a\u009b\79\2\2\u009b\u00a2"+
		"\b\n\1\2\u009c\u009d\7\3\2\2\u009d\u009e\5\f\7\2\u009e\u009f\7\4\2\2\u009f"+
		"\u00a0\b\n\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0096\3\2"+
		"\2\2\u00a1\u0098\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\b\13\1\2\u00a5\25\3\2\2\2"+
		"\u00a6\u00a7\7#\2\2\u00a7\u00a8\79\2\2\u00a8\u00b3\b\f\1\2\u00a9\u00aa"+
		"\79\2\2\u00aa\u00ab\7#\2\2\u00ab\u00b3\b\f\1\2\u00ac\u00ad\7$\2\2\u00ad"+
		"\u00ae\79\2\2\u00ae\u00b3\b\f\1\2\u00af\u00b0\79\2\2\u00b0\u00b1\7$\2"+
		"\2\u00b1\u00b3\b\f\1\2\u00b2\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac"+
		"\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\5\24\13\2\u00b5"+
		"\u00b6\b\r\1\2\u00b6\u00c0\3\2\2\2\u00b7\u00b8\79\2\2\u00b8\u00b9\7*\2"+
		"\2\u00b9\u00ba\5\f\7\2\u00ba\u00bb\b\r\1\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd"+
		"\5\f\7\2\u00bd\u00be\b\r\1\2\u00be\u00c0\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\5\30\r"+
		"\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\b\16\1\2\u00c4\u00d8\3\2\2\2\u00c5"+
		"\u00c6\5\34\17\2\u00c6\u00c7\b\16\1\2\u00c7\u00d8\3\2\2\2\u00c8\u00c9"+
		"\5\36\20\2\u00c9\u00ca\b\16\1\2\u00ca\u00d8\3\2\2\2\u00cb\u00cc\5 \21"+
		"\2\u00cc\u00cd\b\16\1\2\u00cd\u00d8\3\2\2\2\u00ce\u00cf\5$\23\2\u00cf"+
		"\u00d0\b\16\1\2\u00d0\u00d8\3\2\2\2\u00d1\u00d2\7\25\2\2\u00d2\u00d8\b"+
		"\16\1\2\u00d3\u00d4\7\26\2\2\u00d4\u00d5\t\3\2\2\u00d5\u00d6\7\7\2\2\u00d6"+
		"\u00d8\b\16\1\2\u00d7\u00c1\3\2\2\2\u00d7\u00c5\3\2\2\2\u00d7\u00c8\3"+
		"\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d8\33\3\2\2\2\u00d9\u00da\7\20\2\2\u00da\u00db\7\3\2"+
		"\2\u00db\u00dc\5\f\7\2\u00dc\u00dd\7\4\2\2\u00dd\u00e6\5\"\22\2\u00de"+
		"\u00df\7\21\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\5\f\7\2\u00e1\u00e2\7"+
		"\4\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\22\2\2\u00ea\u00ec\5\"\22\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\17"+
		"\1\2\u00ee\35\3\2\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2"+
		"\5\30\r\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\7\7\2\2"+
		"\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9"+
		"\b\20\1\2\u00f9\37\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\7\3\2\2\u00fc"+
		"\u00fd\5\30\r\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\b"+
		"\21\1\2\u0100!\3\2\2\2\u0101\u0108\5\32\16\2\u0102\u0103\7\5\2\2\u0103"+
		"\u0104\5\n\6\2\u0104\u0105\7\6\2\2\u0105\u0106\b\22\1\2\u0106\u0108\3"+
		"\2\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0108#\3\2\2\2\u0109\u010a"+
		"\7\16\2\2\u010a\u010b\7\3\2\2\u010b\u010e\7<\2\2\u010c\u010d\7\65\2\2"+
		"\u010d\u010f\79\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\7\b\2\2\u0111\u0112\b\23\1\2\u0112%\3\2\2\2\25,>"+
		"DIQW{}\u0086\u0088\u0092\u00a1\u00b2\u00bf\u00d7\u00e6\u00eb\u0107\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}