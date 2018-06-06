package grahamcompiler.IR;

import grahamcompiler.AST.node.ExprNode.MemberExprNode;
import grahamcompiler.IR.IRBase.IRInstTraversal;
import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.Value.PhysicalRegister;
import grahamcompiler.IR.Value.Register;

import java.util.List;

public class MemCopy extends IRInstruction{
    private Address fromAddress;
    private Address toAddress;
    private PhysicalRegister dataReg;

    public MemCopy(Label label, Address address1, Address address2) {
        super(label);
        fromAddress = address1;
        toAddress = address2;
    }

    public Address getFromAddress() {
        return fromAddress;
    }

    public Address getToAddress() {
        return toAddress;
    }
    public PhysicalRegister getDataReg() {
        return dataReg;
    }

    public void setDataReg(PhysicalRegister dataReg) {
        this.dataReg = dataReg;
    }

    @Override
    public String toString() {
        if (fromAddress != null && toAddress != null)
            return "MemCopy: " + fromAddress.toString() + " to " + toAddress.toString();
        else if (fromAddress == null && toAddress != null)
            return "";
        else if (fromAddress != null && toAddress == null)
            return "MemCopy: " + fromAddress.toString() + " to NULL";
        else
            return "MemCopy: NULL to NULL";
    }
    public Register getDefRegister() {
        return null;
    }

    @Override
    public void setUsedRegister() {
        usedRegister.clear();
        Address tmp;
        if (fromAddress instanceof Address) {
            tmp = (Address) fromAddress;
            while (tmp.getBase() != null) {
                if (tmp.getOffset() instanceof Register) usedRegister.add((Register) tmp.getOffset());
                tmp = tmp.getBase();
            }
            usedRegister.add(tmp);
        }
        else if (fromAddress instanceof Register) usedRegister.add((Register) fromAddress);
    }

    @Override
    public void accept(IRInstTraversal visitor) {
        visitor.visit(this);
    }
}

