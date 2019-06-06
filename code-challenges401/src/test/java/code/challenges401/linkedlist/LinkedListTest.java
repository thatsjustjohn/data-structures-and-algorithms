package code.challenges401.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test_empty() {
        LinkedList classUnderTest = new LinkedList();
        assertEquals("LinkedList: head -> null", classUnderTest.print());
    }

    @Test
    public void test_insert() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        assertEquals("LinkedList: head -> [5] -> null", classUnderTest.print());
    }

    @Test
    public void test_headToFirst() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        classUnderTest.insert(10);
        classUnderTest.insert(15);
        assertTrue("Head points to 15", classUnderTest.head.value == 15);
    }

    @Test
    public void test_insertMultiple() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        classUnderTest.insert(10);
        classUnderTest.insert(15);
        assertEquals("LinkedList: head -> [15] -> [10] -> [5] -> null", classUnderTest.print());
    }

    @Test
    public void test_includes_true() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        classUnderTest.insert(10);
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertTrue(classUnderTest.includes(1));
    }

    @Test
    public void test_includes_false() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        classUnderTest.insert(10);
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertFalse(classUnderTest.includes(20));
    }

    @Test
    public void test_print() {
        LinkedList classUnderTest = new LinkedList();
        // Test empty
        assertEquals("LinkedList: head -> null", classUnderTest.print());
        classUnderTest.insert(1);
        // Test one
        assertEquals("LinkedList: head -> [1] -> null", classUnderTest.print());
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        // Test three
        assertEquals("LinkedList: head -> [3] -> [2] -> [1] -> null", classUnderTest.print());
    }

    @Test
    public void test_append_multiple() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        // Test
        classUnderTest.append(5);
        assertEquals("Last item is 5",
                5,
                classUnderTest.head.next.next.next.value);
    }


    @Test
    public void test_append_empty() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        assertEquals("Last item is 5",
                1,
                classUnderTest.head.value);
    }

    @Test
    public void test_insertBefore_empty() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue("Head should be null",
                classUnderTest.head == null);
    }
    @Test
    public void test_insertBefore_first() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(1,5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.value);
    }

    @Test
    public void test_insertBefore_mid() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(3,5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.next.value);
    }

    @Test
    public void test_insertBefore_end() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(2,5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.next.value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_insertBefore_dne() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(4,5);
    }


    @Test
    public void test_insertAfter_empty() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue("Head should be null",
                classUnderTest.head == null);
    }

    @Test
    public void test_insertAfter_beginning() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(1, 5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.next.value);

    }

    @Test
    public void test_insertAfter_mid() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(3,5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.next.next.value);

    }

    @Test
    public void test_insertAfter_end() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(2, 5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.next.next.next.value);
    }

    @Test
    public void test_insertAfter_duplicate() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(2,5);
        assertEquals("should be 5",
                5,
                classUnderTest.head.next.next.value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_insertAfter_dne() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(4,5);
    }

    // Testing for code kth element challenge
    public LinkedList setupKthFromEnd(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(8);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        return classUnderTest;
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kthFromEnd_kGreaterThanList(){
        LinkedList classUnderTest = setupKthFromEnd();
        classUnderTest.kthFromEnd(6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kthFromEnd_kSameSizeAsList(){
        LinkedList classUnderTest = setupKthFromEnd();
        classUnderTest.kthFromEnd(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kthFromEnd_kNegative(){
        LinkedList classUnderTest = setupKthFromEnd();
        classUnderTest.kthFromEnd(-44);
    }

    @Test
    public void test_kthFromEnd_kEnd(){
        LinkedList classUnderTest = setupKthFromEnd();
        assertEquals(2,classUnderTest.kthFromEnd(0));
    }

    @Test
    public void test_kthFromEnd_kMiddle(){
        LinkedList classUnderTest = setupKthFromEnd();
        assertEquals(3,classUnderTest.kthFromEnd(2));
    }

    @Test
    public void test_kthFromEnd_kFront(){
        LinkedList classUnderTest = setupKthFromEnd();
        assertEquals(1,classUnderTest.kthFromEnd(3));
    }

    @Test
    public void test_kthFromEnd_oneNode_kFront(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        assertEquals(2,classUnderTest.kthFromEnd(0));
    }

    @Test(expected = IllegalStateException.class)
    public void test_kthFromEnd_empty(){
        LinkedList classUnderTest = new LinkedList();
        assertEquals(1,classUnderTest.kthFromEnd(3));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_mergeLists_bothNull() {
        LinkedList.mergeLists(new LinkedList(), new LinkedList());
    }

    @Test
    public void test_mergeLists_oneNull(){
        // Setup
        LinkedList one = new LinkedList();
        one.insert(5);
        LinkedList two = new LinkedList();
        // First way
        LinkedList result = LinkedList.mergeLists(one, two);
        assertEquals(5,
                result.head.value);
        // Flip them
        result = LinkedList.mergeLists(two, one);
        System.out.println(result.print());
        assertEquals(5,
                result.head.value);
    }

    @Test
    public void test_mergeLists_sameSize(){
        // Setup
        LinkedList one = new LinkedList();
        one.insert(2);
        one.insert(3);
        one.insert(1);
        LinkedList two = new LinkedList();
        two.insert(4);
        two.insert(9);
        two.insert(5);

        LinkedList result = LinkedList.mergeLists(one, two);
        assertEquals("LinkedList: head -> [1] -> [5] -> [3] -> [9] -> [2] -> [4] -> null",
                result.print());

        assertEquals(3,
                one.head.next.next.value);

    }

    @Test
    public void test_mergeLists_firstSmol(){
        // Setup
        LinkedList one = new LinkedList();
        one.insert(3);
        one.insert(1);
        LinkedList two = new LinkedList();
        two.insert(4);
        two.insert(9);
        two.insert(5);

        LinkedList result = LinkedList.mergeLists(one, two);
        assertEquals("LinkedList: head -> [1] -> [5] -> [3] -> [9] -> [4] -> null",
                result.print());

        assertEquals(9,
                one.head.next.next.next.value);

    }

    @Test
    public void test_mergeLists_secondSmol(){
        // Setup
        LinkedList one = new LinkedList();
        one.insert(2);
        one.insert(3);
        one.insert(1);
        LinkedList two = new LinkedList();
        two.insert(9);
        two.insert(5);

        LinkedList result = LinkedList.mergeLists(one, two);
        assertEquals("LinkedList: head -> [1] -> [5] -> [3] -> [9] -> [2] -> null",
                result.print());

        assertEquals(2,
                one.head.next.next.next.next.value);

    }
}