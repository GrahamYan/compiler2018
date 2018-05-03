package grahamcompiler.AST.node.DeclNode;

import grahamcompiler.AST.object.ParameterObject;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;

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
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

