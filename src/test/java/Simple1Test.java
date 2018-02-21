import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Simple1Test {
    @Test
    public void test() {
        Simple1 simple1 = new Simple1();
        int[] array1 = new int[]{2, 2, 4, 4, 6, 6};
        int[] array2 = new int[]{2, 2, 2, 2, 2};
        int[] array3 = new int[]{-2, -2, -2, -2, -2};
        int[] array4 = new int[]{8};
        Assert.assertEquals(4, simple1.returnSecondMax(array1));
        Assert.assertEquals(2, simple1.returnSecondMax(array2));
        Assert.assertEquals(-2, simple1.returnSecondMax(array3));
        Assert.assertEquals(8, simple1.returnSecondMax(array4));
    }
}
