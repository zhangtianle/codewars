package seven;

import org.junit.Test;

/**
 * Find the number of divisors of a positive integer n.
 *
 * Created by Tianle Zhang on 2016/6/16.
 */
public class FindDivisor {

    public long numberOfDivisors(int n) {

        long r = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                r++;
            }
        }
        return r;
    }

    @Test
    public void test() {
        System.out.println(numberOfDivisors(6));
    }
}
