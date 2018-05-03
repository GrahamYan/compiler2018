package Parser;

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
	 * Visit a parse tree produced by {@link MxsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(MxsParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraytype(MxsParser.ArraytypeContext ctx);
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
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MxsParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MxsParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MxsParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MxsParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MxsParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MxsParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MxsParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(MxsParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(MxsParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link MxsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(MxsParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(MxsParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MxsParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConstExpr(MxsParser.BoolConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(MxsParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(MxsParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(MxsParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(MxsParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suffixExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixExpr(MxsParser.SuffixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(MxsParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MxsParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConstExpr(MxsParser.IntConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(MxsParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpr(MxsParser.PrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringConstExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstExpr(MxsParser.StringConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(MxsParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MxsParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MxsParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MxsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MxsParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonArrayNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonArrayNew(MxsParser.NonArrayNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrongNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongNew(MxsParser.WrongNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayNew}
	 * labeled alternative in {@link MxsParser#news}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNew(MxsParser.ArrayNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxsParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MxsParser.FunctionCallContext ctx);
}