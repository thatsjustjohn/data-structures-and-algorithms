package code.challenges401.GetEdge;

import code.challenges401.BreadthFirst.BreadthFirst;
import code.challenges401.graph.Graph;
import code.challenges401.graph.GraphNode;
import javafx.util.Pair;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GetEdgeTest {
    Graph g;
    @Before
    public void test_setup(){
        g = new Graph();
        GraphNode pandora = g.addNode("Pandora");
        GraphNode arendelle =  g.addNode("Arendelle");
        GraphNode monstropolis =  g.addNode("Monstropolis");
        GraphNode metroville =  g.addNode("Metroville");
        GraphNode narnia =  g.addNode("Narnia");
        GraphNode naboo =  g.addNode("Naboo");
        g.addEdge(pandora, arendelle, 150);
        g.addEdge(pandora, metroville, 82);
        g.addEdge(arendelle, metroville, 99);
        g.addEdge(arendelle, monstropolis, 42);
        g.addEdge(metroville, monstropolis, 105);
        g.addEdge(metroville, naboo, 26);
        g.addEdge(metroville, narnia, 37);
        g.addEdge(narnia, naboo, 250);
        g.addEdge(naboo, monstropolis, 73);
    }

    @Test
    public void test_getEdge_pass() {
        ArrayList as = new ArrayList();
        String[] arr = {"Arendelle", "Monstropolis", "Naboo"};
        Pair pair = new Pair(true, 115);
        assertEquals(pair,GetEdge.getEdge(g, arr));
    }

    @Test
    public void test_getEdge_fail() {
        ArrayList as = new ArrayList();
        String[] arr = {"Narnia", "Arendelle", "Naboo"};
        Pair pair = new Pair(false, 0);
        assertEquals(pair,GetEdge.getEdge(g, arr));
    }

    @Test (expected = NullArgumentException.class)
    public void test_getEdge_null() {
        ArrayList as = new ArrayList();
        String[] arr = null;
        Pair pair = new Pair(false, 0);
        assertEquals(pair,GetEdge.getEdge(g, arr));
    }

}