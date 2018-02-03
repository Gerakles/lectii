package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class BonusTimeTest {
    @Test
    public void basicTests() {
        boolean wellConfigured=unicodeTest();
        assertEquals((wellConfigured?"£":"\u00A3")+"100000",Kata2.bonusTime(10000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"250000",Kata2.bonusTime(25000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"10000",Kata2.bonusTime(10000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"60000",Kata2.bonusTime(60000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"20",Kata2.bonusTime(2, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"78",Kata2.bonusTime(78, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"678900",Kata2.bonusTime(67890, true));
    }

    public boolean unicodeTest(){
        System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }
}