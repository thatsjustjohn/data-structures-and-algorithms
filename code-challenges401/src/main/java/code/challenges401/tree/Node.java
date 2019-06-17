package code.challenges401.tree;

import java.util.ArrayList;

public class Node<T extends Comparable<T>> {
    T value;
    ArrayList<Node> children;
    public static int kAry;

    Node(){
        children  = new ArrayList<Node>(kAry);
    }

    Node(T value){
        this();
        this.value = value;
    }

    public String toString(){
        return String.format("[%s]", this.value.toString());
    }
}
