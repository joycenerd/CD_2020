// Generated from /home/dmplus/CD_2020/project_2/myparser.g by ANTLR 4.7.1

// import packages here.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FLOAT=7, INT=8, CHAR=9, 
		MAIN=10, PRINTF=11, VOID=12, IF=13, ELSEIF=14, ELSE=15, FOR=16, WHILE=17, 
		BREAK=18, RETURN=19, EQ_OP=20, LE_OP=21, GE_OP=22, NE_OP=23, ADD_ASS_OP=24, 
		SUB_ASS_OP=25, MUL_ASS_OP=26, DIV_ASS_OP=27, MOD_ASS_OP=28, AND_ASS_OP=29, 
		OR_ASS_OP=30, XOR_ASS_OP=31, PP_OP=32, MM_OP=33, AND_OP=34, OR_OP=35, 
		RSHIFT_OP=36, LSHIFT_OP=37, ARROW_OP=38, ASSIGN_OP=39, LESS_OP=40, GREATER_OP=41, 
		BIT_AND_OP=42, BIT_OR_OP=43, BIT_XOR_OP=44, ADD_OP=45, SUB_OP=46, DIV_OP=47, 
		MUL_OP=48, MOD_OP=49, COMMA_OP=50, DOT_OP=51, TRINARY_OP1=52, TRINARY_OP2=53, 
		Identifier=54, Integer_constant=55, Floating_point_constant=56, Literal_constant=57, 
		Character_constant=58, WS=59, COMMENT=60, MACRO=61, ELSE_IF=62;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_constants = 2, RULE_dec_ids = 3, 
		RULE_type = 4, RULE_statements = 5, RULE_arith_expression = 6, RULE_uniry_op = 7, 
		RULE_incrment_op = 8, RULE_decrement_op = 9, RULE_multExpr = 10, RULE_signExpr = 11, 
		RULE_primaryExpr = 12, RULE_sub_statement = 13, RULE_statement = 14, RULE_ifelse_statements = 15, 
		RULE_for_statements = 16, RULE_while_statements = 17, RULE_block_of_statements = 18, 
		RULE_print_statement = 19;
	public static final String[] ruleNames = {
		"program", "declarations", "constants", "dec_ids", "type", "statements", 
		"arith_expression", "uniry_op", "incrment_op", "decrement_op", "multExpr", 
		"signExpr", "primaryExpr", "sub_statement", "statement", "ifelse_statements", 
		"for_statements", "while_statements", "block_of_statements", "print_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "');'", "'float'", "'int'", "'char'", 
		"'main'", "'printf'", "'void'", "'if'", "'else if'", "'else'", "'for'", 
		"'while'", "'break'", "'return'", "'=='", "'<='", "'>='", "'!='", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'++'", "'--'", 
		"'&&'", "'||'", "'<<'", "'>>'", "'->'", "'='", "'<'", "'>'", "'&'", "'|'", 
		"'^'", "'+'", "'-'", "'/'", "'*'", "'%'", "','", "'.'", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "FLOAT", "INT", "CHAR", "MAIN", 
		"PRINTF", "VOID", "IF", "ELSEIF", "ELSE", "FOR", "WHILE", "BREAK", "RETURN", 
		"EQ_OP", "LE_OP", "GE_OP", "NE_OP", "ADD_ASS_OP", "SUB_ASS_OP", "MUL_ASS_OP", 
		"DIV_ASS_OP", "MOD_ASS_OP", "AND_ASS_OP", "OR_ASS_OP", "XOR_ASS_OP", "PP_OP", 
		"MM_OP", "AND_OP", "OR_OP", "RSHIFT_OP", "LSHIFT_OP", "ARROW_OP", "ASSIGN_OP", 
		"LESS_OP", "GREATER_OP", "BIT_AND_OP", "BIT_OR_OP", "BIT_XOR_OP", "ADD_OP", 
		"SUB_OP", "DIV_OP", "MUL_OP", "MOD_OP", "COMMA_OP", "DOT_OP", "TRINARY_OP1", 
		"TRINARY_OP2", "Identifier", "Integer_constant", "Floating_point_constant", 
		"Literal_constant", "Character_constant", "WS", "COMMENT", "MACRO", "ELSE_IF"
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
	public String getGrammarFileName() { return "myparser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	boolean TRACEON = true;

	public myparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(myparserParser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode VOID() { return getToken(myparserParser.VOID, 0); }
		public TerminalNode INT() { return getToken(myparserParser.INT, 0); }
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
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			match(MAIN);
			setState(42);
			match(T__0);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					matchWildcard();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			match(T__1);
			setState(50);
			match(T__2);
			setState(51);
			declarations();
			setState(52);
			statements();
			setState(53);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Dec_idsContext dec_ids() {
			return getRuleContext(Dec_idsContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				type();
				setState(57);
				dec_ids();
				setState(58);
				match(T__4);
				setState(59);
				declarations();
				 if (TRACEON) System.out.println("declarations: type dec_ids ';' declarations"); 
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

	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode Integer_constant() { return getToken(myparserParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myparserParser.Floating_point_constant, 0); }
		public TerminalNode Character_constant() { return getToken(myparserParser.Character_constant, 0); }
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constants);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(Integer_constant);
				 if (TRACEON) System.out.println("constants: Integer_constant"); 
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(Floating_point_constant);
				 if (TRACEON) System.out.println("constants: Floating_point_constant"); 
				}
				break;
			case Character_constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(Character_constant);
				 if (TRACEON) System.out.println("constants: Character_constant"); 
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

	public static class Dec_idsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public Dec_idsContext dec_ids() {
			return getRuleContext(Dec_idsContext.class,0);
		}
		public Dec_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_ids; }
	}

	public final Dec_idsContext dec_ids() throws RecognitionException {
		Dec_idsContext _localctx = new Dec_idsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_ids);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(Identifier);
				setState(74);
				match(ASSIGN_OP);
				setState(75);
				constants();
				setState(76);
				match(COMMA_OP);
				setState(77);
				dec_ids();
				 if (TRACEON) System.out.println("dec_ids: Identifier '=' constants ',' dec_ids ( " + (((Dec_idsContext)_localctx).Identifier!=null?((Dec_idsContext)_localctx).Identifier.getText():null) + " : " + (((Dec_idsContext)_localctx).constants!=null?_input.getText(((Dec_idsContext)_localctx).constants.start,((Dec_idsContext)_localctx).constants.stop):null) + " )" ); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(Identifier);
				setState(81);
				match(COMMA_OP);
				setState(82);
				dec_ids();
				 if (TRACEON) System.out.println("dec_ids: Identifier ',' dec_ids ( " + (((Dec_idsContext)_localctx).Identifier!=null?((Dec_idsContext)_localctx).Identifier.getText():null) + " )"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(Identifier);
				 if (TRACEON) System.out.println( "dec_ids: Identifier ( " + (((Dec_idsContext)_localctx).Identifier!=null?((Dec_idsContext)_localctx).Identifier.getText():null) + " )"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(Identifier);
				setState(88);
				match(ASSIGN_OP);
				setState(89);
				constants();
				 if (TRACEON) System.out.println("dec_ids: Identifier '=' constants" + " ( " + (((Dec_idsContext)_localctx).Identifier!=null?((Dec_idsContext)_localctx).Identifier.getText():null) + " : " + (((Dec_idsContext)_localctx).constants!=null?_input.getText(((Dec_idsContext)_localctx).constants.start,((Dec_idsContext)_localctx).constants.stop):null) + " )"); 
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(myparserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myparserParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(myparserParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(myparserParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(CHAR);
				if (TRACEON) System.out.println("type: CHAR"); 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(VOID);
				if (TRACEON) System.out.println("type: VOID"); 
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
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(109);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				statement();
				setState(105);
				statements();
				if (TRACEON) System.out.println("statements:statement statements"); 
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
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> ADD_OP() { return getTokens(myparserParser.ADD_OP); }
		public TerminalNode ADD_OP(int i) {
			return getToken(myparserParser.ADD_OP, i);
		}
		public List<TerminalNode> SUB_OP() { return getTokens(myparserParser.SUB_OP); }
		public TerminalNode SUB_OP(int i) {
			return getToken(myparserParser.SUB_OP, i);
		}
		public List<TerminalNode> EQ_OP() { return getTokens(myparserParser.EQ_OP); }
		public TerminalNode EQ_OP(int i) {
			return getToken(myparserParser.EQ_OP, i);
		}
		public List<TerminalNode> LE_OP() { return getTokens(myparserParser.LE_OP); }
		public TerminalNode LE_OP(int i) {
			return getToken(myparserParser.LE_OP, i);
		}
		public List<TerminalNode> GE_OP() { return getTokens(myparserParser.GE_OP); }
		public TerminalNode GE_OP(int i) {
			return getToken(myparserParser.GE_OP, i);
		}
		public List<TerminalNode> NE_OP() { return getTokens(myparserParser.NE_OP); }
		public TerminalNode NE_OP(int i) {
			return getToken(myparserParser.NE_OP, i);
		}
		public List<TerminalNode> GREATER_OP() { return getTokens(myparserParser.GREATER_OP); }
		public TerminalNode GREATER_OP(int i) {
			return getToken(myparserParser.GREATER_OP, i);
		}
		public List<TerminalNode> LESS_OP() { return getTokens(myparserParser.LESS_OP); }
		public TerminalNode LESS_OP(int i) {
			return getToken(myparserParser.LESS_OP, i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			multExpr();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << LE_OP) | (1L << GE_OP) | (1L << NE_OP) | (1L << LESS_OP) | (1L << GREATER_OP) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD_OP:
					{
					setState(112);
					match(ADD_OP);
					setState(113);
					multExpr();
					}
					break;
				case SUB_OP:
					{
					setState(114);
					match(SUB_OP);
					setState(115);
					multExpr();
					}
					break;
				case EQ_OP:
					{
					setState(116);
					match(EQ_OP);
					setState(117);
					multExpr();
					}
					break;
				case LE_OP:
					{
					setState(118);
					match(LE_OP);
					setState(119);
					multExpr();
					}
					break;
				case GE_OP:
					{
					setState(120);
					match(GE_OP);
					setState(121);
					multExpr();
					}
					break;
				case NE_OP:
					{
					setState(122);
					match(NE_OP);
					setState(123);
					multExpr();
					}
					break;
				case GREATER_OP:
					{
					setState(124);
					match(GREATER_OP);
					setState(125);
					multExpr();
					}
					break;
				case LESS_OP:
					{
					setState(126);
					match(LESS_OP);
					setState(127);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if (TRACEON) System.out.println("arith_expression: multExpr ( ADD_OP multExpr| SUB_OP multExpr | EQ_OP multExpr | LE_OP multExpr | GE_OP multExpr | NE_OP multExpr | GREATER_OP multExpr | LESS_OP multExpr)*"); 
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
		public Incrment_opContext incrment_op() {
			return getRuleContext(Incrment_opContext.class,0);
		}
		public Decrement_opContext decrement_op() {
			return getRuleContext(Decrement_opContext.class,0);
		}
		public Uniry_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniry_op; }
	}

	public final Uniry_opContext uniry_op() throws RecognitionException {
		Uniry_opContext _localctx = new Uniry_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_uniry_op);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				incrment_op();
				if (TRACEON) System.out.println("uniry_op: incrment_op"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				decrement_op();
				if (TRACEON) System.out.println("uniry_op: incrment_op"); 
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

	public static class Incrment_opContext extends ParserRuleContext {
		public TerminalNode PP_OP() { return getToken(myparserParser.PP_OP, 0); }
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public Incrment_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrment_op; }
	}

	public final Incrment_opContext incrment_op() throws RecognitionException {
		Incrment_opContext _localctx = new Incrment_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_incrment_op);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PP_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(PP_OP);
				setState(144);
				match(Identifier);
				if (TRACEON) System.out.println("incrment_op: PP_OP Identifier"); 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(PP_OP);
				if (TRACEON) System.out.println("incrment_op: Identifier PP_OP"); 
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

	public static class Decrement_opContext extends ParserRuleContext {
		public TerminalNode MM_OP() { return getToken(myparserParser.MM_OP, 0); }
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public Decrement_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_op; }
	}

	public final Decrement_opContext decrement_op() throws RecognitionException {
		Decrement_opContext _localctx = new Decrement_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decrement_op);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MM_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(MM_OP);
				setState(152);
				match(Identifier);
				if (TRACEON) System.out.println("decrement_op: MM_OP Identifier"); 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(Identifier);
				setState(155);
				match(MM_OP);
				if (TRACEON) System.out.println("decrement_op: Identifier MM_OP"); 
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

	public static class MultExprContext extends ParserRuleContext {
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public List<TerminalNode> MUL_OP() { return getTokens(myparserParser.MUL_OP); }
		public TerminalNode MUL_OP(int i) {
			return getToken(myparserParser.MUL_OP, i);
		}
		public List<TerminalNode> DIV_OP() { return getTokens(myparserParser.DIV_OP); }
		public TerminalNode DIV_OP(int i) {
			return getToken(myparserParser.DIV_OP, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			signExpr();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV_OP || _la==MUL_OP) {
				{
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL_OP:
					{
					setState(160);
					match(MUL_OP);
					setState(161);
					signExpr();
					}
					break;
				case DIV_OP:
					{
					setState(162);
					match(DIV_OP);
					setState(163);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if (TRACEON) System.out.println("multExpr: signExpr ( MUL_OP signExpr | DIV_OP signExpr )*"); 
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
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode SUB_OP() { return getToken(myparserParser.SUB_OP, 0); }
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signExpr);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				primaryExpr();
				if (TRACEON) System.out.println("signExpr: primaryExpr"); 
				}
				break;
			case SUB_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(SUB_OP);
				setState(175);
				primaryExpr();
				if (TRACEON) System.out.println("signExpr: SUB_OP primaryExpr"); 
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
		public TerminalNode Integer_constant() { return getToken(myparserParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myparserParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
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
		enterRule(_localctx, 24, RULE_primaryExpr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(Integer_constant);
				if (TRACEON) System.out.println("primaryExpr: Integer_constant"); 
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(Floating_point_constant);
				if (TRACEON) System.out.println("primaryExpr: Floating_point_constant"); 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(Identifier);
				if (TRACEON) System.out.println("primaryExpr: Identifier"); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(T__0);
				setState(187);
				arith_expression();
				setState(188);
				match(T__1);
				if (TRACEON) System.out.println("primaryExpr: '(' arith_expression ')'"); 
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

	public static class Sub_statementContext extends ParserRuleContext {
		public Uniry_opContext uniry_op() {
			return getRuleContext(Uniry_opContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(myparserParser.ASSIGN_OP, 0); }
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
		enterRule(_localctx, 26, RULE_sub_statement);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				uniry_op();
				if (TRACEON) System.out.println("sub_statement: uniry_op"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(Identifier);
				setState(197);
				match(ASSIGN_OP);
				setState(198);
				arith_expression();
				if (TRACEON) System.out.println("sub_statement: Identifier ASSIGN_OP arith_expression ( " + (((Sub_statementContext)_localctx).Identifier!=null?((Sub_statementContext)_localctx).Identifier.getText():null) + " = " + (((Sub_statementContext)_localctx).arith_expression!=null?_input.getText(((Sub_statementContext)_localctx).arith_expression.start,((Sub_statementContext)_localctx).arith_expression.stop):null) + " )"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				arith_expression();
				if (TRACEON) System.out.println("sub_statement: arith_expression"); 
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
		public TerminalNode BREAK() { return getToken(myparserParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(myparserParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PP_OP:
			case MM_OP:
			case SUB_OP:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				sub_statement();
				setState(207);
				match(T__4);
				if (TRACEON) System.out.println("statement: sub_statement ';'"); 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				ifelse_statements();
				if (TRACEON) System.out.println("statement: ifelse_statements"); 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				for_statements();
				if (TRACEON) System.out.println("statement: for_statements"); 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				while_statements();
				if (TRACEON) System.out.println("statement: while_statements"); 
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				print_statement();
				if (TRACEON) System.out.println("statement: print_statement"); 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(BREAK);
				if (TRACEON) System.out.println("statement: BREAK"); 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				match(RETURN);
				setState(225);
				sub_statement();
				setState(226);
				match(T__4);
				 if (TRACEON) System.out.println("statement: RETURN sub_statement ';'"); 
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
		public TerminalNode IF() { return getToken(myparserParser.IF, 0); }
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
		public List<TerminalNode> ELSE_IF() { return getTokens(myparserParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(myparserParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(myparserParser.ELSE, 0); }
		public Ifelse_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_statements; }
	}

	public final Ifelse_statementsContext ifelse_statements() throws RecognitionException {
		Ifelse_statementsContext _localctx = new Ifelse_statementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifelse_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			setState(232);
			match(T__0);
			setState(233);
			arith_expression();
			setState(234);
			match(T__1);
			setState(235);
			block_of_statements();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(ELSE_IF);
					setState(237);
					match(T__0);
					setState(238);
					arith_expression();
					setState(239);
					match(T__1);
					setState(240);
					block_of_statements();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(247);
				match(ELSE);
				setState(248);
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
		public TerminalNode FOR() { return getToken(myparserParser.FOR, 0); }
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
		enterRule(_localctx, 32, RULE_for_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FOR);
			setState(254);
			match(T__0);
			setState(255);
			sub_statement();
			setState(256);
			match(T__4);
			setState(257);
			sub_statement();
			setState(258);
			match(T__4);
			setState(259);
			sub_statement();
			setState(260);
			match(T__1);
			setState(261);
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
		public TerminalNode WHILE() { return getToken(myparserParser.WHILE, 0); }
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
		enterRule(_localctx, 34, RULE_while_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(WHILE);
			setState(265);
			match(T__0);
			setState(266);
			sub_statement();
			setState(267);
			match(T__1);
			setState(268);
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
		enterRule(_localctx, 36, RULE_block_of_statements);
		try {
			setState(279);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				statement();
				 if (TRACEON) System.out.println("block_of_statements: statement"); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__2);
				setState(275);
				statements();
				setState(276);
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
		public TerminalNode PRINTF() { return getToken(myparserParser.PRINTF, 0); }
		public TerminalNode Literal_constant() { return getToken(myparserParser.Literal_constant, 0); }
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(PRINTF);
			setState(282);
			match(T__0);
			setState(283);
			match(Literal_constant);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_OP) {
				{
				setState(284);
				match(COMMA_OP);
				setState(285);
				match(Identifier);
				}
			}

			setState(288);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0083\n\b\f\b\16\b"+
		"\u0086\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a0\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00c2\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00e8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00f5\n\21\f\21\16\21\u00f8\13\21\3\21\3\21\5\21"+
		"\u00fc\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u011a\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0121\n\25\3"+
		"\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(\2\3\4\2\n\n\16\16\2\u0139\2*\3\2\2\2\4A\3\2\2\2\6I\3\2\2\2\b^\3\2\2"+
		"\2\nh\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20\u008f\3\2\2\2\22\u0097\3\2\2\2"+
		"\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00b4\3\2\2\2\32\u00c1\3\2\2\2\34"+
		"\u00ce\3\2\2\2\36\u00e7\3\2\2\2 \u00e9\3\2\2\2\"\u00ff\3\2\2\2$\u010a"+
		"\3\2\2\2&\u0119\3\2\2\2(\u011b\3\2\2\2*+\t\2\2\2+,\7\f\2\2,\60\7\3\2\2"+
		"-/\13\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2"+
		"\2\2\62\60\3\2\2\2\63\64\7\4\2\2\64\65\7\5\2\2\65\66\5\4\3\2\66\67\5\f"+
		"\7\2\678\7\6\2\289\b\2\1\29\3\3\2\2\2:;\5\n\6\2;<\5\b\5\2<=\7\7\2\2=>"+
		"\5\4\3\2>?\b\3\1\2?B\3\2\2\2@B\b\3\1\2A:\3\2\2\2A@\3\2\2\2B\5\3\2\2\2"+
		"CD\79\2\2DJ\b\4\1\2EF\7:\2\2FJ\b\4\1\2GH\7<\2\2HJ\b\4\1\2IC\3\2\2\2IE"+
		"\3\2\2\2IG\3\2\2\2J\7\3\2\2\2KL\78\2\2LM\7)\2\2MN\5\6\4\2NO\7\64\2\2O"+
		"P\5\b\5\2PQ\b\5\1\2Q_\3\2\2\2RS\78\2\2ST\7\64\2\2TU\5\b\5\2UV\b\5\1\2"+
		"V_\3\2\2\2WX\78\2\2X_\b\5\1\2YZ\78\2\2Z[\7)\2\2[\\\5\6\4\2\\]\b\5\1\2"+
		"]_\3\2\2\2^K\3\2\2\2^R\3\2\2\2^W\3\2\2\2^Y\3\2\2\2_\t\3\2\2\2`a\7\n\2"+
		"\2ai\b\6\1\2bc\7\t\2\2ci\b\6\1\2de\7\13\2\2ei\b\6\1\2fg\7\16\2\2gi\b\6"+
		"\1\2h`\3\2\2\2hb\3\2\2\2hd\3\2\2\2hf\3\2\2\2i\13\3\2\2\2jk\5\36\20\2k"+
		"l\5\f\7\2lm\b\7\1\2mp\3\2\2\2np\3\2\2\2oj\3\2\2\2on\3\2\2\2p\r\3\2\2\2"+
		"q\u0084\5\26\f\2rs\7/\2\2s\u0083\5\26\f\2tu\7\60\2\2u\u0083\5\26\f\2v"+
		"w\7\26\2\2w\u0083\5\26\f\2xy\7\27\2\2y\u0083\5\26\f\2z{\7\30\2\2{\u0083"+
		"\5\26\f\2|}\7\31\2\2}\u0083\5\26\f\2~\177\7+\2\2\177\u0083\5\26\f\2\u0080"+
		"\u0081\7*\2\2\u0081\u0083\5\26\f\2\u0082r\3\2\2\2\u0082t\3\2\2\2\u0082"+
		"v\3\2\2\2\u0082x\3\2\2\2\u0082z\3\2\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\b\1\2\u0088"+
		"\17\3\2\2\2\u0089\u008a\5\22\n\2\u008a\u008b\b\t\1\2\u008b\u0090\3\2\2"+
		"\2\u008c\u008d\5\24\13\2\u008d\u008e\b\t\1\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008c\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092\7\"\2"+
		"\2\u0092\u0093\78\2\2\u0093\u0098\b\n\1\2\u0094\u0095\78\2\2\u0095\u0096"+
		"\7\"\2\2\u0096\u0098\b\n\1\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\7#\2\2\u009a\u009b\78\2\2\u009b\u00a0\b\13\1\2"+
		"\u009c\u009d\78\2\2\u009d\u009e\7#\2\2\u009e\u00a0\b\13\1\2\u009f\u0099"+
		"\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a8\5\30\r\2\u00a2"+
		"\u00a3\7\62\2\2\u00a3\u00a7\5\30\r\2\u00a4\u00a5\7\61\2\2\u00a5\u00a7"+
		"\5\30\r\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\b\f\1\2\u00ac\27\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae"+
		"\u00af\b\r\1\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\5"+
		"\32\16\2\u00b2\u00b3\b\r\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\79\2\2\u00b7\u00c2\b\16\1"+
		"\2\u00b8\u00b9\7:\2\2\u00b9\u00c2\b\16\1\2\u00ba\u00bb\78\2\2\u00bb\u00c2"+
		"\b\16\1\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\7\4\2\2"+
		"\u00bf\u00c0\b\16\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00b8"+
		"\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\33\3\2\2\2\u00c3"+
		"\u00c4\5\20\t\2\u00c4\u00c5\b\17\1\2\u00c5\u00cf\3\2\2\2\u00c6\u00c7\7"+
		"8\2\2\u00c7\u00c8\7)\2\2\u00c8\u00c9\5\16\b\2\u00c9\u00ca\b\17\1\2\u00ca"+
		"\u00cf\3\2\2\2\u00cb\u00cc\5\16\b\2\u00cc\u00cd\b\17\1\2\u00cd\u00cf\3"+
		"\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf"+
		"\35\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\b\20"+
		"\1\2\u00d3\u00e8\3\2\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\20\1\2\u00d6"+
		"\u00e8\3\2\2\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\b\20\1\2\u00d9\u00e8\3"+
		"\2\2\2\u00da\u00db\5$\23\2\u00db\u00dc\b\20\1\2\u00dc\u00e8\3\2\2\2\u00dd"+
		"\u00de\5(\25\2\u00de\u00df\b\20\1\2\u00df\u00e8\3\2\2\2\u00e0\u00e1\7"+
		"\24\2\2\u00e1\u00e8\b\20\1\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\5\34\17"+
		"\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\b\20\1\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00d0\3\2\2\2\u00e7\u00d4\3\2\2\2\u00e7\u00d7\3\2\2\2\u00e7\u00da\3\2"+
		"\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e8"+
		"\37\3\2\2\2\u00e9\u00ea\7\17\2\2\u00ea\u00eb\7\3\2\2\u00eb\u00ec\5\16"+
		"\b\2\u00ec\u00ed\7\4\2\2\u00ed\u00f6\5&\24\2\u00ee\u00ef\7@\2\2\u00ef"+
		"\u00f0\7\3\2\2\u00f0\u00f1\5\16\b\2\u00f1\u00f2\7\4\2\2\u00f2\u00f3\5"+
		"&\24\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\7\21\2\2\u00fa\u00fc\5&\24\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\21\1\2\u00fe!\3\2\2\2"+
		"\u00ff\u0100\7\22\2\2\u0100\u0101\7\3\2\2\u0101\u0102\5\34\17\2\u0102"+
		"\u0103\7\7\2\2\u0103\u0104\5\34\17\2\u0104\u0105\7\7\2\2\u0105\u0106\5"+
		"\34\17\2\u0106\u0107\7\4\2\2\u0107\u0108\5&\24\2\u0108\u0109\b\22\1\2"+
		"\u0109#\3\2\2\2\u010a\u010b\7\23\2\2\u010b\u010c\7\3\2\2\u010c\u010d\5"+
		"\34\17\2\u010d\u010e\7\4\2\2\u010e\u010f\5&\24\2\u010f\u0110\b\23\1\2"+
		"\u0110%\3\2\2\2\u0111\u0112\5\36\20\2\u0112\u0113\b\24\1\2\u0113\u011a"+
		"\3\2\2\2\u0114\u0115\7\5\2\2\u0115\u0116\5\f\7\2\u0116\u0117\7\6\2\2\u0117"+
		"\u0118\b\24\1\2\u0118\u011a\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0114\3"+
		"\2\2\2\u011a\'\3\2\2\2\u011b\u011c\7\r\2\2\u011c\u011d\7\3\2\2\u011d\u0120"+
		"\7;\2\2\u011e\u011f\7\64\2\2\u011f\u0121\78\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\b\2\2\u0123\u0124\b\25"+
		"\1\2\u0124)\3\2\2\2\27\60AI^ho\u0082\u0084\u008f\u0097\u009f\u00a6\u00a8"+
		"\u00b4\u00c1\u00ce\u00e7\u00f6\u00fb\u0119\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}