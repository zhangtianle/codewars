package five;

/**
 * 'codewars' is a merge from 'cdw' and 'oears':
 *     s:  c o d e w a r s   = codewars
 * part1:  c   d   w         = cdw
 * part2:    o   e   a r s   = oears
 * Created by Tianle Zhang on 2016/7/7.
 */
public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        // TODO
        s = s.replace(" ","");
        part1 = part1.replace(" ","");
        part2 = part2.replace(" ","");

        int index1 = 0;
        int index2 = 0;

        char[] cp1 = part1.toCharArray();
        char[] cp2 = part2.toCharArray();

        for (int i = 0; i < s.length(); ) {
            char is = s.charAt(i);
            if (index1 < cp1.length && cp1[index1] == is) {
                index1++;
                i++;
                continue;
            }
            if (index2 < cp2.length && cp2[index2] == is) {
                index2++;
                i++;
                continue;
            }
            return false;
        }
        return s.length() == index1 + index2;
    }
}