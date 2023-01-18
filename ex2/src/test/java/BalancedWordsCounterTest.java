import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {
    @Test
    public void testCount() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        assertEquals(28, counter.count("aabbabcccba"));
        assertEquals(0, counter.count(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputWithNumbers() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        counter.count("abababa1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        counter.count(null);
    }
}
