package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;

public class ContinueNode extends StmtNode{
    public ContinueNode(location pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
