package code.challenges401;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class BinarySearchTest {
    @Test
    public void binarySearch_test_output_even() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("binarySearchMethod should return '2'", classUnderTest.binarySearch(new int[]{4, 8, 15, 16, 23, 42}, 15) == 2);
    }

    @Test
    public void binarySearch_test_output_odd_fail() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("binarySearchMethod should return '-1'", classUnderTest.binarySearch(new int[]{11,22,33,44,55,66,77}, 90) == -1);
    }

    @Test
    public void binarySearch_test_output_odd(){
        BinarySearch classUnderTest = new BinarySearch();
        assertEquals("binarySearchMethod should return '5'", 5, classUnderTest.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 6));
    }

    @Test
    public void binarySearch_test_output_empty(){
        BinarySearch classUnderTest = new BinarySearch();
        assertEquals("binarySearchMethod should return '-1'", -1, classUnderTest.binarySearch(new int[]{}, 6));
    }
}
