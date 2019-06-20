# Find maximum value in a tree

Implement a function that finds the max value

## Challenge

Implement a function that finds the maximum value in a binary tree

## Approach & Efficiency

Approach

Create a initial and helper function to recursively return the max value of a node, left subtree, and right subtree

Efficiency

Time: O(n)
Space: O(1)

## API
Binary Tree:\
```public int findMaximumValue(BinaryTree bt)``` This function takes in a Binary Tree and and returns the max value of that tree.\
```private int findMaximumValueHelper(BTNode node)``` This function is a helper function that takes in a binary node and returns the max value.
