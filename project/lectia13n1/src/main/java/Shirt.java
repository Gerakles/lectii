public class Shirt extends Clothing{
    private String fit;
    private final double SHIP_PRICE = 5;

    //public Shirt() {}

    public Shirt(String fit) {
        super(7,"black",'Y',39.5);
        this.fit=fit;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }
    @Override
    public double calculateShip() {
        double parentValue = super.calculateShip();
        return SHIP_PRICE * parentValue;
    }
}
