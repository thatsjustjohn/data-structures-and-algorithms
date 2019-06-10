# Singly Linked List

This is an implementation of a singularly linked list which currently only contains methods to insert, includes, print, append, insertBefore, insertAfter, kthEndFrom, mergeLists.

## Challenge

Create a singly linked list and write functions to insert a node(insert), a function that checks if something is included in the list(includes), and a function to print out the link list(print).
(June 4)Added methods for to insert a node at the end of a list(append), a method to insert before a specific node(insertBefore), and a method to insert after a target node(insertAfter).
(June 5)Added a method to find the kth element from the end of the list(kthFromEnd).
(June 6)Added a method to merge 2 linked lists together (mergeLists).
(June 7)Added 2 methods to detect if a linked list is a palindrome(isPalindrome) and (Phealper)a helper function.

## Approach & Efficiency

Efficiency\
insert: time: O(1) space: O(1)\
inserting at the head provides O(1) time performance.\ 
includes: time: O(n) space: O(1)\
includes has to check the whole list which results in O(n) time performance.\
print: time: O(n) space: O(1)\
print has to get data from each item in the list which results in O(n) time performance.\
append: time: O(n) space: O(1)\
appending without a tail pointed requires O(n) time performance.\
insertBefore: time: O(n) space: O(1)\
insertBefore requires traversal of the list to find the target item making it O(n) time performance.\ 
insertAfter: time: O(n) space: O(1)\
insertAfter requires traversal of the list to find the target item making it O(n) time performance.\
kthFromEnd: time: O(n) space: O(1)\
kthFromEnd requires traversal of the list to find the Kth element making it O(n) time performance.\
MergeLists: time: O(n) space: O(1)\
MergeLists requires traversal of the list together making it O(n) performance.  This is done is O(1) as no new node items or LinkedLists are created.\
isPalindrome: time: O(n)\
isPalindrome stack time: O(n) space O(n)\
isPalindrome(both) requires traversal of the list, making them both O(n) performance.  isPalindrome stack uses a stack datas tructure to hold the nodes making its space O(n).


## API
```void insert(int value)``` Takes in a integer value as a parameter.\
```boolean includes(int value)``` Takes in an integer value as a parameter and returns a boolean(true or false).\
```String print()``` Takes in no parameters and returns a String which lists all the nodes.\
```void append(int value)``` Takes in an integer value as a parameter.\
```boolean insertBefore(int target, int value)``` Takes in integers as the target, value and returns a boolean if it was inserted successfully.\
```boolean insertAfter(int target, int value)``` Takes in integers as the target, value and returns a boolean if it was inserted successfully.\
```int kthFromEnd(int k)``` Takes in an integer for home many positions from the end's element you want.  Returns an integer that elements value.\
```LinkedList mergeLists(LinkedList one, LinkedList two)``` Takes in two linked lists and returns a linked list of those 2 lists merged.\
```boolean isPalindrome(LinkedList ll)``` Takes in a linked list and returns a boolean if the list is a palindrome.\
```boolean isPalindrome_stack(LinkedList ll)``` Takes in a linked list and returns a boolean if the list is a palindrome.

