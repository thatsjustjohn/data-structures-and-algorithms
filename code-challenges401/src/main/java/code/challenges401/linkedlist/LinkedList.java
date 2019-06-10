package code.challenges401.linkedlist;

import jdk.internal.util.xml.impl.Pair;

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

    static class Pair {
        boolean isPal;
        Node node;

        Pair(Node n){
            this.isPal = true;
            this.node = n;
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

    // This function will return the value kth from the end
    public int kthFromEnd(int k){
        // Validate inputs
        // Check if head is null also helps for .next traversal
        if(head == null) throw new IllegalStateException();
        if(k < 0) throw new IllegalArgumentException();
        // Setup variables
        Node frontIterator = head;
        Node backIterator = head;
        int count = 0;
        while(frontIterator.next != null){
            if(count >= k) backIterator = backIterator.next;
            frontIterator = frontIterator.next;
            count++;
        }
        // If we loop and there are less elements than the target
        if(count < k) throw new IllegalArgumentException();
        return backIterator.value;
    }

    public static LinkedList mergeLists(LinkedList one, LinkedList two){
        if(one.head == null && two.head == null) throw new IllegalArgumentException();
        if(one.head == null || two.head == null) return one.head == null ? two : one;
        Node cur1 = one.head, cur2 = two.head, next1, next2;
        while(cur1 != null && cur2 != null){
            next1 = cur1.next;
            cur1.next = cur2;
            // If only a downshift
            if(next1 == null){
                return one;
            }
            // Perform upshift
            next2 = cur2.next;
            cur2.next = next1;
            //Move up pointers
            cur1 = next1;
            cur2 = next2;
        }
        return one;
    }

    public static boolean isPalindrome(LinkedList ll){
        if(ll.head == null) return false;
        if(ll.head.next == null) return true;

        Pair result = PHelper(ll.head, ll.head);
        return result.isPal;
    }

    private static Pair PHelper(Node n, Node head){
        if(n == null){
            return new Pair(head);
        }
        Pair answer = PHelper(n.next, head);
        if(answer.node.value != n.value){
            answer.isPal = false;
        }
        answer.node = answer.node.next;
        return answer;
    }


    public static boolean isPalindrome_stack(LinkedList ll){
        if(ll.head == null) return false;
        LinkedList ll2 = new LinkedList();
        Node iterator = ll.head;
        int size = 0;
        // Create stack
        while(iterator != null){
            ll2.insert(iterator.value);
            iterator = iterator.next;
            size++;
        }
        iterator = ll.head;
        Node iterator2 = ll2.head;
        for(int i = 0; i < size+1/2; i++){
            if(iterator.value != iterator2.value){
                return false;
            }
        }
        return true;
    }
}
