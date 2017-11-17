public class CarOne {
    String color;
    public static void main (String[]args){
        CarOne c1 = new CarOne();
        CarOne c2 = new CarOne();
        CarOne c3 = new CarOne();

        c1.color = "green";
        c2.color = "red";
        c3.color = "blue";

        System.out.println(c1.color + " " + c2.color + " " + c3.color);

    }
}