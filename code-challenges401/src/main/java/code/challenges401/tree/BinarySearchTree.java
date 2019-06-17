package code.challenges401.tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    BinarySearchTree(){
        super();
    }
    public void add(T value){
        root = add(value, root);
    }

    public BTNode add(T value, BTNode node){
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

    public boolean contains(T value, BTNode node){
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
