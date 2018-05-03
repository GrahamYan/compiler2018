package grahamcompiler.AST.object;

import grahamcompiler.utility.Name;
import grahamcompiler.utility.Scope;
import grahamcompiler.utility.location;
import grahamcompiler.AST.node.DeclNode.FuncParamNode;
import grahamcompiler.AST.node.ExprNode.ExprListNode;
import grahamcompiler.Type.Type;

import java.util.List;

public class Object {
    protected Name name;
    public Object(String na) {
        name = Name.getName(na);
    }
    public Name getName() {
        return name;
    }
}







