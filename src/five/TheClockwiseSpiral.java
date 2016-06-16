package five;

/**
 * Classic definition: A spiral is a curve which emanates from a central point,
 * getting progressively farther away as it revolves around the point.
 *
 * Your objective is to complete a function createSpiral(N)
 * that receives an integer N and returns two-dimensional array
 * where numbers from 1 to N should be represented as clockwise spiral.
 *
 * Return an empty array if N < 1
 * Examples:
 *
 * N = 3 Output: [[1,2,3],[8,9,4],[7,6,5]]
 * 1    2    3
 * 8    9    4
 * 7    6    5
 *
 * Created by Tianle Zhang on 2016/6/16.
 */
public class TheClockwiseSpiral {

    public static int[][] createSpiral(int N) {
        int num = 1;
        int maxNum = N * N;

        int[][] r = new int[N][N];

        int[] direction = new int[]{1,2,3,4};
        int d = 0;

        int i = 0;
        int j = 0;

        int right = N-1;
        int top = 1;
        int left = 0;
        int bottom = N-1;

        while (num <= maxNum) {

            while (d == 0 && j <=right) {
                r[i][j++] = num++;
            }
            right--;
            d++;
            j--;
            i++;
            while (d == 1 && i <= bottom) {
                r[i++][j] = num++;
            }
            bottom--;
            d++;
            i--;
            j--;
            while (d == 2 && j>=left) {
                r[i][j--] = num++;
            }
            left++;
            d++;
            j++;
            i--;
            while (d == 3 && i>=top) {
                r[i--][j] = num++;
            }
            top++;
            d = 0;
            i++;
            j++;
        }
        return r;
    }
}
