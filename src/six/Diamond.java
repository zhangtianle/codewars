package six;

/**
 * Created by Tianle Zhang on 2016/6/18.
 */
public class Diamond {
    public static String print(int n) {
        if (!verifyInput(n)) {
            return null;
        }

        StringBuffer diamond = new StringBuffer();
        int spaces = n/2;
        for (int i = 1; i <= n; i = i + 2) {
            appendSpaces(diamond, spaces);
            spaces = spaces-1;
            appendStars(diamond, i);
            diamond.append("\n");
        }

        spaces = 1;
        for (int i = n - 2; i >= 1; i = i - 2) {
            appendSpaces(diamond, spaces);
            spaces = spaces+1;
            appendStars(diamond, i);
            diamond.append("\n");
        }

        return diamond.toString();
    }

    private static boolean verifyInput(int n) {
        if (n < 0 || n % 2 == 0) {
            return false;
        }
        return true;
    }

    private static void appendStars(StringBuffer buffer, int i) {
        for (int j = 1; j <= i; j++) {
            buffer.append("*");
        }
    }

    private static void appendSpaces(StringBuffer buffer, int spaces) {
        for (int k = 0; k < spaces; k++) {
            buffer.append(" ");
        }
    }

}
