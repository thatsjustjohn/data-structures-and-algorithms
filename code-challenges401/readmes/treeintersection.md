# Tree Intersection
This is an implementation that finds all the nodes that contain the same value in a Binary tree.

## Challenge

Find all of the matching values between two binary trees.

## Approach & Efficiency

Approach

Push a tree into a hash set.  Using that hash set and the second tree, traverse the second tree and if you find that value in the hashset, add it to a final result hashset.

Efficiency

TreeIntersection:\
treeIntersection: T: O(n+m) S: O(n+m)\

## API
TreeIntersection:\
```public static HashSet<Integer> treeIntersection(BinaryTree a, BinaryTree b)``` Takes in 2 binary trees and returns a hashset containing the intersecting values.\
```private static HashSet<Integer> treeToSet(BTNode node, HashSet hashSet)``` Takes in a binary tree and hashset and returns a hashset with all unique numbers from the tree.\
```private static HashSet<Integer> treeToSet(BTNode node, HashSet hashSet, HashSet resultHashSet)``` Takes in a binary tree and 2 hashsets, returns a hashset of all of values from the tree that are in the hashset.\