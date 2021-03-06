package code.challenges401.tree;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    private BinaryTree setup(){
        BinaryTree bt = new BinaryTree();
        // Setup left side
        BTNode lrl = new BTNode(5);
        BTNode lrr = new BTNode(11);
        BTNode ll = new BTNode(2);
        BTNode lr = new BTNode(6, lrl, lrr);
        BTNode l = new BTNode(7, ll, lr);
        // Setup right side
        BTNode rrl = new BTNode(4);
        BTNode rr = new BTNode(9, rrl, null);
        BTNode r = new BTNode(5, null, rr);
        bt.root = new BTNode(2, l, r);
        return bt;
    }
    @Test
    public void test_breadthFirst() {
        BinaryTree bt = setup();
        bt.breadthFirst(bt);
    }

    @Test
    public void test_findMaxiumumValue() {
        BinaryTree bt = setup();
        assertEquals(11,bt.findMaximumValue(bt));
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_findMaxiumumValue_empty() {
        BinaryTree bt = new BinaryTree();
        assertEquals(11,bt.findMaximumValue(bt));
    }
}