package code.challenges401.LeftJoin;

import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void test_leftJoin() {
        HashMap<String, String> a = new HashMap<>();
        HashMap<String, String> b = new HashMap<>();
        a.put("wrath", "anger");
        a.put("guide", "usher");
        b.put("wrath", "delight");
        HashMap<String, String[]> c = new HashMap<>();
        c.put("wrath", new String[]{"anger", "delight"});
        c.put("guide", new String[]{"usher", null});
        HashMap<String, String[]> d = LeftJoin.leftJoin(a, b);
        for (String key : d.keySet()) {
            assertEquals(c.get(key), d.get(key));
        }
    }

    @Test (expected = NullArgumentException.class)
    public void test_leftJoin_null() {
        HashMap<String, String> a = new HashMap<>();
        HashMap<String, String[]> d = LeftJoin.leftJoin(a, null);
    }

    @Test
    public void test_leftJoin_bempty() {
        HashMap<String, String> a = new HashMap<>();
        HashMap<String, String> b = new HashMap<>();
        a.put("wrath", "anger");
        a.put("guide", "usher");
        HashMap<String, String[]> c = new HashMap<>();
        c.put("wrath", new String[]{"anger", null});
        c.put("guide", new String[]{"usher", null});
        HashMap<String, String[]> d = LeftJoin.leftJoin(a, b);
        for (String key : d.keySet()) {
            assertEquals(c.get(key), d.get(key));
        }
    }

}