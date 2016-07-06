package five;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tianle Zhang on 2016/7/6.
 */
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character,Integer> m1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (!m1.containsKey(str1.charAt(i))) {
                m1.put(str1.charAt(i),1);
            } else {
                int value = m1.get(str1.charAt(i));
                m1.replace(str1.charAt(i),value+1);
            }
        }

        Map<Character,Integer> m2 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            if (!m2.containsKey(str2.charAt(i))) {
                m2.put(str2.charAt(i),1);
            } else {
                int value = m2.get(str2.charAt(i));
                m2.replace(str2.charAt(i),value+1);
            }
        }

        for (char m : m2.keySet()) {
            if (!m1.containsKey(m) || m2.get(m) > m1.get(m)) {
                return false;
            }
        }
        return true;
    }
}
