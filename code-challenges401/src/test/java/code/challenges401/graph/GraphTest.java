package code.challenges401.graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest<V> {

    @Test
    public void test_addNode() {
        Graph graph = new Graph();
        graph.addNode(32);
        ArrayList<GraphNode<V>> nodes = graph.getNodes();
        GraphNode<V> gn = nodes.get(0);
        assertEquals(32, gn.value);
    }

    @Test
    public void test_addEdge() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(32), graph.addNode(23), 10);
        ArrayList<GraphNode<V>> nodes = graph.getNodes();
        GraphNode<V> gn = nodes.get(1);
        System.out.println(gn.neighbors);
    }

    @Test
    public void test_getNodes() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(32), graph.addNode(23), 10);
        ArrayList<GraphNode<V>> nodes = graph.getNodes();
        assertEquals(2, nodes.size());
    }

    @Test
    public void test_getNeighbors() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(32), graph.addNode(23), 10);
        ArrayList<GraphNode<V>> nodes = graph.getNodes();
        GraphNode<V> gn = nodes.get(0);
        graph.addEdge(gn, graph.addNode(10), 9);
        assertEquals(2, gn.neighbors.size());
        assertEquals(1, nodes.get(1).neighbors.size());
        assertEquals(1, nodes.get(2).neighbors.size());
    }

    @Test
    public void test_size() {
        Graph graph = new Graph();
        assertEquals(0, graph.size());
        graph.addNode(32);
        assertEquals(1, graph.size());
    }
}