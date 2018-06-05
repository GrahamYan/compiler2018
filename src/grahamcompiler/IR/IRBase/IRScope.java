package grahamcompiler.IR.IRBase;

import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.Value.VirtualRegister;
import grahamcompiler.utility.Name;

import java.util.HashMap;
import java.util.Map;

public class IRScope {
    private Map<Name, VirtualRegister> registerMap = new HashMap<>();
    private Map<Name, Address> addressMap = new HashMap<>();
    private boolean isTop;
    private IRScope parent;

    public IRScope(boolean isTop) {
        this.isTop = isTop;
    }

    public IRScope(IRScope parent) {
        this.isTop = false;
        this.parent = parent;
    }

    public void addRegister(Name name, VirtualRegister VirtualRegister) {
        registerMap.put(name, VirtualRegister);
    }

    public VirtualRegister getRegister(Name name) {
        if (registerMap.containsKey(name))
            return registerMap.get(name);
        else return parent.getRegister(name);
    }



    public Address findAddress(Name name) {
        if (addressMap.containsKey(name))
            return addressMap.get(name);
        else return parent.findAddress(name);
    }

    public void addAddress(Name name, Address address) {
        addressMap.put(name, address);
    }

    public IRScope getParent() {
        return parent;
    }
}
