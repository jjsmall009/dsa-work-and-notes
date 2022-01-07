/**
* A simple implemenation of reversing an integer array. There is both an in-place and out of
* place version and an array printing helper function.
**/
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {9, 2, 15, 2, 22, 10, 6, 1, 2, 3, 5};

        int[] reversed1 = reversed(numbers);
        printArray(reversed1);

        nPlaceReversed(numbers);
        printArray(reversed2);

    }

    // Work backwards through the given array and populate the new one
    public static int[] reversed(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = 1; i <= arr.length; i++) {
            reversed[i - 1] = arr[arr.length - i];
        }

        return reversed;
    }

    // Use two pointers to traverse from both ends, swapping as we go
    public static void inPlaceReversed(int[] arr) {
        int start_index = 0;
        int end_index = arr.length - 1;

        while (start_index < end_index) {
            int temp = arr[start_index];
            arr[start_index] = arr[end_index];
            arr[end_index] = temp;
            start_index++;
            end_index--;
        }
    }

    public static void printArray(int[] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}