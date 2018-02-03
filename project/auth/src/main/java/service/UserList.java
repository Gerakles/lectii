package service;

//import model.Admin;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List <User> users;
    //public static List <Admin> admins;

    static {
        users = new ArrayList <>();
        //admins.add( new Admin( "Gerakles", "pass" ) );
        users.add( new User( "Gerakles", "pass" ) );
        users.add( new User( "test", "test" ) );
        users.add( new User( "Holop", "pas" ) );
    }
}