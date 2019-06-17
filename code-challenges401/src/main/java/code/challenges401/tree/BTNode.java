package code.challenges401.tree;

public class BTNode<T extends Comparable<T>> extends Node<T> {
    T value;
    BTNode<T> left, right;

    BTNode(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public String toString(){
        return String.format("[%s]", this.value.toString());
    }

}
