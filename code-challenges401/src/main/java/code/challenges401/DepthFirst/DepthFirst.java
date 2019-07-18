package code.challenges401.DepthFirst;

import code.challenges401.graph.GraphNode;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.*;

public class DepthFirst {
    public static ArrayList depthFirst(GraphNode node){
        if(node == null) throw new NullArgumentException();
        Stack<GraphNode> stack = new Stack<>();
        HashSet<GraphNode> hs = new HashSet();
        ArrayList al = new ArrayList();
        stack.push(node);
        hs.add(node);
        while(!stack.isEmpty()){
            GraphNode newNode = stack.pop();
            al.add(newNode.getValue());
            HashMap<GraphNode, Integer> neighbors = newNode.getNeighbors();
            for (Map.Entry<GraphNode, Integer> entry : neighbors.entrySet()) {
                GraphNode key = entry.getKey();
                if(!hs.contains(key)) {
                    stack.push(key);
                    hs.add(key);
                }
            }
        }
        return al;
    }
}
