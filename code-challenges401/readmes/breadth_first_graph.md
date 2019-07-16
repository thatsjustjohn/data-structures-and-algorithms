# Breath First Search ( Graph )
Implement a function that does a Breadth first search for a graph

## Challenge

Implement a Breadth First search.

## Approach & Efficiency

Approach

Create a Queue to enqueue nodes onto.  When a node is dequeued, enqueue its possible neighbors and ignore previously visited nodes. Users a queue, hashset for tracking visited, and arraylist for keeping order of nodes visited.

Efficiency

Time: O(n)
Space: O(n)

## API
Graph:\
``` public static ArrayList breadthFirst(GraphNode node)``` This function takes in a graph node and does a breadth first search of all its neighbors.\

