package kyu6;

import java.math.BigDecimal;

public class C {
    public static String f(int n) {
        BigDecimal y = new BigDecimal( 1 );
        for (;n>1;)
            y = y.multiply( new BigDecimal( n-- ) );
        return y +"";
    }
}