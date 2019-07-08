package code.challenges401.hashtable;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HashtableTest {
    @Test
    public void test_hashTable_init() {
        Hashtable hashtable = new Hashtable();
        System.out.println(hashtable);
    }

    @Test
    public void test_hashTable_hash() {
        Hashtable hashtable = new Hashtable();
        System.out.println(hashtable.hash("Johnny Wint"));
    }

    @Test
    public void test_hashTable_add() {
        Hashtable hashtable = new Hashtable();
        hashtable.add("John", 100);
        List<HashNode> ll = hashtable.hashtable[299];
        assertEquals("John", ll.get(0).key);
    }
    @Test
    public void test_hashTable_contains() {
        Hashtable hashtable = new Hashtable();
        hashtable.add("John", 100);
        assertEquals(true, hashtable.contains("John"));
    }

    @Test
    public void test_hashTable_get_and_reassign() {
        Hashtable hashtable = new Hashtable();
        hashtable.add("John", 100);
        assertEquals(100, hashtable.get("John"));
        hashtable.add("John", 150);
        assertEquals(150, hashtable.get("John"));
    }
}