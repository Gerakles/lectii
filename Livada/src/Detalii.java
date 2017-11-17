public class Detalii {
    private String numar;
    private String fructul;
    private String culoare;
    private double marimea;
    private double greutate;

    @Override
    public String toString() {
        return "__________________" +"\n" + "Fructul "+ this.numar+"\n" + "------------------"+"\n" + "Tip: " + this.fructul+"\n" + "Culoare: " + this.culoare +"\n"+ "Marimea: " + this.marimea+"cm" +"\n"+ "Greutate: " + this.greutate+"g";
    }

    public String getNumar() {
        return numar;
    }

    public String getFructul() {
        return fructul;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getMarimea() {
        return marimea;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public void setFructul(String fructul) {
        this.fructul = fructul;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMarimea(double marimea) {
        this.marimea = marimea;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }
}
