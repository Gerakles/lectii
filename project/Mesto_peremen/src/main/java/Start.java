import Interfaces.Resourse;
import body.User;
import service.Authentification;
import service.ResourseList;
import service.RoleList;
import service.UserList;

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
                        System.out.println( "Ты не из место перемен! Почему?" );
                    break;
                case "new":
                    String name = place[1];
                    String password = place[2];
                    User user = UserList.service.createUser( name, password );
                    System.out.println( "Was created ");
                    break;
                case "info":
                    if (mp.getCarentUser() != null) {
                        System.out.println( mp.getCarentUser() );
                    } else
                        System.out.println( "please login" );
                    break;
                case "get":
                    Resourse res = ResourseList.findByTitle(place[1] );
                    if (RoleList.findByID( mp.getCarentUser().getId() ).hasAcces( res ))
                        System.out.println( "Have access " + res );
                    else
                        System.out.println( "Don't access " + res );
                    break;
                case "delete":
                    String uN = place[1];
                    UserList.service.deleteUser( uN );
                    System.out.println( "Was deleted " + uN );
                    break;
                case "logaut":
                    mp.setCarentUser( null );
                    break;
                case "exit":
                    exit = true;
            }
        }
    }
}