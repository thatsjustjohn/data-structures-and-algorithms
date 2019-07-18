# Depth First Search ( Graph )
Implement a function that does a Depth first search for a graph

## Challenge

Implement a Depth First search.

## Approach & Efficiency

Approach

Create a Stack to push nodes onto.  When a node is popped, push its possible neighbors and ignore previously visited nodes. Use a stack, hashset for tracking visited, and arraylist for keeping order of nodes visited.

Efficiency

Time: O(n)
Space: O(n)

## API
Graph:\
``` public static ArrayList depthFirst(GraphNode node)``` This function takes in a graph node and does a breadth first search of all its neighbors.\

