PseudoQueue, A Queue with 2 Stacks.

This is an implementation of a function that determines that the string has all matching brackets in the correct order.

## Challenge

Implement a Multi Bracket Validator

## Approach & Efficiency

Approach

Use 1 HashMap to store a key (open bracket) with a value (close bracket) for the pair.\
Iterate over the string, When you find a open bracket, push, when you find a close bracket, pop and validate that it matches it key.

Efficiency

MultiBracketValidation:\
multiBracketValidation: T: O(n) S: O(n)

## API
MultiBracketValidation:\
```public static boolean multiBracketValidation(String input)``` Takes in a String as a parameter and returns true is its valid and false if not.
