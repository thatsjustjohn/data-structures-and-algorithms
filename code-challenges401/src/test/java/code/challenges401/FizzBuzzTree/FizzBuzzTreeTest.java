package code.challenges401.FizzBuzzTree;

import code.challenges401.tree.BTNode;
import code.challenges401.tree.BinarySearchTree;
import code.challenges401.tree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void test_fizzBuzzTree_tree_empty() {
        BinaryTree tree = new BinaryTree();
        FizzBuzzTree.fizzBuzzTree(tree);
        assertEquals(null, tree.getRoot());
    }

    @Test
    public void test_fizzBuzzTree_tree(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(2);
        bst.add(7);
        bst.add(15);
        bst.add(12);
        bst.add(17);
        FizzBuzzTree.fizzBuzzTree(bst);
        assertEquals("Buzz", bst.getRoot().getValue());
        assertEquals("Buzz", bst.getRoot().getLeft().getValue());
        assertEquals("FizzBuzz", bst.getRoot().getRight().getValue());
        assertEquals("Fizz", bst.getRoot().getRight().getLeft().getValue());
    }

    @Test
    public void test_fizzBuzzTree_node_fizzbuzz() {
        BTNode node = new BTNode(15);
        FizzBuzzTree.fizzBuzzTree(node);
        assertEquals("FizzBuzz", node.getValue());
    }

    @Test
    public void test_fizzBuzzTree_node_fizz() {
        BTNode node = new BTNode(18);
        FizzBuzzTree.fizzBuzzTree(node);
        assertEquals("Fizz", node.getValue());
    }

    @Test
    public void test_fizzBuzzTree_node_buzz() {
        BTNode node = new BTNode(10);
        FizzBuzzTree.fizzBuzzTree(node);
        assertEquals("Buzz", node.getValue());
    }

    @Test
    public void test_fizzBuzzTree_node_value() {
        BTNode node = new BTNode(8);
        FizzBuzzTree.fizzBuzzTree(node);
        assertEquals(8, node.getValue());
    }

    @Test
    public void test_fizzBuzz() {
        assertEquals("FizzBuzz",FizzBuzzTree.fizzBuzz(15));
    }

    @Test
    public void test_fizz() {
        assertEquals("Fizz",FizzBuzzTree.fizzBuzz(18));
    }

    @Test
    public void test_buzz() {
        assertEquals("Buzz",FizzBuzzTree.fizzBuzz(10));
    }

    @Test
    public void test_value() {
        assertEquals(8,FizzBuzzTree.fizzBuzz(8));
    }
}