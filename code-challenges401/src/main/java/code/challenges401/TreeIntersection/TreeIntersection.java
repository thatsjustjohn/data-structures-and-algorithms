package code.challenges401.TreeIntersection;

import code.challenges401.tree.BTNode;
import code.challenges401.tree.BinaryTree;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.HashSet;

public class TreeIntersection {
    public static HashSet<Integer> tree_intersection(BinaryTree a, BinaryTree b){
        if(a == null || b == null) throw new NullArgumentException();
        if(a.isEmpty() || b.isEmpty()) return new HashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> resultHashSet = new HashSet<>();
        hashSet = treeToSet(a.getRoot(), hashSet);
        return treeToSet(b.getRoot(), hashSet, resultHashSet);
    }

    private static HashSet<Integer> treeToSet(BTNode node, HashSet hashSet){
        if(node == null) return hashSet;
        hashSet.add(node.getValue());
        hashSet = treeToSet(node.getLeft(), hashSet);
        hashSet = treeToSet(node.getRight(), hashSet);
        return hashSet;
    }

    private static HashSet<Integer> treeToSet(BTNode node, HashSet hashSet, HashSet resultHashSet){
        if(node == null) return resultHashSet;
        if(hashSet.contains(node.getValue())) resultHashSet.add(node.getValue());
        resultHashSet = treeToSet(node.getLeft(), hashSet, resultHashSet);
        resultHashSet = treeToSet(node.getRight(), hashSet, resultHashSet);
        return resultHashSet;
    }
}
