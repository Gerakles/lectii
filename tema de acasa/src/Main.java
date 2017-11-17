public class Main {

    public static void main (String[] args){
        Item I1 = new Item('A');

        if (I1.setColor('$')){
            System.out.println("I1.color = " +I1.color);
        }
        else System.out.println("fail");
    }
}
