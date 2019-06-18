package code.challenges401.FizzBuzzTree;

import code.challenges401.tree.BTNode;
import code.challenges401.tree.BinaryTree;

public class FizzBuzzTree {
    public static BinaryTree fizzBuzzTree(BinaryTree binaryTree){
        fizzBuzzTree(binaryTree.getRoot());
        return binaryTree;
    }

    public static void fizzBuzzTree(BTNode node){
        if(node == null) return;
        node.setValue(fizzBuzz(node.getValue()));
        fizzBuzzTree(node.getLeft());
        fizzBuzzTree(node.getRight());
    }

    public static Comparable fizzBuzz(Comparable value){
        // Validate input
        try{
            int castValue = (int)value;
        }catch(ClassCastException e){
            return value;
        }
        String returnString = "";
        if((int)value % 3 == 0) returnString = "Fizz";
        if((int)value % 5 == 0) returnString = returnString + "Buzz";
        return returnString != "" ? returnString : value;
    }
}
