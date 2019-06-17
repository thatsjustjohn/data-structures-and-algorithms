package code.challenges401.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void test_isEmpty(){
        BinarySearchTree bst = new BinarySearchTree();
        assertTrue(bst.isEmpty());
    }

    @Test
    public void test_constructor(){
        BinarySearchTree bst = new BinarySearchTree();
        assertNull(bst.root);
    }

    @Test
    public void test_constructor2(){
        BinarySearchTree bst = new BinarySearchTree(2);
        assertEquals(2, bst.root.value);
    }

    @Test
    public void test_add() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(10);
        bst.add(1);
        assertEquals(5, bst.root.value);
        assertEquals(10, bst.root.right.value);
        assertEquals(1, bst.root.left.value);
    }

    @Test
    public void test_preOrder() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(10);
        bst.add(1);
        System.out.println(bst.preOrder().toString());
    }

    @Test
    public void test_inOrder() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(10);
        bst.add(1);
        System.out.println(bst.inOrder().toString());
    }

    @Test
    public void test_postOrder() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(10);
        bst.add(1);
        System.out.println(bst.postOrder().toString());
    }

    @Test
    public void test_contains() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(2);
        bst.add(7);
        bst.add(15);
        bst.add(12);
        bst.add(17);
        bst.add(1);
        assertTrue(bst.contains(1));
    }
}