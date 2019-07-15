# Left Join
This is an implementation that lefts joins 2 hashmaps

## Challenge

Finds the matches from the first hashmap and creates a new combined value for left keys.\

## Approach & Efficiency

Approach

Iterate over the first hashmap and put the key and matching values into a new hashmap.  If the value doesn't exist in tree b, add null instead.\

Efficiency

LeftJoin:\
leftJoin : T: O(n) S: O(n)\

## API
LeftJoin:\
```public static HashMap<String, String[]> leftJoin(HashMap<String, String> a, HashMap<String, String> b)``` Takes in 2 hashmaps and returns 1 hashmap that is a left join of the 2.\
