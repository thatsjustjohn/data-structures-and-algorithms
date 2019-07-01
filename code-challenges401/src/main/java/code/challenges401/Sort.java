package code.challenges401;

import org.apache.commons.math3.exception.NullArgumentException;

public class Sort {
    // This function performs insertion sort on an array of ints.
    public static int[] insertionSort(int[] arr){
        // Cannot call .length on null, this addresses passing in a null object
        if(arr == null) throw new NullArgumentException();
        // Loop through the array starting at the 1 index.
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            // Reverse loop to insert in the correct location
            while(j >= 0 && arr[j] > temp){
                // Shift j to the left.
                arr[j+1] = arr[j];
                j = j - 1;
            }
            // Insert temp when we are at the front of the list
            // Or the thing currently in front is smaller than what we are inserting.
            arr[j+1] = temp;
        }
        // Return the sorted array
        return arr;
    }
}
