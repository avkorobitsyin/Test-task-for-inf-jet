import org.junit.Assert;
import org.junit.Test;

/**
 * Created by avkor on 20.02.2018.
 */
public class Middle1Test {
    @Test
    public void test() {
        Middle1 middle1 = new Middle1();
        int[] array1 = new int[]{2, 2, 4, 4, 6, 6};
        int[] array2 = new int[]{2, 2, 2, 2, 2};
        int[] array3 = new int[]{-2, -2, -2, -2, -2};
        int[] array4 = new int[]{8};
        int[] array5 = new int[]{2, 3, 4, 5, 6, 7, 8};
        Assert.assertEquals(4, middle1.returnSomeMax(2, array1));
        Assert.assertEquals(2, middle1.returnSomeMax(4, array2));
        Assert.assertEquals(-2, middle1.returnSomeMax(1, array3));
        Assert.assertEquals(8, middle1.returnSomeMax(7, array4));
        Assert.assertEquals(6, middle1.returnSomeMax(3, array5));
    }
}
