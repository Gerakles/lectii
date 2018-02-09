package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List <User> users;

    static {
        users = new ArrayList <>();
        users.add( new User( "Gerakles", "pass", RoleList.findByName( "admin" ) ) );
        users.add( new User( "test", "test" ,RoleList.findByName( "user" ) ) );
        users.add( new User( "Holop", "pas" ,RoleList.findByName( "user" ) ) );
    }
    public static User createUser (String userName, String password) {
        User user = new User( userName, password,  RoleList.findByName( "user" ));
         users.add( user );
         return user;
    }
    public static User deleteUser (String userName, String password) {
        User duser = new User( userName, password,  RoleList.findByName( "user" ));
        users.add(null);
        return null;
    }
}