import service.Authentication;
//import service.AuthenticationAdmin;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Authentication yakim = new Authentication();
        //AuthenticationAdmin yakimAdmin = new AuthenticationAdmin();
        Scanner sc = new Scanner( System.in );
        while (sc.hasNext()) {
            String coman = sc.nextLine();
            String[] yak = coman.split( " " );
            switch (yak[0]) {
                case "login":
                    if (yakim.login( yak[1], yak[2] ))
                        System.out.println( yakim.getcarentuser() );
                     else
                        System.out.println( "Good buy" );
                    break;
//                case "Admin":
//                    if (yakimAdmin.logins( yak[1],yak[2] ))
//                        System.out.println(yakimAdmin.getCarentAdmin());
//                    else
//                        System.out.println("You not Admin");
//                    break;
                case "info":
                    if (yakim.getcarentuser() != null)
                        System.out.println( yakim.getcarentuser() );
                    else
                        System.out.println( "please login" );
                    break;
                case "logaut":
                    yakim.setCarentuser( null );
                    break;
            }
        }
    }
}