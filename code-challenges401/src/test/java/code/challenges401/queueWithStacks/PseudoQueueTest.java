package code.challenges401.queueWithStacks;

import code.challenges401.stacksandqueues.Queue;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void test_emptyQueue() {
        PseudoQueue queue = new PseudoQueue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void test_enqueue_one() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(5);
        assertEquals(5, queue.enqueueStack.peek());
    }

    @Test
    public void test_enqueue_multiple() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(-5, queue.enqueueStack.peek());
    }
    @Test
    public void test_enqueue_dequeue_enqueue() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(5);
        assertEquals(5, queue.enqueueStack.peek());
    }

    @Test
    public void dequeue() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(5,
                queue.dequeue());
        assertEquals(6,
                queue.dequeueStack.peek());
    }

    @Test
    public void dequeue_toEmpty() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(5, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertEquals(-5, queue.dequeue());
        assertTrue("Queue is empty", queue.isEmpty());
    }

    @Test (expected = EmptyStackException.class)
    public void test_dequeue_empty(){
        PseudoQueue queue = new PseudoQueue();
        queue.dequeue();
    }

    @Test
    public void peek() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(5,
                queue.peek());

    }


    @Test (expected = EmptyStackException.class)
    public void test_peek_empty(){
        PseudoQueue queue = new PseudoQueue();
        queue.peek();
    }
}