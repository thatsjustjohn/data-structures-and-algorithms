package code.challenges401;

import java.util.Arrays;
import java.lang.Math;

public class ArrayShift {
    public int[] insertShiftArray(int[] inputArray, int inputNumber){
        //Setup variables
        int arrayLength = inputArray.length+1;
        int[] outputArray = new int[arrayLength];
        int outputIncrementer = 0;
        int inputIncrementer = 0;
        int middle = (int) Math.floor(arrayLength / 2);
        //Loop through and copy
        while(outputIncrementer < arrayLength){
            if(outputIncrementer == middle) {
                outputArray[outputIncrementer] = inputNumber;
            }else{
                outputArray[outputIncrementer] = inputArray[inputIncrementer];
                inputIncrementer++;
            }
            outputIncrementer++;
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(outputArray));
        return outputArray;
    }
}
