package code.challenges401.hashtable;

import org.apache.commons.math3.exception.NullArgumentException;
import java.util.LinkedList;
import java.util.List;


// It didn't like pairs so I did this new HashNode
class HashNode<K, V>
{
    K key;
    V value;

    public HashNode(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}

public class Hashtable<K, V> {
    LinkedList<HashNode<K, V>>[] hashtable = new LinkedList[1024];

    public void add(String key, V value){
        int hashedKey = hash(key);
        if(hashtable[hashedKey] == null) hashtable[hashedKey] = new LinkedList<>();
        for(HashNode<K,V> hn : hashtable[hashedKey]){
            if(hn.key.equals(key)) {
                hn.value = value;
                return;
            }
        }
        hashtable[hashedKey].add(new HashNode(key, value));
    }

    public V get(String key){
        List<HashNode<K,V>> bucket = hashtable[hash(key)];
        if(bucket != null) return bucket.stream().filter(item -> item.key.equals(key)).findFirst().get().value;
        else return null;
    }

    public boolean contains(String key){
        List<HashNode<K,V>> bucket = hashtable[hash(key)];
        if(bucket == null) return false;
        for(HashNode<K,V> hn : bucket){
            if(hn.key.equals(key)) return true;
        }
        return false;
    }

    public int hash(String key){
        if(key == null) throw new NullArgumentException();
        double hashedKey = 0;
        int n = key.length();
        for(int i = 0; i < n; i++){
            hashedKey += ((int)key.charAt(i) * Math.pow(31, n-(i+1)));
        }
        return (int) hashedKey % 1024;
    }
}
