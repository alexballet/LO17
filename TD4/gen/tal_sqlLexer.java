// Generated from /Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD4/src/tal_sql.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tal_sqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, ARTICLE=2, TITRE=3, CONTACT=4, BULLETIN=5, CONJ_ET=6, CONJ_OU=7, 
		POINT=8, MOT=9, DATE=10, MOIS=11, JOUR=12, ANNEE=13, WS=14, VAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "ARTICLE", "TITRE", "CONTACT", "BULLETIN", "CONJ_ET", "CONJ_OU", 
		"POINT", "MOT", "DATE", "MOIS", "JOUR", "ANNEE", "WS", "VAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'vouloir'", "'article'", "'titre'", "'contact'", "'bulletin'", 
		"'et'", "'ou'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "ARTICLE", "TITRE", "CONTACT", "BULLETIN", "CONJ_ET", 
		"CONJ_OU", "POINT", "MOT", "DATE", "MOIS", "JOUR", "ANNEE", "WS", "VAR"
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


	public tal_sqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tal_sql.g3"; }

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
		case 13:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\17\3\17\5\17\u0090\n\17\3"+
		"\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097\13\20\3\20\7\20\u009a\n\20\f"+
		"\20\16\20\u009d\13\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\5\2\13\13\17\17\"\"\5\2\62;C"+
		"\\c|\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2"+
		"\2\2\5)\3\2\2\2\7\61\3\2\2\2\t\67\3\2\2\2\13?\3\2\2\2\rH\3\2\2\2\17K\3"+
		"\2\2\2\21N\3\2\2\2\23a\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31y\3\2\2\2\33"+
		"|\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\"\7x\2\2\"#\7q\2\2#$\7w\2"+
		"\2$%\7n\2\2%&\7q\2\2&\'\7k\2\2\'(\7t\2\2(\4\3\2\2\2)*\7c\2\2*+\7t\2\2"+
		"+,\7v\2\2,-\7k\2\2-.\7e\2\2./\7n\2\2/\60\7g\2\2\60\6\3\2\2\2\61\62\7v"+
		"\2\2\62\63\7k\2\2\63\64\7v\2\2\64\65\7t\2\2\65\66\7g\2\2\66\b\3\2\2\2"+
		"\678\7e\2\289\7q\2\29:\7p\2\2:;\7v\2\2;<\7c\2\2<=\7e\2\2=>\7v\2\2>\n\3"+
		"\2\2\2?@\7d\2\2@A\7w\2\2AB\7n\2\2BC\7n\2\2CD\7g\2\2DE\7v\2\2EF\7k\2\2"+
		"FG\7p\2\2G\f\3\2\2\2HI\7g\2\2IJ\7v\2\2J\16\3\2\2\2KL\7q\2\2LM\7w\2\2M"+
		"\20\3\2\2\2NO\7\60\2\2O\22\3\2\2\2PQ\7o\2\2QR\7q\2\2Rb\7v\2\2ST\7e\2\2"+
		"TU\7q\2\2UV\7p\2\2VW\7v\2\2WX\7g\2\2XY\7p\2\2YZ\7k\2\2Zb\7t\2\2[\\\7r"+
		"\2\2\\]\7c\2\2]^\7t\2\2^_\7n\2\2_`\7g\2\2`b\7t\2\2aP\3\2\2\2aS\3\2\2\2"+
		"a[\3\2\2\2b\24\3\2\2\2cd\7r\2\2de\7c\2\2ef\7t\2\2fg\7w\2\2gh\7v\2\2hi"+
		"\7k\2\2ij\7q\2\2ju\7p\2\2kl\7t\2\2lm\7g\2\2mn\7f\2\2no\7c\2\2op\7e\2\2"+
		"pq\7v\2\2qr\7k\2\2rs\7q\2\2su\7p\2\2tc\3\2\2\2tk\3\2\2\2u\26\3\2\2\2v"+
		"w\4\62\63\2wx\4\62;\2x\30\3\2\2\2yz\4\62;\2z{\4\62;\2{\32\3\2\2\2|}\4"+
		"\62;\2}~\4\62;\2~\177\4\62;\2\177\u0080\4\62;\2\u0080\34\3\2\2\2\u0081"+
		"\u008c\t\2\2\2\u0082\u0083\7l\2\2\u0083\u008c\7g\2\2\u0084\u0085\7s\2"+
		"\2\u0085\u0086\7w\2\2\u0086\u008c\7k\2\2\u0087\u0088\7f\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7p\2\2\u008a\u008c\7v\2\2\u008b\u0081\3\2\2\2\u008b"+
		"\u0082\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0090\b\17\2\2\u008e\u0090\7\f\2\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\36\3\2\2\2\u0091\u0095\t\3\2\2\u0092\u0094\4c|\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u009b\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\4\62;\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c \3\2\2\2\u009d\u009b\3\2\2\2\t\2at\u008b\u008f\u0095\u009b"+
		"\3\3\17\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}