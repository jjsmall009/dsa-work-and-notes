public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,8,13,15,17,34,56,69,87,99,145,234,555};

        int result = binarySearch(arr, 13);
        System.out.println(result);

    }

    // Given an array of integers and a value to kind, search the array 
    // and return the index of the key if found
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }

        return -1;
    }
}