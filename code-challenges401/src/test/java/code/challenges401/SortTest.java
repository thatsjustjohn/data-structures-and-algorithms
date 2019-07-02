package code.challenges401;

import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void test_insertionSort_multiple() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sort.insertionSort(new int[] {5,4,3,2,1}));
    }

    @Test (expected = NullArgumentException.class)
    public void test_insertionSort_null() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sort.insertionSort(null));
    }

    @Test
    public void test_insertionSort_empty() {
        assertArrayEquals(new int[] {}, Sort.insertionSort(new int[] {}));
    }

    @Test
    public void test_insertionSort_one() {
        assertArrayEquals(new int[] {1}, Sort.insertionSort(new int[] {1}));
    }

    @Test
    public void test_insertionSort_two() {
        assertArrayEquals(new int[] {1,2}, Sort.insertionSort(new int[] {2,1}));
    }

    @Test
    public void test_mergeSort_multiple() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sort.mergeSort(new int[] {5,4,3,2,1}));
    }

    @Test (expected = NullArgumentException.class)
    public void test_mergeSort_null() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sort.mergeSort(null));
    }

    @Test
    public void test_mergeSort_empty() {
        assertArrayEquals(new int[] {}, Sort.mergeSort(new int[] {}));
    }

    @Test
    public void test_mergeSort_one() {
        assertArrayEquals(new int[] {1}, Sort.mergeSort(new int[] {1}));
    }

    @Test
    public void test_mergeSort_two() {
        assertArrayEquals(new int[] {1,2}, Sort.mergeSort(new int[] {2,1}));
    }
}