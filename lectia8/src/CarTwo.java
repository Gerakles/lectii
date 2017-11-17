public class CarTwo {
    static final String color;
    static {
        color = "black";

    }

    public static void main (String[]args){
    //    CarTwo.color = "green";

        System.out.println(Integer.MAX_VALUE);

        CarTwo c1 = new CarTwo();
        CarTwo c2 = new CarTwo();
        CarTwo c3 = new CarTwo();

        System.out.println(c1.color + " " + c2.color + " " + c3.color);

    }
}
