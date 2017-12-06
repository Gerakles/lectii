public class Clothing {
    // fields given default values
    private int itemID = 0;
    private String desc = "-description required-";
    private char colorCode = 'U';
    private double price = 0.0;
    private double SHIP_PRICE = 20;

    //public Clothing(){}

    // Constructor
    public Clothing(int itemID, String desc, char color, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = color;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double calculateShip() {
        return SHIP_PRICE;
    }
}