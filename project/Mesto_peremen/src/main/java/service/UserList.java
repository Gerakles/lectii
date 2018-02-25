package service;

import body.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    // SQLite connection string
    static final String url = "jdbc:sqlite:D://lectii/src/db/mesto_peremen.db";
    public static UserList service =new UserList();

    public List<User> findAll() {
        String sql = "SELECT id, name, password,id_role FROM user";
        List <User> users = new ArrayList <>();
        return users;
    }
}
