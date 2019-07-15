package code.challenges401.LeftJoin;

import javafx.util.Pair;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {
    public static HashMap<String, String[]> leftJoin(HashMap<String, String> a, HashMap<String, String> b){
        if(a == null || b == null) throw new NullArgumentException();
        HashMap<String, String[]> c = new HashMap<>();
        for(Map.Entry pair : a.entrySet()){
            if(b.containsKey(pair.getKey())) c.put(pair.getKey().toString(), new String[] {pair.getValue().toString(), b.get(pair.getKey())});
            else c.put(pair.getKey().toString(), new String[] {pair.getValue().toString(), null});
        }
        return c;
    }
}
