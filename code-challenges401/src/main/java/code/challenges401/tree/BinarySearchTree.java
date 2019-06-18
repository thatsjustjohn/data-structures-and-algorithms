package code.challenges401.tree;

import code.challenges401.BinarySearch;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

    public BinarySearchTree(){
        super();
    }

    public BinarySearchTree(T value){
        this();
        this.add(value);
    }

    public void add(T value){

        this.root = add(value, root);
    }

    private BTNode add(T value, BTNode node){
        if(node == null){
            return new BTNode<>(value);
        }else if(node.value.compareTo(value) > 0){
            node.left = add(value, node.left);
        }else{
            node.right = add(value, node.right);
        }
        return node;
    }

    public boolean contains(T value){
        return contains(value, root);
    }

    private boolean contains(T value, BTNode node){
        if(node == null){
            return false;
        }else if(node.value.compareTo(value) == 0){
            return true;
        }
        if(node.value.compareTo(value) > 0){
            return contains(value, node.left);
        }else{
            return contains(value, node.right);
        }
    }
}
