package grahamcompiler.AST.object;

import grahamcompiler.Type.Type;
import grahamcompiler.utility.Scope;



public class ParameterObject extends VarObject {
    public ParameterObject(String name, Type type) {
        super(name, false, type);
    }
}
