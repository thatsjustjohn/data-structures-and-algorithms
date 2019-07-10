# Repeated words
This is an implementation that finds repeated words in a String using a hashtable.

## Challenge

Find the first repeated word in a String.

## Approach & Efficiency

Approach

Split the string into an array of words, push each word into a hashtable, if it already exists, return that word.

Efficiency

RepeatedWord:\
repeatedWord: T: O(n) S: O(n)\

## API
RepeatedWord:\
```public static String repeatedWord(String input)``` Takes in an input String and returns a string of the first word that is repeated.\
