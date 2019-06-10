package code.challenges401.stacksandqueues;


public class Node {
    int value;
    Node next;

    // Constructor takes in an int.
    Node(int value){
        this.value = value;
        this.next = null;
    }

    public String toString(){
        return String.format("[%d]", this.value);
    }
}
