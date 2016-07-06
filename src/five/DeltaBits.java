package five;

import java.util.Stack;

/**
 * Created by Tianle Zhang on 2016/7/6.
 */
public class DeltaBits {
    static Stack<Integer> r = new Stack<>();
    public static int convertBits(int a, int b) {
        int result = 0;
        div(a^b);
        while (!r.isEmpty()) {
            if (r.pop() == 1) {
                result++;
            }
        }
        return result;
    }

    public static void div(int n) {
        while (n != 0) {
            int y = n % 2;
            r.push(y);
            n = n / 2;
        }
    }

}
