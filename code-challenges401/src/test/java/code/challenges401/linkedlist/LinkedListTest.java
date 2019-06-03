package code.challenges401.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test_empty() {
        LinkedList classUnderTest = new LinkedList();
        assertEquals("LinkedList: null", classUnderTest.print());
    }

    @Test
    public void test_insert() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        assertEquals("LinkedList: 5->null", classUnderTest.print());
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
        assertEquals("LinkedList: 15->10->5->null", classUnderTest.print());
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
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertEquals("LinkedList: 3->2->1->null", classUnderTest.print());
    }
}