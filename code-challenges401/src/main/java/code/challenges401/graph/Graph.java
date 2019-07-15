package code.challenges401.graph;

import java.util.ArrayList;
import java.util.HashMap;


class GraphNode<V> {
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

public class Graph<V> {
    ArrayList<GraphNode<V>> graph;

    public Graph(){
        graph = new ArrayList<>();
    }

    public GraphNode addNode(V value){
        GraphNode<V> newNode = new GraphNode(value);
        graph.add(newNode);
        return newNode;
    }

    public void addEdge(GraphNode src, GraphNode dst, int weight){
        if(graph.contains(src) && graph.contains(dst)){
            graph.get(graph.indexOf(src)).neighbors.put(dst, weight);
            graph.get(graph.indexOf(dst)).neighbors.put(src, weight);
        }
    }

    public ArrayList getNodes(){
        return graph;
    }

    public HashMap<GraphNode<V>, Integer> getNeighbors(GraphNode graphNode){
        if(graph.contains(graphNode)){
            return graph.get(graph.indexOf(graphNode)).neighbors;
        }
        return null;
    }

    public int size(){ return graph.size(); }
}
