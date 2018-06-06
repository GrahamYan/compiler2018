package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.node.ExprNode.ExprNode;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.IRInstruction;

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
    @Override
    public IRInstruction accept(IRTraversal visitor) {
        visitor.visit(this);
        return null;
    }
}
