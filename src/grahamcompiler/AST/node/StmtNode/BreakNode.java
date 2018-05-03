package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;

public class BreakNode extends StmtNode{
    public BreakNode(location pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
