# Graph
This is an implementation of a graph in java

## Challenge

Implement your own version of a graph in java.\

## Approach & Efficiency

Approach

Making a Array list of graph nodes.  Each graph node has a value and neighbors or edges.  you can add nodes, and after you can add edges which combine 2 nodes with a weight.

Efficiency

Graph:\
addNode() : T: O(1)\
addEdge() : T: O(n)\
getNodes() : T: O(1)\
getNeighbors() : T: O(n)\
size() : T: O(1)\


## API
Graph:\
```public GraphNode addNode(V value)``` Takes a value, adds it to the graph, and returns the node that was created.\
```public void addEdge(GraphNode src, GraphNode dst, int weight)``` Takes in 2 Graph nodes and a weight and creates an edge.\
```public ArrayList getNodes()``` Returns an arraylist of all of the nodes in the graph.\
```public HashMap<GraphNode<V>, Integer> getNeighbors(GraphNode graphNode)```Takes in a graph node and returns the hashmap of its neighbors.\
```public int size()``` Returns the size of the graph.
