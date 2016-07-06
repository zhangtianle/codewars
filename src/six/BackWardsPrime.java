package six;

import java.util.HashSet;
import java.util.Set;


/**
 * Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime.
 * (This rules out primes which are palindromes.)
 *
 * 13 17 31 37 71 73 are Backwards Read Primes
 * 13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.
 *
 * Find all Backwards Read Primes between two positive given numbers (both inclusive),
 * the second one being greater than the first one. The resulting array or the resulting string
 * will be ordered following the natural order of the prime numbers.
 *
 * Created by Tianle Zhang on 2016/7/6.
 */
public class BackWardsPrime {
    // TODO
    public static String backwardsPrime(long start, long end) {
        Set<Long> s = new HashSet<>();
        for (long i = end; i > start; i--) {
            if (isPrime(i)) {
               s.add(i);
            }
        }
        String str = "";
        for (long i : s) {
            if (isBack(i,s)) {
                str = str + i + " ";
            }
        }
        return str.trim();
    }

    private static boolean isBack(long l, Set<Long> s) {
        long rl = revert(l);
        return s.contains(rl);
    }

    private static boolean isPrime(long l) {
        if (l<2) {
            return false;
        }
        double r = Math.sqrt(l);
        for (int i = 2; i <= r; i++) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long revert(long i) {
        String s = "";
        while (i/10 != 0) {
            long k = i % 10;
            s += k + "";
            i = i /10;
        }
        String is = i + "";
        char c = is.charAt(0);
        s += c;
        return Long.parseLong(s);
    }
}
