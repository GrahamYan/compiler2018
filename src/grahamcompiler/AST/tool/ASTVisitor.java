package grahamcompiler.AST.tool;

import grahamcompiler.AST.node.DeclNode.*;
import grahamcompiler.AST.node.ExprNode.*;
import grahamcompiler.AST.node.StmtNode.*;
import grahamcompiler.AST.node.ProgNode;
import grahamcompiler.Type.Type;

public interface ASTVisitor {
    void visit(ProgNode node);
    void visit(DeclNode node);
    void visit(VarDeclNode node);
    void visit(FuncParamNode node);
    void visit(FuncDeclNode node);
    void visit(ClassDeclNode node);

    // Expressions
    void visit(ExprNode node);
    void visit(ExprStmtNode node);
    void visit(ExprListNode node);
    void visit(BinaryExprNode node);
    void visit(PrefixExprNode node);
    void visit(SuffixExprNode node);
    void visit(OrExprNode node);
    void visit(AndExprNode node);
    void visit(BoolConstNode node);
    void visit(IntConstNode node);
    void visit(StringConstNode node);
    void visit(NullConstNode node);
    void visit(ArrayExprNode node);
    void visit(AssignExprNode node);
    void visit(CallExprNode node);
    void visit(MemberExprNode node);
    void visit(IdentifierExprNode node);
    void visit(CreatorExprNode node);
    void visit(NewExprNode node);
    void visit(ThisExprNode node);
    void visit(StmtNode node);
    void visit(BlockNode node);
    void visit(IfNode node);
    void visit(ForNode node);
    void visit(WhileNode node);
    void visit(BreakNode node);
    void visit(ReturnNode node);
    void visit(ContinueNode node);

    void visit(Type type) throws Exception;
}

