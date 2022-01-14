import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {8,5,65,23,11,3,35,88,15,29,28,7,14,1};

        System.out.println(Arrays.toString(data));

        insertionSort(data);

        System.out.println(Arrays.toString(data));
    }

    // Compare each element in the array to every previous element, do some swaps, and
    // you'll end up with a sorted array that runs in O(n^2) time.
    public static void insertionSort(int[] arr) {
f       for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > value) {
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = value;
        }
    }
}