// Generated from /Users/joycechin/CD_2020/project_4/jasmine/myCompiler.g by ANTLR 4.8

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, COMMENT=20, LINE_COMMENT=21, FLOAT=22, INT=23, CHAR=24, 
		MAIN=25, VOID=26, IF=27, ELSE=28, FOR=29, RETURN=30, RelationOP=31, Identifier=32, 
		Floating_point_constant=33, Integer_constant=34, STRING_LITERAL=35, WS=36;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_statements = 3, 
		RULE_cond_expression = 4, RULE_arith_expression = 5, RULE_addExpr = 6, 
		RULE_multExpr = 7, RULE_signExpr = 8, RULE_primaryExpr = 9, RULE_statement = 10, 
		RULE_assign_stmt = 11, RULE_if_stmt = 12, RULE_func_no_return_stmt = 13, 
		RULE_for_stmt = 14, RULE_while_stmt = 15, RULE_block_stmt = 16, RULE_printf = 17, 
		RULE_argument = 18, RULE_arg = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "type", "statements", "cond_expression", "arith_expression", 
			"addExpr", "multExpr", "signExpr", "primaryExpr", "statement", "assign_stmt", 
			"if_stmt", "func_no_return_stmt", "for_stmt", "while_stmt", "block_stmt", 
			"printf", "argument", "arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "';'", "'<<'", "'>>'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'&'", "'++'", "'--'", "'while'", "'printf'", 
			"','", null, null, "'float'", "'int'", "'char'", "'main'", "'void'", 
			"'if'", "'else'", "'for'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", 
			"FLOAT", "INT", "CHAR", "MAIN", "VOID", "IF", "ELSE", "FOR", "RETURN", 
			"RelationOP", "Identifier", "Floating_point_constant", "Integer_constant", 
			"STRING_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "myCompiler.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public myCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myCompilerParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myCompilerParser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VOID);
			setState(41);
			match(MAIN);
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);

			           /* Output function prologue */
			           prologue();
			        
			setState(45);
			match(T__2);
			setState(46);
			declarations();
			setState(47);
			statements();
			setState(48);
			match(T__3);

					   if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");

			           /* output function epilogue */	  
			           epilogue();
			        
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
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				type();
				setState(52);
				match(Identifier);

				                if (TRACEON)
				                System.out.println("declarations: type Identifier : declarations");

				                if (symtab.containsKey((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null))) {
				                // variable re-declared.
				                System.out.println("Type Error: " + 
				                                    ((DeclarationsContext)_localctx).Identifier.getLine() + 
				                                    ": Redeclared identifier.");
				                System.exit(0);
				                }
				                
				                /* Add ID and its attr_type into the symbol table. */
				                ArrayList the_list = new ArrayList();
				                the_list.add(((DeclarationsContext)_localctx).type.attr_type);
				                the_list.add(storageIndex); /*position*/
				                storageIndex = storageIndex + 1;
				                symtab.put((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null), the_list);
				            
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(54);
					match(T__4);
					setState(55);
					arith_expression();

					                //type checking   
					                if (((DeclarationsContext)_localctx).type.attr_type!=((DeclarationsContext)_localctx).arith_expression.attr_type) {
					                    System.out.println(((DeclarationsContext)_localctx).type.attr_type+" "+ ((DeclarationsContext)_localctx).arith_expression.attr_type);

					                    System.out.println("assign_stmt:Type error!\n");
					                    System.exit(0);
					                }
					                
					                // issue store insruction:
					                // => store the top element of the operand stack into the locals.

					                switch (((DeclarationsContext)_localctx).type.attr_type) {
					                case INT:
					                    TextCode.add("  istore " + (storageIndex - 1));
					                    break;
					                case FLOAT:
					                    TextCode.add("  fstore " + (storageIndex - 1));
					                    break;
					                }
					            
					}
				}

				setState(60);
				match(T__5);
				setState(61);
				declarations();
				}
				break;
			case T__3:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case IF:
			case FOR:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{

				            if (TRACEON)
				            System.out.println("declarations: ");
				        
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
		public Type attr_type;
		public TerminalNode INT() { return getToken(myCompilerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myCompilerParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; 
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
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case IF:
			case FOR:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				statement();
				setState(73);
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public String label;
		public boolean truth;
		public Arith_expressionContext a;
		public Arith_expressionContext b;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public List<TerminalNode> RelationOP() { return getTokens(myCompilerParser.RelationOP); }
		public TerminalNode RelationOP(int i) {
			return getToken(myCompilerParser.RelationOP, i);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Cond_expressionContext(ParserRuleContext parent, int invokingState, String label) {
			super(parent, invokingState);
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
	}

	public final Cond_expressionContext cond_expression(String label) throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState(), label);
		enterRule(_localctx, 8, RULE_cond_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((Cond_expressionContext)_localctx).a = arith_expression();

			            if (((Cond_expressionContext)_localctx).a.attr_type.ordinal() != 0)
			                truth = true;
			            else
			                truth = false;
			        
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOP) {
				{
				{
				setState(80);
				match(RelationOP);
				setState(81);
				((Cond_expressionContext)_localctx).b = arith_expression();
				 
				            if(((Cond_expressionContext)_localctx).a.attr_type!=((Cond_expressionContext)_localctx).b.attr_type){
				                System.out.println("cond_expression:Type error!\n");
				                System.exit(0);
				            }
				            
				            
				            if(((Cond_expressionContext)_localctx).a.attr_type==Type.INT){
				                if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals(">")){
				                    TextCode.add("  if_icmple "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals(">=")){
				                    TextCode.add("  if_icmplt "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("<")){
				                    TextCode.add("  if_icmpge "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("<=")){
				                    TextCode.add("  if_icmpgt "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("==")){
				                    TextCode.add("  if_icmpne "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("!=")){
				                    TextCode.add("  if_icmpeq "+label);
				                }
				            }else if(((Cond_expressionContext)_localctx).a.attr_type==Type.FLOAT){
				                TextCode.add("  fcmpl");
				                if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals(">")){
				                    TextCode.add("  ifle "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals(">=")){
				                    TextCode.add("  iflt "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("<")){
				                    TextCode.add("  ifge "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("<=")){
				                    TextCode.add("  ifgt "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("==")){
				                    TextCode.add("  ifne "+label);
				                }else if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("!=")){
				                    TextCode.add("  ifeq "+label);
				                }
				            }

				        
				}
				}
				setState(88);
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public Type attr_type;
		public AddExprContext a;
		public AddExprContext b;
		public AddExprContext c;
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
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
			setState(89);
			((Arith_expressionContext)_localctx).a = addExpr();
			 ((Arith_expressionContext)_localctx).attr_type =  ((Arith_expressionContext)_localctx).a.attr_type; 
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(91);
					match(T__6);
					setState(92);
					((Arith_expressionContext)_localctx).b = addExpr();

					                // We need to do type checking first.
					                // ...
					                if (_localctx.attr_type != ((Arith_expressionContext)_localctx).b.attr_type) {
					                    System.out.println("＋:Type error!\n");
					                    System.exit(0);
					                }
					                
					                // code generation.
					                if ((_localctx.attr_type == Type.INT) && (((Arith_expressionContext)_localctx).b.attr_type == Type.INT)){
					                    //TextCode.add("  ldc 2");
					                    //TextCode.add("  imul");
					                    //TextCode.add("  imul");
					                    TextCode.add("  ishl");
					                }
					                else if((_localctx.attr_type == Type.FLOAT) && (((Arith_expressionContext)_localctx).b.attr_type == Type.FLOAT)){
					                    //TextCode.add("  ldc 2");
					                    //TextCode.add("  fmul");
					                    //TextCode.add("  fdiv");
					                    TextCode.add("  fshl");
					                }
					            
					            
					}
					break;
				case T__7:
					{
					setState(95);
					match(T__7);
					setState(96);
					((Arith_expressionContext)_localctx).c = addExpr();

					                // We need to do type checking first.
					                if (_localctx.attr_type != ((Arith_expressionContext)_localctx).c.attr_type) {
					                    System.out.println("-:Type error!\n");
					                    System.exit(0);
					                }
					                
					                // code generation.
					                if ((_localctx.attr_type == Type.INT) && (((Arith_expressionContext)_localctx).c.attr_type == Type.INT))
					                    // TextCode.add("  isub");
					                    TextCode.add(" ishr");
					                else if((_localctx.attr_type == Type.FLOAT) && (((Arith_expressionContext)_localctx).c.attr_type == Type.FLOAT))
					                    // TextCode.add("  fsub");
					                    TextCode.add("  fshr");
					            
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
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

	public static class AddExprContext extends ParserRuleContext {
		public Type attr_type;
		public MultExprContext a;
		public MultExprContext b;
		public MultExprContext c;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((AddExprContext)_localctx).a = multExpr();
			 ((AddExprContext)_localctx).attr_type =  ((AddExprContext)_localctx).a.attr_type; 
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(106);
					match(T__8);
					setState(107);
					((AddExprContext)_localctx).b = multExpr();

					                // We need to do type checking first.
					                // ...
					                if (_localctx.attr_type != ((AddExprContext)_localctx).b.attr_type) {
					                    System.out.println("＋:Type error!\n");
					                    System.exit(0);
					                }
					                
					                // code generation.
					                if ((_localctx.attr_type == Type.INT) && (((AddExprContext)_localctx).b.attr_type == Type.INT))
					                    TextCode.add("  iadd");
					                else if((_localctx.attr_type == Type.FLOAT) && (((AddExprContext)_localctx).b.attr_type == Type.FLOAT))
					                    TextCode.add("  fadd");
					            
					            
					}
					break;
				case T__9:
					{
					setState(110);
					match(T__9);
					setState(111);
					((AddExprContext)_localctx).c = multExpr();

					                // We need to do type checking first.
					                if (_localctx.attr_type != ((AddExprContext)_localctx).c.attr_type) {
					                    System.out.println("-:Type error!\n");
					                    System.exit(0);
					                }
					                
					                // code generation.
					                if ((_localctx.attr_type == Type.INT) && (((AddExprContext)_localctx).c.attr_type == Type.INT))
					                    TextCode.add("  isub");
					                else if((_localctx.attr_type == Type.FLOAT) && (((AddExprContext)_localctx).c.attr_type == Type.FLOAT))
					                    TextCode.add("  fsub");
					            
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
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
		public Type attr_type;
		public SignExprContext a;
		public SignExprContext b;
		public SignExprContext c;
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((MultExprContext)_localctx).a = signExpr();
			 ((MultExprContext)_localctx).attr_type = ((MultExprContext)_localctx).a.attr_type; 
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(121);
					match(T__10);
					setState(122);
					((MultExprContext)_localctx).b = signExpr();

					            if (_localctx.attr_type != ((MultExprContext)_localctx).b.attr_type) {
					                System.out.println("*:Type error!\n");
					                System.exit(0);
					            }
					            if ((_localctx.attr_type == Type.INT) && (((MultExprContext)_localctx).b.attr_type == Type.INT))
					                TextCode.add("  imul");
					            else if((_localctx.attr_type == Type.FLOAT) && (((MultExprContext)_localctx).b.attr_type == Type.FLOAT))
					                TextCode.add("  fmul");
					        
					}
					break;
				case T__11:
					{
					setState(125);
					match(T__11);
					setState(126);
					((MultExprContext)_localctx).c = signExpr();

					            if (_localctx.attr_type != ((MultExprContext)_localctx).c.attr_type) {
					                System.out.println("/:Type error!\n");
					                System.exit(0);
					            }
					            if ((_localctx.attr_type == Type.INT) && (((MultExprContext)_localctx).c.attr_type == Type.INT))
					                TextCode.add("  idiv");
					            else if((_localctx.attr_type == Type.FLOAT) && (((MultExprContext)_localctx).c.attr_type == Type.FLOAT))
					                TextCode.add("  fdiv");
					        
					}
					break;
				case T__12:
					{
					setState(129);
					match(T__12);
					setState(130);
					((MultExprContext)_localctx).c = signExpr();

					            if (_localctx.attr_type != ((MultExprContext)_localctx).c.attr_type) {
					                System.out.println("/:Type error!\n");
					                System.exit(0);
					            }
					            if ((_localctx.attr_type == Type.INT) && (((MultExprContext)_localctx).c.attr_type == Type.INT))
					                TextCode.add("  irem");
					            else if((_localctx.attr_type == Type.FLOAT) && (((MultExprContext)_localctx).c.attr_type == Type.FLOAT))
					                TextCode.add("  frem");
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
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
		public Type attr_type;
		public PrimaryExprContext a;
		public PrimaryExprContext b;
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
		enterRule(_localctx, 16, RULE_signExpr);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__13:
			case Identifier:
			case Floating_point_constant:
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((SignExprContext)_localctx).a = primaryExpr();
				 ((SignExprContext)_localctx).attr_type = ((SignExprContext)_localctx).a.attr_type; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__9);
				setState(142);
				((SignExprContext)_localctx).b = primaryExpr();

				            if (_localctx.attr_type != ((SignExprContext)_localctx).b.attr_type) {
				                System.out.println("sign:Type error!\n");
				                System.exit(0);
				            }
				            if ((_localctx.attr_type == Type.INT) && (((SignExprContext)_localctx).b.attr_type == Type.INT))
				                TextCode.add("  ineg");
				            else if((_localctx.attr_type == Type.FLOAT) && (((SignExprContext)_localctx).b.attr_type == Type.FLOAT))
				                TextCode.add("  fneg");
				        
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
		public Type attr_type;
		public TerminalNode Floating_point_constant() { return getToken(myCompilerParser.Floating_point_constant, 0); }
		public TerminalNode Integer_constant() { return getToken(myCompilerParser.Integer_constant, 0); }
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
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
		enterRule(_localctx, 18, RULE_primaryExpr);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(Floating_point_constant);

				            ((PrimaryExprContext)_localctx).attr_type =  Type.FLOAT;
				            TextCode.add("  ldc " + (((PrimaryExprContext)_localctx).Floating_point_constant!=null?((PrimaryExprContext)_localctx).Floating_point_constant.getText():null));
				        
				}
				break;
			case Integer_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Integer_constant);

				            ((PrimaryExprContext)_localctx).attr_type =  Type.INT;
				            TextCode.add("  ldc " + (((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null));
				        
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(Identifier);

				            // get type information from symtab.
				            ((PrimaryExprContext)_localctx).attr_type =  (Type) symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(0);
				            switch (_localctx.attr_type) {
				            case INT: 
				                        // load the variable into the operand stack.
				                        TextCode.add("  iload " + symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(1));
				                        break;
				            case FLOAT:
				                        TextCode.add("  fload " + symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(1));
				                        break;
				            
				            }
				        
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(T__13);
				setState(154);
				match(Identifier);

				            ((PrimaryExprContext)_localctx).attr_type =  (Type) symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(0);
				            TextCode.add("  ldc " + symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(1));
				        
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(T__0);
				setState(157);
				arith_expression();
				setState(158);
				match(T__1);

				            ((PrimaryExprContext)_localctx).attr_type =  (Type)((PrimaryExprContext)_localctx).arith_expression.attr_type;
				        
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Func_no_return_stmtContext func_no_return_stmt() {
			return getRuleContext(Func_no_return_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				assign_stmt();
				 TextCode.add(((StatementContext)_localctx).assign_stmt.code); 
				setState(165);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				func_no_return_stmt();
				setState(169);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				while_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				printf();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public String code;
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_stmt);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(Identifier);
				setState(177);
				match(T__4);
				setState(178);
				arith_expression();


				            Type the_type;
				            int the_mem;
				            
				            // get the ID's location and type from symtab.			   
				            the_type = (Type) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(0);
				            the_mem = (int) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				            
				            if (the_type!=((Assign_stmtContext)_localctx).arith_expression.attr_type) {
				                System.out.println(the_type+" "+ ((Assign_stmtContext)_localctx).arith_expression.attr_type);

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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__14);
				setState(182);
				match(Identifier);

				            // get type information from symtab.
				            Type the_type = (Type) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(0);
				            int the_mem = (int) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);

				            code="  ldc 1";
				            switch (the_type) {
				            case INT: 
				                        // load the variable into the operand stack.
				                        code+="\n  iload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  iadd";
				                        break;
				            case FLOAT:
				                        code+="\n  fload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  fadd";
				                        break;
				            }
				            code+="\n  istore " + the_mem;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__15);
				setState(185);
				match(Identifier);

				            // get type information from symtab.
				            Type the_type = (Type) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(0);
				            int the_mem = (int) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);

				            switch (the_type) {
				            case INT: 
				                        // load the variable into the operand stack.
				                        code="  iload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  ldc 1";
				                        code+="\n  isub";
				                        break;
				            case FLOAT:
				                        code="  fload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  ldc 1";
				                        code+="\n  fsub";
				                        break;
				            }
				            code+="\n  istore " + the_mem;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(Identifier);
				setState(188);
				match(T__14);

				            // get type information from symtab.
				            Type the_type = (Type) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(0);
				            int the_mem = (int) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);

				            code="  ldc 1";
				            switch (the_type) {
				            case INT: 
				                        // load the variable into the operand stack.
				                        code+="\n  iload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  iadd";
				                        break;
				            case FLOAT:
				                        code+="\n  fload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  fadd";
				                        break;
				            }
				            code+="\n  istore " + the_mem;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(Identifier);
				setState(191);
				match(T__15);

				            // get type information from symtab.
				            Type the_type = (Type) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(0);
				            int the_mem = (int) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);

				            switch (the_type) {
				            case INT: 
				                        // load the variable into the operand stack.
				                        code="  iload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  ldc 1";
				                        code+="\n  isub";
				                        break;
				            case FLOAT:
				                        code="  fload " + symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
				                        code+="\n  ldc 1";
				                        code+="\n  fsub";
				                        break;
				            }
				            code+="\n  istore " + the_mem;
				        
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myCompilerParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<Block_stmtContext> block_stmt() {
			return getRuleContexts(Block_stmtContext.class);
		}
		public Block_stmtContext block_stmt(int i) {
			return getRuleContext(Block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(myCompilerParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		 String next; String elseLable;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 next=newLabel(); elseLable=newLabel(); 
			setState(196);
			match(IF);
			setState(197);
			match(T__0);
			setState(198);
			cond_expression(elseLable);
			setState(199);
			match(T__1);
			setState(200);
			block_stmt();
			 TextCode.add("  goto "+next);TextCode.add(elseLable+":");
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(202);
				match(ELSE);
				setState(203);
				block_stmt();
				}
			}

			 TextCode.add(next+":"); 
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

	public static class Func_no_return_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Func_no_return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_no_return_stmt; }
	}

	public final Func_no_return_stmtContext func_no_return_stmt() throws RecognitionException {
		Func_no_return_stmtContext _localctx = new Func_no_return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_no_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Identifier);
			setState(209);
			match(T__0);
			setState(210);
			argument();
			setState(211);
			match(T__1);
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

	public static class For_stmtContext extends ParserRuleContext {
		public Assign_stmtContext a;
		public Assign_stmtContext b;
		public TerminalNode FOR() { return getToken(myCompilerParser.FOR, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public List<Assign_stmtContext> assign_stmt() {
			return getRuleContexts(Assign_stmtContext.class);
		}
		public Assign_stmtContext assign_stmt(int i) {
			return getRuleContext(Assign_stmtContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_stmt);
		 String next; String loopLable;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 next=newLabel(); loopLable=newLabel();
			setState(214);
			match(FOR);
			setState(215);
			match(T__0);
			setState(216);
			((For_stmtContext)_localctx).a = assign_stmt();
			TextCode.add(((For_stmtContext)_localctx).a.code);
			setState(218);
			match(T__5);
			 TextCode.add(loopLable+":");
			setState(220);
			cond_expression(next);
			setState(221);
			match(T__5);
			setState(222);
			((For_stmtContext)_localctx).b = assign_stmt();
			setState(223);
			match(T__1);
			setState(224);
			block_stmt();
			 TextCode.add(((For_stmtContext)_localctx).b.code); TextCode.add("  goto "+loopLable); TextCode.add(next+":");
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

	public static class While_stmtContext extends ParserRuleContext {
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stmt);
		 String next; String loopLable;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 next=newLabel(); loopLable=newLabel(); TextCode.add(loopLable+":");
			setState(228);
			match(T__16);
			setState(229);
			match(T__0);
			setState(230);
			cond_expression(next);
			setState(231);
			match(T__1);
			setState(232);
			block_stmt();
			 TextCode.add("  goto "+loopLable); TextCode.add(next+":");
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

	public static class Block_stmtContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__2);
			setState(236);
			statements();
			setState(237);
			match(T__3);
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

	public static class PrintfContext extends ParserRuleContext {
		public Arith_expressionContext a;
		public TerminalNode STRING_LITERAL() { return getToken(myCompilerParser.STRING_LITERAL, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printf);
		String str;int ind_prev;int len;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__17);
			setState(240);
			match(T__0);
			setState(241);
			match(STRING_LITERAL);
			  ind_prev=1; str=(((PrintfContext)_localctx).STRING_LITERAL!=null?((PrintfContext)_localctx).STRING_LITERAL.getText():null);len=str.length();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(243);
				match(T__18);
				TextCode.add("  getstatic java/lang/System/out Ljava/io/PrintStream;");
				setState(245);
				((PrintfContext)_localctx).a = arith_expression();

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
				                        if(((PrintfContext)_localctx).a.attr_type!=Type.INT){
				                            System.out.println("printf:Type error!\n");
				                            System.exit(0);
				                        }
				                        TextCode.add("  invokevirtual java/io/PrintStream/print(I)V");
				                        break;
				                    case 'f':
				                        if(((PrintfContext)_localctx).a.attr_type!=Type.FLOAT){
				                            System.out.println("printf:Type error!\n");
				                            System.exit(0);
				                        }
				                        TextCode.add("  invokevirtual java/io/PrintStream/print(F)V");
				                        break;
				                }
				            
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(T__1);
			setState(254);
			match(T__5);

			        if(ind_prev<(len-1)){
			            String s=str.substring(ind_prev,len-1);
			            TextCode.add("  getstatic java/lang/System/out Ljava/io/PrintStream;");
			            TextCode.add("  ldc \""+s+"\"");
			            TextCode.add("  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			arg();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(258);
				match(T__18);
				setState(259);
				arg();
				}
				}
				setState(264);
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

	public static class ArgContext extends ParserRuleContext {
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(myCompilerParser.STRING_LITERAL, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__9:
			case T__13:
			case Identifier:
			case Floating_point_constant:
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				arith_expression();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(STRING_LITERAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\3\3\5\3C\n\3\3\4"+
		"\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7f"+
		"\n\7\f\7\16\7i\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f"+
		"\b\16\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00c4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00cf\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00fb\n\23\f\23\16\23\u00fe\13\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u0107\n\24\f\24\16\24\u010a\13\24\3\25\3\25"+
		"\5\25\u010e\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\2\2\u0119\2*\3\2\2\2\4B\3\2\2\2\6H\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2"+
		"\f[\3\2\2\2\16j\3\2\2\2\20y\3\2\2\2\22\u0093\3\2\2\2\24\u00a3\3\2\2\2"+
		"\26\u00b0\3\2\2\2\30\u00c3\3\2\2\2\32\u00c5\3\2\2\2\34\u00d2\3\2\2\2\36"+
		"\u00d7\3\2\2\2 \u00e5\3\2\2\2\"\u00ed\3\2\2\2$\u00f1\3\2\2\2&\u0103\3"+
		"\2\2\2(\u010d\3\2\2\2*+\7\34\2\2+,\7\33\2\2,-\7\3\2\2-.\7\4\2\2./\b\2"+
		"\1\2/\60\7\5\2\2\60\61\5\4\3\2\61\62\5\b\5\2\62\63\7\6\2\2\63\64\b\2\1"+
		"\2\64\3\3\2\2\2\65\66\5\6\4\2\66\67\7\"\2\2\67<\b\3\1\289\7\7\2\29:\5"+
		"\f\7\2:;\b\3\1\2;=\3\2\2\2<8\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\b\2\2?@\5"+
		"\4\3\2@C\3\2\2\2AC\b\3\1\2B\65\3\2\2\2BA\3\2\2\2C\5\3\2\2\2DE\7\31\2\2"+
		"EI\b\4\1\2FG\7\30\2\2GI\b\4\1\2HD\3\2\2\2HF\3\2\2\2I\7\3\2\2\2JK\5\26"+
		"\f\2KL\5\b\5\2LO\3\2\2\2MO\3\2\2\2NJ\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\5"+
		"\f\7\2QX\b\6\1\2RS\7!\2\2ST\5\f\7\2TU\b\6\1\2UW\3\2\2\2VR\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\5\16\b\2\\g\b\7\1"+
		"\2]^\7\t\2\2^_\5\16\b\2_`\b\7\1\2`f\3\2\2\2ab\7\n\2\2bc\5\16\b\2cd\b\7"+
		"\1\2df\3\2\2\2e]\3\2\2\2ea\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3"+
		"\2\2\2ig\3\2\2\2jk\5\20\t\2kv\b\b\1\2lm\7\13\2\2mn\5\20\t\2no\b\b\1\2"+
		"ou\3\2\2\2pq\7\f\2\2qr\5\20\t\2rs\b\b\1\2su\3\2\2\2tl\3\2\2\2tp\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\5\22\n\2z\u0089"+
		"\b\t\1\2{|\7\r\2\2|}\5\22\n\2}~\b\t\1\2~\u0088\3\2\2\2\177\u0080\7\16"+
		"\2\2\u0080\u0081\5\22\n\2\u0081\u0082\b\t\1\2\u0082\u0088\3\2\2\2\u0083"+
		"\u0084\7\17\2\2\u0084\u0085\5\22\n\2\u0085\u0086\b\t\1\2\u0086\u0088\3"+
		"\2\2\2\u0087{\3\2\2\2\u0087\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\5\24\13\2\u008d\u008e\b\n\1\2\u008e\u0094\3"+
		"\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\24\13\2\u0091\u0092\b\n\1\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008f\3\2\2\2\u0094\23\3\2\2"+
		"\2\u0095\u0096\7#\2\2\u0096\u00a4\b\13\1\2\u0097\u0098\7$\2\2\u0098\u00a4"+
		"\b\13\1\2\u0099\u009a\7\"\2\2\u009a\u00a4\b\13\1\2\u009b\u009c\7\20\2"+
		"\2\u009c\u009d\7\"\2\2\u009d\u00a4\b\13\1\2\u009e\u009f\7\3\2\2\u009f"+
		"\u00a0\5\f\7\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\b\13\1\2\u00a2\u00a4\3"+
		"\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009b\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\5\30\r"+
		"\2\u00a6\u00a7\b\f\1\2\u00a7\u00a8\7\b\2\2\u00a8\u00b1\3\2\2\2\u00a9\u00b1"+
		"\5\32\16\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\b\2\2\u00ac\u00b1\3\2\2"+
		"\2\u00ad\u00b1\5\36\20\2\u00ae\u00b1\5 \21\2\u00af\u00b1\5$\23\2\u00b0"+
		"\u00a5\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b3"+
		"\7\"\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\b\r\1\2\u00b6"+
		"\u00c4\3\2\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00c4\b"+
		"\r\1\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00c4\b\r\1\2\u00bd"+
		"\u00be\7\"\2\2\u00be\u00bf\7\21\2\2\u00bf\u00c4\b\r\1\2\u00c0\u00c1\7"+
		"\"\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c4\b\r\1\2\u00c3\u00b2\3\2\2\2\u00c3"+
		"\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2"+
		"\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\b\16\1\2\u00c6\u00c7\7\35\2\2\u00c7"+
		"\u00c8\7\3\2\2\u00c8\u00c9\5\n\6\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\""+
		"\22\2\u00cb\u00ce\b\16\1\2\u00cc\u00cd\7\36\2\2\u00cd\u00cf\5\"\22\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\16"+
		"\1\2\u00d1\33\3\2\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5"+
		"\5&\24\2\u00d5\u00d6\7\4\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\b\20\1\2\u00d8"+
		"\u00d9\7\37\2\2\u00d9\u00da\7\3\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\b"+
		"\20\1\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\b\20\1\2\u00de\u00df\5\n\6\2\u00df"+
		"\u00e0\7\b\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\5"+
		"\"\22\2\u00e3\u00e4\b\20\1\2\u00e4\37\3\2\2\2\u00e5\u00e6\b\21\1\2\u00e6"+
		"\u00e7\7\23\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea\7"+
		"\4\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec\b\21\1\2\u00ec!\3\2\2\2\u00ed"+
		"\u00ee\7\5\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\7\6\2\2\u00f0#\3\2\2\2"+
		"\u00f1\u00f2\7\24\2\2\u00f2\u00f3\7\3\2\2\u00f3\u00f4\7%\2\2\u00f4\u00fc"+
		"\b\23\1\2\u00f5\u00f6\7\25\2\2\u00f6\u00f7\b\23\1\2\u00f7\u00f8\5\f\7"+
		"\2\u00f8\u00f9\b\23\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\4\2\2\u0100\u0101\7\b\2\2\u0101"+
		"\u0102\b\23\1\2\u0102%\3\2\2\2\u0103\u0108\5(\25\2\u0104\u0105\7\25\2"+
		"\2\u0105\u0107\5(\25\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\'\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010e\5\f\7\2\u010c\u010e\7%\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e)\3\2\2\2\25<BHNXegtv\u0087\u0089\u0093\u00a3\u00b0\u00c3\u00ce"+
		"\u00fc\u0108\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}