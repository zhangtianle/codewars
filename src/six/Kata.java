package six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a function that accepts a string, and returns true if it is in the form of a phone number.
 * Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
 *
 * Only worry about the following format:
 * (123) 456-7890 (don't forget the space after the close parentheses)
 *
 * Examples:
 *
 * validPhoneNumber("(123) 456-7890")  => returns true
 * validPhoneNumber("(1111)555 2345")  => returns false
 * validPhoneNumber("(098) 123 4567")  => returns false
 *
 * Created by Tianle Zhang on 2016/6/18.
 */
public class Kata {

    public static boolean validPhoneNumber(String phoneNumber) {

        Pattern p = Pattern.compile("^\\(\\d{3}+\\)\\s\\d{3}+\\-\\d{4}+$");
        Matcher m = p.matcher(phoneNumber);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
}
