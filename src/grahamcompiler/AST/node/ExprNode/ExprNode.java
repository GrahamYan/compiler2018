package grahamcompiler.AST.node.ExprNode;

import jdk.nashorn.internal.codegen.CompilerConstants;

import grahamcompiler.AST.node.ASTNode;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.BinaryOp;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.location;
import grahamcompiler.utility.UnaryOp;
import grahamcompiler.Type.Type;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.Type.Type;

import java.util.List;

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
}








































