import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort_validInput() {
        List<Comparable> input = Arrays.asList(1,4,5,6,8,3,8);
        List<Comparable> expected = Arrays.asList(1,3,4,5,6,8,8);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSort_validInput_float() {
        List<Comparable> input = Arrays.asList(-9.3,0.2,4.0,0.1,5.0,9.0);
        List<Comparable> expected = Arrays.asList(-9.3,0.1,0.2,4.0,5.0,9.0);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSort_emptyInput() {
        List<Comparable> input = Arrays.asList();
        List<Comparable> expected = Arrays.asList();
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSort_nullValue() {
        List<Comparable> input = Arrays.asList(null,5.0001);
        List<Comparable> expected = Arrays.asList(5.0001);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSort_nullInput() {
        bubbleSort.sort(null);
    }
}
