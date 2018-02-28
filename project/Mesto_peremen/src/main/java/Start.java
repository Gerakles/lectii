import Interfaces.Resourse;
import body.User;
import service.Authentification;
import service.ResourseList;
import service.RoleList;
import service.UserList;

import java.util.Random;
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
                    System.out.println( "Was created " + user );
                    break;
                case "info":
                    if (mp.getCarentUser() != null)
                        System.out.println( mp.getCarentUser() );
                     else
                        System.out.println( "please login" );
                    break;
                case "get":
                    Resourse res = ResourseList.findByTitle( place[1] );
                    if (RoleList.findByID( mp.getCarentUser().getId() ).hasAcces( res ))
                        System.out.println( "Have access " + res );
                    else
                        System.out.println( "Don't access " + res );
                    break;
                case "minigame" :
                    Random rn = new Random();

                    int a = rn.nextInt( 1 ) + 1;
                    int b = rn.nextInt( 2 ) + 1;
                    int c = rn.nextInt( 3 ) + 1;
                    int d = rn.nextInt( 4 ) + 1;
                    String loc1 = String.valueOf( a );
                    String loc2 = String.valueOf( b );
                    String loc3 = String.valueOf( c );
                    String loc4 = String.valueOf( d );

                    System.out.println( "Level 1: " );
                    String local1 = sc.next();
                    if (loc1.equals( local1 )) {
                        System.out.println( "GOOD & level 2: " );
                        String local2 = sc.next();
                        if (loc2.equals( local2 )) {
                            System.out.println( "VERY GOOD & level 3: " );
                            String local3 = sc.next();
                            if (loc3.equals( local3 )) {
                                System.out.println( "You are my hero & level 4: " );
                                String local4 = sc.next();
                                if (loc4.equals( local4 )) {
                                    System.out.println( "Super Man & level 5: " );
                                } else {
                                    System.out.println( "O no! game over" );
                                }
                            } else {
                                System.out.println( "O no! game over" );
                            }
                        } else {
                            System.out.println( "O no! game over" );
                        }
                    } else {
                        System.out.println( "O no! game over" );
                    }
                    break;
                case "delete":
                    String del = place[1];
                    UserList.service.deleteUser( del );
                    System.out.println( "Was deleted " + del );
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
