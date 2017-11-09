package loopurile;

import java.util.ArrayList;

public class lectiacinci {
    public static void main(String[] args) {

        int [] array = new int [5];
        ArrayList<Integer> arrayDynamic = new ArrayList<>();

        arrayDynamic.add(1);
        arrayDynamic.add(2);
        arrayDynamic.add(3);
        arrayDynamic.add(4);
        arrayDynamic.add(5);
        arrayDynamic.set(4,10);
        int index = arrayDynamic.indexOf(10);
        System.out.println("index elementului 10: "+index);


        for (int i = 0; i <arrayDynamic.size() ; i++) {
            System.out.println("======================");
            System.out.println("pina la continue");

            if(arrayDynamic.get(i)  == 3) {
                continue;
            }
            System.out.println("dupa continue");
           /* System.out.println(array[i]);*/
            System.out.println("value of i: "+1);
            System.out.println(arrayDynamic.get(i));

        }
    }
}
