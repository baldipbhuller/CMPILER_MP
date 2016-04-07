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
		Terminator=7, VarDecStarter=8, FuncStarter=9, ConstantStarter=10, AssOp=11, 
		PrintStarter=12, ScanStarter=13, IfKeyword=14, ElseKeyword=15, ElseIfKeyword=16, 
		EventLoopKeyword=17, CountLoopKeyword=18, RepeatUntilLoopKeyword=19, VoidKeyword=20, 
		MainKeyword=21, Comma=22, NullKeyword=23, ReturnKeyword=24, BoolLit=25, 
		AddOp=26, SubOp=27, MulOp=28, DivOp=29, ModOp=30, EquaOp=31, GreaterThanOp=32, 
		LessThanOp=33, GreaterThanEqualTo=34, LessThanEqualTo=35, NotEqualToOp=36, 
		AndOp=37, OrOp=38, IncrementOp=39, DecrementOp=40, OpenBrace=41, CloseBrace=42, 
		OpenParenthesis=43, CloseParenthesis=44, IntLit=45, FloatLit=46, StringLit=47, 
		CharLit=48, Array=49, VarIdentifier=50, EndOfFile=51;
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
		"'2'", "'3'"
	};
	public static final String[] ruleNames = {
		"WS", "CommentBlock", "IntDataType", "CharDataType", "BoolDataType", "StringDataType", 
		"Terminator", "VarDecStarter", "FuncStarter", "ConstantStarter", "AssOp", 
		"PrintStarter", "ScanStarter", "IfKeyword", "ElseKeyword", "ElseIfKeyword", 
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
		case 6: Terminator_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Terminator_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("in terminator"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0177\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\6\2k\n\2\r\2\16\2l\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u010b\n\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\6.\u013d\n.\r.\16.\u013e\3/\5/\u0142\n/\3/\7/\u0145\n"+
		"/\f/\16/\u0148\13/\3/\3/\6/\u014c\n/\r/\16/\u014d\3/\5/\u0151\n/\3/\6"+
		"/\u0154\n/\r/\16/\u0155\5/\u0158\n/\3\60\3\60\7\60\u015c\n\60\f\60\16"+
		"\60\u015f\13\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\6\62\u0169\n\62"+
		"\r\62\16\62\u016a\3\62\3\62\3\63\3\63\7\63\u0171\n\63\f\63\16\63\u0174"+
		"\13\63\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65\3\2\n\6\2\13\f\17\17\"\"~~\6\2\"\"\62;C\\c|\3\2\62;\5\2)"+
		")--~~\5\2))\60\60^^\4\2))gg\5\2\62;C\\c|\4\2C\\c|\u0183\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\3j\3\2\2\2\5p\3\2\2\2\7\u008a\3\2\2\2\t\u008e"+
		"\3\2\2\2\13\u0093\3\2\2\2\r\u009b\3\2\2\2\17\u00a2\3\2\2\2\21\u00a7\3"+
		"\2\2\2\23\u00ac\3\2\2\2\25\u00b1\3\2\2\2\27\u00b6\3\2\2\2\31\u00b9\3\2"+
		"\2\2\33\u00bf\3\2\2\2\35\u00c4\3\2\2\2\37\u00c9\3\2\2\2!\u00cd\3\2\2\2"+
		"#\u00d6\3\2\2\2%\u00d9\3\2\2\2\'\u00de\3\2\2\2)\u00e3\3\2\2\2+\u00e8\3"+
		"\2\2\2-\u00f8\3\2\2\2/\u00fa\3\2\2\2\61\u00ff\3\2\2\2\63\u010a\3\2\2\2"+
		"\65\u010c\3\2\2\2\67\u010e\3\2\2\29\u0110\3\2\2\2;\u0112\3\2\2\2=\u0114"+
		"\3\2\2\2?\u0116\3\2\2\2A\u0119\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G"+
		"\u0120\3\2\2\2I\u0123\3\2\2\2K\u0126\3\2\2\2M\u012a\3\2\2\2O\u012d\3\2"+
		"\2\2Q\u0130\3\2\2\2S\u0133\3\2\2\2U\u0135\3\2\2\2W\u0137\3\2\2\2Y\u0139"+
		"\3\2\2\2[\u013c\3\2\2\2]\u0141\3\2\2\2_\u0159\3\2\2\2a\u0162\3\2\2\2c"+
		"\u0166\3\2\2\2e\u016e\3\2\2\2g\u0175\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\2\2\2o\4\3\2\2\2pq\7x\2\2qr\7g"+
		"\2\2rs\7t\2\2st\7{\2\2tu\7\"\2\2uv\7e\2\2vw\7o\2\2wx\7v\2\2x|\3\2\2\2"+
		"y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2"+
		"\2\2\177\u0080\7x\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7{\2\2\u0083\u0084\7\"\2\2\u0084\u0085\7e\2\2\u0085\u0086\7o\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\3\2\2\u0089\6\3\2\2\2"+
		"\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\b\3\2"+
		"\2\2\u008e\u008f\7e\2\2\u008f\u0090\7j\2\2\u0090\u0091\7c\2\2\u0091\u0092"+
		"\7t\2\2\u0092\n\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7p\2\2\u009a\f\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2"+
		"\u00a1\16\3\2\2\2\u00a2\u00a3\b\b\3\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7"+
		"q\2\2\u00a5\u00a6\7y\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9"+
		"\7w\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7j\2\2\u00ab\22\3\2\2\2\u00ac\u00ad"+
		"\7o\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\24\3\2\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7{\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\30\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"\u00c1\7e\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7p\2\2\u00c3\34\3\2\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7{\2\2"+
		"\u00c8\36\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7"+
		"v\2\2\u00cc \3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7{\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7q\2\2\u00d8$\3\2\2\2\u00d9\u00da\7o\2\2\u00da\u00db\7c\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7{\2\2\u00dd&\3\2\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7g\2\2\u00e2(\3\2\2\2\u00e3"+
		"\u00e4\7x\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7f\2\2"+
		"\u00e7*\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7i\2"+
		"\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7K\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7g\2\2"+
		"\u00f6\u00f7\7u\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9.\3\2\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7n\2\2"+
		"\u00fe\60\3\2\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7q\2\2\u0101\u0102\7"+
		"y\2\2\u0102\62\3\2\2\2\u0103\u0104\7{\2\2\u0104\u0105\7k\2\2\u0105\u010b"+
		"\7|\2\2\u0106\u0107\7p\2\2\u0107\u0108\7c\2\2\u0108\u0109\7y\2\2\u0109"+
		"\u010b\7r\2\2\u010a\u0103\3\2\2\2\u010a\u0106\3\2\2\2\u010b\64\3\2\2\2"+
		"\u010c\u010d\7-\2\2\u010d\66\3\2\2\2\u010e\u010f\7/\2\2\u010f8\3\2\2\2"+
		"\u0110\u0111\7,\2\2\u0111:\3\2\2\2\u0112\u0113\7\61\2\2\u0113<\3\2\2\2"+
		"\u0114\u0115\7\'\2\2\u0115>\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118\7u"+
		"\2\2\u0118@\3\2\2\2\u0119\u011a\7@\2\2\u011aB\3\2\2\2\u011b\u011c\7>\2"+
		"\2\u011cD\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f\7?\2\2\u011fF\3\2\2\2"+
		"\u0120\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122H\3\2\2\2\u0123\u0124\7#\2"+
		"\2\u0124\u0125\7?\2\2\u0125J\3\2\2\2\u0126\u0127\7c\2\2\u0127\u0128\7"+
		"p\2\2\u0128\u0129\7f\2\2\u0129L\3\2\2\2\u012a\u012b\7q\2\2\u012b\u012c"+
		"\7t\2\2\u012cN\3\2\2\2\u012d\u012e\7-\2\2\u012e\u012f\7-\2\2\u012fP\3"+
		"\2\2\2\u0130\u0131\7/\2\2\u0131\u0132\7/\2\2\u0132R\3\2\2\2\u0133\u0134"+
		"\7}\2\2\u0134T\3\2\2\2\u0135\u0136\7\177\2\2\u0136V\3\2\2\2\u0137\u0138"+
		"\7*\2\2\u0138X\3\2\2\2\u0139\u013a\7+\2\2\u013aZ\3\2\2\2\u013b\u013d\t"+
		"\4\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\\\3\2\2\2\u0140\u0142\t\5\2\2\u0141\u0140\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0146\3\2\2\2\u0143\u0145\t\4\2\2\u0144\u0143"+
		"\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\t\6\2\2\u014a\u014c\t\4"+
		"\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0157\3\2\2\2\u014f\u0151\t\7\2\2\u0150\u014f\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\t\4\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0150\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"^\3\2\2\2\u0159\u015d\7$\2\2\u015a\u015c\t\b\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7$\2\2\u0161`\3\2\2\2\u0162\u0163"+
		"\7)\2\2\u0163\u0164\t\b\2\2\u0164\u0165\7)\2\2\u0165b\3\2\2\2\u0166\u0168"+
		"\7]\2\2\u0167\u0169\t\4\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7_"+
		"\2\2\u016dd\3\2\2\2\u016e\u0172\t\t\2\2\u016f\u0171\t\b\2\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"f\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7&\2\2\u0176h\3\2\2\2\20\2l"+
		"|\u010a\u013e\u0141\u0146\u014d\u0150\u0155\u0157\u015d\u016a\u0172\4"+
		"\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}