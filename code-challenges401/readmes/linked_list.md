# Singly Linked List

This is an implementation of a singarly linked list which currently only contains methods to insert, includes, print, append, insertBefore, insertAfter, kthEndFrom

## Challenge

Create a singly linked list and write functions to insert a node(insert), a function that checks if something is included in the list(includes), and a function to print out the link list(print).
Adding onto this June 4.
Added methods for to insert a node at the end of a list(append), a method to insert before a specific node(insertBefore), and a method to insert after a target node(insertAfter).
Adding onto this June 5.
Added a method to find the kth element from the end of the list(kthFromEnd).

## Approach & Efficiency

Efficiency  
insert: time: O(1) space: O(1)  
inserting at the head provides O(1) time performance,   
includes: time: O(n) space: O(1)   
includes has to check the whole list which results in O(n) time performance.  
print: time: O(n) space: O(1)  
print has to get data from each item in the list which results in O(n) time performance.  
append: time: O(n) space: O(1) 
appending without a tail pointed requires O(n) time perfomance  
insertBefore: time: O(n) space: O(1) 
insertBefore requires traversal of the list to find the target item making it O(n) time performance. 
insertAfter: time: O(n) space: O(1) 
insertAfter requires traversal of the list to find the target item making it O(n) time performance. 
kthFromEnd: time: O(n) space: O(1)
kthFromEnd requires traversal of the list to find the Kth element making it O(n) time performance


## API
```void insert(int value)``` Takes in a integer value as a parameter.   
```boolean includes(int value)``` Takes in an integer value as a parameter and returns a boolean(true or false).  
```String print()``` Takes in no parmeters and returns a String which lists all the nodes.  
```void append(int value)``` Takes in an integer value as a parameter.   
```boolean insertBefore(int target, int value)``` Takes in integers as the target, value and returns a boolean if it was inserted successfully.  
```boolean insertAfter(int target, int value)``` Takes in integers as the target, value and returns a boolean if it was inserted successfully.  
```int kthFromEnd(int k)``` Takes in an integer for home many positions from the end's element you want.  Returns an integer that elements value.

