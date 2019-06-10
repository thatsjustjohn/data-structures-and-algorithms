package code.challenges401.stacksandqueues;


public class Node<T> {
    T value;
    Node next;

    // Constructor takes in an int.
    Node(T value){
        this.value = value;
        this.next = null;
    }

    public String toString(){
        return String.format("[%s]", this.value.toString());
    }
}
