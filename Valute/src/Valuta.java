public class Valuta {
    private String name;
    private int age;
    private int serie;
    private final double defaultValue = 1;

    public double Buy(){
        return (3 * defaultValue);
    }

    public double Sell(){
        return (3 * defaultValue);
    }

    @Override
    public String toString() {
        return "Name: " + this.name +"\n"+ "Serie: " + this.serie +"\n"+ "Age: " + this.age;
    }

    /////G\S//////
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSerie() {
        return serie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
