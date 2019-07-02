# Trees

This is an implementation of a Tree, Binary Tree, Binary Search Tree.  Below are a list of the methods

## Challenge

Implements a Binary Search Tree and Binary Tree methods for traversal(Pre / In / Post).

## Approach & Efficiency

Approach

Create a Binary Tree and Binary Tree Node got creating a tree and traversing.\
Create a Binary Search Tree class for adding and seeing if the tree contains a number.

Efficiency

Binary Tree:
preOrder: O(n)
inOrder: O(n)
postOrder: O(n)
isEmpty: O(1)

Binary Search Tree:
add: O(lg n)
contains: O(lg n)

## API
Binary Tree:\
```ArrayList<T> preOrder()``` This function returns a list of the tree in PreOrder.\
```ArrayList<T> inOrder()``` This function returns a list of the tree in InOrder.\
```ArrayList<T> postOrder()``` This function returns a list of the tree in PostOrder.\
```boolean isEmpty()``` This function returns true if the tree is empty, otherwise false.\
Binary Search Tree:\
```void add(T value)``` Takes in a Type value as a parameter and adds it to the tree\
```boolean contains(T value)``` Takes in a Type value as a parameter and returns true if its in the list otherwise false.\
