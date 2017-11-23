// Generated from /Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD4/src/tal_sql.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tal_sqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tal_sqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#listerequetes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListerequetes(tal_sqlParser.ListerequetesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#requete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequete(tal_sqlParser.RequeteContext ctx);
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(tal_sqlParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#dateparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateparams(tal_sqlParser.DateparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#suite_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite_params(tal_sqlParser.Suite_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(tal_sqlParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link tal_sqlParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(tal_sqlParser.DateContext ctx);
}