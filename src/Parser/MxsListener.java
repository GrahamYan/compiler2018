package Parser;

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
	 * Enter a parse tree produced by {@link MxsParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(MxsParser.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(MxsParser.ArraytypeContext ctx);
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
	 * Enter a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(MxsParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(MxsParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MxsParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MxsParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(MxsParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(MxsParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MxsParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MxsParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MxsParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MxsParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(MxsParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(MxsParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(MxsParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(MxsParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(MxsParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(MxsParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(MxsParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(MxsParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(MxsParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(MxsParser.ExprStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MxsParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MxsParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolConstExpr(MxsParser.BoolConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolConstExpr(MxsParser.BoolConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(MxsParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(MxsParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(MxsParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(MxsParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(MxsParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(MxsParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(MxsParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(MxsParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suffixExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuffixExpr(MxsParser.SuffixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suffixExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuffixExpr(MxsParser.SuffixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(MxsParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(MxsParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MxsParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MxsParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntConstExpr(MxsParser.IntConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntConstExpr(MxsParser.IntConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(MxsParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(MxsParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(MxsParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(MxsParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringConstExpr(MxsParser.StringConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringConstExpr(MxsParser.StringConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(MxsParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(MxsParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MxsParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MxsParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MxsParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MxsParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MxsParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MxsParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wrongNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void enterWrongNew(MxsParser.WrongNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wrongNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void exitWrongNew(MxsParser.WrongNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void enterArrayNew(MxsParser.ArrayNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void exitArrayNew(MxsParser.ArrayNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonArrayNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void enterNonArrayNew(MxsParser.NonArrayNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonArrayNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 */
	void exitNonArrayNew(MxsParser.NonArrayNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MxsParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MxsParser.FunctionCallContext ctx);
}