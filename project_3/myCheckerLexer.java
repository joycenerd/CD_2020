// $ANTLR 3.5.2 myChecker.g 2020-05-24 19:56:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myChecker.g"; }

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:2:7: ( '(' )
			// myChecker.g:2:9: '('
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:3:7: ( ')' )
			// myChecker.g:3:9: ')'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:4:7: ( ');' )
			// myChecker.g:4:9: ');'
			{
			match(");"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:5:7: ( ';' )
			// myChecker.g:5:9: ';'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:6:7: ( '{' )
			// myChecker.g:6:9: '{'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:7:7: ( '}' )
			// myChecker.g:7:9: '}'
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
	// $ANTLR end "T__65"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:271:6: ( 'float' )
			// myChecker.g:271:7: 'float'
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:272:4: ( 'int' )
			// myChecker.g:272:5: 'int'
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
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:273:5: ( 'char' )
			// myChecker.g:273:6: 'char'
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
	// $ANTLR end "CHAR"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:274:6: ( 'const' )
			// myChecker.g:274:8: 'const'
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
	// $ANTLR end "CONST"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:275:5: ( 'main' )
			// myChecker.g:275:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:276:7: ( 'printf' )
			// myChecker.g:276:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:277:5: ( 'void' )
			// myChecker.g:277:7: 'void'
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
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:278:3: ( 'if' )
			// myChecker.g:278:5: 'if'
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
	// $ANTLR end "IF"

	// $ANTLR start "ELSE_IF"
	public final void mELSE_IF() throws RecognitionException {
		try {
			int _type = ELSE_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:279:8: ( 'else if' )
			// myChecker.g:279:10: 'else if'
			{
			match("else if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:280:5: ( 'else' )
			// myChecker.g:280:7: 'else'
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
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:281:4: ( 'for' )
			// myChecker.g:281:6: 'for'
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
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:282:6: ( 'while' )
			// myChecker.g:282:8: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:283:6: ( 'break' )
			// myChecker.g:283:7: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:284:7: ( 'return' )
			// myChecker.g:284:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:290:7: ( '==' )
			// myChecker.g:290:9: '=='
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

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:291:7: ( '<=' )
			// myChecker.g:291:9: '<='
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
			// myChecker.g:292:7: ( '>=' )
			// myChecker.g:292:9: '>='
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

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:293:7: ( '!=' )
			// myChecker.g:293:9: '!='
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

	// $ANTLR start "ADD_ASS_OP"
	public final void mADD_ASS_OP() throws RecognitionException {
		try {
			int _type = ADD_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:294:12: ( '+=' )
			// myChecker.g:294:14: '+='
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
	// $ANTLR end "ADD_ASS_OP"

	// $ANTLR start "SUB_ASS_OP"
	public final void mSUB_ASS_OP() throws RecognitionException {
		try {
			int _type = SUB_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:295:12: ( '-=' )
			// myChecker.g:295:14: '-='
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
	// $ANTLR end "SUB_ASS_OP"

	// $ANTLR start "MUL_ASS_OP"
	public final void mMUL_ASS_OP() throws RecognitionException {
		try {
			int _type = MUL_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:296:12: ( '*=' )
			// myChecker.g:296:14: '*='
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
	// $ANTLR end "MUL_ASS_OP"

	// $ANTLR start "DIV_ASS_OP"
	public final void mDIV_ASS_OP() throws RecognitionException {
		try {
			int _type = DIV_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:297:12: ( '/=' )
			// myChecker.g:297:14: '/='
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
	// $ANTLR end "DIV_ASS_OP"

	// $ANTLR start "MOD_ASS_OP"
	public final void mMOD_ASS_OP() throws RecognitionException {
		try {
			int _type = MOD_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:298:12: ( '%=' )
			// myChecker.g:298:14: '%='
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
	// $ANTLR end "MOD_ASS_OP"

	// $ANTLR start "AND_ASS_OP"
	public final void mAND_ASS_OP() throws RecognitionException {
		try {
			int _type = AND_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:299:12: ( '&=' )
			// myChecker.g:299:14: '&='
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
	// $ANTLR end "AND_ASS_OP"

	// $ANTLR start "OR_ASS_OP"
	public final void mOR_ASS_OP() throws RecognitionException {
		try {
			int _type = OR_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:300:12: ( '|=' )
			// myChecker.g:300:14: '|='
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
	// $ANTLR end "OR_ASS_OP"

	// $ANTLR start "XOR_ASS_OP"
	public final void mXOR_ASS_OP() throws RecognitionException {
		try {
			int _type = XOR_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:301:12: ( '^=' )
			// myChecker.g:301:14: '^='
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
	// $ANTLR end "XOR_ASS_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:302:7: ( '++' )
			// myChecker.g:302:9: '++'
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
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:303:7: ( '--' )
			// myChecker.g:303:9: '--'
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
	// $ANTLR end "MM_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:304:8: ( '&&' )
			// myChecker.g:304:10: '&&'
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
			// myChecker.g:305:7: ( '||' )
			// myChecker.g:305:9: '||'
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

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:306:11: ( '<<' )
			// myChecker.g:306:13: '<<'
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
			// myChecker.g:307:11: ( '>>' )
			// myChecker.g:307:13: '>>'
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

	// $ANTLR start "ARROW_OP"
	public final void mARROW_OP() throws RecognitionException {
		try {
			int _type = ARROW_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:308:9: ( '->' )
			// myChecker.g:308:11: '->'
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
	// $ANTLR end "ARROW_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:309:11: ( '=' )
			// myChecker.g:309:13: '='
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
			// myChecker.g:310:9: ( '<' )
			// myChecker.g:310:11: '<'
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
			// myChecker.g:311:12: ( '>' )
			// myChecker.g:311:14: '>'
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

	// $ANTLR start "BIT_AND_OP"
	public final void mBIT_AND_OP() throws RecognitionException {
		try {
			int _type = BIT_AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:312:12: ( '&' )
			// myChecker.g:312:14: '&'
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
			// myChecker.g:313:12: ( '|' )
			// myChecker.g:313:14: '|'
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
			// myChecker.g:314:12: ( '^' )
			// myChecker.g:314:14: '^'
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

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:315:9: ( '+' )
			// myChecker.g:315:11: '+'
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
			// myChecker.g:316:9: ( '-' )
			// myChecker.g:316:11: '-'
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

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:317:9: ( '/' )
			// myChecker.g:317:11: '/'
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

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:318:9: ( '*' )
			// myChecker.g:318:11: '*'
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

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:319:9: ( '%' )
			// myChecker.g:319:11: '%'
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

	// $ANTLR start "COMMA_OP"
	public final void mCOMMA_OP() throws RecognitionException {
		try {
			int _type = COMMA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:320:9: ( ',' )
			// myChecker.g:320:11: ','
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

	// $ANTLR start "DOT_OP"
	public final void mDOT_OP() throws RecognitionException {
		try {
			int _type = DOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:321:7: ( '.' )
			// myChecker.g:321:9: '.'
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

	// $ANTLR start "TRINARY_OP1"
	public final void mTRINARY_OP1() throws RecognitionException {
		try {
			int _type = TRINARY_OP1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:322:12: ( '?' )
			// myChecker.g:322:14: '?'
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
	// $ANTLR end "TRINARY_OP1"

	// $ANTLR start "TRINARY_OP2"
	public final void mTRINARY_OP2() throws RecognitionException {
		try {
			int _type = TRINARY_OP2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:323:12: ( ':' )
			// myChecker.g:323:14: ':'
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
	// $ANTLR end "TRINARY_OP2"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:325:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myChecker.g:325:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myChecker.g:325:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:
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
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:326:17: ( ( '0' .. '9' )+ )
			// myChecker.g:326:18: ( '0' .. '9' )+
			{
			// myChecker.g:326:18: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myChecker.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:327:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myChecker.g:327:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myChecker.g:327:25: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myChecker.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// myChecker.g:327:39: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myChecker.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "Literal_constant"
	public final void mLiteral_constant() throws RecognitionException {
		try {
			int _type = Literal_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:328:17: ( '\\\"' ( . )* '\\\"' )
			// myChecker.g:328:19: '\\\"' ( . )* '\\\"'
			{
			match('\"'); 
			// myChecker.g:328:23: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myChecker.g:328:24: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
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
	// $ANTLR end "Literal_constant"

	// $ANTLR start "Character_constant"
	public final void mCharacter_constant() throws RecognitionException {
		try {
			int _type = Character_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:329:19: ( '\\'' ( . ) '\\'' )
			// myChecker.g:329:21: '\\'' ( . ) '\\''
			{
			match('\''); 
			// myChecker.g:329:25: ( . )
			// myChecker.g:329:26: .
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
	// $ANTLR end "Character_constant"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:331:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myChecker.g:331:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:332:8: ( ( '/*' ( options {greedy=false; } : . )* '*/' ) | ( '//' ( . )* '\\n' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='/') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='*') ) {
					alt8=1;
				}
				else if ( (LA8_1=='/') ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myChecker.g:332:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
					{
					// myChecker.g:332:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
					// myChecker.g:332:11: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// myChecker.g:332:16: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='*') ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1=='/') ) {
								alt6=2;
							}
							else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// myChecker.g:332:41: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match("*/"); 

					}

					_channel=HIDDEN;
					}
					break;
				case 2 :
					// myChecker.g:332:72: ( '//' ( . )* '\\n' )
					{
					// myChecker.g:332:72: ( '//' ( . )* '\\n' )
					// myChecker.g:332:73: '//' ( . )* '\\n'
					{
					match("//"); 

					// myChecker.g:332:77: ( . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='\n') ) {
							alt7=2;
						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// myChecker.g:332:78: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop7;
						}
					}

					match('\n'); 
					}

					_channel=HIDDEN;
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "MACRO"
	public final void mMACRO() throws RecognitionException {
		try {
			int _type = MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:333:6: ( '#' ( . )* '\\n' )
			// myChecker.g:333:8: '#' ( . )* '\\n'
			{
			match('#'); 
			// myChecker.g:333:11: ( . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\n') ) {
					alt9=2;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myChecker.g:333:12: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			match('\n'); 
			_channel=HIDDEN;
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
		// myChecker.g:1:8: ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | FLOAT | INT | CHAR | CONST | MAIN | PRINTF | VOID | IF | ELSE_IF | ELSE | FOR | WHILE | BREAK | RETURN | EQ_OP | LE_OP | GE_OP | NE_OP | ADD_ASS_OP | SUB_ASS_OP | MUL_ASS_OP | DIV_ASS_OP | MOD_ASS_OP | AND_ASS_OP | OR_ASS_OP | XOR_ASS_OP | PP_OP | MM_OP | AND_OP | OR_OP | RSHIFT_OP | LSHIFT_OP | ARROW_OP | ASSIGN_OP | LESS_OP | GREATER_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | ADD_OP | SUB_OP | DIV_OP | MUL_OP | MOD_OP | COMMA_OP | DOT_OP | TRINARY_OP1 | TRINARY_OP2 | Identifier | Integer_constant | Floating_point_constant | Literal_constant | Character_constant | WS | COMMENT | MACRO )
		int alt10=62;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// myChecker.g:1:10: T__60
				{
				mT__60(); 

				}
				break;
			case 2 :
				// myChecker.g:1:16: T__61
				{
				mT__61(); 

				}
				break;
			case 3 :
				// myChecker.g:1:22: T__62
				{
				mT__62(); 

				}
				break;
			case 4 :
				// myChecker.g:1:28: T__63
				{
				mT__63(); 

				}
				break;
			case 5 :
				// myChecker.g:1:34: T__64
				{
				mT__64(); 

				}
				break;
			case 6 :
				// myChecker.g:1:40: T__65
				{
				mT__65(); 

				}
				break;
			case 7 :
				// myChecker.g:1:46: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 8 :
				// myChecker.g:1:52: INT
				{
				mINT(); 

				}
				break;
			case 9 :
				// myChecker.g:1:56: CHAR
				{
				mCHAR(); 

				}
				break;
			case 10 :
				// myChecker.g:1:61: CONST
				{
				mCONST(); 

				}
				break;
			case 11 :
				// myChecker.g:1:67: MAIN
				{
				mMAIN(); 

				}
				break;
			case 12 :
				// myChecker.g:1:72: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 13 :
				// myChecker.g:1:79: VOID
				{
				mVOID(); 

				}
				break;
			case 14 :
				// myChecker.g:1:84: IF
				{
				mIF(); 

				}
				break;
			case 15 :
				// myChecker.g:1:87: ELSE_IF
				{
				mELSE_IF(); 

				}
				break;
			case 16 :
				// myChecker.g:1:95: ELSE
				{
				mELSE(); 

				}
				break;
			case 17 :
				// myChecker.g:1:100: FOR
				{
				mFOR(); 

				}
				break;
			case 18 :
				// myChecker.g:1:104: WHILE
				{
				mWHILE(); 

				}
				break;
			case 19 :
				// myChecker.g:1:110: BREAK
				{
				mBREAK(); 

				}
				break;
			case 20 :
				// myChecker.g:1:116: RETURN
				{
				mRETURN(); 

				}
				break;
			case 21 :
				// myChecker.g:1:123: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 22 :
				// myChecker.g:1:129: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 23 :
				// myChecker.g:1:135: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 24 :
				// myChecker.g:1:141: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 25 :
				// myChecker.g:1:147: ADD_ASS_OP
				{
				mADD_ASS_OP(); 

				}
				break;
			case 26 :
				// myChecker.g:1:158: SUB_ASS_OP
				{
				mSUB_ASS_OP(); 

				}
				break;
			case 27 :
				// myChecker.g:1:169: MUL_ASS_OP
				{
				mMUL_ASS_OP(); 

				}
				break;
			case 28 :
				// myChecker.g:1:180: DIV_ASS_OP
				{
				mDIV_ASS_OP(); 

				}
				break;
			case 29 :
				// myChecker.g:1:191: MOD_ASS_OP
				{
				mMOD_ASS_OP(); 

				}
				break;
			case 30 :
				// myChecker.g:1:202: AND_ASS_OP
				{
				mAND_ASS_OP(); 

				}
				break;
			case 31 :
				// myChecker.g:1:213: OR_ASS_OP
				{
				mOR_ASS_OP(); 

				}
				break;
			case 32 :
				// myChecker.g:1:223: XOR_ASS_OP
				{
				mXOR_ASS_OP(); 

				}
				break;
			case 33 :
				// myChecker.g:1:234: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 34 :
				// myChecker.g:1:240: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 35 :
				// myChecker.g:1:246: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 36 :
				// myChecker.g:1:253: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 37 :
				// myChecker.g:1:259: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 38 :
				// myChecker.g:1:269: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 39 :
				// myChecker.g:1:279: ARROW_OP
				{
				mARROW_OP(); 

				}
				break;
			case 40 :
				// myChecker.g:1:288: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 41 :
				// myChecker.g:1:298: LESS_OP
				{
				mLESS_OP(); 

				}
				break;
			case 42 :
				// myChecker.g:1:306: GREATER_OP
				{
				mGREATER_OP(); 

				}
				break;
			case 43 :
				// myChecker.g:1:317: BIT_AND_OP
				{
				mBIT_AND_OP(); 

				}
				break;
			case 44 :
				// myChecker.g:1:328: BIT_OR_OP
				{
				mBIT_OR_OP(); 

				}
				break;
			case 45 :
				// myChecker.g:1:338: BIT_XOR_OP
				{
				mBIT_XOR_OP(); 

				}
				break;
			case 46 :
				// myChecker.g:1:349: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 47 :
				// myChecker.g:1:356: SUB_OP
				{
				mSUB_OP(); 

				}
				break;
			case 48 :
				// myChecker.g:1:363: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 49 :
				// myChecker.g:1:370: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 50 :
				// myChecker.g:1:377: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 51 :
				// myChecker.g:1:384: COMMA_OP
				{
				mCOMMA_OP(); 

				}
				break;
			case 52 :
				// myChecker.g:1:393: DOT_OP
				{
				mDOT_OP(); 

				}
				break;
			case 53 :
				// myChecker.g:1:400: TRINARY_OP1
				{
				mTRINARY_OP1(); 

				}
				break;
			case 54 :
				// myChecker.g:1:412: TRINARY_OP2
				{
				mTRINARY_OP2(); 

				}
				break;
			case 55 :
				// myChecker.g:1:424: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 56 :
				// myChecker.g:1:435: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 57 :
				// myChecker.g:1:452: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 58 :
				// myChecker.g:1:476: Literal_constant
				{
				mLiteral_constant(); 

				}
				break;
			case 59 :
				// myChecker.g:1:493: Character_constant
				{
				mCharacter_constant(); 

				}
				break;
			case 60 :
				// myChecker.g:1:512: WS
				{
				mWS(); 

				}
				break;
			case 61 :
				// myChecker.g:1:515: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 62 :
				// myChecker.g:1:523: MACRO
				{
				mMACRO(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\2\uffff\1\47\3\uffff\12\40\1\66\1\71\1\74\1\uffff\1\77\1\103\1\105\1"+
		"\110\1\112\1\115\1\120\1\122\5\uffff\1\123\6\uffff\3\40\1\130\11\40\40"+
		"\uffff\1\40\1\143\1\144\1\uffff\12\40\2\uffff\1\157\1\40\1\161\1\40\1"+
		"\163\1\165\3\40\1\171\1\uffff\1\172\1\uffff\1\40\3\uffff\1\174\1\175\1"+
		"\40\2\uffff\1\177\2\uffff\1\u0080\2\uffff";
	static final String DFA10_eofS =
		"\u0081\uffff";
	static final String DFA10_minS =
		"\1\11\1\uffff\1\73\3\uffff\1\154\1\146\1\150\1\141\1\162\1\157\1\154\1"+
		"\150\1\162\1\145\1\75\1\74\1\75\1\uffff\1\53\1\55\1\75\1\52\1\75\1\46"+
		"\2\75\5\uffff\1\56\6\uffff\1\157\1\162\1\164\1\60\1\141\1\156\3\151\1"+
		"\163\1\151\1\145\1\164\40\uffff\1\141\2\60\1\uffff\1\162\1\163\2\156\1"+
		"\144\1\145\1\154\1\141\1\165\1\164\2\uffff\1\60\1\164\1\60\1\164\1\60"+
		"\1\40\1\145\1\153\1\162\1\60\1\uffff\1\60\1\uffff\1\146\3\uffff\2\60\1"+
		"\156\2\uffff\1\60\2\uffff\1\60\2\uffff";
	static final String DFA10_maxS =
		"\1\175\1\uffff\1\73\3\uffff\1\157\1\156\1\157\1\141\1\162\1\157\1\154"+
		"\1\150\1\162\1\145\2\75\1\76\1\uffff\1\75\1\76\4\75\1\174\1\75\5\uffff"+
		"\1\71\6\uffff\1\157\1\162\1\164\1\172\1\141\1\156\3\151\1\163\1\151\1"+
		"\145\1\164\40\uffff\1\141\2\172\1\uffff\1\162\1\163\2\156\1\144\1\145"+
		"\1\154\1\141\1\165\1\164\2\uffff\1\172\1\164\1\172\1\164\2\172\1\145\1"+
		"\153\1\162\1\172\1\uffff\1\172\1\uffff\1\146\3\uffff\2\172\1\156\2\uffff"+
		"\1\172\2\uffff\1\172\2\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\1\5\1\6\15\uffff\1\30\10\uffff\1\63\1\64\1\65"+
		"\1\66\1\67\1\uffff\1\72\1\73\1\74\1\76\1\3\1\2\15\uffff\1\25\1\50\1\26"+
		"\1\45\1\51\1\27\1\46\1\52\1\31\1\41\1\56\1\32\1\42\1\47\1\57\1\33\1\61"+
		"\1\34\1\75\1\60\1\35\1\62\1\36\1\43\1\53\1\37\1\44\1\54\1\40\1\55\1\70"+
		"\1\71\3\uffff\1\16\12\uffff\1\21\1\10\12\uffff\1\11\1\uffff\1\13\1\uffff"+
		"\1\15\1\17\1\20\3\uffff\1\7\1\12\1\uffff\1\22\1\23\1\uffff\1\14\1\24";
	static final String DFA10_specialS =
		"\u0081\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\23\1\42\1\45\1\uffff\1\30\1\31\1\43"+
			"\1\1\1\2\1\26\1\24\1\34\1\25\1\35\1\27\12\41\1\37\1\3\1\21\1\20\1\22"+
			"\1\36\1\uffff\32\40\3\uffff\1\33\1\40\1\uffff\1\40\1\16\1\10\1\40\1\14"+
			"\1\6\2\40\1\7\3\40\1\11\2\40\1\12\1\40\1\17\3\40\1\13\1\15\3\40\1\4\1"+
			"\32\1\5",
			"",
			"\1\46",
			"",
			"",
			"",
			"\1\50\2\uffff\1\51",
			"\1\53\7\uffff\1\52",
			"\1\54\6\uffff\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\70\1\67",
			"\1\72\1\73",
			"",
			"\1\76\21\uffff\1\75",
			"\1\101\17\uffff\1\100\1\102",
			"\1\104",
			"\1\107\4\uffff\1\107\15\uffff\1\106",
			"\1\111",
			"\1\114\26\uffff\1\113",
			"\1\116\76\uffff\1\117",
			"\1\121",
			"",
			"",
			"",
			"",
			"",
			"\1\124\1\uffff\12\41",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\125",
			"\1\126",
			"\1\127",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
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
			"\1\142",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\160",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\162",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\164\17\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\173",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\176",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | FLOAT | INT | CHAR | CONST | MAIN | PRINTF | VOID | IF | ELSE_IF | ELSE | FOR | WHILE | BREAK | RETURN | EQ_OP | LE_OP | GE_OP | NE_OP | ADD_ASS_OP | SUB_ASS_OP | MUL_ASS_OP | DIV_ASS_OP | MOD_ASS_OP | AND_ASS_OP | OR_ASS_OP | XOR_ASS_OP | PP_OP | MM_OP | AND_OP | OR_OP | RSHIFT_OP | LSHIFT_OP | ARROW_OP | ASSIGN_OP | LESS_OP | GREATER_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | ADD_OP | SUB_OP | DIV_OP | MUL_OP | MOD_OP | COMMA_OP | DOT_OP | TRINARY_OP1 | TRINARY_OP2 | Identifier | Integer_constant | Floating_point_constant | Literal_constant | Character_constant | WS | COMMENT | MACRO );";
		}
	}

}
