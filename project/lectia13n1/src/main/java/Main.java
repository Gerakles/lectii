public class Main {
    public static void main(String[]args) {
        Clothing shirt1 = new Shirt("Y");
        Clothing shirt2 = new Paint("L");
        shirt1.calculateShip();
        shirt2.calculateShip();
        if (shirt1 instanceof Shirt) {
            ((Shirt)shirt1).setFit("XXL");

        }

        System.out.println(shirt1.calculateShip()+" Рубашка");
        System.out.println(shirt2.calculateShip()+" Джинсы со скидкой");
    }
}
