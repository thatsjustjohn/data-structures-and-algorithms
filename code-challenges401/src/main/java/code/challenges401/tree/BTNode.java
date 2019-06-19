package code.challenges401.tree;

public class BTNode<T extends Comparable<T>> extends Node<T> {
    T value;
    BTNode<T> left, right;

    public BTNode(){
        super();
    }

    public BTNode(T value){
        super();
        this.value = value;
    }

    public BTNode(T value, BTNode left, BTNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BTNode<T> getLeft() {
        return this.left;
    }

    public BTNode<T> getRight() {
        return this.right;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String toString(){
        return String.format("[%s]", this.value.toString());
    }

}
