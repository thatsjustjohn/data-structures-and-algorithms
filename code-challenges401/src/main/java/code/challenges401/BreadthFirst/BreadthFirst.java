package code.challenges401.BreadthFirst;

import code.challenges401.graph.GraphNode;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.*;

public class BreadthFirst {

    public static ArrayList breadthFirst(GraphNode node){
        if(node == null) throw new NullArgumentException();
        Queue<GraphNode> q = new LinkedList<>();
        HashSet<GraphNode> hs = new HashSet();
        ArrayList al = new ArrayList();
        q.add(node);
        hs.add(node);
        while(!q.isEmpty()){
            GraphNode newNode = q.remove();
            al.add(newNode.getValue());
            HashMap<GraphNode, Integer> neighbors = newNode.getNeighbors();
            for (Map.Entry<GraphNode, Integer> entry : neighbors.entrySet()) {
                GraphNode key = entry.getKey();
                if(!hs.contains(key)) {
                    q.add(key);
                    hs.add(key);
                }
            }
        }
        return al;
    }
}
