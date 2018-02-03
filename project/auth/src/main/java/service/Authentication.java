package service;

import model.Admin;
import model.User;

public class Authentication {
    public User carentuser;
    public boolean login(String login, String password) {
        for (User user: UserList.users ) {
            if (login.equals( user.getLogin()) && password.equals( user.getPassword() )) {
                carentuser = user;
                return  true;
            }
        }
        return false;
    }

    public User getcarentuser() {
        return carentuser;
    }

    public void setCarentuser(User carentuser) {
        this.carentuser = carentuser;
    }

    public Admin carentAdmin;
    public boolean logins(String login, String password) {
        for (Admin AD: UserList.admins ) {
            if (login.equals( AD.getLogins()) && password.equals( AD.getPasswords() )) {
                carentAdmin = AD;
                return  true;
            }
        }
        return false;
    }

    public Admin getCarentAdmin() {
        return carentAdmin;
    }

    public void setCarentAdmin(Admin carentAdmin) {
        this.carentAdmin = carentAdmin;
    }
}
