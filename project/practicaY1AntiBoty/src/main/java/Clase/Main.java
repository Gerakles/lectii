package Clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Yakim> yakimList = new ArrayList <>();
        yakimList.add( new Lity( "A" ) );
        yakimList.add( new Lity( "B" ) );
        yakimList.add( new Lity( "C" ) );
        yakimList.add( new Lity( "D" ) );
        yakimList.add( new Lity( "G" ) );
        yakimList.add( new Lity( "H" ) );
        yakimList.add( new Lity( "I" ) );
        yakimList.add( new Lity( "K" ) );
        yakimList.add( new Lity( "M" ) );
        yakimList.add( new Lity( "N" ) );
        yakimList.add( new Lity( "O" ) );
        yakimList.add( new Lity( "U" ) );
        yakimList.add( new Lity( "Y" ) );
        yakimList.add( new Cify( "0" ) );
        yakimList.add( new Cify( "1" ) );
        yakimList.add( new Cify( "2" ) );
        yakimList.add( new Cify( "3" ) );
        yakimList.add( new Cify( "4" ) );
        yakimList.add( new Cify( "5" ) );
        yakimList.add( new Cify( "6" ) );
        yakimList.add( new Cify( "7" ) );
        yakimList.add( new Cify( "8" ) );
        yakimList.add( new Cify( "9" ) );

        Cody cody = new Cody();
        Course courseYBA = new Course(cody,7);

        courseYBA.start();
        courseYBA.rany();
        courseYBA.totals();

    }
}

