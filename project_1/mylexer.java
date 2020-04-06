// $ANTLR 3.5.2 mylexer.g 2020-04-06 11:25:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADDEQ_OP=4;
	public static final int ADD_ADD_OP=5;
	public static final int ADD_OP=6;
	public static final int ANDEQ_OP=7;
	public static final int AND_OP=8;
	public static final int ASSIGN_OP=9;
	public static final int BIT_AND_OP=10;
	public static final int BIT_OR_OP=11;
	public static final int BIT_XOR_OP=12;
	public static final int CHARACTER=13;
	public static final int CHAR_TYPE=14;
	public static final int COMMA_OP=15;
	public static final int COMMENT1=16;
	public static final int COMMENT2=17;
	public static final int CONST_TYPE=18;
	public static final int DEC_NUM=19;
	public static final int DIGIT=20;
	public static final int DIVEQ_OP=21;
	public static final int DIV_OP=22;
	public static final int DOT_OP=23;
	public static final int DOUBLE_TYPE=24;
	public static final int DO_=25;
	public static final int ELSE_=26;
	public static final int EQ_OP=27;
	public static final int FLOAT_NUM=28;
	public static final int FLOAT_NUM1=29;
	public static final int FLOAT_NUM2=30;
	public static final int FLOAT_TYPE=31;
	public static final int FOR_=32;
	public static final int GE_OP=33;
	public static final int GOTO_=34;
	public static final int GREATER_OP=35;
	public static final int ID=36;
	public static final int IF_=37;
	public static final int INT_NUM=38;
	public static final int INT_TYPE=39;
	public static final int LESS_OP=40;
	public static final int LETTER=41;
	public static final int LE_OP=42;
	public static final int LITERAL=43;
	public static final int LONG_TYPE=44;
	public static final int LSHIFT_OP=45;
	public static final int L_BRACKET=46;
	public static final int L_PARANTHESIS=47;
	public static final int L_SQUARE_RBRACKET=48;
	public static final int MACRO=49;
	public static final int MEM_SELECT_OP=50;
	public static final int MODEQ_OP=51;
	public static final int MOD_OP=52;
	public static final int MULEQ_OP=53;
	public static final int MUL_OP=54;
	public static final int NEW_LINE=55;
	public static final int NE_OP=56;
	public static final int OREQ_OP=57;
	public static final int OR_OP=58;
	public static final int POSITIVE_DIGIT=59;
	public static final int RSHIFT_OP=60;
	public static final int R_BRACKET=61;
	public static final int R_PARANTHESIS=62;
	public static final int R_SQUARE_BRACKET=63;
	public static final int SEMICOLON=64;
	public static final int STRUCT_=65;
	public static final int SUBEQ_OP=66;
	public static final int SUB_OP=67;
	public static final int SUB_SUB_OP=68;
	public static final int TERNARY_OP1=69;
	public static final int TERNARY_OP2=70;
	public static final int TYPEDEF_=71;
	public static final int UNSIGNED_TYPE=72;
	public static final int VOID_TYPE=73;
	public static final int WHILE_=74;
	public static final int WS=75;
	public static final int XOREQ_OP=76;
	public static final int ZERO=77;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:9: ( 'int' )
			// mylexer.g:12:10: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:10: ( 'char' )
			// mylexer.g:13:11: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:10: ( 'void' )
			// mylexer.g:14:11: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "UNSIGNED_TYPE"
	public final void mUNSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = UNSIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:14: ( 'unsigned' )
			// mylexer.g:15:15: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:10: ( 'long' )
			// mylexer.g:16:11: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "CONST_TYPE"
	public final void mCONST_TYPE() throws RecognitionException {
		try {
			int _type = CONST_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:11: ( 'const' )
			// mylexer.g:17:12: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:11: ( 'float' )
			// mylexer.g:18:12: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:12: ( 'double' )
			// mylexer.g:19:13: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:4: ( 'if' )
			// mylexer.g:20:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:6: ( 'else' )
			// mylexer.g:21:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:5: ( 'for' )
			// mylexer.g:22:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:7: ( 'while' )
			// mylexer.g:23:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "DO_"
	public final void mDO_() throws RecognitionException {
		try {
			int _type = DO_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:4: ( 'do' )
			// mylexer.g:24:5: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO_"

	// $ANTLR start "GOTO_"
	public final void mGOTO_() throws RecognitionException {
		try {
			int _type = GOTO_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:6: ( 'goto' )
			// mylexer.g:25:7: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO_"

	// $ANTLR start "STRUCT_"
	public final void mSTRUCT_() throws RecognitionException {
		try {
			int _type = STRUCT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:8: ( 'struct' )
			// mylexer.g:26:9: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT_"

	// $ANTLR start "TYPEDEF_"
	public final void mTYPEDEF_() throws RecognitionException {
		try {
			int _type = TYPEDEF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:9: ( 'typedef' )
			// mylexer.g:27:10: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEDEF_"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:34:6: ( '<=' )
			// mylexer.g:34:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:6: ( '>=' )
			// mylexer.g:35:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:6: ( '==' )
			// mylexer.g:36:7: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:6: ( '!=' )
			// mylexer.g:37:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "ADDEQ_OP"
	public final void mADDEQ_OP() throws RecognitionException {
		try {
			int _type = ADDEQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:9: ( '+=' )
			// mylexer.g:38:10: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDEQ_OP"

	// $ANTLR start "ADD_ADD_OP"
	public final void mADD_ADD_OP() throws RecognitionException {
		try {
			int _type = ADD_ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:11: ( '++' )
			// mylexer.g:39:12: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_ADD_OP"

	// $ANTLR start "SUBEQ_OP"
	public final void mSUBEQ_OP() throws RecognitionException {
		try {
			int _type = SUBEQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:9: ( '-=' )
			// mylexer.g:40:10: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBEQ_OP"

	// $ANTLR start "SUB_SUB_OP"
	public final void mSUB_SUB_OP() throws RecognitionException {
		try {
			int _type = SUB_SUB_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:11: ( '--' )
			// mylexer.g:41:12: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_SUB_OP"

	// $ANTLR start "MULEQ_OP"
	public final void mMULEQ_OP() throws RecognitionException {
		try {
			int _type = MULEQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:9: ( '*=' )
			// mylexer.g:42:10: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULEQ_OP"

	// $ANTLR start "DIVEQ_OP"
	public final void mDIVEQ_OP() throws RecognitionException {
		try {
			int _type = DIVEQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:43:9: ( '/=' )
			// mylexer.g:43:10: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVEQ_OP"

	// $ANTLR start "MODEQ_OP"
	public final void mMODEQ_OP() throws RecognitionException {
		try {
			int _type = MODEQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:9: ( '%=' )
			// mylexer.g:44:10: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODEQ_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:7: ( '&&' )
			// mylexer.g:45:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_OP"

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:6: ( '||' )
			// mylexer.g:46:7: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "ANDEQ_OP"
	public final void mANDEQ_OP() throws RecognitionException {
		try {
			int _type = ANDEQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:9: ( '&=' )
			// mylexer.g:47:10: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDEQ_OP"

	// $ANTLR start "OREQ_OP"
	public final void mOREQ_OP() throws RecognitionException {
		try {
			int _type = OREQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:8: ( '|=' )
			// mylexer.g:48:9: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OREQ_OP"

	// $ANTLR start "XOREQ_OP"
	public final void mXOREQ_OP() throws RecognitionException {
		try {
			int _type = XOREQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:9: ( '^=' )
			// mylexer.g:49:10: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOREQ_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:10: ( '<<' )
			// mylexer.g:50:11: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:10: ( '>>' )
			// mylexer.g:51:11: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "MEM_SELECT_OP"
	public final void mMEM_SELECT_OP() throws RecognitionException {
		try {
			int _type = MEM_SELECT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:14: ( '->' )
			// mylexer.g:52:15: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEM_SELECT_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:10: ( '=' )
			// mylexer.g:53:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "LESS_OP"
	public final void mLESS_OP() throws RecognitionException {
		try {
			int _type = LESS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:8: ( '<' )
			// mylexer.g:54:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_OP"

	// $ANTLR start "GREATER_OP"
	public final void mGREATER_OP() throws RecognitionException {
		try {
			int _type = GREATER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:11: ( '>' )
			// mylexer.g:55:12: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_OP"

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:7: ( '+' )
			// mylexer.g:56:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_OP"

	// $ANTLR start "SUB_OP"
	public final void mSUB_OP() throws RecognitionException {
		try {
			int _type = SUB_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:7: ( '-' )
			// mylexer.g:57:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:7: ( '*' )
			// mylexer.g:58:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:7: ( '/' )
			// mylexer.g:59:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:7: ( '%' )
			// mylexer.g:60:8: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "BIT_AND_OP"
	public final void mBIT_AND_OP() throws RecognitionException {
		try {
			int _type = BIT_AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:11: ( '&' )
			// mylexer.g:61:12: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_AND_OP"

	// $ANTLR start "BIT_OR_OP"
	public final void mBIT_OR_OP() throws RecognitionException {
		try {
			int _type = BIT_OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:10: ( '|' )
			// mylexer.g:62:11: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR_OP"

	// $ANTLR start "BIT_XOR_OP"
	public final void mBIT_XOR_OP() throws RecognitionException {
		try {
			int _type = BIT_XOR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:11: ( '^' )
			// mylexer.g:63:12: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_XOR_OP"

	// $ANTLR start "DOT_OP"
	public final void mDOT_OP() throws RecognitionException {
		try {
			int _type = DOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:7: ( '.' )
			// mylexer.g:64:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_OP"

	// $ANTLR start "COMMA_OP"
	public final void mCOMMA_OP() throws RecognitionException {
		try {
			int _type = COMMA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:9: ( ',' )
			// mylexer.g:65:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA_OP"

	// $ANTLR start "TERNARY_OP1"
	public final void mTERNARY_OP1() throws RecognitionException {
		try {
			int _type = TERNARY_OP1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:12: ( '?' )
			// mylexer.g:66:13: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERNARY_OP1"

	// $ANTLR start "TERNARY_OP2"
	public final void mTERNARY_OP2() throws RecognitionException {
		try {
			int _type = TERNARY_OP2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:12: ( ':' )
			// mylexer.g:67:13: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERNARY_OP2"

	// $ANTLR start "L_PARANTHESIS"
	public final void mL_PARANTHESIS() throws RecognitionException {
		try {
			int _type = L_PARANTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:14: ( '(' )
			// mylexer.g:74:15: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_PARANTHESIS"

	// $ANTLR start "R_PARANTHESIS"
	public final void mR_PARANTHESIS() throws RecognitionException {
		try {
			int _type = R_PARANTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:14: ( ')' )
			// mylexer.g:75:15: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_PARANTHESIS"

	// $ANTLR start "L_BRACKET"
	public final void mL_BRACKET() throws RecognitionException {
		try {
			int _type = L_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:10: ( '{' )
			// mylexer.g:76:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_BRACKET"

	// $ANTLR start "R_BRACKET"
	public final void mR_BRACKET() throws RecognitionException {
		try {
			int _type = R_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:77:10: ( '}' )
			// mylexer.g:77:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_BRACKET"

	// $ANTLR start "L_SQUARE_RBRACKET"
	public final void mL_SQUARE_RBRACKET() throws RecognitionException {
		try {
			int _type = L_SQUARE_RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:78:18: ( '[' )
			// mylexer.g:78:19: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_SQUARE_RBRACKET"

	// $ANTLR start "R_SQUARE_BRACKET"
	public final void mR_SQUARE_BRACKET() throws RecognitionException {
		try {
			int _type = R_SQUARE_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:79:17: ( ']' )
			// mylexer.g:79:18: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_SQUARE_BRACKET"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:86:3: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:86:4: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:86:12: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT_NUM"
	public final void mINT_NUM() throws RecognitionException {
		try {
			int _type = INT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:87:8: ( ZERO | ( POSITIVE_DIGIT ) ( DIGIT )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// mylexer.g:87:9: ZERO
					{
					mZERO(); 

					}
					break;
				case 2 :
					// mylexer.g:87:16: ( POSITIVE_DIGIT ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:87:32: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_NUM"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:88:10: ( ( FLOAT_NUM1 | FLOAT_NUM2 ) ( LETTER )* )
			// mylexer.g:88:11: ( FLOAT_NUM1 | FLOAT_NUM2 ) ( LETTER )*
			{
			// mylexer.g:88:11: ( FLOAT_NUM1 | FLOAT_NUM2 )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			else if ( (LA4_0=='.') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// mylexer.g:88:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:88:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;

			}

			// mylexer.g:88:36: ( LETTER )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:89:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) ( LETTER )* )
			// mylexer.g:89:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* ) ( LETTER )*
			{
			// mylexer.g:89:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// mylexer.g:89:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:89:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:89:28: ( DIGIT )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			// mylexer.g:89:37: ( LETTER )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:91:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:91:21: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:91:21: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match('.'); 
			// mylexer.g:91:32: ( DIGIT )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:92:20: ( '.' ( DIGIT )+ )
			// mylexer.g:92:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:92:25: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "LITERAL"
	public final void mLITERAL() throws RecognitionException {
		try {
			int _type = LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:99:8: ( '\\\"' ( . )* '\\\"' )
			// mylexer.g:99:10: '\\\"' ( . )* '\\\"'
			{
			match('\"'); 
			// mylexer.g:99:14: ( . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\"') ) {
					alt12=2;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:99:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:100:10: ( '\\'' ( . ) '\\'' )
			// mylexer.g:100:11: '\\'' ( . ) '\\''
			{
			match('\''); 
			// mylexer.g:100:15: ( . )
			// mylexer.g:100:16: .
			{
			matchAny(); 
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:107:10: ( ';' )
			// mylexer.g:107:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:108:9: ( '\\n' )
			// mylexer.g:108:10: '\\n'
			{
			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:109:3: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:109:4: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:109:4: ( ' ' | '\\r' | '\\t' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\t'||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:111:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:112:15: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "ZERO"
	public final void mZERO() throws RecognitionException {
		try {
			// mylexer.g:113:14: ( '0' )
			// mylexer.g:113:15: '0'
			{
			match('0'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZERO"

	// $ANTLR start "POSITIVE_DIGIT"
	public final void mPOSITIVE_DIGIT() throws RecognitionException {
		try {
			// mylexer.g:114:24: ( '1' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSITIVE_DIGIT"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:121:10: ( '//' ( . )* '\\n' )
			// mylexer.g:121:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:121:16: ( . )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\n') ) {
					alt14=2;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:121:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop14;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:122:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:122:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:122:17: ( options {greedy=false; } : . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='*') ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1=='/') ) {
						alt15=2;
					}
					else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
						alt15=1;
					}

				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// mylexer.g:122:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop15;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "MACRO"
	public final void mMACRO() throws RecognitionException {
		try {
			int _type = MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:127:7: ( '#' ( . )* '\\n' )
			// mylexer.g:127:9: '#' ( . )* '\\n'
			{
			match('#'); 
			// mylexer.g:127:12: ( . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\n') ) {
					alt16=2;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// mylexer.g:127:13: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MACRO"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | UNSIGNED_TYPE | LONG_TYPE | CONST_TYPE | FLOAT_TYPE | DOUBLE_TYPE | IF_ | ELSE_ | FOR_ | WHILE_ | DO_ | GOTO_ | STRUCT_ | TYPEDEF_ | LE_OP | GE_OP | EQ_OP | NE_OP | ADDEQ_OP | ADD_ADD_OP | SUBEQ_OP | SUB_SUB_OP | MULEQ_OP | DIVEQ_OP | MODEQ_OP | AND_OP | OR_OP | ANDEQ_OP | OREQ_OP | XOREQ_OP | RSHIFT_OP | LSHIFT_OP | MEM_SELECT_OP | ASSIGN_OP | LESS_OP | GREATER_OP | ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | DOT_OP | COMMA_OP | TERNARY_OP1 | TERNARY_OP2 | L_PARANTHESIS | R_PARANTHESIS | L_BRACKET | R_BRACKET | L_SQUARE_RBRACKET | R_SQUARE_BRACKET | ID | INT_NUM | FLOAT_NUM | DEC_NUM | LITERAL | CHARACTER | SEMICOLON | NEW_LINE | WS | COMMENT1 | COMMENT2 | MACRO )
		int alt17=68;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// mylexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// mylexer.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:39: UNSIGNED_TYPE
				{
				mUNSIGNED_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:53: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:63: CONST_TYPE
				{
				mCONST_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:74: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:85: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:97: IF_
				{
				mIF_(); 

				}
				break;
			case 10 :
				// mylexer.g:1:101: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 11 :
				// mylexer.g:1:107: FOR_
				{
				mFOR_(); 

				}
				break;
			case 12 :
				// mylexer.g:1:112: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 13 :
				// mylexer.g:1:119: DO_
				{
				mDO_(); 

				}
				break;
			case 14 :
				// mylexer.g:1:123: GOTO_
				{
				mGOTO_(); 

				}
				break;
			case 15 :
				// mylexer.g:1:129: STRUCT_
				{
				mSTRUCT_(); 

				}
				break;
			case 16 :
				// mylexer.g:1:137: TYPEDEF_
				{
				mTYPEDEF_(); 

				}
				break;
			case 17 :
				// mylexer.g:1:146: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 18 :
				// mylexer.g:1:152: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 19 :
				// mylexer.g:1:158: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 20 :
				// mylexer.g:1:164: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 21 :
				// mylexer.g:1:170: ADDEQ_OP
				{
				mADDEQ_OP(); 

				}
				break;
			case 22 :
				// mylexer.g:1:179: ADD_ADD_OP
				{
				mADD_ADD_OP(); 

				}
				break;
			case 23 :
				// mylexer.g:1:190: SUBEQ_OP
				{
				mSUBEQ_OP(); 

				}
				break;
			case 24 :
				// mylexer.g:1:199: SUB_SUB_OP
				{
				mSUB_SUB_OP(); 

				}
				break;
			case 25 :
				// mylexer.g:1:210: MULEQ_OP
				{
				mMULEQ_OP(); 

				}
				break;
			case 26 :
				// mylexer.g:1:219: DIVEQ_OP
				{
				mDIVEQ_OP(); 

				}
				break;
			case 27 :
				// mylexer.g:1:228: MODEQ_OP
				{
				mMODEQ_OP(); 

				}
				break;
			case 28 :
				// mylexer.g:1:237: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 29 :
				// mylexer.g:1:244: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 30 :
				// mylexer.g:1:250: ANDEQ_OP
				{
				mANDEQ_OP(); 

				}
				break;
			case 31 :
				// mylexer.g:1:259: OREQ_OP
				{
				mOREQ_OP(); 

				}
				break;
			case 32 :
				// mylexer.g:1:267: XOREQ_OP
				{
				mXOREQ_OP(); 

				}
				break;
			case 33 :
				// mylexer.g:1:276: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:286: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:296: MEM_SELECT_OP
				{
				mMEM_SELECT_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:310: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:320: LESS_OP
				{
				mLESS_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:328: GREATER_OP
				{
				mGREATER_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:339: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:346: SUB_OP
				{
				mSUB_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:353: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:360: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:367: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:374: BIT_AND_OP
				{
				mBIT_AND_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:385: BIT_OR_OP
				{
				mBIT_OR_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:395: BIT_XOR_OP
				{
				mBIT_XOR_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:406: DOT_OP
				{
				mDOT_OP(); 

				}
				break;
			case 48 :
				// mylexer.g:1:413: COMMA_OP
				{
				mCOMMA_OP(); 

				}
				break;
			case 49 :
				// mylexer.g:1:422: TERNARY_OP1
				{
				mTERNARY_OP1(); 

				}
				break;
			case 50 :
				// mylexer.g:1:434: TERNARY_OP2
				{
				mTERNARY_OP2(); 

				}
				break;
			case 51 :
				// mylexer.g:1:446: L_PARANTHESIS
				{
				mL_PARANTHESIS(); 

				}
				break;
			case 52 :
				// mylexer.g:1:460: R_PARANTHESIS
				{
				mR_PARANTHESIS(); 

				}
				break;
			case 53 :
				// mylexer.g:1:474: L_BRACKET
				{
				mL_BRACKET(); 

				}
				break;
			case 54 :
				// mylexer.g:1:484: R_BRACKET
				{
				mR_BRACKET(); 

				}
				break;
			case 55 :
				// mylexer.g:1:494: L_SQUARE_RBRACKET
				{
				mL_SQUARE_RBRACKET(); 

				}
				break;
			case 56 :
				// mylexer.g:1:512: R_SQUARE_BRACKET
				{
				mR_SQUARE_BRACKET(); 

				}
				break;
			case 57 :
				// mylexer.g:1:529: ID
				{
				mID(); 

				}
				break;
			case 58 :
				// mylexer.g:1:532: INT_NUM
				{
				mINT_NUM(); 

				}
				break;
			case 59 :
				// mylexer.g:1:540: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 60 :
				// mylexer.g:1:550: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 61 :
				// mylexer.g:1:558: LITERAL
				{
				mLITERAL(); 

				}
				break;
			case 62 :
				// mylexer.g:1:566: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 63 :
				// mylexer.g:1:576: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 64 :
				// mylexer.g:1:586: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 65 :
				// mylexer.g:1:595: WS
				{
				mWS(); 

				}
				break;
			case 66 :
				// mylexer.g:1:598: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 67 :
				// mylexer.g:1:607: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 68 :
				// mylexer.g:1:616: MACRO
				{
				mMACRO(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\1\uffff\14\43\1\75\1\100\1\102\1\uffff\1\105\1\111\1\113\1\117\1\121"+
		"\1\124\1\127\1\131\1\132\12\uffff\2\134\6\uffff\1\43\1\140\7\43\1\151"+
		"\5\43\43\uffff\1\134\1\157\1\uffff\6\43\1\166\1\43\1\uffff\5\43\1\uffff"+
		"\1\175\1\43\1\177\1\43\1\u0081\1\43\1\uffff\1\43\1\u0084\1\43\1\u0086"+
		"\2\43\1\uffff\1\u0089\1\uffff\1\43\1\uffff\1\u008b\1\43\1\uffff\1\u008d"+
		"\1\uffff\2\43\1\uffff\1\43\1\uffff\1\u0091\1\uffff\1\u0092\2\43\2\uffff"+
		"\1\u0095\1\u0096\2\uffff";
	static final String DFA17_eofS =
		"\u0097\uffff";
	static final String DFA17_minS =
		"\1\11\1\146\1\150\1\157\1\156\1\157\1\154\1\157\1\154\1\150\1\157\1\164"+
		"\1\171\1\74\2\75\1\uffff\1\53\1\55\1\75\1\52\1\75\1\46\2\75\1\60\12\uffff"+
		"\2\56\6\uffff\1\164\1\60\1\141\1\156\1\151\1\163\1\156\1\157\1\162\1\60"+
		"\1\163\1\151\1\164\1\162\1\160\43\uffff\1\56\1\60\1\uffff\1\162\1\163"+
		"\1\144\1\151\1\147\1\141\1\60\1\142\1\uffff\1\145\1\154\1\157\1\165\1"+
		"\145\1\uffff\1\60\1\164\1\60\1\147\1\60\1\164\1\uffff\1\154\1\60\1\145"+
		"\1\60\1\143\1\144\1\uffff\1\60\1\uffff\1\156\1\uffff\1\60\1\145\1\uffff"+
		"\1\60\1\uffff\1\164\1\145\1\uffff\1\145\1\uffff\1\60\1\uffff\1\60\1\146"+
		"\1\144\2\uffff\2\60\2\uffff";
	static final String DFA17_maxS =
		"\1\175\1\156\2\157\1\156\3\157\1\154\1\150\1\157\1\164\1\171\1\75\1\76"+
		"\1\75\1\uffff\1\75\1\76\4\75\1\174\1\75\1\71\12\uffff\2\172\6\uffff\1"+
		"\164\1\172\1\141\1\156\1\151\1\163\1\156\1\157\1\162\1\172\1\163\1\151"+
		"\1\164\1\162\1\160\43\uffff\2\172\1\uffff\1\162\1\163\1\144\1\151\1\147"+
		"\1\141\1\172\1\142\1\uffff\1\145\1\154\1\157\1\165\1\145\1\uffff\1\172"+
		"\1\164\1\172\1\147\1\172\1\164\1\uffff\1\154\1\172\1\145\1\172\1\143\1"+
		"\144\1\uffff\1\172\1\uffff\1\156\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff"+
		"\1\164\1\145\1\uffff\1\145\1\uffff\1\172\1\uffff\1\172\1\146\1\144\2\uffff"+
		"\2\172\2\uffff";
	static final String DFA17_acceptS =
		"\20\uffff\1\24\11\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1"+
		"\71\2\uffff\1\75\1\76\1\77\1\100\1\101\1\104\17\uffff\1\21\1\41\1\45\1"+
		"\22\1\42\1\46\1\23\1\44\1\25\1\26\1\47\1\27\1\30\1\43\1\50\1\31\1\51\1"+
		"\32\1\102\1\103\1\52\1\33\1\53\1\34\1\36\1\54\1\35\1\37\1\55\1\40\1\56"+
		"\1\57\1\73\1\72\1\74\2\uffff\1\11\10\uffff\1\15\5\uffff\1\1\6\uffff\1"+
		"\13\6\uffff\1\2\1\uffff\1\3\1\uffff\1\5\2\uffff\1\12\1\uffff\1\16\2\uffff"+
		"\1\6\1\uffff\1\7\1\uffff\1\14\3\uffff\1\10\1\17\2\uffff\1\20\1\4";
	static final String DFA17_specialS =
		"\u0097\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\52\1\51\2\uffff\1\52\22\uffff\1\52\1\20\1\46\1\53\1\uffff\1\25\1\26"+
			"\1\47\1\35\1\36\1\23\1\21\1\32\1\22\1\31\1\24\1\44\11\45\1\34\1\50\1"+
			"\15\1\17\1\16\1\33\1\uffff\32\43\1\41\1\uffff\1\42\1\30\1\43\1\uffff"+
			"\2\43\1\2\1\7\1\10\1\6\1\12\1\43\1\1\2\43\1\5\6\43\1\13\1\14\1\4\1\3"+
			"\1\11\3\43\1\37\1\27\1\40",
			"\1\55\7\uffff\1\54",
			"\1\56\6\uffff\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63\2\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\74\1\73",
			"\1\76\1\77",
			"\1\101",
			"",
			"\1\104\21\uffff\1\103",
			"\1\107\17\uffff\1\106\1\110",
			"\1\112",
			"\1\116\4\uffff\1\115\15\uffff\1\114",
			"\1\120",
			"\1\122\26\uffff\1\123",
			"\1\126\76\uffff\1\125",
			"\1\130",
			"\12\133",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\133\1\uffff\12\133\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
			"\1\133\1\uffff\12\136\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\137",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\24\43\1\150\5\43",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\133\1\uffff\12\136\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\167",
			"",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\176",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0080",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0082",
			"",
			"\1\u0083",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0085",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0087",
			"\1\u0088",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u008a",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u008c",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u008e",
			"\1\u008f",
			"",
			"\1\u0090",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0093",
			"\1\u0094",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | UNSIGNED_TYPE | LONG_TYPE | CONST_TYPE | FLOAT_TYPE | DOUBLE_TYPE | IF_ | ELSE_ | FOR_ | WHILE_ | DO_ | GOTO_ | STRUCT_ | TYPEDEF_ | LE_OP | GE_OP | EQ_OP | NE_OP | ADDEQ_OP | ADD_ADD_OP | SUBEQ_OP | SUB_SUB_OP | MULEQ_OP | DIVEQ_OP | MODEQ_OP | AND_OP | OR_OP | ANDEQ_OP | OREQ_OP | XOREQ_OP | RSHIFT_OP | LSHIFT_OP | MEM_SELECT_OP | ASSIGN_OP | LESS_OP | GREATER_OP | ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | DOT_OP | COMMA_OP | TERNARY_OP1 | TERNARY_OP2 | L_PARANTHESIS | R_PARANTHESIS | L_BRACKET | R_BRACKET | L_SQUARE_RBRACKET | R_SQUARE_BRACKET | ID | INT_NUM | FLOAT_NUM | DEC_NUM | LITERAL | CHARACTER | SEMICOLON | NEW_LINE | WS | COMMENT1 | COMMENT2 | MACRO );";
		}
	}

}
