package six;

/**
 * Create a method named "rotate" that returns a given array with the elements inside the array rotated n spaces.
 * If n is greater than 0 it should rotate the array to the right. If n is less than 0 it should rotate the array to the left.
 * If n is 0, then it should return the array unchanged.
 *
 * Object[] data = new Object[]{1, 2, 3, 4, 5};
 *
 * rotate(data, 1)    =>    {5, 1, 2, 3, 4}
 * rotate(data, 2)    =>    {4, 5, 1, 2, 3}
 * rotate(data, 3)    =>    {3, 4, 5, 1, 2}
 * rotate(data, 4)    =>    {2, 3, 4, 5, 1}
 * rotate(data, 5)    =>    {1, 2, 3, 4, 5}
 *
 * rotate(data, 0)    =>    {1, 2, 3, 4, 5}
 *
 * rotate(data, -1)    =>    {2, 3, 4, 5, 1}
 * rotate(data, -2)    =>    {3, 4, 5, 1, 2}
 * rotate(data, -3)    =>    {4, 5, 1, 2, 3}
 *
 * Created by Tianle Zhang on 2016/6/16.
 */
public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        Object[] objects = new Object[data.length];
        int index = n % data.length;
        int j = 0;
        if (n>=0) {
            for (int i = data.length - index; i < data.length; i++) {
                objects[j++] = data[i];
            }
            for (int i = 0; i < data.length - index; i++) {
                objects[j++] = data[i];
            }
        } else {
            index = -index;
            for (int i = index; i < data.length; i++) {
                objects[j++] = data[i];
            }
            for (int i = 0; i < index; i++) {
                objects[j++] = data[i];
            }
        }
        return objects;
    }
}
