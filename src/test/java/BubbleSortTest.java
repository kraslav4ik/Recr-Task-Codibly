import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testWithIntegers() {
        assertArrayEquals(new Number[] {1,3,4,5,6,8,8}, BubbleSort.sort(new Number[] {1, 4, 5, 6, 8, 3, 8}));
    }
    @Test
    public void testWithDifferentTypes() {
        assertArrayEquals(new Number[] {-9.3,0.1,0.2,4,5,9}, BubbleSort.sort(new Number[] {-9.3,0.2,4,0.1,5,9}));
    }
    @Test
    public void testEmpty() {
        assertArrayEquals(new Number[] {}, BubbleSort.sort(new Number[] {}));
    }
    @Test
    public void testWithNullElement() {
        assertArrayEquals(new Number[] {5.0001}, BubbleSort.sort(new Number[] {null, 5.0001}));
    }
    @Test
    public void testNull() {
        assertThrows(RuntimeException.class, () -> BubbleSort.sort(null));
    }

}
