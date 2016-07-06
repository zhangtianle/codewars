package six;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianle Zhang on 2016/7/6.
 */
public class FindOutlier {
    public static int find(int[] integers){
        Set<Integer> sOdd = new HashSet<>();
        Set<Integer> sEven = new HashSet<>();

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                sOdd.add(integers[i]);
            } else {
                sEven.add(integers[i]);
            }
        }
        if (sEven.size()>1) {
            for (int i : sOdd) {
                return i;
            }
        }
        if (sOdd.size()>1) {
            for (int i : sEven) {
                return i;
            }
        }
        return 1;
    }
}
