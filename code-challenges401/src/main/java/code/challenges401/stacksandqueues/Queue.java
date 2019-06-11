package code.challenges401.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> front;
    Node<T> back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    // This function adds an item to the end of the queue.
    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(back == null && front == null){
            front = newNode;
            back = newNode;
            return;
        }
        back.next = newNode;
        back = newNode;
    }

    // This function removes an item from the beginning of the queue.
    public T dequeue(){
        if(front == null) throw new NoSuchElementException();
        // This function removes(pops) an item from the stack
        Node<T> temp = front;
        front = temp.next;
        // Reset back point for one item dequeue
        if(front == null) back = null;
        return temp.value;
    }

    // This function returns the value thats at the top of the stack.
    public T peek(){
        if(front == null) throw new NoSuchElementException();
        return front.value;
    }

    // This function returns true is the queue is empty, otherwise false.
    public boolean isEmpty(){
        return front == null ? true : false;
    }

    // This function returns the string of the queue
    public String toString(){
        // Declare variables
        Node<T> iterator = front;
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Queue: Front -> ");
        while(iterator != null){
            nodeString.append(iterator.toString());
            nodeString.append(" -> ");
            iterator = iterator.next;
        }
        // Finished the null / also works if front is null
        nodeString.append("null");
        return nodeString.toString();
    }
}
