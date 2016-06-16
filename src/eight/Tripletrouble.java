package eight;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * which takes in numbers num1 and num2 and returns 1 if there is a straight
 * triple of a number at any place in num1 and also a straight double of the
 * same number in num2.
 *
 * Created by Tianle Zhang on 2016/6/16.
 */
public class Tripletrouble {
    public static int TripleDouble(long num1, long num2) {

        int result = 0;

        String sn1 = num1 + "";
        String sn2 = num2 + "";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        int i = 0 , j = 1;
        while (i<sn1.length() && j<sn1.length()) {
            char cs = sn1.charAt(i);
            char ce = sn1.charAt(j);
            if (cs == ce) {
                j++;
                if ((j - i) >= 2) {
                    set1.add(cs);
                }
            } else {
                i++;
                j = i + 1;
            }
        }

        int a = 0 , b = 1;
        while (a<sn2.length() && b<sn2.length()) {
            char cs = sn2.charAt(a);
            char ce = sn2.charAt(b);
            if (cs == ce) {
                b++;
                if ((b - a) >= 1) {
                    set2.add(cs);
                }
            } else {
                a++;
                b = a + 1;
            }
        }

        for (char c : set1) {
            if (set2.contains(c)) {
                result = 1;
            }
        }

        return result;

    }

    @Test
    public void test1(){
        Assert.assertEquals(1, Tripletrouble.TripleDouble(451999277L, 41177722899L));
    }

    @Test
    public void test2(){
        Assert.assertEquals(0, Tripletrouble.TripleDouble(1222345L, 12345L));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0, Tripletrouble.TripleDouble(12345L, 12345L));
    }

    @Test
    public void test4(){
        Assert.assertEquals(1, Tripletrouble.TripleDouble(666789L, 12345667L));
    }

}
