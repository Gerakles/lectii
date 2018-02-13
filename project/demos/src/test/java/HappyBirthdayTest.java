import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class HappyBirthdayTest {
    @Test
    public void test() {
        Assert.assertEquals( 16,HappyBirthday.yakim( "Iachimciuc Bogdan" ) );
        Assert.assertEquals( 12,HappyBirthday.yakim( "Blanari Denis" ) );
        Assert.assertEquals( 7,HappyBirthday.yakim( "Vitalie" ) );
        Assert.assertEquals( 6,HappyBirthday.yakim( "Andrei" ) );
        Assert.assertEquals( 0,HappyBirthday.yakim( " " ) );
    }
}
