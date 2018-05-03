package grahamcompiler.Type;

import grahamcompiler.AST.node.DeclNode.ClassDeclNode;
import grahamcompiler.utility.Name;

public class Type {
    private Name typeName;
    private int typeSize;
    public Type(String name, int size){
        typeName = Name.getName(name);
        typeSize = size;
    }
    public Name getTypeName() {
        return typeName;
    }
    public int getTypeSize() {
        return typeSize;
    }
    public ClassDeclNode getClassNode() {
        return null;
    }
    public static boolean equal(Type a, Type b) {
        return (a.getTypeName() == b.getTypeName());
    }
}
