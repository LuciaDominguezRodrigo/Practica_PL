// Generated from C:/Users/Jorge/Documents/Jorge/URJC/3º/Procesadores de Lenguajes/Practica_PL/PracticaObligatoria/src/Translator.g4 by ANTLR 4.13.1
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
		WS=1, IDENT=2, DEC_DIGIT=3, OCT_DIGIT=4, HEX_DIGIT=5, DEC_INT=6, OCT_INT=7, 
		HEX_INT=8, CONSTINT=9, DEC_REAL=10, OCT_REAL=11, HEX_REAL=12, CONSTFLOAT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "IDENT", "DEC_DIGIT", "OCT_DIGIT", "HEX_DIGIT", "DEC_INT", "OCT_INT", 
			"HEX_INT", "CONSTINT", "DEC_REAL", "OCT_REAL", "HEX_REAL", "CONSTFLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IDENT", "DEC_DIGIT", "OCT_DIGIT", "HEX_DIGIT", "DEC_INT", 
			"OCT_INT", "HEX_INT", "CONSTINT", "DEC_REAL", "OCT_REAL", "HEX_REAL", 
			"CONSTFLOAT"
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
		case 1:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			CONSTINT_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			CONSTFLOAT_action((RuleContext)_localctx, actionIndex);
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

	public static final String _serializedATN =
		"\u0004\u0000\r}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0005"+
		"\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0003\u00054\b\u0005\u0001\u0005\u0004\u00057\b\u0005\u000b\u0005"+
		"\f\u00058\u0001\u0006\u0001\u0006\u0003\u0006=\b\u0006\u0001\u0006\u0004"+
		"\u0006@\b\u0006\u000b\u0006\f\u0006A\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007H\b\u0007\u0001\u0007\u0004\u0007K\b\u0007\u000b"+
		"\u0007\f\u0007L\u0001\b\u0001\b\u0001\b\u0003\bR\b\b\u0001\b\u0005\bU"+
		"\b\b\n\b\f\bX\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004\t_\b\t"+
		"\u000b\t\f\t`\u0001\n\u0001\n\u0001\n\u0004\nf\b\n\u000b\n\f\ng\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000bm\b\u000b\u000b\u000b\f\u000b"+
		"n\u0001\f\u0001\f\u0001\f\u0003\ft\b\f\u0001\f\u0005\fw\b\f\n\f\f\fz\t"+
		"\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u0001\u0000\u0007\u0002\u0000\t\n\r\r\u0003\u0000$$A"+
		"Zaz\u0005\u0000$$09AZ__az\u0001\u000009\u0001\u000007\u0003\u000009AF"+
		"af\u0002\u0000++--\u008d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000"+
		"\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000"+
		"\u0000\u0007.\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b"+
		"3\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000fC\u0001\u0000"+
		"\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000"+
		"\u0015b\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019s"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c\u0002"+
		"\u0001\u0000\u0000\u0000\u001d!\u0007\u0001\u0000\u0000\u001e \u0007\u0002"+
		"\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\'\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0003\u0001\u0000\u0000%$\u0001"+
		"\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000*+\u0006\u0001\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0007"+
		"\u0003\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0007\u0004\u0000"+
		"\u0000/\b\u0001\u0000\u0000\u000001\u0007\u0005\u0000\u00001\n\u0001\u0000"+
		"\u0000\u000024\u0007\u0006\u0000\u000032\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u000057\u0003\u0005\u0002\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\f\u0001\u0000\u0000\u0000:<\u00050\u0000"+
		"\u0000;=\u0007\u0006\u0000\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000>@\u0003\u0007\u0003\u0000?>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u00050\u0000"+
		"\u0000DE\u0005x\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0007\u0006\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000IK\u0003\t\u0004\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0010"+
		"\u0001\u0000\u0000\u0000NR\u0003\u000b\u0005\u0000OR\u0003\r\u0006\u0000"+
		"PR\u0003\u000f\u0007\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000SU\u0003\u0001"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0006\b\u0001\u0000Z\u0012\u0001\u0000\u0000"+
		"\u0000[\\\u0003\u000b\u0005\u0000\\^\u0005.\u0000\u0000]_\u0003\u0005"+
		"\u0002\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0014\u0001\u0000\u0000"+
		"\u0000bc\u0003\r\u0006\u0000ce\u0005.\u0000\u0000df\u0003\u0007\u0003"+
		"\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0016\u0001\u0000\u0000\u0000"+
		"ij\u0003\u000f\u0007\u0000jl\u0005.\u0000\u0000km\u0003\t\u0004\u0000"+
		"lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o\u0018\u0001\u0000\u0000\u0000pt\u0003"+
		"\u0013\t\u0000qt\u0003\u0015\n\u0000rt\u0003\u0017\u000b\u0000sp\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tx\u0001\u0000\u0000\u0000uw\u0003\u0001\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0006"+
		"\f\u0002\u0000|\u001a\u0001\u0000\u0000\u0000\u0010\u0000!\'38<AGLQV`"+
		"gnsx\u0003\u0001\u0001\u0000\u0001\b\u0001\u0001\f\u0002";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}