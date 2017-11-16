// $ANTLR 3.5.2 tal_sql.g3 2017-11-16 13:06:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int BULLETIN=6;
	public static final int CONJ_ET=7;
	public static final int CONJ_OU=8;
	public static final int CONTACT=9;
	public static final int DATE=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int POINT=14;
	public static final int SELECT=15;
	public static final int TITRE=16;
	public static final int VAR=17;
	public static final int WS=18;

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
			// tal_sql.g3:122:8: ( 'vouloir' )
			// tal_sql.g3:122:10: 'vouloir'
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
			// tal_sql.g3:125:9: ( 'article' )
			// tal_sql.g3:125:11: 'article'
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
			// tal_sql.g3:128:7: ( 'titre' )
			// tal_sql.g3:128:9: 'titre'
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

	// $ANTLR start "CONTACT"
	public final void mCONTACT() throws RecognitionException {
		try {
			int _type = CONTACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:131:9: ( 'contact' )
			// tal_sql.g3:131:11: 'contact'
			{
			match("contact"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTACT"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:134:10: ( 'bulletin' )
			// tal_sql.g3:134:12: 'bulletin'
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
			// tal_sql.g3:137:9: ( 'et' )
			// tal_sql.g3:137:11: 'et'
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
			// tal_sql.g3:140:9: ( 'ou' )
			// tal_sql.g3:140:11: 'ou'
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
			// tal_sql.g3:143:7: ( '.' )
			// tal_sql.g3:143:9: '.'
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
			// tal_sql.g3:146:5: ( 'mot' | 'contenir' | 'parler' )
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
					// tal_sql.g3:146:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// tal_sql.g3:146:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// tal_sql.g3:146:28: 'parler'
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

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:149:6: ( 'parution' | 'redaction' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='p') ) {
				alt2=1;
			}
			else if ( (LA2_0=='r') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// tal_sql.g3:149:8: 'parution'
					{
					match("parution"); 

					}
					break;
				case 2 :
					// tal_sql.g3:149:21: 'redaction'
					{
					match("redaction"); 

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
	// $ANTLR end "DATE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:152:7: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// tal_sql.g3:152:9: ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:155:8: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// tal_sql.g3:155:10: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:158:7: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' )
			int alt3=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='a') ) {
					alt3=1;
				}
				else if ( (LA3_1=='u') ) {
					int LA3_10 = input.LA(3);
					if ( (LA3_10=='i') ) {
						int LA3_14 = input.LA(4);
						if ( (LA3_14=='n') ) {
							alt3=6;
						}
						else if ( (LA3_14=='l') ) {
							alt3=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt3=2;
				}
				break;
			case 'm':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='a') ) {
					int LA3_11 = input.LA(3);
					if ( (LA3_11=='r') ) {
						alt3=3;
					}
					else if ( (LA3_11=='i') ) {
						alt3=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4=='v') ) {
					alt3=4;
				}
				else if ( (LA3_4=='o') ) {
					alt3=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt3=9;
				}
				break;
			case 'o':
				{
				alt3=10;
				}
				break;
			case 'n':
				{
				alt3=11;
				}
				break;
			case 'd':
				{
				alt3=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// tal_sql.g3:158:9: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// tal_sql.g3:158:21: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// tal_sql.g3:158:33: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// tal_sql.g3:158:42: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// tal_sql.g3:158:52: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// tal_sql.g3:158:60: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// tal_sql.g3:158:69: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// tal_sql.g3:158:81: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// tal_sql.g3:158:90: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// tal_sql.g3:158:104: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// tal_sql.g3:158:116: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// tal_sql.g3:158:129: 'decembre'
					{
					match("decembre"); 

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
	// $ANTLR end "MOIS"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:161:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\t'||LA5_0=='\r'||LA5_0==' '||LA5_0=='d'||LA5_0=='j'||LA5_0=='q') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\n') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// tal_sql.g3:161:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// tal_sql.g3:161:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt4=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt4=1;
						}
						break;
					case '\t':
						{
						alt4=2;
						}
						break;
					case '\r':
						{
						alt4=3;
						}
						break;
					case 'j':
						{
						alt4=4;
						}
						break;
					case 'q':
						{
						alt4=5;
						}
						break;
					case 'd':
						{
						alt4=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// tal_sql.g3:161:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// tal_sql.g3:161:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// tal_sql.g3:161:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// tal_sql.g3:161:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// tal_sql.g3:161:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// tal_sql.g3:161:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// tal_sql.g3:161:62: '\\n'
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
			// tal_sql.g3:164:6: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' ) ( 'a' .. 'z' )* ( '0' .. '9' )* )
			// tal_sql.g3:164:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' ) ( 'a' .. 'z' )* ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// tal_sql.g3:164:40: ( 'a' .. 'z' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
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
					break loop6;
				}
			}

			// tal_sql.g3:164:51: ( '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// tal_sql.g3:
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
					break loop7;
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
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// tal_sql.g3:1:8: ( SELECT | ARTICLE | TITRE | CONTACT | BULLETIN | CONJ_ET | CONJ_OU | POINT | MOT | DATE | JOUR | ANNEE | MOIS | WS | VAR )
		int alt8=15;
		alt8 = dfa8.predict(input);
		switch (alt8) {
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
				// tal_sql.g3:1:31: CONTACT
				{
				mCONTACT(); 

				}
				break;
			case 5 :
				// tal_sql.g3:1:39: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// tal_sql.g3:1:48: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 7 :
				// tal_sql.g3:1:56: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 8 :
				// tal_sql.g3:1:64: POINT
				{
				mPOINT(); 

				}
				break;
			case 9 :
				// tal_sql.g3:1:70: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// tal_sql.g3:1:74: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// tal_sql.g3:1:79: JOUR
				{
				mJOUR(); 

				}
				break;
			case 12 :
				// tal_sql.g3:1:84: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 13 :
				// tal_sql.g3:1:90: MOIS
				{
				mMOIS(); 

				}
				break;
			case 14 :
				// tal_sql.g3:1:95: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// tal_sql.g3:1:98: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\7\24\1\uffff\11\24\1\uffff\1\24\1\uffff\7\24\1\64\1\65\5\24\1"+
		"\75\2\24\1\22\15\24\2\uffff\1\24\1\116\1\24\1\120\3\24\1\uffff\7\24\1"+
		"\22\3\24\1\120\4\24\1\uffff\1\120\1\uffff\3\24\1\150\1\24\1\120\5\24\1"+
		"\22\2\24\1\120\1\161\7\24\1\uffff\10\24\1\uffff\4\24\1\116\10\24\1\u008d"+
		"\1\u008e\1\u008f\2\24\1\120\2\24\3\120\3\24\3\uffff\1\116\1\u0097\1\u0098"+
		"\2\24\2\120\2\uffff\1\u0098\1\120";
	static final String DFA8_eofS =
		"\u009b\uffff";
	static final String DFA8_minS =
		"\1\11\2\157\1\151\1\157\1\165\1\164\1\143\1\uffff\2\141\1\145\1\60\1\141"+
		"\2\145\1\157\1\145\1\uffff\1\165\1\uffff\1\165\1\164\1\162\1\165\1\164"+
		"\1\156\1\154\2\60\2\164\1\151\1\162\1\144\1\60\1\156\1\151\1\60\1\166"+
		"\1\160\1\166\1\143\1\156\1\151\1\154\2\151\1\164\1\162\1\164\1\154\2\uffff"+
		"\1\157\1\60\1\163\1\60\1\154\1\141\1\60\1\uffff\1\166\1\154\1\162\1\164"+
		"\2\145\1\164\1\60\1\157\1\143\1\154\1\60\1\145\1\141\1\145\1\142\1\uffff"+
		"\1\60\1\uffff\1\145\1\164\1\143\1\60\1\151\1\60\1\154\1\151\1\145\2\155"+
		"\1\60\1\151\1\154\2\60\1\143\1\156\1\164\2\162\1\151\1\164\1\uffff\3\145"+
		"\1\155\2\142\1\162\1\145\1\uffff\1\164\2\151\1\145\1\60\1\157\1\151\1"+
		"\162\1\164\1\162\1\142\2\162\3\60\1\162\1\156\1\60\1\156\1\157\3\60\1"+
		"\162\2\145\3\uffff\3\60\1\156\1\145\2\60\2\uffff\2\60";
	static final String DFA8_maxS =
		"\1\172\1\157\1\166\1\151\1\157\1\165\1\164\1\165\1\uffff\1\157\1\141\1"+
		"\145\1\71\1\165\2\145\2\157\1\uffff\1\165\1\uffff\1\165\1\164\1\162\1"+
		"\165\1\164\1\156\1\154\2\172\2\164\2\162\1\144\1\71\1\156\1\151\1\172"+
		"\1\166\1\160\1\166\1\143\1\156\1\151\1\154\2\151\1\164\1\162\1\164\1\154"+
		"\2\uffff\1\157\1\172\1\163\1\172\1\165\1\141\1\71\1\uffff\1\166\1\156"+
		"\1\162\1\164\2\145\1\164\1\172\1\157\1\143\1\154\1\172\3\145\1\142\1\uffff"+
		"\1\172\1\uffff\1\145\1\164\1\143\1\71\1\151\1\172\1\154\1\151\1\145\2"+
		"\155\1\172\1\151\1\154\2\172\1\143\1\156\1\164\2\162\1\151\1\164\1\uffff"+
		"\3\145\1\155\2\142\1\162\1\145\1\uffff\1\164\2\151\1\145\1\172\1\157\1"+
		"\151\1\162\1\164\1\162\1\142\2\162\3\172\1\162\1\156\1\172\1\156\1\157"+
		"\3\172\1\162\2\145\3\uffff\3\172\1\156\1\145\2\172\2\uffff\2\172";
	static final String DFA8_acceptS =
		"\10\uffff\1\10\11\uffff\1\16\1\uffff\1\17\37\uffff\1\6\1\7\7\uffff\1\13"+
		"\20\uffff\1\11\1\uffff\1\15\27\uffff\1\14\10\uffff\1\3\33\uffff\1\1\1"+
		"\2\1\4\7\uffff\1\5\1\12\2\uffff";
	static final String DFA8_specialS =
		"\u009b\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\15\uffff\1\10\1\uffff\12\14\7\uffff"+
			"\32\24\6\uffff\1\2\1\5\1\4\1\21\1\6\1\16\3\24\1\15\2\24\1\11\1\20\1\7"+
			"\1\12\1\23\1\13\1\17\1\3\1\24\1\1\4\24",
			"\1\25",
			"\1\30\2\uffff\1\26\3\uffff\1\27",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\36\21\uffff\1\35",
			"",
			"\1\40\15\uffff\1\37",
			"\1\41",
			"\1\42",
			"\12\43",
			"\1\44\3\uffff\1\46\17\uffff\1\45",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52\11\uffff\1\53",
			"",
			"\1\54",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\1\66",
			"\1\67",
			"\1\71\10\uffff\1\70",
			"\1\72",
			"\1\73",
			"\12\74",
			"\1\76",
			"\1\77",
			"\12\24\47\uffff\32\24",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"",
			"\1\115",
			"\12\24\47\uffff\32\24",
			"\1\117",
			"\12\24\47\uffff\32\24",
			"\1\121\10\uffff\1\122",
			"\1\123",
			"\12\124",
			"",
			"\1\125",
			"\1\127\1\uffff\1\126",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\12\24\47\uffff\32\24",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\24\47\uffff\32\24",
			"\1\140",
			"\1\141\3\uffff\1\142",
			"\1\143",
			"\1\144",
			"",
			"\12\24\47\uffff\32\24",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\24",
			"\1\151",
			"\12\24\47\uffff\32\24",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\12\24\47\uffff\32\24",
			"\1\157",
			"\1\160",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\12\24\47\uffff\32\24",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\1\u0090",
			"\1\u0091",
			"\12\24\47\uffff\32\24",
			"\1\u0092",
			"\1\u0093",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"",
			"",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"\1\u0099",
			"\1\u009a",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24",
			"",
			"",
			"\12\24\47\uffff\32\24",
			"\12\24\47\uffff\32\24"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | TITRE | CONTACT | BULLETIN | CONJ_ET | CONJ_OU | POINT | MOT | DATE | JOUR | ANNEE | MOIS | WS | VAR );";
		}
	}

}
