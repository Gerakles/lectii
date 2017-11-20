public class Main {
    public static void main (String [] args) {
        Detalii apl = new Detalii("","","", 7.5, 70.5);
        apl.setNumar(Fructele.numere[0]);
        apl.setFructul(Fructele.fructele[0]);
        apl.setCuloare(Fructele.culorile[0]);
        apl.setMarimea(Fructele.marime[0]);
        apl.setGreutate(Fructele.greutate[0]);

        Detalii apr = new Detalii("","","", 1.5, 2.3);
        apr.setNumar(Fructele.numere[1]);
        apr.setFructul(Fructele.fructele[1]);
        apr.setCuloare(Fructele.culorile[1]);
        apr.setMarimea(Fructele.marime[1]);
        apr.setGreutate(Fructele.greutate[1]);

        Detalii chr = new Detalii("","","", 6.0, 50.4);
        chr.setNumar(Fructele.numere[2]);
        chr.setFructul(Fructele.fructele[2]);
        chr.setCuloare(Fructele.culorile[2]);
        chr.setMarimea(Fructele.marime[2]);
        chr.setGreutate(Fructele.greutate[2]);

        System.out.println(apl);
        System.out.println(apr);
        System.out.println(chr);
    }
}
