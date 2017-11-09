// $ANTLR 3.5.2 tal_sql.g3 2017-11-09 13:08:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int BULLETIN=5;
	public static final int CONJ_ET=6;
	public static final int CONJ_OU=7;
	public static final int MOT=8;
	public static final int POINT=9;
	public static final int SELECT=10;
	public static final int TITRE=11;
	public static final int VAR=12;
	public static final int WS=13;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "tal_sql.g3"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:83:8: ( 'vouloir' )
			// tal_sql.g3:83:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:86:9: ( 'article' )
			// tal_sql.g3:86:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:89:7: ( 'titre' )
			// tal_sql.g3:89:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:92:10: ( 'bulletin' )
			// tal_sql.g3:92:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ_ET"
	public final void mCONJ_ET() throws RecognitionException {
		try {
			int _type = CONJ_ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:95:9: ( 'et' )
			// tal_sql.g3:95:11: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_ET"

	// $ANTLR start "CONJ_OU"
	public final void mCONJ_OU() throws RecognitionException {
		try {
			int _type = CONJ_OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:98:9: ( 'ou' )
			// tal_sql.g3:98:11: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:101:7: ( '.' )
			// tal_sql.g3:101:9: '.'
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
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:104:5: ( 'mot' | 'contenir' | 'parler' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt1=1;
				}
				break;
			case 'c':
				{
				alt1=2;
				}
				break;
			case 'p':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// tal_sql.g3:104:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// tal_sql.g3:104:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// tal_sql.g3:104:28: 'parler'
					{
					match("parler"); 

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
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:107:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' '||LA3_0=='d'||LA3_0=='j'||LA3_0=='q') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// tal_sql.g3:107:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// tal_sql.g3:107:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt2=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt2=1;
						}
						break;
					case '\t':
						{
						alt2=2;
						}
						break;
					case '\r':
						{
						alt2=3;
						}
						break;
					case 'j':
						{
						alt2=4;
						}
						break;
					case 'q':
						{
						alt2=5;
						}
						break;
					case 'd':
						{
						alt2=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// tal_sql.g3:107:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// tal_sql.g3:107:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// tal_sql.g3:107:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// tal_sql.g3:107:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// tal_sql.g3:107:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// tal_sql.g3:107:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// tal_sql.g3:107:62: '\\n'
					{
					match('\n'); 
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
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:110:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// tal_sql.g3:110:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// tal_sql.g3:110:30: ( 'a' .. 'z' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// tal_sql.g3:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// tal_sql.g3:1:8: ( SELECT | ARTICLE | TITRE | BULLETIN | CONJ_ET | CONJ_OU | POINT | MOT | WS | VAR )
		int alt5=10;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// tal_sql.g3:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// tal_sql.g3:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// tal_sql.g3:1:25: TITRE
				{
				mTITRE(); 

				}
				break;
			case 4 :
				// tal_sql.g3:1:31: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 5 :
				// tal_sql.g3:1:40: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 6 :
				// tal_sql.g3:1:48: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 7 :
				// tal_sql.g3:1:56: POINT
				{
				mPOINT(); 

				}
				break;
			case 8 :
				// tal_sql.g3:1:62: MOT
				{
				mMOT(); 

				}
				break;
			case 9 :
				// tal_sql.g3:1:66: WS
				{
				mWS(); 

				}
				break;
			case 10 :
				// tal_sql.g3:1:69: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\20\uffff\4\17\1\40\1\41\3\17\1\13\6\17\2\uffff\1\53\2\17\1\13\5\17\1"+
		"\uffff\2\17\1\13\2\17\1\67\5\17\1\uffff\2\17\1\53\1\77\1\100\2\17\2\uffff"+
		"\1\103\1\53\1\uffff";
	static final String DFA5_eofS =
		"\104\uffff";
	static final String DFA5_minS =
		"\1\11\6\141\1\uffff\3\141\1\uffff\3\141\1\uffff\1\165\2\164\1\154\2\141"+
		"\1\164\1\156\1\162\1\141\1\151\1\156\1\154\1\151\1\162\1\154\2\uffff\1"+
		"\141\1\164\1\154\1\141\1\164\1\157\1\143\2\145\1\uffff\2\145\1\141\1\151"+
		"\1\154\1\141\1\164\1\156\2\162\1\145\1\uffff\2\151\3\141\1\156\1\162\2"+
		"\uffff\2\141\1\uffff";
	static final String DFA5_maxS =
		"\7\172\1\uffff\3\172\1\uffff\3\172\1\uffff\1\165\2\164\1\154\2\172\1\164"+
		"\1\156\1\162\1\172\1\151\1\156\1\154\1\151\1\162\1\154\2\uffff\1\172\1"+
		"\164\1\154\1\172\1\164\1\157\1\143\2\145\1\uffff\2\145\1\172\1\151\1\154"+
		"\1\172\1\164\1\156\2\162\1\145\1\uffff\2\151\3\172\1\156\1\162\2\uffff"+
		"\2\172\1\uffff";
	static final String DFA5_acceptS =
		"\7\uffff\1\7\3\uffff\1\11\3\uffff\1\12\20\uffff\1\5\1\6\11\uffff\1\10"+
		"\13\uffff\1\3\7\uffff\1\1\1\2\2\uffff\1\4";
	static final String DFA5_specialS =
		"\104\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\15\uffff\1\7\22\uffff\32\17\6\uffff"+
			"\1\2\1\4\1\11\1\16\1\5\4\17\1\14\2\17\1\10\1\17\1\6\1\12\1\15\2\17\1"+
			"\3\1\17\1\1\4\17",
			"\16\17\1\20\13\17",
			"\21\17\1\21\10\17",
			"\10\17\1\22\21\17",
			"\24\17\1\23\5\17",
			"\23\17\1\24\6\17",
			"\24\17\1\25\5\17",
			"",
			"\16\17\1\26\13\17",
			"\16\17\1\27\13\17",
			"\1\30\31\17",
			"",
			"\4\17\1\31\25\17",
			"\24\17\1\32\5\17",
			"\16\17\1\33\13\17",
			"",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\32\17",
			"\32\17",
			"\1\42",
			"\1\43",
			"\1\44",
			"\32\17",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"",
			"",
			"\32\17",
			"\1\54",
			"\1\55",
			"\32\17",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"\1\63",
			"\1\64",
			"\32\17",
			"\1\65",
			"\1\66",
			"\32\17",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"\1\75",
			"\1\76",
			"\32\17",
			"\32\17",
			"\32\17",
			"\1\101",
			"\1\102",
			"",
			"",
			"\32\17",
			"\32\17",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | TITRE | BULLETIN | CONJ_ET | CONJ_OU | POINT | MOT | WS | VAR );";
		}
	}

}
