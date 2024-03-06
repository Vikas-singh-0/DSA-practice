/**
 * Array
 */
public class Array {
    public static void printArray(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.printf(" " + arr[i]);
        }
    }
    public static int[] reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        // possible ways to create arrays in java
        int[] myArray1 = new int[] {1,4,5,2,7,5,75,6};
        printArray(myArray1);
        myArray1 = reverseArr(myArray1);
        printArray(myArray1);
    }
}