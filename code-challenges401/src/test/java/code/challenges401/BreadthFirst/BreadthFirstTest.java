package code.challenges401.BreadthFirst;

import code.challenges401.BreadthFirst.BreadthFirst;
import code.challenges401.graph.Graph;
import code.challenges401.graph.GraphNode;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test (expected = NullArgumentException.class)
    public void test_breadthFirst_null() {
        GraphNode gn = null;
        BreadthFirst.breadthFirst(gn);
    }

    @Test
    public void test_breadthFirst_happy() {
        Graph g = new Graph();
        GraphNode one = g.addNode(1);
        GraphNode three =  g.addNode(3);
        GraphNode four =  g.addNode(4);
        GraphNode five =  g.addNode(5);
        GraphNode six =  g.addNode(6);
        GraphNode seven =  g.addNode(7);
        g.addEdge(one, three, 0);
        g.addEdge(three, five, 0);
        g.addEdge(three, four, 0);
        g.addEdge(four, five, 0);
        g.addEdge(four, seven, 0);
        g.addEdge(five, seven, 0);
        g.addEdge(five, six, 0);
        g.addEdge(seven, six, 0);
        ArrayList as = new ArrayList();
        as.add(1);
        as.add(3);
        as.add(5);
        as.add(4);
        as.add(6);
        as.add(7);
        assertEquals(as,BreadthFirst.breadthFirst(one));

    }

    @Test
    public void test_breadthFirst_one() {
        Graph g = new Graph();
        GraphNode one = g.addNode(1);
        ArrayList as = new ArrayList();
        as.add(1);
        assertEquals(as, BreadthFirst.breadthFirst(one));
    }
}