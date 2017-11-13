package lectie6;

import java.util.Scanner;

public class Proba {
    private static String login;
    private static String login1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ваше имя");
        login = sc.nextLine();
        login1 = sc1.nextLine();

         if(login.equals("Богдан")) {
             System.out.println("Я вас привествую мой господин!");
             System.out.println("Желаю вам всего наилучшего!");

             if(login1.equals("Спасибо")) {
                 System.out.println("Я рад что угил вам");
             }  else {
                 System.out.println("Fail");
             }
         }  else {
             System.out.println("Fail");
         }



         }


    }


