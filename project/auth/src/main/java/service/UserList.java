package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List <User> users;

    static {
        users = new ArrayList <>();
        users.add( new User( "Gerrakles", "Password" ) );
        users.add( new User( "Holop", "Password" ) );
    }
}
