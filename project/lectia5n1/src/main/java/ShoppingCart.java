public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = custName +" wants to purchase " +quantity +" " +itemDesc;
        total = quantity * price * tax;

        if (quantity > 1){
            message = message +"s";
        }

        boolean outOfStock = false;

        if (outOfStock){
            System.out.println(itemDesc+" is out of stock.");
        }
        else{
            System.out.println(message);
            System.out.println("Total cost with tax: " +total);
        }
    }
}

