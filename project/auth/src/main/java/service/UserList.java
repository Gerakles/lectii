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
        users.add( new User( "Gerakles", "pass", RoleList.findByName( "admin" ) ) );
        users.add( new User( "test", "test" ,RoleList.findByName( "user" ) ) );
        users.add( new User( "Holop", "pas" ,RoleList.findByName( "user" ) ) );
    }
    public static User createUser (String userName, String password) {
        User user = new User( userName, password,  RoleList.findByName( "user" ));
         users.add( user );
         return user;
    }
}