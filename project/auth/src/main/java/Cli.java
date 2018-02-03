import model.Role;
import service.Authentication;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Authentication yakim = new Authentication();
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
                case "info":
                    if (yakim.getcarentuser() != null)
                        System.out.println( yakim.getcarentuser() );
                    else
                        System.out.println( "please login" );
                    break;
                case "logaut":
                    yakim.setCarentuser( null );
                    break;
                case "Admin":
            }
        }
    }
}
//I dont under stand