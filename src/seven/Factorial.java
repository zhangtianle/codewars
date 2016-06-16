package seven;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/6/16.
 */
public class Factorial {

    public int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        if (n == 0) {
            return 1;
        }

        return n * factorial(n-1);
    }

    @Test
    public void test() {
        System.out.println(factorial(1));
    }
}
