package oracle.practice;

public class Car {
    private char color;
    private int mass;

    Car() {

    }

    Car(char color) {
        this.color = color;
    }

    public boolean setColor(char color) {
        if (color !=' ') {
            return true;
        }
        return false;
    }
    public int getMass(){
        return mass;
    }
    public void setMass(int mass){
        this.mass = mass;

    }
    public String toString() {
        return "Car color"
    }
}
