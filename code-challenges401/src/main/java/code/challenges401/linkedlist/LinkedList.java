package code.challenges401.linkedlist;

public class LinkedList {

    // Variables
    Node head;

    // Create nodes for linked list
    static class Node {
        int data;
        Node next;

        // Constructor takes in an int.
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Linked list constructor sets head to null on creation
    LinkedList(){
        this.head = null;
    }

    // This function inserts an item into the linked list
    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // This function returns a boolean if the item exists in the linked list
    public boolean includes(int data){
        Node iterator = head;
        while(iterator != null){
            if(iterator.data == data) return true;
            iterator = iterator.next;
        }
        return false;
    }

    // This function prints the linked list.
    public String print(){
        // Declare variables
        Node iterator = head;
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("LinkedList: ");
        while(iterator != null){
            nodeString.append(iterator.data);
            nodeString.append("->");
            iterator = iterator.next;
        }
        // Finished the null / also works if head is null
        nodeString.append("null");
        return nodeString.toString();
    }
}
