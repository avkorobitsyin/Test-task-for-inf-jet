import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Simple5Test {
    @Test
    public void test() {
        Simple5 simple5 = new Simple5();
        String s1 = "Колбаса";
        String s2 = "баса";
        String s3 = "Колбаса";
        String s4 = "молоко";
        Assert.assertTrue(simple5.findString(s1, s2));
        Assert.assertTrue(!simple5.findString(s3, s4));
    }
}
