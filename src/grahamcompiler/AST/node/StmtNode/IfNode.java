package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.node.ExprNode.ExprNode;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Scope;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.IRInstruction;

public class IfNode extends StmtNode {
    private ExprNode condition;
    private StmtNode state, elsestate;
    private Scope externalScope, internalScope;
    public IfNode(location pos, ExprNode cond, StmtNode then, StmtNode elsethen) {
        super(pos);
        condition = cond;
        state = then;
        elsestate = elsethen;
    }
    public final ExprNode getCondition() {
        return condition;
    }
    public final StmtNode getState() {
        return state;
    }
    public final StmtNode getElsestate() {
        return elsestate;
    }
    public void setInternalScope(Scope internalScope) {
        this.internalScope = internalScope;
    }
    public void setExternalScope(Scope externalScope) {
        this.externalScope = externalScope;
    }
    public Scope getInternalScope() {
        return internalScope;
    }
    public Scope getExternalScope() {
        return externalScope;
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
