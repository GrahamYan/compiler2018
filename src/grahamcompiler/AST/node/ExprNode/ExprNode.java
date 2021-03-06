package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.node.ASTNode;
import grahamcompiler.utility.location;
import grahamcompiler.Type.Type;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public abstract class ExprNode extends ASTNode{
    private boolean isLeftvalue;
    private Type exprType;
    public ExprNode(location pos) {
        super(pos);
        isLeftvalue = false;
    }
    public void setIsLeftvalue(boolean value) {
        isLeftvalue = value;
    }
    public boolean isLeftvalue() {
        return isLeftvalue;
    }
    public void setExprType(Type exprTy) {
        exprType = exprTy;
    }
    public Type getExprType() {
        return exprType;
    }
    @Override
    public IntegerValue accept(IRTraversal visitor) {
        return visitor.visit(this);
    }
}








































