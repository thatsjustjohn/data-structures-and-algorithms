package code.challenges401;

import java.lang.Math;

public class ArrayShift {
    // This function takes in an array of int and an int and
    // puts that int into the middle of the Array, It returns the new array
    public int[] insertShiftArray(int[] inputArray, int inputNumber){
        // Setup variables
        int arrayLength = inputArray.length+1;
        int[] outputArray = new int[arrayLength];
        int outputIncrementer = 0;
        int inputIncrementer = 0;
        int middle = (int) Math.floor(arrayLength / 2);
        // Loop through and copy
        while(outputIncrementer < arrayLength){
            //I
            if(outputIncrementer == middle) {
                outputArray[outputIncrementer] = inputNumber;
            }else{
                outputArray[outputIncrementer] = inputArray[inputIncrementer];
                inputIncrementer++;
            }
            outputIncrementer++;
        }
        return outputArray;
    }
}
