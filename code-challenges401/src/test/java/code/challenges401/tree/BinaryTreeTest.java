package code.challenges401.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void test_preOrder() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(10);
        bst.add(1);
        System.out.println(bst.preOrder().toString());
    }

//    @Test
//    public void test_inOrder() {
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.add(5);
//        bst.add(10);
//        bst.add(1);
//        System.out.println(bst.inOrder(bst.root).toString());
//    }
//
//    @Test
//    public void test_postOrder() {
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.add(5);
//        bst.add(10);
//        bst.add(1);
//        System.out.println(bst.postOrder(bst.root).toString());
//    }
}