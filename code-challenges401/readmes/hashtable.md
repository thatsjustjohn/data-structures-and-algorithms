# Hashtables
This is an implementation of a Hash Table.

## Challenge

Implements a Hash Table and methods for Add, Get, Contains, and Hash


## Approach & Efficiency

Approach

Create a hashtable using a linked list to deal with collisions.

Efficiency

HashTable:\
hash: T: O(m) m being the size of the key.\
These functions are based off the bucket size.\
add: T: O(1)\
get: T: O(1)\
contains: T: O(1)


## API
Hashtable:\
```public void add(String key, V value)``` Takes in a string and value and inserts it into the hash table.\
```public V get(String key)``` Takes in a string and returns the value if that key exists.\
```public boolean contains(String key)``` Takes in a string and returns true if the key exists.\
```public int hash(String key)``` Takes in a string key and returns a int index.