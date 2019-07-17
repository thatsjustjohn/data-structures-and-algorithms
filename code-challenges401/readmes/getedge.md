# Graph Get Edge

## Challenge

This function takes in a graph and array of node names and validates that those edges exist and the sum of the weights of those edges you need to traverse.

## Approach & Efficiency

Approach

First get the starting node, then check its neighbors to find that the next node is the list is a neighbor.  If it is, add the weight to the sum and continue this process until you have finished the traversal needed.

Efficiency

Changing the structure from an Arraylist to a Hashmap for the graph and then storing the node's name as the key and the value being the node would speed up this process.

GetEdge:\
getEdge() : T: O(n + m * n)\


## API
GetEdge:\
```public static Pair getEdge(Graph graph, String[] arr)``` Takes in a graph and a Array of strings of the node names.\
```private static GraphNode getStartingNode(Graph graph, String nodeName)``` Takes in a graph and a nodes name and returns the node.\
```private static HashMap.Entry<GraphNode, Integer> getNeighborEntrySet(GraphNode node, String nodeName)``` This function takes in a node and nodeName and returns the hashmap entry for that nodes neighbor who matches the node name.\