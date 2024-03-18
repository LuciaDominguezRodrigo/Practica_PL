// Generated from C:/Users/marco/Documents/GitHub/Practica_PL/PracticaObligatoria/src/Translator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TranslatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SPACE=2, IDENT=3, DEC_DIGIT=4, OCT_DIGIT=5, HEX_DIGIT=6, DEC_INT=7, 
		OCT_INT=8, HEX_INT=9, CONSTINT=10, DEC_REAL=11, OCT_REAL=12, HEX_REAL=13, 
		CONSTFLOAT=14, CONSTLIT=15, ENDOFLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "SPACE", "IDENT", "DEC_DIGIT", "OCT_DIGIT", "HEX_DIGIT", "DEC_INT", 
			"OCT_INT", "HEX_INT", "CONSTINT", "DEC_REAL", "OCT_REAL", "HEX_REAL", 
			"CONSTFLOAT", "CONSTLIT", "ENDOFLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "' '", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "SPACE", "IDENT", "DEC_DIGIT", "OCT_DIGIT", "HEX_DIGIT", 
			"DEC_INT", "OCT_INT", "HEX_INT", "CONSTINT", "DEC_REAL", "OCT_REAL", 
			"HEX_REAL", "CONSTFLOAT", "CONSTLIT", "ENDOFLINE"
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


	public TranslatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Translator.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			CONSTINT_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			CONSTFLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			CONSTLIT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("<IDENT>");
			break;
		}
	}
	private void CONSTINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("<CONSTINT>");
			break;
		}
	}
	private void CONSTFLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("<CONSTFLOAT>");
			break;
		}
	}
	private void CONSTLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("<CONSTLIT>");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002"+
		"\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0003\u0006<\b\u0006\u0001\u0006\u0004\u0006"+
		"?\b\u0006\u000b\u0006\f\u0006@\u0001\u0007\u0001\u0007\u0003\u0007E\b"+
		"\u0007\u0001\u0007\u0004\u0007H\b\u0007\u000b\u0007\f\u0007I\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\b\u0004\bS\b\b\u000b\b\f\bT\u0001"+
		"\t\u0001\t\u0001\t\u0003\tZ\b\t\u0001\t\u0005\t]\b\t\n\t\f\t`\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\ng\b\n\u000b\n\f\nh\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000bn\b\u000b\u000b\u000b\f\u000bo\u0001"+
		"\f\u0001\f\u0001\f\u0004\fu\b\f\u000b\f\f\fv\u0001\r\u0001\r\u0001\r\u0003"+
		"\r|\b\r\u0001\r\u0005\r\u007f\b\r\n\r\f\r\u0082\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0089\b\u000e\u000b\u000e\f"+
		"\u000e\u008a\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"\u0001\u0000\u0007\u0002\u0000\t\n\r\r\u0003\u0000$$AZaz\u0005\u0000$"+
		"$09AZ__az\u0001\u000009\u0001\u000007\u0003\u000009AFaf\u0002\u0000++"+
		"--\u00a6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%\u0001"+
		"\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000"+
		"\u0000\u000b8\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f"+
		"B\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013Y\u0001"+
		"\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017j\u0001\u0000\u0000"+
		"\u0000\u0019q\u0001\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d"+
		"\u0085\u0001\u0000\u0000\u0000\u001f\u008f\u0001\u0000\u0000\u0000!\""+
		"\u0007\u0000\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005 \u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%)\u0007\u0001\u0000\u0000&(\u0007"+
		"\u0002\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*/\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000,.\u0003\u0001\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"23\u0006\u0002\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0007\u0003"+
		"\u0000\u00005\b\u0001\u0000\u0000\u000067\u0007\u0004\u0000\u00007\n\u0001"+
		"\u0000\u0000\u000089\u0007\u0005\u0000\u00009\f\u0001\u0000\u0000\u0000"+
		":<\u0007\u0006\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<>\u0001\u0000\u0000\u0000=?\u0003\u0007\u0003\u0000>=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BD\u00050\u0000\u0000"+
		"CE\u0007\u0006\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000FH\u0003\t\u0004\u0000GF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u00050\u0000\u0000LM\u0005"+
		"x\u0000\u0000MO\u0001\u0000\u0000\u0000NP\u0007\u0006\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QS\u0003\u000b\u0005\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0012\u0001"+
		"\u0000\u0000\u0000VZ\u0003\r\u0006\u0000WZ\u0003\u000f\u0007\u0000XZ\u0003"+
		"\u0011\b\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\u0003\u0001\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0006\t\u0001\u0000b\u0014\u0001\u0000\u0000\u0000cd\u0003"+
		"\r\u0006\u0000df\u0005.\u0000\u0000eg\u0003\u0007\u0003\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u0016\u0001\u0000\u0000\u0000jk\u0003\u000f"+
		"\u0007\u0000km\u0005.\u0000\u0000ln\u0003\t\u0004\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000p\u0018\u0001\u0000\u0000\u0000qr\u0003\u0011\b\u0000"+
		"rt\u0005.\u0000\u0000su\u0003\u000b\u0005\u0000ts\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u001a\u0001\u0000\u0000\u0000x|\u0003\u0015\n\u0000y|\u0003\u0017"+
		"\u000b\u0000z|\u0003\u0019\f\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0080\u0001\u0000\u0000\u0000"+
		"}\u007f\u0003\u0001\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0006\r\u0002\u0000\u0084\u001c\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0005\'\u0000\u0000\u0086\u0089\b\u0000\u0000"+
		"\u0000\u0087\u0089\u0005\'\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005\'\u0000\u0000\u008d"+
		"\u008e\u0006\u000e\u0003\u0000\u008e\u001e\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\r\u0000\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u000f\u0004\u0000\u0093 \u0001"+
		"\u0000\u0000\u0000\u0012\u0000)/;@DIOTY^hov{\u0080\u0088\u008a\u0005\u0001"+
		"\u0002\u0000\u0001\t\u0001\u0001\r\u0002\u0001\u000e\u0003\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}