public class ShoppingCart {
    public static void main (String[] args){
        Item item1 = new Item();

        if (item1.setColor('B')){
            System.out.println("Item1.color = " +item1.color);
        }
        else System.out.println("Invalid color");
    }
}
