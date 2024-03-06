public class MinValueInArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 5, 8, 3, 15, 7};

        // Find the minimum value
        int minValue = findMinValue(numbers);

        // Print the minimum value
        System.out.println("The minimum value in the array is: " + minValue);
    }

    // Function to find the minimum value in an array
    public static int findMinValue(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Assume the first element as the minimum
        int min = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is less than the minimum, update the minimum
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
