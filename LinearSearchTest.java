import static org.junit.Assert.*;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testFound() {
        int arr[] = {10, 20, 30};
        assertEquals(1, LinearSearch.search(arr, 20));
    }

    @Test
    public void testNotFound() {
        int arr[] = {10, 20, 30};
        assertEquals(-1, LinearSearch.search(arr, 50));
    }
}
