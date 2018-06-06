package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.utility.location;
import grahamcompiler.AST.node.ASTNode;
import grahamcompiler.utility.Name;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.IRInstruction;

public abstract class StmtNode extends ASTNode{
    public StmtNode(location pos) {
        super(pos);
    }
    public Name getName() {
        return Name.getName("Stmt");
    }
    @Override
    public IRInstruction accept(IRTraversal visitor) {
        visitor.visit(this);
        return null;
    }
}
