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
        assertTrue("Head points to 15", classUnderTest.head.data == 15);
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
    public void append_multiple() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        // Test
        classUnderTest.append(5);
        assertEquals("Last item is 5",
                5,
                classUnderTest.head.next.next.next.data);
    }


    @Test
    public void append_empty() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(1);
        assertEquals("Last item is 5",
                1,
                classUnderTest.head.data);
    }

    @Test
    public void insertBefore_empty() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue("Head should be null",
                classUnderTest.head == null);
    }
    @Test
    public void insertBefore_first() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.data);
    }

    @Test
    public void insertBefore_mid() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.next.data);
    }

    @Test
    public void insertBefore_end() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(2);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.next.data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertBefore_dne() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(4,5);
    }


    @Test
    public void insertAfter_empty() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue("Head should be null",
                classUnderTest.head == null);
    }

    @Test
    public void insertAfter_beginning() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.next.data);

    }

    @Test
    public void insertAfter_mid() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.next.next.data);

    }

    @Test
    public void insertAfter_end() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.next.next.next.data);
        System.out.println(classUnderTest.print());
    }

    @Test
    public void insertAfter_duplicate() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(2);
        classUnderTest.insert(1);

        assertEquals("should be 5",
                5,
                classUnderTest.head.next.next.data);
        System.out.println(classUnderTest.print());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertAfter_dne() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(4,5);
    }

}