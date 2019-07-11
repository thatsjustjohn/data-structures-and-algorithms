package code.challenges401.TreeIntersection;

import code.challenges401.tree.BinarySearchTree;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void test_treeIntersection_happy() {
        BinarySearchTree a = new BinarySearchTree<>();
        BinarySearchTree b = new BinarySearchTree<>();
        // a tree
        a.add(9);
        a.add(4);
        a.add(2);
        a.add(8);
        a.add(14);
        a.add(12);
        a.add(18);
        a.add(1);
        // b tree
        b.add(10);
        b.add(5);
        b.add(2);
        b.add(7);
        b.add(15);
        b.add(12);
        b.add(17);
        b.add(2);
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(12);
        assertEquals(hs, TreeIntersection.tree_intersection(a, b));
    }

    @Test (expected = NullArgumentException.class)
    public void test_treeIntersection_null() {
        BinarySearchTree a = null;
        BinarySearchTree b = new BinarySearchTree<>();
        // b tree
        b.add(10);
        b.add(5);
        b.add(2);
        b.add(7);
        b.add(15);
        b.add(12);
        b.add(17);
        b.add(2);
        HashSet<Integer> hs = new HashSet<>();
        assertEquals(hs, TreeIntersection.tree_intersection(a, b));
    }

    @Test
    public void test_treeIntersection_empty() {
        BinarySearchTree a = new BinarySearchTree<>();
        BinarySearchTree b = new BinarySearchTree<>();
        // b tree
        b.add(10);
        b.add(5);
        b.add(2);
        b.add(7);
        b.add(15);
        b.add(12);
        b.add(17);
        b.add(2);
        HashSet<Integer> hs = new HashSet<>();
        assertEquals(hs, TreeIntersection.tree_intersection(a, b));
    }

    @Test
    public void test_treeIntersection_no_match() {
        BinarySearchTree a = new BinarySearchTree<>();
        BinarySearchTree b = new BinarySearchTree<>();
        // a tree
        a.add(9);
        a.add(4);
        a.add(3);
        a.add(8);
        a.add(14);
        a.add(12);
        a.add(18);
        a.add(1);
        // b tree
        b.add(10);
        b.add(5);
        b.add(2);
        b.add(7);
        b.add(15);
        b.add(13);
        b.add(17);
        b.add(2);
        HashSet<Integer> hs = new HashSet<>();
        assertEquals(hs, TreeIntersection.tree_intersection(a, b));
    }
}