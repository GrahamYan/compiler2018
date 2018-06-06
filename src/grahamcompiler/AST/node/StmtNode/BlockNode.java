package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Scope;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.IRInstruction;

import java.util.List;

public class BlockNode extends StmtNode {
    private List<StmtNode> statements;
    private Scope scope;
    public BlockNode(location pos, List<StmtNode> stmt) {
        super(pos);
        statements = stmt;
    }
    public final List<StmtNode> getStatements() {
        return statements;
    }
    public Scope getScope() {
        return scope;
    }
    public void setScope(Scope scope) {
        this.scope = scope;
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
