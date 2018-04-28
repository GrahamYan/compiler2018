// Generated from E:/大二/大二下/compiler/compiler2018/src\Mxs.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxsParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(MxsParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefs(MxsParser.DefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(MxsParser.VarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#defvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvars(MxsParser.DefvarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(MxsParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(MxsParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#basetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasetype(MxsParser.BasetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(MxsParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#defclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefclass(MxsParser.DefclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(MxsParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#defunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefunc(MxsParser.DefuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MxsParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MxsParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MxsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MxsParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(MxsParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MxsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#news}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNews(MxsParser.NewsContext ctx);
}