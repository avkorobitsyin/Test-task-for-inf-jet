import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Middle3Test {
    @Test
    public void test() {
        Middle3 middle3 = new Middle3();
        String s1 = "3e4r6g";
        String s2 = "7Г2Ь3e4r6g";
        String s3 = "2mq3ША";
        Assert.assertEquals("eeerrrrgggggg", middle3.rleDecoding(s1));
        Assert.assertEquals("ГГГГГГГЬЬeeerrrrgggggg", middle3.rleDecoding(s2));
        Assert.assertEquals("mqmqШАШАША", middle3.rleDecoding(s3));
    }
}
