package practics;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ведите ваше имя: ");
        String a = scan.next();

        System.out.println(a+", Welcome in your programm");
        String b = scan.nextLine();
        System.out.println("My boss you beatiful say "+b);
    }
}
