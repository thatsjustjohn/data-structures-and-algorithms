package code.challenges401;

public class BinarySearch {
    public int binarySearch(int[] inputArray, int searchKey){
        // Setup variables
        int high = inputArray.length - 1;
        int low = 0;
        int mid = 0;
        // Loop through array and find item
        while(low <= high){
            mid = high == low ? high : (high + low)/2;
            if(inputArray[mid] == searchKey) return mid;
            if(inputArray[mid] > searchKey) high = mid - 1;
            else low = mid + 1;
        }
        // Return -1 if not found
        return -1;
    }
}
