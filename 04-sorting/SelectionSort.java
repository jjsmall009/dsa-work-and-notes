import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {8,5,65,23,11,3,35,88,15,29,28,7,14,1};

        System.out.println(Arrays.toString(data));

        selectionSort(data);

        System.out.println(Arrays.toString(data));
    }

    public static void selectionSort(int[] arr) {
        // By using a pointer to the index of smallest number for the current pass through
        // the array, you only have to swap elements once per loop instead of every time
        // you come across a smaller number.
        int min_index = -1;
        for(int i = 0; i < arr.length - 1; i ++) {
            min_index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // Swap the smallest element in the section of the array that is not sorted
            // with the end of the sorted section of the array.
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}