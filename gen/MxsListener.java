// Generated from E:/大二/大二下/compiler/compiler2018/src\Mxs.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxsParser}.
 */
public interface MxsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(MxsParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(MxsParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#defs}.
	 * @param ctx the parse tree
	 */
	void enterDefs(MxsParser.DefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#defs}.
	 * @param ctx the parse tree
	 */
	void exitDefs(MxsParser.DefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(MxsParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(MxsParser.VarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#defvars}.
	 * @param ctx the parse tree
	 */
	void enterDefvars(MxsParser.DefvarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#defvars}.
	 * @param ctx the parse tree
	 */
	void exitDefvars(MxsParser.DefvarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(MxsParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(MxsParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(MxsParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(MxsParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxsParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#basetype}.
	 * @param ctx the parse tree
	 */
	void enterBasetype(MxsParser.BasetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#basetype}.
	 * @param ctx the parse tree
	 */
	void exitBasetype(MxsParser.BasetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(MxsParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(MxsParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#defclass}.
	 * @param ctx the parse tree
	 */
	void enterDefclass(MxsParser.DefclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#defclass}.
	 * @param ctx the parse tree
	 */
	void exitDefclass(MxsParser.DefclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(MxsParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(MxsParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#defunc}.
	 * @param ctx the parse tree
	 */
	void enterDefunc(MxsParser.DefuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#defunc}.
	 * @param ctx the parse tree
	 */
	void exitDefunc(MxsParser.DefuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MxsParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MxsParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MxsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MxsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MxsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MxsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MxsParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MxsParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(MxsParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(MxsParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MxsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MxsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void enterNews(MxsParser.NewsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void exitNews(MxsParser.NewsContext ctx);
}