import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Simple3Test {
    @Test
    public void test() {
        Simple3 simple3 = new Simple3();
        String s1 = "а роза   упала  на лапу азора ";
        String s2 = "а роза УпаЛА НА лапу АЗОРА";
        String s3 = "А не упала ли роза на азора лапу";
        Assert.assertTrue(simple3.isPalindrome(s1));
        Assert.assertTrue(simple3.isPalindrome(s2));
        Assert.assertTrue(!simple3.isPalindrome(s3));
    }
}
