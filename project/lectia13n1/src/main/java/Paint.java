public class Paint extends Shirt {
    private int SHIP_PRICE = 30;

    public Paint(String fit) {
        super( fit );
    }

    @Override
    public String getFit() {
        return fit;
    }

    @Override
    public void setFit(String fit) {
        this.fit = fit;
    }

    private String fit;

    @Override
    public double calculateShip() {
        double parentValue = super.calculateShip();
        return  parentValue-SHIP_PRICE;
    }
}
