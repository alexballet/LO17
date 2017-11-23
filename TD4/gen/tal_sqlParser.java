// Generated from /Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD4/src/tal_sql.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tal_sqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, ARTICLE=2, TITRE=3, CONTACT=4, BULLETIN=5, CONJ_ET=6, CONJ_OU=7, 
		POINT=8, MOT=9, DATE=10, MOIS=11, JOUR=12, ANNEE=13, WS=14, VAR=15;
	public static final int
		RULE_listerequetes = 0, RULE_requete = 1, RULE_params = 2, RULE_dateparams = 3, 
		RULE_suite_params = 4, RULE_param = 5, RULE_date = 6;
	public static final String[] ruleNames = {
		"listerequetes", "requete", "params", "dateparams", "suite_params", "param", 
		"date"
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

	@Override
	public String getGrammarFileName() { return "tal_sql.g3"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tal_sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ListerequetesContext extends ParserRuleContext {
		public String sql = "";
		public RequeteContext r;
		public TerminalNode POINT() { return getToken(tal_sqlParser.POINT, 0); }
		public RequeteContext requete() {
			return getRuleContext(RequeteContext.class,0);
		}
		public ListerequetesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listerequetes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterListerequetes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitListerequetes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitListerequetes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListerequetesContext listerequetes() throws RecognitionException {
		ListerequetesContext _localctx = new ListerequetesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_listerequetes);
		Arbre lr_arbre;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((ListerequetesContext)_localctx).r = requete();
			setState(15);
			match(POINT);

							lr_arbre = ((ListerequetesContext)_localctx).r.req_arbre;
							sql = lr_arbre.sortArbre();
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequeteContext extends ParserRuleContext {
		public Arbre req_arbre = new Arbre("");
		public ParamsContext ps;
		public DateContext d;
		public TerminalNode SELECT() { return getToken(tal_sqlParser.SELECT, 0); }
		public TerminalNode ARTICLE() { return getToken(tal_sqlParser.ARTICLE, 0); }
		public TerminalNode BULLETIN() { return getToken(tal_sqlParser.BULLETIN, 0); }
		public TerminalNode TITRE() { return getToken(tal_sqlParser.TITRE, 0); }
		public TerminalNode DATE() { return getToken(tal_sqlParser.DATE, 0); }
		public TerminalNode MOT() { return getToken(tal_sqlParser.MOT, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public RequeteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterRequete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitRequete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitRequete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequeteContext requete() throws RecognitionException {
		RequeteContext _localctx = new RequeteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_requete);
		Arbre ps_arbre;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(SELECT);

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARTICLE:
				{
				setState(20);
				match(ARTICLE);

							req_arbre.ajouteFils(new Arbre("","fichier"));
							
				}
				break;
			case BULLETIN:
				{
				setState(22);
				match(BULLETIN);

							req_arbre.ajouteFils(new Arbre("","bulletin"));
							
				}
				break;
			case TITRE:
				{
				setState(24);
				match(TITRE);
				setState(25);
				match(ARTICLE);

				            			req_arbre.ajouteFils(new Arbre("","fichier"));
				            			
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(29);
				match(MOT);

								req_arbre.ajouteFils(new Arbre("","from titreTexte"));
								req_arbre.ajouteFils(new Arbre("","where"));
							
				setState(31);
				((RequeteContext)_localctx).ps = params();

				            				ps_arbre = ((RequeteContext)_localctx).ps.les_pars_arbre;
				            				req_arbre.ajouteFils(ps_arbre);
				            			
				}
				}
				break;
			case 2:
				{
				setState(34);
				match(DATE);

				        				req_arbre.ajouteFils(new Arbre("","from date"));
				        				req_arbre.ajouteFils(new Arbre("","where"));
				        			
				}
				break;
			case 3:
				{
				setState(36);
				match(MOT);
				setState(37);
				match(DATE);

				                				req_arbre.ajouteFils(new Arbre("","from titreTexte LEFT JOIN date ON titre.fichier = date.fichier"));
				                				req_arbre.ajouteFils(new Arbre("","where"));
				                			
				setState(39);
				((RequeteContext)_localctx).d = date();

				        				ps_arbre = ((RequeteContext)_localctx).d.date_arbre;
				        				req_arbre.ajouteFils(ps_arbre);
				        			
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Arbre les_pars_arbre = new Arbre("");
		public Suite_paramsContext sparams;
		public ParamContext par2;
		public Suite_paramsContext suite_params() {
			return getRuleContext(Suite_paramsContext.class,0);
		}
		public List<TerminalNode> CONJ_OU() { return getTokens(tal_sqlParser.CONJ_OU); }
		public TerminalNode CONJ_OU(int i) {
			return getToken(tal_sqlParser.CONJ_OU, i);
		}
		public List<TerminalNode> CONJ_ET() { return getTokens(tal_sqlParser.CONJ_ET); }
		public TerminalNode CONJ_ET(int i) {
			return getToken(tal_sqlParser.CONJ_ET, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		Arbre sparams_arbre, par2_arbre;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((ParamsContext)_localctx).sparams = suite_params();

				    sparams_arbre = ((ParamsContext)_localctx).sparams.suite_params_arbre;
			         les_pars_arbre.ajouteFils(sparams_arbre);
				
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJ_ET || _la==CONJ_OU) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONJ_OU:
					{
					setState(46);
					match(CONJ_OU);
					setState(47);
					((ParamsContext)_localctx).par2 = param();

					            			par2_arbre = ((ParamsContext)_localctx).par2.lepar_arbre;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "OR"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;
				case CONJ_ET:
					{
					setState(50);
					match(CONJ_ET);
					setState(51);
					((ParamsContext)_localctx).par2 = param();

					            			par2_arbre = ((ParamsContext)_localctx).par2.lepar_arbre;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "AND"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateparamsContext extends ParserRuleContext {
		public Arbre les_pars_arbre = new Arbre("");
		public Suite_paramsContext sparams;
		public Suite_paramsContext suite_params() {
			return getRuleContext(Suite_paramsContext.class,0);
		}
		public DateparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterDateparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitDateparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitDateparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateparamsContext dateparams() throws RecognitionException {
		DateparamsContext _localctx = new DateparamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dateparams);
		Arbre sparams_arbre, par2_arbre;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((DateparamsContext)_localctx).sparams = suite_params();

				    sparams_arbre = ((DateparamsContext)_localctx).sparams.suite_params_arbre;
			         les_pars_arbre.ajouteFils(sparams_arbre);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Suite_paramsContext extends ParserRuleContext {
		public Arbre suite_params_arbre = new Arbre("");
		public ParamContext par1;
		public ParamContext par3;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Suite_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterSuite_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitSuite_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitSuite_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Suite_paramsContext suite_params() throws RecognitionException {
		Suite_paramsContext _localctx = new Suite_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_suite_params);
		Arbre par1_arbre, par3_arbre;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((Suite_paramsContext)_localctx).par1 = param();

			        				par1_arbre = ((Suite_paramsContext)_localctx).par1.lepar_arbre;
			        				suite_params_arbre.ajouteFils(par1_arbre);
			        			
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(64);
				((Suite_paramsContext)_localctx).par3 = param();

				    				par3_arbre = ((Suite_paramsContext)_localctx).par3.lepar_arbre;
				    				suite_params_arbre.ajouteFils(new Arbre("", "AND"));
				    				suite_params_arbre.ajouteFils(par3_arbre);
				    			
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Arbre lepar_arbre = new Arbre("");
		public Token v;
		public TerminalNode VAR() { return getToken(tal_sqlParser.VAR, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		Arbre d_arbre;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((ParamContext)_localctx).v = match(VAR);
			 lepar_arbre.ajouteFils(new Arbre("mot like ", "'\%"+v.getText()+"\%'"));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public Arbre date_arbre = new Arbre("");
		public Token j;
		public Token m;
		public Token a;
		public TerminalNode JOUR() { return getToken(tal_sqlParser.JOUR, 0); }
		public TerminalNode MOIS() { return getToken(tal_sqlParser.MOIS, 0); }
		public TerminalNode ANNEE() { return getToken(tal_sqlParser.ANNEE, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tal_sqlListener ) ((tal_sqlListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tal_sqlVisitor ) return ((tal_sqlVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOUR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(75);
				((DateContext)_localctx).j = match(JOUR);
				 date_arbre.ajouteFils(new Arbre("jour =", "'"+j.getText()+"'"));
				setState(77);
				((DateContext)_localctx).m = match(MOIS);
				 date_arbre.ajouteFils(new Arbre("", "AND"));
				        	    date_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));
				setState(79);
				((DateContext)_localctx).a = match(ANNEE);
				 date_arbre.ajouteFils(new Arbre("", "AND"));
				                        	    date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
				}
				}
				break;
			case MOIS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(81);
				((DateContext)_localctx).m = match(MOIS);
				 date_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));
				setState(83);
				((DateContext)_localctx).a = match(ANNEE);
				 date_arbre.ajouteFils(new Arbre("", "AND"));
				                               	    date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
				}
				}
				break;
			case ANNEE:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				((DateContext)_localctx).a = match(ANNEE);
				 date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6F\n\6\f\6"+
		"\16\6I\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bZ\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2]\2\20\3\2\2\2\4\24\3\2\2\2"+
		"\6.\3\2\2\2\b=\3\2\2\2\n@\3\2\2\2\fJ\3\2\2\2\16Y\3\2\2\2\20\21\5\4\3\2"+
		"\21\22\7\n\2\2\22\23\b\2\1\2\23\3\3\2\2\2\24\25\7\3\2\2\25\35\b\3\1\2"+
		"\26\27\7\4\2\2\27\36\b\3\1\2\30\31\7\7\2\2\31\36\b\3\1\2\32\33\7\5\2\2"+
		"\33\34\7\4\2\2\34\36\b\3\1\2\35\26\3\2\2\2\35\30\3\2\2\2\35\32\3\2\2\2"+
		"\36,\3\2\2\2\37 \7\13\2\2 !\b\3\1\2!\"\5\6\4\2\"#\b\3\1\2#-\3\2\2\2$%"+
		"\7\f\2\2%-\b\3\1\2&\'\7\13\2\2\'(\7\f\2\2()\b\3\1\2)*\5\16\b\2*+\b\3\1"+
		"\2+-\3\2\2\2,\37\3\2\2\2,$\3\2\2\2,&\3\2\2\2-\5\3\2\2\2./\5\n\6\2/:\b"+
		"\4\1\2\60\61\7\t\2\2\61\62\5\f\7\2\62\63\b\4\1\2\639\3\2\2\2\64\65\7\b"+
		"\2\2\65\66\5\f\7\2\66\67\b\4\1\2\679\3\2\2\28\60\3\2\2\28\64\3\2\2\29"+
		"<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3\2\2\2=>\5\n\6\2>?\b\5\1\2"+
		"?\t\3\2\2\2@A\5\f\7\2AG\b\6\1\2BC\5\f\7\2CD\b\6\1\2DF\3\2\2\2EB\3\2\2"+
		"\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IG\3\2\2\2JK\7\21\2\2KL\b"+
		"\7\1\2L\r\3\2\2\2MN\7\16\2\2NO\b\b\1\2OP\7\r\2\2PQ\b\b\1\2QR\7\17\2\2"+
		"RZ\b\b\1\2ST\7\r\2\2TU\b\b\1\2UV\7\17\2\2VZ\b\b\1\2WX\7\17\2\2XZ\b\b\1"+
		"\2YM\3\2\2\2YS\3\2\2\2YW\3\2\2\2Z\17\3\2\2\2\b\35,8:GY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}