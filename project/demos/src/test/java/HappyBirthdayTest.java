import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.UUID;

public class HappyBirthdayTest {
    @Test
    public void test() {
        Assert.assertEquals( 16, HappyBirthday.yakim( "Iachimciuc Bogdan" ) );
        Assert.assertEquals( 12, HappyBirthday.yakim( "Blanari Denis" ) );
        Assert.assertEquals( 7, HappyBirthday.yakim( "Vitalie" ) );
        Assert.assertEquals( 6, HappyBirthday.yakim( "Andrei" ) );
        Assert.assertEquals( 0, HappyBirthday.yakim( " " ) );
    }

    @Test
    public void testrandom() {
        int a = 0;
        for (int i = 0; i < UUID.randomUUID().toString().length(); i++) {
            if (Character.isLetter( UUID.randomUUID().toString().charAt( i ) ))
                a++;

            Assert.assertEquals( a, HappyBirthday.yakim( UUID.randomUUID().toString() ) );
        }
        }
}

