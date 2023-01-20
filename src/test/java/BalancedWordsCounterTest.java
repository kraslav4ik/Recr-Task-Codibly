import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalancedWordsCounterTest {

    @Test
    public void testWithLetters() {
        assertEquals(28, BalancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, BalancedWordsCounter.count(""));
    }

    @Test
    public void testWithOtherChars() {
        assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count("abababa1"));
    }

    @Test
    public void testNull() {
        assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(null));
    }
}
