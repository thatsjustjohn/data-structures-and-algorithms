# Singly Linked List

This is an implementation of a singarly linked list which currently only contains methods to insert, includes, and print.

## Challenge

Create a singly linked list and write functions to insert a node(insert), a function that checks if something is included in the list(includes), and a function to print out the link list(print).

## Approach & Efficiency

Efficiency  
insert: O(1)  
inserting at the head provides O(1) time performance,   
includes: O(n)   
includes has to check the whole list which results in O(n) time performance.  
print: O(n)  
print has to get data from each item in the list which results in O(n) time performance.  

## API
void insert(int value) Takes in a integer value as a parameter.   
boolean includes(int value) Takes in an integer value as a parameter and returns a boolean(true or false).     
String print() Takes in no parmeters and returns a String which lists all the nodes.   
