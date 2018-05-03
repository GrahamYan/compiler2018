package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.node.ExprNode.ExprNode;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;

public class ExprStmtNode extends StmtNode{
    private ExprNode express;
    public ExprStmtNode(location pos, ExprNode expr) {
        super(pos);
        express = expr;
    }
    public final ExprNode getExpress() {
        return express;
    }
    @Override
    public  void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
