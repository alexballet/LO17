// Generated from /Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD4/src/tal_sql.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tal_sqlParser}.
 */
public interface tal_sqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#listerequetes}.
	 * @param ctx the parse tree
	 */
	void enterListerequetes(tal_sqlParser.ListerequetesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#listerequetes}.
	 * @param ctx the parse tree
	 */
	void exitListerequetes(tal_sqlParser.ListerequetesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#requete}.
	 * @param ctx the parse tree
	 */
	void enterRequete(tal_sqlParser.RequeteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#requete}.
	 * @param ctx the parse tree
	 */
	void exitRequete(tal_sqlParser.RequeteContext ctx);
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(tal_sqlParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(tal_sqlParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#dateparams}.
	 * @param ctx the parse tree
	 */
	void enterDateparams(tal_sqlParser.DateparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#dateparams}.
	 * @param ctx the parse tree
	 */
	void exitDateparams(tal_sqlParser.DateparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#suite_params}.
	 * @param ctx the parse tree
	 */
	void enterSuite_params(tal_sqlParser.Suite_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#suite_params}.
	 * @param ctx the parse tree
	 */
	void exitSuite_params(tal_sqlParser.Suite_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(tal_sqlParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(tal_sqlParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link tal_sqlParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(tal_sqlParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link tal_sqlParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(tal_sqlParser.DateContext ctx);
}