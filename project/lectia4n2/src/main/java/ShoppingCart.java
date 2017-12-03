public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        System.out.println(message);

        total = quantity * price * tax;
        System.out.println("Total cost with tax: "+total);
    }
}
