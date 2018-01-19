import java.util.Scanner;

public class Binarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        byte b = (byte) sc.nextByte();
        System.out.println(Integer.toBinaryString((int) b));
    }
}
