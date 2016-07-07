package five;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/7/7.
 */
public class LargestDifference {
    public static int largestDifference(int[] data) {

        int max = 0;
        int ii = 0;
        int jj = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                int dif = data[j] - data[i];
                if (dif >= 0) {
                    if (j - i > max) {
                        ii = i;
                        jj = j;
                        max = j - i;
                    }
                }
            }
        }
        return jj - ii;
    }

    @Test
    public void test2(){
        Assert.assertEquals(4, LargestDifference.largestDifference(new int[]{9,4,1,10,3,4,0,-1,-2}));
        Assert.assertEquals(0, LargestDifference.largestDifference(new int[]{3,2,1}));
    }
}
