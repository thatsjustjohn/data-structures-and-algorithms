package code.challenges401.tree;

public class Node<T extends Comparable<T>> {
    T value;

    Node(){
        value = null;
    }
    Node(T value){
        this.value = value;
    }
}
