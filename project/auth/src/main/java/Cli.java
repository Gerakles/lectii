import api.Resource;
import model.Page;
import model.Role;
import model.User;

public class Cli {
    public static void main(String[] args) {
        User Admin = new User("Gerrakles", "Password");
        User user = new User("Holop", "Password");
        Role Adminr = new Role( "Name" );
        Role userr = new Role( "Name" );
        Resource res1 = new Page("home");
    }
}