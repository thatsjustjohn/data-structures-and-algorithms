package code.challenges401.stacksandqueues;

import org.apache.commons.math3.exception.NullArgumentException;

public class Stack {
    Node top;

    Stack(){
        this.top = null;
    }

    // This function pushes an item into the stack.
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        this.top = newNode;
    }

    // This function removes(pops) an item from the stack.
    public int pop(){
        if(top == null) throw new IllegalStateException();
        Node temp = top;
        top = temp.next;
        return temp.value;
    }

    // This function returns the value that's at the top of the stack.
    public int peek(){
        if(top == null) throw new IllegalStateException();
        return top.value;
    }

    // This function returns true is the stack is empty, otherwise false.
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }

    // This function returns the string of the stack
    public String toString(){
        // Declare variables
        Node iterator = top;
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
