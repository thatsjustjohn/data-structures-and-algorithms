# Challenge Summary
Write a function uses binary search to find an item in a sorted array

## Challenge Description
Write a function called binarySearch which takes in a sorted array and the value to be search for.  Without utilizing any of the built-in methods available to your language, return an index of where the searched value exists.

## Approach & Efficiency
A simple while loop with a high and low to keep track of your current bounds.  Moving to the middle of the bounds and Testing if the search key is higher or lower allows us shift (our bounds) the low <- mid or high <- mid respectively.  We continue to shift our bounds until we find the item or high < low, in which the search key doesn't exist.  At this point we would return the index or -1 if we have not found the search key.

## Solution
[[White Board]](../code-challenges401/assets/binary_search.jpg)[[Code]](../code-challenges401/src/main/java/code/challenges401/BinarySearch.java)