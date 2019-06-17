package code.challenges401.tree;

public class BTNode<T extends Comparable<T>> extends Node<T> {
    T value;
    BTNode<T> left, right;

    BTNode(){
        super();
    }

    BTNode(T value){
        super();
        this.value = value;
    }

    public Node<T> getLeft(){
        return this.children.get(0);
    }

    public Node<T> getRight(){
        return this.children.get(1);
    }

    public void setLeft(Node<T> node){
        this.children.add(0, node);
    }

    public void setRight(Node<T> node){
        this.children.add(1, node);
    }

    public String toString(){
        return String.format("[%s]", this.value.toString());
    }

}
