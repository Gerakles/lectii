import org.junit.Assert;
import org.junit.Test;

public class TestFixture {
    @Test
    public void test() {
        Assert.assertEquals( 47, Solution.kgPaint( 14,7,3.5 ) );
        Assert.assertEquals( 253, Solution.kgPaint( 63,9,2.7 ) );
        Assert.assertEquals( 77, Solution.kgPaint( 73,2,1.5 ) );
        Assert.assertEquals( 83, Solution.kgPaint( 25,5,7.3 ) );
        Assert.assertEquals( 408, Solution.kgPaint( 100,10,1 ) );
    }
    @Test
    public void testNull() {
        Assert.assertEquals( 0,Solution.kgPaint( 0,0,0 ) );
    }
}
