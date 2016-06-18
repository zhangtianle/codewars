package five;

import java.math.BigDecimal;

/**
 * Consider the following numbers (where n! is factorial(n)):
 * u1 = (1 / 1!) * (1!)
 * u2 = (1 / 2!) * (1! + 2!)
 * u3 = (1 / 3!) * (1! + 2! + 3!)
 * un = (1 / n!) * (1! + 2! + 3! + ... + n!)
 *
 * Which will win: 1 / n! or (1! + 2! + 3! + ... + n!)?
 *
 * Are these number going to 0 because of 1/n! or to infinity due to the sum of factorials?
 *
 * Calculate (1 / n!) * (1! + 2! + 3! + ... + n!) for a given n. Call this function "going(n)"
 * where n is an integer greater or equal to 1.
 *
 * To avoid discussions about rounding, if the result of the calculation is designed by "result", going(n) will return
 * "result" truncated to 6 decimal places.
 *
 *
 * Created by Tianle Zhang on 2016/6/18.
 */
public class Suite {
    public static double going(int n) {
        double result;

        // to calculate extra large factorials, create BigDecimal with initial value of 1
        BigDecimal fact = new BigDecimal(1);//.setScale(6, BigDecimal.ROUND_UNNECESSARY);

        // to sum up all these factorials, create another BigDecimal object with initial value of 0
        // set its scale to 6. fact object does not need this since we are handling it here.
        BigDecimal chainOfFact = new BigDecimal(0).setScale(6, BigDecimal.ROUND_UNNECESSARY);

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigDecimal.valueOf(i));
            chainOfFact = chainOfFact.add(fact);
        }

        try{
            result = chainOfFact.divide(fact, BigDecimal.ROUND_UNNECESSARY).doubleValue();
        } catch(ArithmeticException ex){
            result = chainOfFact.divide(fact, BigDecimal.ROUND_FLOOR).doubleValue();
        }

        return result;
    }

    private static long factorial(int n) {
        if ( n==0 || n==1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
