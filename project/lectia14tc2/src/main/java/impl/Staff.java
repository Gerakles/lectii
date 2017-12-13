package impl;

import api.Role;
import impl.Person;

public abstract class Staff extends Person implements Role {

    public Staff(String text) {
        super(text);
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Role=")
                .append(getRoleName())
                .append(", {")
                .append(getfirstName())
                .append(", ")
                .append(getlastName())
                .append(", ")
                .append(getage())
                .append("}");
        return sb.toString();
    }


}
