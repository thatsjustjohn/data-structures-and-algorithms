package code.challenges401;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayShiftTest {
    @Test
    public void arrayShift_test_output_odd() {
        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals(new int[] {2,4,5,6,8}, classUnderTest.insertShiftArray(new int[]{2,4,6,8}, 5));
    }
    @Test
    public void arrayShift_test_output_even() {
        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals(new int[] {4,8,15,16,23,42}, classUnderTest.insertShiftArray(new int[]{4,8,15,23,42}, 16));
    }
    @Test
    public void arrayShift_test_output_empty() {
        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals(new int[]{16}, classUnderTest.insertShiftArray(new int[]{}, 16));
    }
}
