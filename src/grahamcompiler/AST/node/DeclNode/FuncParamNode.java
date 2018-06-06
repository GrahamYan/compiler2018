package grahamcompiler.AST.node.DeclNode;

import grahamcompiler.AST.object.ParameterObject;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;
import grahamcompiler.Type.*;
import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.utility.Name;


public class FuncParamNode extends VarDeclNode{
    private ParameterObject parameter;
    public FuncParamNode(location pos, ParameterObject param) {
        super(pos, param, null);
        parameter = param;
    }

    public ParameterObject getParameter() {
        return parameter;
    }

    @Override
    public Name getName() {
        return parameter.getName();
    }

    @Override
    public Address accept(IRTraversal visitor) {
        visitor.visit(this);
        return null;
    }

    @Override
    public Type getType() {
        return parameter.getType();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
