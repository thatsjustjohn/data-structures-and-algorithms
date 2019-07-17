package code.challenges401.GetEdge;


import code.challenges401.graph.Graph;
import code.challenges401.graph.GraphNode;
import javafx.util.Pair;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.ArrayList;
import java.util.HashMap;

public class GetEdge {
    // This function sums up all the edges weights or costs given the nodes to traverse.
    public static Pair getEdge(Graph graph, String[] arr){
        // Validate inputs
        if(graph == null || arr == null) throw new NullArgumentException();
        if(graph.size() == 0 || arr.length == 0) return new Pair(false, 0);
        // Find the "starting node" if it exists
        GraphNode node = getStartingNode(graph, arr[0]);
        if(node == null) return new Pair(false, 0);
        // Start the traversal
        double sum = 0;
        for(int i = 1; i < arr.length; i++){
                HashMap.Entry<GraphNode, Integer> kvp = getNeighborEntrySet(node, arr[i]);
                if(kvp != null) {
                    node = kvp.getKey();
                    sum += kvp.getValue();
                }else
                {
                    return new Pair(false, 0);
                }
        }
        return new Pair(true, sum);
    }

    // This function gets the starting node from the list of nodes via the nodes name.
    private static GraphNode getStartingNode(Graph graph, String nodeName){
        ArrayList<GraphNode> nodes = graph.getNodes();
        for(GraphNode node : nodes){
            if(node.getValue().equals(nodeName)){
                return node;
            }
        }
        return null;
    }

    // This function gets the hashmap entry of nodes edge with the weight between the 2 nodes.
    private static HashMap.Entry<GraphNode, Integer> getNeighborEntrySet(GraphNode node, String nodeName){
        HashMap<GraphNode, Integer> hashmap = node.getNeighbors();
        for(HashMap.Entry<GraphNode, Integer>  neighbor : hashmap.entrySet()){
            if(neighbor.getKey().getValue().equals(nodeName)){
                return neighbor;
            }
        }
        return null;
    }
}
