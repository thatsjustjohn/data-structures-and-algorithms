package code.challenges401.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void test_emptyQueue() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void test_enqueue_one() {
        Queue queue = new Queue();
        queue.enqueue(5);
        assertEquals(5, queue.front.value);
        assertEquals(5, queue.back.value);
    }

    @Test
    public void test_enqueue_multiple() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(5, queue.front.value);
        assertEquals(-5, queue.back.value);
    }

    @Test
    public void dequeue() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(5,
                queue.dequeue());
        assertEquals(6,
                queue.front.value);
        assertEquals(-5,
                queue.back.value);
    }

    @Test
    public void dequeue_toEmpty() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(null,
                queue.front);
    }

    @Test (expected = IllegalStateException.class)
    public void test_dequeue_empty(){
        Queue queue = new Queue();
        queue.dequeue();
    }

    @Test
    public void peek() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals(5,
                queue.peek());

    }


    @Test (expected = IllegalStateException.class)
    public void test_peek_empty(){
        Queue queue = new Queue();
        queue.peek();
    }
    @Test
    public void test_toString() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(-5);
        assertEquals("Queue: Front -> [5] -> [6] -> [-5] -> null",
                queue.toString());
    }
}