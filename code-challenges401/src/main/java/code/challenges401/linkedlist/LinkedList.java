package code.challenges401.linkedlist;

public class LinkedList {

    // Variables
    Node head;

    // Create nodes for linked list
    static class Node {
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

    // Linked list constructor sets head to null on creation
    LinkedList(){
        this.head = null;
    }

    // This function inserts an item into the linked list
    public void insert(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // This function returns a boolean if the item exists in the linked list
    public boolean includes(int value){
        Node iterator = head;
        while(iterator != null){
            if(iterator.value == value) return true;
            iterator = iterator.next;
        }
        return false;
    }

    // This function prints the linked list.
    public String print(){
        // Declare variables
        Node iterator = head;
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("LinkedList: head -> ");
        while(iterator != null){
            nodeString.append(iterator.toString());
            nodeString.append(" -> ");
            iterator = iterator.next;
        }
        // Finished the null / also works if head is null
        nodeString.append("null");
        return nodeString.toString();
    }

    // This function appends to the end of the linked list
    public void append(int value){
        Node iterator = head;
        if(head == null) {
            this.insert(value);
            return;
        }
        while(iterator.next != null){
            iterator = iterator.next;
        }
        Node newNode = new Node(value);
        iterator.next = newNode;
    }

    // This function inserts before the target node
    public void insertBefore(int target, int value){
        Node iterator = head;
        // Empty List
        if(head == null) return;
        if(head.value == target){
            insert(value);
            return;
        }
        while(iterator.next != null){
            if(iterator.next.value == target){
                Node newNode = new Node(value);
                newNode.next = iterator.next;
                iterator.next = newNode;
                return;
            }
            iterator = iterator.next;
        }
        throw new IllegalArgumentException();
    }

    // This function inserts after the target value
    public void insertAfter(int target, int value){
        Node iterator = head;
        if(head == null) return;
        while(iterator != null){
            if(iterator.value == target){
                Node newNode = new Node(value);
                newNode.next = iterator.next;
                iterator.next = newNode;
                return;
            }
            iterator = iterator.next;
        }
        // If target wasn't found
        throw new IllegalArgumentException();
    }

}
