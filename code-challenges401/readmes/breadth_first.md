# Breath First Search ( Worked on the whiteboard part of this with Levi Porter
Implement a function that does a Breadth first search.

## Challenge

Implement a Breadth First search.

## Approach & Efficiency

Approach

Create a Queue to enqueue nodes onto.  When a node is dequeued, enqueue its possible children.

Efficiency

Time: O(n)
Space: O(1)

## API
Binary Tree:\
```public void breadthFirst(BinaryTree)``` This function takes in a Binary Tree and prints out the values in a breadth first ordering.\
