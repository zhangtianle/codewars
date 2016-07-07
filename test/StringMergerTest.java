import five.StringMerger;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertFalse("abcde", StringMerger.isMerge("abcde", "ab", "cd"));
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }

}