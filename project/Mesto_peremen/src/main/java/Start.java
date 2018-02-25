import service.Authentification;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Authentification mp = new Authentification();
        Scanner sc = new Scanner( System.in );
        boolean exit = false;
        while (!exit && sc.hasNext()) {
            String comander = sc.nextLine();
            String[] place = comander.split( " " );
            switch (place[0]) {
                case "login":
                    if (mp.login( place[1], place[2] ))
                        System.out.println( mp.getCarentUser() );
                    else
                        System.out.println( "Good buy" );
            }
        }
    }
}
