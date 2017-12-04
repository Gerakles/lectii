public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" Smith");

        sb.append(custName.substring(spaceIdx));
        System.out.println(sb);
    }
}