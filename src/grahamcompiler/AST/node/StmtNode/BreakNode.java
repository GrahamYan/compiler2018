package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.IRInstruction;

public class BreakNode extends StmtNode{
    public BreakNode(location pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public IRInstruction accept(IRTraversal visitor) {
        visitor.visit(this);
        return null;
    }
}
