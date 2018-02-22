import org.junit.Assert;
import org.junit.Test;

public class paintMyClassroomTest {
    @Test
    public void test() {
        Assert.assertEquals( 47, paintMyClassroom.kgPaint( 14,7,3.5 ) );
        Assert.assertEquals( 253, paintMyClassroom.kgPaint( 63,9,2.7 ) );
        Assert.assertEquals( 77, paintMyClassroom.kgPaint( 73,2,1.5 ) );
        Assert.assertEquals( 83, paintMyClassroom.kgPaint( 25,5,7.3 ) );
        Assert.assertEquals( 408, paintMyClassroom.kgPaint( 100,10,1 ) );
    }
}
