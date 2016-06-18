package five;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Consider a sequence u where u is defined as follows:
 * The number u(0) = 1 is the first one in u.
 * For each x in u, then y = 2 * x + 1 and z = 3 * x + 1 must be in u too.
 * There are no other numbers in u.
 * Ex: u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]
 * 1 gives 3 and 4, then 3 gives 7 and 10, 4 gives 9 and 13, then 7 gives 15 and 22 and so on...
 * Created by Tianle Zhang on 2016/6/18.
 */
public class DoubleLinear {
    public static int dblLinear (int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int index = 0;
        while (list.size() <= (n)) {
            int y = 2 * list.get(index) + 1;
            int z = 3 * list.get(index) + 1;

            if (!list.contains(y)) {
                list.add(y);
            }

            if (!list.contains(z)) {
                list.add(z);
            }

            list.sort(null);

            index++;
        }
        return list.get(n);
    }

    public static int dblLinear2(int n) {
        SortedSet<Integer> u = new TreeSet<>();
        u.add(1);

        for (int i = 0; i < n; i++) {
            int x = u.first();
            u.add(x * 2 + 1);
            u.add(x * 3 + 1);
            u.remove(x);
        }

        return u.first();
    }
}
