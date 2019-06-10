package code.challenges401.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test_emptyStack() {
        Stack stack = new Stack();
        assertEquals(null,
                stack.top);
    }

    @Test
    public void test_push() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(5,
                stack.top.value);
    }

    @Test
    public void test_push_multiple() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        assertEquals(4,
                stack.top.next.value);
    }

    @Test
    public void test_pop() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        assertEquals(4,
                stack.pop());
        assertEquals(5,
                stack.top.value);
    }

    @Test (expected = NullPointerException.class)
    public void test_pop_empty(){
        Stack stack = new Stack();
        stack.pop();
    }

    @Test
    public void test_pop_emptyStack() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.pop();
        stack.pop();
        assertEquals(null,
                stack.top);
    }

    @Test (expected = NullPointerException.class)
    public void test_peek_empty(){
        Stack stack = new Stack();
        stack.peek();
    }

    @Test
    public void test_peek() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        assertEquals(4,
                stack.peek());
        assertEquals(4,
                stack.top.value);
    }

    @Test
    public void test_toString() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        assertEquals("Stack: Top -> [4] -> [5] -> null", stack.toString());
    }
}