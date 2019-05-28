import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {
        // create the array to test your code on later
        int[] startArr = new int[] {1,2,3,4,5,10};
        // print it out, nicely
        System.out.println(Arrays.toString(startArr));
        // call your reverseArray method and save the result in a variable
        int[] endArr = reverseArray(startArr);
        // print out the result, nicely
        System.out.println(Arrays.toString(endArr));
        // Uncomment to Execute the line below to run tests
        //test();
    }

    // the method you should write, to reverse an array
    public static int[] reverseArray(int[] inputArray) {
        // your code goes here!
        int end = inputArray.length;
        int middle = end / 2;
        int front = 0;
        end--;
        while(front < middle){
            int temp = inputArray[front];
            inputArray[front] = inputArray[end];
            inputArray[end] = temp;
            front++;
            end--;
        }
        // for now, to make sure that it compiles, here is a bad answer
        return inputArray;
    }

    public static void test(){
        int[] testArray1 = new int[] {1, 2, 3, 4, 5, 6};
        int[] testArray2 = new int[] {89, 2354, 3546, 23, 10, -923, 823, -12};
        int[] testArray3 = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

        int[] testOutputArray1 = new int[] {6, 5, 4, 3, 2, 1};
        int[] testOutputArray2 = new int[] {-12, 823, -923, 10, 23, 3546, 2354, 89};
        int[] testOutputArray3 = new int[] {199, 197, 193, 191, 181, 179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2};

        System.out.printf("Test1 Pass: %b\n", Arrays.equals(reverseArray(testArray1), testOutputArray1));
        System.out.printf("Test2 Pass: %b\n", Arrays.equals(reverseArray(testArray2), testOutputArray2));
        System.out.printf("Test3 Pass: %b\n", Arrays.equals(reverseArray(testArray3), testOutputArray3));

    }
}