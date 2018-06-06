package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public class NewExprNode extends ExprNode {
    private CreatorExprNode creatorNode;
    public NewExprNode(location pos, CreatorExprNode creator) {
        super(pos);
        creatorNode = creator;
    }
    public CreatorExprNode getCreatorNode() {
        return creatorNode;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public IntegerValue accept(IRTraversal visitor) {
        return visitor.visit(this);
    }
}