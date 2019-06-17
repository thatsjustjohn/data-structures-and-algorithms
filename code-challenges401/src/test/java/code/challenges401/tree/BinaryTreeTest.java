package code.challenges401.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void test_preOrder() {
        BinaryTree bt = new BinaryTree(2);
        bt.root.setLeft(new Node(3));
        bt.root.setRight(new Node(5));
        System.out.println(bt.preOrder().toString());
    }

    @Test
    public void test_inOrder() {
        BinaryTree bt = new BinaryTree();

        System.out.println(bt.inOrder().toString());
    }

    @Test
    public void test_postOrder() {
        BinaryTree bt = new BinaryTree();

        System.out.println(bt.postOrder().toString());
    }
}