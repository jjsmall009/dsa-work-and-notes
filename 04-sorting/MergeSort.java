import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {8,5,65,23,11,3,35,88,15,29,28,7,14,1};

        System.out.println(Arrays.toString(data));

        mergeSort(data, 0, data.length - 1);

        System.out.println(Arrays.toString(data));
    }

    // Continually divide the input array in half until you reach the bottom (one element 
    // in the array). Then head back up merging as you go.
    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    // This method does the actual sorting. It merges the two sorted subarrays back
    // into one array
    public static void merge(int arr[], int start, int mid, int end) {
        int[] tempSorted = new int[end - start + 1];

        int i = start; // pointer for the left half of the array
        int j = mid + 1; //pointer for the right half of the array
        int k = 0; // pointer for the temp sorted array

        // Step through both sorted sub-arrays and place them into the temp array
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                tempSorted[k] = arr[i];
                k += 1; i += 1;
            }
            else {
                tempSorted[k] = arr[j];
                k += 1; j += 1;
            }
        }

        // Add in the remaining elements from either sub-array if needed
        while(i <= mid) {
            tempSorted[k] = arr[i];
            k += 1; i += 1;
        }
        while(j <= end) {
            tempSorted[k] = arr[j];
            k += 1; j += 1;
        }

        // Copy the sorted array back into the original array
        for(i = start; i <= end; i += 1) {
            arr[i] = tempSorted[i - start];
        }
    }
}