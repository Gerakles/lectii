import api.Resource;
import model.User;
import service.Authentication;
import service.ResurcesList;
import service.UserList;

import java.util.Scanner;

//import service.AuthenticationAdmin;

public class Cli {
    public static void main(String[] args) {
        Authentication yakim = new Authentication();
        Scanner sc = new Scanner( System.in );
        boolean exit = false;
        while (!exit && sc.hasNext()) {
            String coman = sc.nextLine();
            String[] yak = coman.split( " " );
            switch (yak[0]) {
                case "login":
                    if (yakim.login( yak[1], yak[2] ))
                        System.out.println( yakim.getcarentuser() );
                    else
                        System.out.println( "Good buy" );
                    break;
                case "new":
                    String userName = yak[1];
                    String pass = yak[2];
                    User u = UserList.createUser( userName, pass );
                    System.out.println( "Was created " + u );
                    break;
                case "info":
                    if (yakim.getcarentuser() != null) {
                        System.out.println( yakim.getcarentuser() );
                    } else
                        System.out.println( "please login" );
                    break;
                case "get":
                    Resource res = ResurcesList.findByTitle( yak[1] );
                    if (yakim.getcarentuser().getRole().hasAccess( res ))
                        System.out.println( "Have access " + res );
                    else
                        System.out.println( "Don't access " + res );
                    break;
                case "delete":
                    String uN = yak[1];
                    String uP = yak[2];
                    User y = UserList.deleteUser( uN, uP );

                    System.out.println( "Was deleted " + yak[1]+", "+yak[2] );
                    break;
                case "logaut":
                    yakim.setCarentuser( null );
                    break;
                case "exit":
                    exit = true;
            }
        }
    }
}