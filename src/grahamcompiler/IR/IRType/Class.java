package grahamcompiler.IR.IRType;

import grahamcompiler.utility.Name;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<IRType> contains;
    private Name name;

    public Class(List<IRType> containTypes, Name name) {
        contains = containTypes;
        this.name = name;
    }

    public Class(Name name) {
        contains = new ArrayList<>();
        this.name = name;
    }

    public String toFullInfoString() {
        String tmp = "struct:" + name.toString() + "= type {";
        int i = 0;
        for (IRType item : contains) {
            if (i != contains.size() - 1)
                tmp += item.toString() + " ";
            else
                tmp += item.toString() + "}";
        }
        return tmp;
    }

    public void addContain(IRType type) {contains.add(type);}

    @Override
    public String toString() {return "struct:" + name.toString() + ":";}
}
