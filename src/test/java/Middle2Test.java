import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Middle2Test {
    @Test
    public void test() {
        Middle2 middle2 = new Middle2();
        String s1 = "eeeeewwwffffqqq";
        String s2 = "выыыыеееемммммААА";
        String s3 = "ssssEEEVVвыыыыеееемммммААА";
        String s4 = "ifdbdw";
        Assert.assertEquals("5e3w4f3q", middle2.rleCoding(s1));
        Assert.assertEquals("1в4ы4е5м3А", middle2.rleCoding(s2));
        Assert.assertEquals("4s3E2V1в4ы4е5м3А", middle2.rleCoding(s3));
        Assert.assertEquals("1i1f1d1b1d1w", middle2.rleCoding(s4));
    }
}
