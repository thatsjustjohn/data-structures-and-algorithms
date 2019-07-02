package code.challenges401;

import org.apache.commons.math3.exception.NullArgumentException;

import java.util.Arrays;

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

    // This function gets called recursively to divide up the array
    public static int[] mergeSort(int[] arr){
        // Cannot call .length on null, this addresses passing in a null object
        if(arr == null) throw new NullArgumentException();

        int arrayLength = arr.length;
        // If the length is bigger than 1 divide
        if(arrayLength > 1){
            // Merge sort on the left half
            int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, arrayLength/2));
            // Merge sort on the right half
            int[] rightArr = mergeSort(Arrays.copyOfRange(arr, arrayLength/2, arrayLength));
            // Merge the 2 half arrays back into original
            merge(leftArr, rightArr, arr);
        }

        // Return combine array
        return arr;
    }

    // Private method to merge 2 arrays into a bigger array in sorted order.
    private static int[] merge(int[] leftArr , int[] rightArr, int[] arr){
        // Declare indexes
        int i = 0;
        int j = 0;
        int k = 0;
        // While i and j aren't at the end
        while(i < leftArr.length && j < rightArr.length){
            // If the index of left array is less than the right.. add left to the big array
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{ // If the index of the right is less than the left.. add right to the big array
                arr[k] = rightArr[j];
                j++;
            }
            k++;
            // Finish copying contents of the other array when one of the smaller arrays has finished looping
            if(i == leftArr.length) System.arraycopy(rightArr, j, arr, k, rightArr.length);
            else System.arraycopy(leftArr, i, arr, k, leftArr.length);
        }
        // Return the combine sorted array
        return arr;
    }
}