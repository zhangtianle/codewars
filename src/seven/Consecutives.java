package seven;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given a list/array which contains only integers (positive and negative).
 * Your job is to sum only the numbers that are the same and consecutive.
 * The result should be one list.
 *
 * Extra credit if you solve it in one line. You can asume there is never an empty list/array and there will always be an integer.
 * Same meaning: 1 == 1
 * 1 != -1
 *
 * Examples:
 * [1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]
 * """So as you can see sum of consecutives 1 is 1
 * sum of 3 consecutives 4 is 12
 * sum of 0... and sum of 2
 * consecutives 3 is 6 ..."""
 *
 * Created by Tianle Zhang on 2016/6/16.
 */
public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = i+1;
        while (i<s.size() && j<s.size()) {
            if (s.get(i)!=s.get(j)) {
                list.add(s.get(i));
                i = j;
                j = i + 1;
            } else {
                while (i < s.size() && j < s.size() && s.get(i) == s.get(j)) {
                    j++;
                }
                list.add(s.get(i) * (j - i));
                i = j;
                j = i + 1;
            }
        }
        if (s.get(i) != s.get(i-1)) {
            list.add(s.get(i));
        }
        return list;
    }

    @Test
    public void test() {
        System.out.println("Basic Tests");
        List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);
        List<Integer> o = Arrays.asList(1,12,0,4,6,1);
        System.out.println("Input: {1,4,4,4,0,4,3,3,1}");
        Assert.assertEquals(o, Consecutives.sumConsecutives(i));
        i = Arrays.asList(-5,-5,7,7,12,0);
        o = Arrays.asList(-10,14,12,0);
        System.out.println("Input: {-5,-5,7,7,12,0}");
        Assert.assertEquals(o, Consecutives.sumConsecutives(i));
    }
}
