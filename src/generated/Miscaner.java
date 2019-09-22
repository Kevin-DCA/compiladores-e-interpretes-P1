// Generated from C:/Users/kevin/Documents/tarea\Miscaner.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Miscaner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, Then=2, Else=3, While=4, Do=5, Let=6, In=7, End=8, Const=9, Var=10, 
		Identifier=11, Literal=12, Float=13, Operator=14, Pyc=15, Parnt=16, Dpig=17, 
		Lin=18, Dp=19, Com=20, Comi=21, Comf=22, Pc=23, TEXT=24, Line=25, WS=26, 
		Next=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "Then", "Else", "While", "Do", "Let", "In", "End", "Const", "Var", 
			"Identifier", "Literal", "Float", "Operator", "Pyc", "Parnt", "Dpig", 
			"Lin", "Dp", "Com", "Comi", "Comf", "Pc", "Letter", "Digit", "TEXT", 
			"CharContenido", "Line", "WS", "Next"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "';'", null, "':='", "'~'", "':'", "'//'", "'*/'", 
			"'/*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "Then", "Else", "While", "Do", "Let", "In", "End", "Const", 
			"Var", "Identifier", "Literal", "Float", "Operator", "Pyc", "Parnt", 
			"Dpig", "Lin", "Dp", "Com", "Comi", "Comf", "Pc", "TEXT", "Line", "WS", 
			"Next"
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


	public Miscaner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Miscaner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3T\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"s\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0086\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b5\n\13\3\f\3\f\3\f\7\f\u00ba\n\f\f\f\16\f\u00bd"+
		"\13\f\3\r\6\r\u00c0\n\r\r\r\16\r\u00c1\3\16\6\16\u00c5\n\16\r\16\16\16"+
		"\u00c6\3\16\3\16\6\16\u00cb\n\16\r\16\16\16\u00cc\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u00f6\n\33\r\33\16\33\u00f7"+
		"\3\34\3\34\6\34\u00fc\n\34\r\34\16\34\u00fd\5\34\u0100\n\34\3\35\3\35"+
		"\6\35\u0104\n\35\r\35\16\35\u0105\5\35\u0108\n\35\3\36\6\36\u010b\n\36"+
		"\r\36\16\36\u010c\3\36\3\36\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\2\63\2\65\32\67\29\33;\34=\35\3\2\n\4\2..\60\60\6\2\'\'"+
		",-//\61\61\4\2]]__\4\2C\\c|\21\2\62;C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u037f\u0381\u2001\u200e\u200f\u2041\u2042\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\17\17\"\"\5\2\13\13\17\17\"\""+
		"\3\2\f\f\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3E\3\2"+
		"\2\2\5S\3\2\2\2\7a\3\2\2\2\tr\3\2\2\2\13z\3\2\2\2\r\u0085\3\2\2\2\17\u008d"+
		"\3\2\2\2\21\u0098\3\2\2\2\23\u00a9\3\2\2\2\25\u00b4\3\2\2\2\27\u00b6\3"+
		"\2\2\2\31\u00bf\3\2\2\2\33\u00c4\3\2\2\2\35\u00d8\3\2\2\2\37\u00da\3\2"+
		"\2\2!\u00dc\3\2\2\2#\u00de\3\2\2\2%\u00e1\3\2\2\2\'\u00e3\3\2\2\2)\u00e5"+
		"\3\2\2\2+\u00e8\3\2\2\2-\u00eb\3\2\2\2/\u00ee\3\2\2\2\61\u00f0\3\2\2\2"+
		"\63\u00f2\3\2\2\2\65\u00f5\3\2\2\2\67\u00ff\3\2\2\29\u0107\3\2\2\2;\u010a"+
		"\3\2\2\2=\u0110\3\2\2\2?@\7k\2\2@F\7h\2\2AB\7K\2\2BF\7H\2\2CD\7K\2\2D"+
		"F\7h\2\2E?\3\2\2\2EA\3\2\2\2EC\3\2\2\2F\4\3\2\2\2GH\7V\2\2HI\7j\2\2IJ"+
		"\7g\2\2JT\7p\2\2KL\7v\2\2LM\7j\2\2MN\7g\2\2NT\7p\2\2OP\7V\2\2PQ\7J\2\2"+
		"QR\7G\2\2RT\7P\2\2SG\3\2\2\2SK\3\2\2\2SO\3\2\2\2T\6\3\2\2\2UV\7G\2\2V"+
		"W\7n\2\2WX\7u\2\2Xb\7g\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\b\7g\2\2]^\7G"+
		"\2\2^_\7N\2\2_`\7U\2\2`b\7G\2\2aU\3\2\2\2aY\3\2\2\2a]\3\2\2\2b\b\3\2\2"+
		"\2cd\7Y\2\2de\7j\2\2ef\7k\2\2fg\7n\2\2gs\7g\2\2hi\7y\2\2ij\7j\2\2jk\7"+
		"k\2\2kl\7n\2\2ls\7g\2\2mn\7Y\2\2no\7J\2\2op\7K\2\2pq\7N\2\2qs\7G\2\2r"+
		"c\3\2\2\2rh\3\2\2\2rm\3\2\2\2s\n\3\2\2\2tu\7F\2\2u{\7q\2\2vw\7f\2\2w{"+
		"\7q\2\2xy\7F\2\2y{\7Q\2\2zt\3\2\2\2zv\3\2\2\2zx\3\2\2\2{\f\3\2\2\2|}\7"+
		"N\2\2}~\7g\2\2~\u0086\7t\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0086\7v\2\2\u0082\u0083\7N\2\2\u0083\u0084\7G\2\2\u0084\u0086\7V\2\2"+
		"\u0085|\3\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\16\3\2\2\2"+
		"\u0087\u0088\7K\2\2\u0088\u008e\7P\2\2\u0089\u008a\7k\2\2\u008a\u008e"+
		"\7p\2\2\u008b\u008c\7K\2\2\u008c\u008e\7p\2\2\u008d\u0087\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e\20\3\2\2\2\u008f\u0090\7G\2\2"+
		"\u0090\u0091\7p\2\2\u0091\u0099\7f\2\2\u0092\u0093\7G\2\2\u0093\u0094"+
		"\7P\2\2\u0094\u0099\7F\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0099\7f\2\2\u0098\u008f\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2"+
		"\2\2\u0099\22\3\2\2\2\u009a\u009b\7E\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7u\2\2\u009e\u00aa\7v\2\2\u009f\u00a0\7E\2\2\u00a0"+
		"\u00a1\7Q\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7U\2\2\u00a3\u00aa\7V\2\2"+
		"\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8\u00aa\7v\2\2\u00a9\u009a\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7X\2\2\u00ac\u00ad\7c\2\2"+
		"\u00ad\u00b5\7t\2\2\u00ae\u00af\7X\2\2\u00af\u00b0\7C\2\2\u00b0\u00b5"+
		"\7T\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b5\7t\2\2\u00b4"+
		"\u00ab\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\26\3\2\2"+
		"\2\u00b6\u00bb\5\61\31\2\u00b7\u00ba\5\61\31\2\u00b8\u00ba\5\63\32\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\30\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0"+
		"\5\63\32\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\32\3\2\2\2\u00c3\u00c5\5\63\32\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\t\2\2\2\u00c9\u00cb\5\63\32\2\u00ca\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\34\3\2\2\2\u00ce\u00d9\t\3\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d9\7?\2\2"+
		"\u00d1\u00d2\7>\2\2\u00d2\u00d9\7?\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d9"+
		"\7?\2\2\u00d5\u00d9\4>@\2\u00d6\u00d7\7#\2\2\u00d7\u00d9\7?\2\2\u00d8"+
		"\u00ce\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d3\3\2"+
		"\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\36\3\2\2\2\u00da\u00db"+
		"\7=\2\2\u00db \3\2\2\2\u00dc\u00dd\4*+\2\u00dd\"\3\2\2\2\u00de\u00df\7"+
		"<\2\2\u00df\u00e0\7?\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7\u0080\2\2\u00e2"+
		"&\3\2\2\2\u00e3\u00e4\7<\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6"+
		"\u00e7\7\61\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ea\7\61\2\2"+
		"\u00ea,\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\7,\2\2\u00ed.\3\2\2\2"+
		"\u00ee\u00ef\t\4\2\2\u00ef\60\3\2\2\2\u00f0\u00f1\t\5\2\2\u00f1\62\3\2"+
		"\2\2\u00f2\u00f3\4\62;\2\u00f3\64\3\2\2\2\u00f4\u00f6\5\67\34\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\66\3\2\2\2\u00f9\u0100\t\6\2\2\u00fa\u00fc\t\7\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fb\3\2\2\2\u01008\3\2\2\2"+
		"\u0101\u0108\t\6\2\2\u0102\u0104\t\b\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0101\3\2\2\2\u0107\u0103\3\2\2\2\u0108:\3\2\2\2\u0109\u010b\t\7\2\2"+
		"\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b\36\2\2\u010f<\3\2\2\2\u0110"+
		"\u0111\t\t\2\2\u0111>\3\2\2\2\31\2ESarz\u0085\u008d\u0098\u00a9\u00b4"+
		"\u00b9\u00bb\u00c1\u00c6\u00cc\u00d8\u00f7\u00fd\u00ff\u0105\u0107\u010c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}