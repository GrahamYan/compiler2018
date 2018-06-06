package grahamcompiler.AST.node.StmtNode;

import grahamcompiler.AST.node.ExprNode.ExprNode;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Scope;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.IRInstruction;
import grahamcompiler.Type.ArrayType;

public class WhileNode extends StmtNode{
    private ExprNode condition;
    private StmtNode block;
    private Scope internalScope, externalScope;
    public WhileNode(location pos, ExprNode cond, StmtNode blo) {
        super(pos);
        condition = cond;
        block = blo;
    }
    public ExprNode getCondition() {
        return condition;
    }
    public StmtNode getBlock() {
        return block;
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
