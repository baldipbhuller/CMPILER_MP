// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DogeScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, CommentBlock=2, IntDataType=3, CharDataType=4, BoolDataType=5, StringDataType=6, 
		ConDecStarter=7, Terminator=8, VarDecStarter=9, FuncStarter=10, ConstantStarter=11, 
		AssOp=12, PrintStarter=13, ScanStarter=14, IfKeyword=15, ElseKeyword=16, 
		ElseIfKeyword=17, EventLoopKeyword=18, CountLoopKeyword=19, RepeatUntilLoopKeyword=20, 
		VoidKeyword=21, MainKeyword=22, Comma=23, NullKeyword=24, ReturnKeyword=25, 
		BoolLit=26, AddOp=27, SubOp=28, MulOp=29, DivOp=30, ModOp=31, EquaOp=32, 
		GreaterThanOp=33, LessThanOp=34, GreaterThanEqualTo=35, LessThanEqualTo=36, 
		NotEqualToOp=37, AndOp=38, OrOp=39, IncrementOp=40, DecrementOp=41, OpenBrace=42, 
		CloseBrace=43, OpenParenthesis=44, CloseParenthesis=45, IntLit=46, FloatLit=47, 
		StringLit=48, CharLit=49, Array=50, VarIdentifier=51, EndOfFile=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'"
	};
	public static final String[] ruleNames = {
		"WS", "CommentBlock", "IntDataType", "CharDataType", "BoolDataType", "StringDataType", 
		"ConDecStarter", "Terminator", "VarDecStarter", "FuncStarter", "ConstantStarter", 
		"AssOp", "PrintStarter", "ScanStarter", "IfKeyword", "ElseKeyword", "ElseIfKeyword", 
		"EventLoopKeyword", "CountLoopKeyword", "RepeatUntilLoopKeyword", "VoidKeyword", 
		"MainKeyword", "Comma", "NullKeyword", "ReturnKeyword", "BoolLit", "AddOp", 
		"SubOp", "MulOp", "DivOp", "ModOp", "EquaOp", "GreaterThanOp", "LessThanOp", 
		"GreaterThanEqualTo", "LessThanEqualTo", "NotEqualToOp", "AndOp", "OrOp", 
		"IncrementOp", "DecrementOp", "OpenBrace", "CloseBrace", "OpenParenthesis", 
		"CloseParenthesis", "IntLit", "FloatLit", "StringLit", "CharLit", "Array", 
		"VarIdentifier", "EndOfFile"
	};


	public DogeScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DogeScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: Terminator_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Terminator_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("in terminator"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0182\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\6\2m\n\2\r\2\16\2n\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0116\n\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\6/"+
		"\u0148\n/\r/\16/\u0149\3\60\5\60\u014d\n\60\3\60\7\60\u0150\n\60\f\60"+
		"\16\60\u0153\13\60\3\60\3\60\6\60\u0157\n\60\r\60\16\60\u0158\3\60\5\60"+
		"\u015c\n\60\3\60\6\60\u015f\n\60\r\60\16\60\u0160\5\60\u0163\n\60\3\61"+
		"\3\61\7\61\u0167\n\61\f\61\16\61\u016a\13\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\6\63\u0174\n\63\r\63\16\63\u0175\3\63\3\63\3\64\3\64\7"+
		"\64\u017c\n\64\f\64\16\64\u017f\13\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\n\6\2\13\f\17\17\""+
		"\"~~\6\2\"\"\62;C\\c|\3\2\62;\5\2))--~~\5\2))\60\60^^\4\2))gg\5\2\62;"+
		"C\\c|\4\2C\\c|\u018e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\3l\3\2\2\2\5r\3\2\2\2\7\u008c\3\2\2\2\t\u0090\3\2\2\2\13\u0095\3\2\2"+
		"\2\r\u009d\3\2\2\2\17\u00a4\3\2\2\2\21\u00ad\3\2\2\2\23\u00b2\3\2\2\2"+
		"\25\u00b7\3\2\2\2\27\u00bc\3\2\2\2\31\u00c1\3\2\2\2\33\u00c4\3\2\2\2\35"+
		"\u00ca\3\2\2\2\37\u00cf\3\2\2\2!\u00d4\3\2\2\2#\u00d8\3\2\2\2%\u00e1\3"+
		"\2\2\2\'\u00e4\3\2\2\2)\u00e9\3\2\2\2+\u00ee\3\2\2\2-\u00f3\3\2\2\2/\u0103"+
		"\3\2\2\2\61\u0105\3\2\2\2\63\u010a\3\2\2\2\65\u0115\3\2\2\2\67\u0117\3"+
		"\2\2\29\u0119\3\2\2\2;\u011b\3\2\2\2=\u011d\3\2\2\2?\u011f\3\2\2\2A\u0121"+
		"\3\2\2\2C\u0124\3\2\2\2E\u0126\3\2\2\2G\u0128\3\2\2\2I\u012b\3\2\2\2K"+
		"\u012e\3\2\2\2M\u0131\3\2\2\2O\u0135\3\2\2\2Q\u0138\3\2\2\2S\u013b\3\2"+
		"\2\2U\u013e\3\2\2\2W\u0140\3\2\2\2Y\u0142\3\2\2\2[\u0144\3\2\2\2]\u0147"+
		"\3\2\2\2_\u014c\3\2\2\2a\u0164\3\2\2\2c\u016d\3\2\2\2e\u0171\3\2\2\2g"+
		"\u0179\3\2\2\2i\u0180\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2op\3\2\2\2pq\b\2\2\2q\4\3\2\2\2rs\7x\2\2st\7g\2\2tu\7t\2\2u"+
		"v\7{\2\2vw\7\"\2\2wx\7e\2\2xy\7o\2\2yz\7v\2\2z~\3\2\2\2{}\t\3\2\2|{\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7{\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7e\2\2\u0087\u0088\7o\2"+
		"\2\u0088\u0089\7v\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\3\2\2\u008b\6"+
		"\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f"+
		"\b\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7j\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7t\2\2\u0094\n\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2"+
		"\u009b\u009c\7p\2\2\u009c\f\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v"+
		"\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3"+
		"\7i\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\b\t\3\2"+
		"\u00ae\u00af\7y\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7y\2\2\u00b1\22\3\2"+
		"\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6"+
		"\7j\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba"+
		"\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7{\2\2\u00c0\30\3\2\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7u\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\34\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7{\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7d\2\2\u00d5"+
		"\u00d6\7w\2\2\u00d6\u00d7\7v\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7d\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7t\2"+
		"\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7{\2\2\u00e0$\3\2"+
		"\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7q\2\2\u00e3&\3\2\2\2\u00e4\u00e5"+
		"\7o\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7{\2\2\u00e8"+
		"(\3\2\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7e\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7f\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7f\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7i\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7K\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7h\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7g\2\2\u0101\u0102\7u\2\2\u0102.\3\2\2\2\u0103"+
		"\u0104\7.\2\2\u0104\60\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7w\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7n\2\2\u0109\62\3\2\2\2\u010a\u010b\7d\2\2\u010b"+
		"\u010c\7q\2\2\u010c\u010d\7y\2\2\u010d\64\3\2\2\2\u010e\u010f\7{\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0116\7|\2\2\u0111\u0112\7p\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7y\2\2\u0114\u0116\7r\2\2\u0115\u010e\3\2\2\2\u0115\u0111"+
		"\3\2\2\2\u0116\66\3\2\2\2\u0117\u0118\7-\2\2\u01188\3\2\2\2\u0119\u011a"+
		"\7/\2\2\u011a:\3\2\2\2\u011b\u011c\7,\2\2\u011c<\3\2\2\2\u011d\u011e\7"+
		"\61\2\2\u011e>\3\2\2\2\u011f\u0120\7\'\2\2\u0120@\3\2\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7u\2\2\u0123B\3\2\2\2\u0124\u0125\7@\2\2\u0125D\3"+
		"\2\2\2\u0126\u0127\7>\2\2\u0127F\3\2\2\2\u0128\u0129\7@\2\2\u0129\u012a"+
		"\7?\2\2\u012aH\3\2\2\2\u012b\u012c\7>\2\2\u012c\u012d\7?\2\2\u012dJ\3"+
		"\2\2\2\u012e\u012f\7#\2\2\u012f\u0130\7?\2\2\u0130L\3\2\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7p\2\2\u0133\u0134\7f\2\2\u0134N\3\2\2\2\u0135\u0136"+
		"\7q\2\2\u0136\u0137\7t\2\2\u0137P\3\2\2\2\u0138\u0139\7-\2\2\u0139\u013a"+
		"\7-\2\2\u013aR\3\2\2\2\u013b\u013c\7/\2\2\u013c\u013d\7/\2\2\u013dT\3"+
		"\2\2\2\u013e\u013f\7}\2\2\u013fV\3\2\2\2\u0140\u0141\7\177\2\2\u0141X"+
		"\3\2\2\2\u0142\u0143\7*\2\2\u0143Z\3\2\2\2\u0144\u0145\7+\2\2\u0145\\"+
		"\3\2\2\2\u0146\u0148\t\4\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a^\3\2\2\2\u014b\u014d\t\5\2\2"+
		"\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0151\3\2\2\2\u014e\u0150"+
		"\t\4\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\t\6"+
		"\2\2\u0155\u0157\t\4\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0162\3\2\2\2\u015a\u015c\t\7"+
		"\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015f\t\4\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015b\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163`\3\2\2\2\u0164\u0168\7$\2\2\u0165\u0167\t\b\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7$\2\2\u016c"+
		"b\3\2\2\2\u016d\u016e\7)\2\2\u016e\u016f\t\b\2\2\u016f\u0170\7)\2\2\u0170"+
		"d\3\2\2\2\u0171\u0173\7]\2\2\u0172\u0174\t\4\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0178\7_\2\2\u0178f\3\2\2\2\u0179\u017d\t\t\2\2\u017a\u017c"+
		"\t\b\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017eh\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7&\2\2\u0181"+
		"j\3\2\2\2\20\2n~\u0115\u0149\u014c\u0151\u0158\u015b\u0160\u0162\u0168"+
		"\u0175\u017d\4\b\2\2\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}