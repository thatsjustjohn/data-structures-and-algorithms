package code.challenges401.stacksandqueues;

import org.apache.commons.math3.exception.NullArgumentException;
import sun.invoke.empty.Empty;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top;

    public Stack(){
        this.top = null;
    }

    // This function pushes an item into the stack.
    public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        this.top = newNode;
    }

    // This function removes(pops) an item from the stack.
    public T pop(){
        if(top == null) throw new EmptyStackException();
        Node<T> temp = top;
        top = temp.next;
        return temp.value;
    }

    // This function returns the value that's at the top of the stack.
    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.value;
    }

    // This function returns true is the stack is empty, otherwise false.
    public boolean isEmpty(){
        return top == null ? true : false;
    }

    // This function returns the string of the stack
    public String toString(){
        // Declare variables
        Node<T> iterator = top;
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Stack: Top -> ");
        while(iterator != null){
            nodeString.append(iterator.toString());
            nodeString.append(" -> ");
            iterator = iterator.next;
        }
        // Finished the null / also works if top is null
        nodeString.append("null");
        return nodeString.toString();
    }
}
