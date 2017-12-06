import java.util.Collections;
import java.util.List;

public class laTrei {
    public static List<Integer> inmultire;

    public static void main(String[] args) {

        for (int i = 3; i <= 10; i += 3) {//toate nr se imparte la 3
            for (int a = 5; a <= 10; a += 5) {
                int sum = i * a;
                //System.out.println(sum);
                inmultire.add(sum);
                Collections.sort(inmultire);
            }
        }
    }
}