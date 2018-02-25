package service;

import model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleList {
    public static List <Role> rols;

    static {
        rols = new ArrayList <>();
        rols.add( new Role( "user", 1, ResurcesList.findUserResourse() ) );
        rols.add( new Role( "admin", 2, ResurcesList.resours ) );
    }

    public static Role findByName(String name) {
        for (int i = 0; i < rols.size(); i++) {
            if (rols.get( i ).getName().equals( name ))
                return rols.get( i );

        }
        return null;
    }

    public static Role findById(int id) {
        for (int i = 0; i < rols.size(); i++) {
            if (rols.get( i ).getId() == id)
                return rols.get( i );

        }
        return null;
    }
}
