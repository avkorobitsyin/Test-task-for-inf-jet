import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Simple2Test {
    @Test
    public void test() {
        Simple2 simple2 = new Simple2();
        String result1 = simple2.simpleDivisions(22);
        String result2 = simple2.simpleDivisions(29);
        Assert.assertEquals("2 11", result1);
        Assert.assertEquals("29", result2);
    }
}
