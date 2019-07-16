package code.challenges401.graph;

import java.util.HashMap;

public class GraphNode<V> {
    V value;
    HashMap<GraphNode<V>, Integer> neighbors;

    public GraphNode(V value)
    {
        this.value = value;
        neighbors = new HashMap<>();
    }

    public V getValue(){return this.value;}
    public HashMap<GraphNode<V>, Integer> getNeighbors(){return this.neighbors;}

}
