package seven;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Created by Tianle Zhang on 2016/6/16.
 */
public class Circle {
    public static double area(double radius) {
        if (radius<=0) {
            throw new IllegalArgumentException();
        }else {
            double r = Math.PI * radius * radius;
            DecimalFormat df = new DecimalFormat("#.##");
            return Double.parseDouble(df.format(r));
        }
    }

    @Test
    public void test() {
        System.out.println(area(0));
    }

    @Test
    public void testKnownValues() {
        try {
            Circle.area(0);
            Assert.fail("Radius of 0 should throw an IllegalArgumentException");
        } catch(IllegalArgumentException iae) {}
        for(int i = 0; i < 3; i++) {
            double x = 3D;
            Assert.assertEquals(28.27D, Circle.area(x), 0.01);
        }
    }
}
