/**
* Given an array and a value n (that's no bigger than the length of the array) find
* the nth smallest element in the array.

* Time complexity = O(n)
* Extra space = O(1)
*/
import java.util.Arrays;

public class NthSmallest {
    public static void main(String[] args) {
        int[] numbers = {8,5,15,3,7,75,1,2,8,11,23,18};
        int k = 4;

        int result1 = SimpleButNaive(numbers, k);
        System.out.println(result1); // result = 5
        
    }

    // The simplest approach is to sort the array and grab the kth element from it.
    // However this is most likely O(nlog(n)) and thus not as fast as it could be.
    public static int SimpleButNaive(int[] arr, int k) {
        Arrays.sort(arr);

        return arr[k - 1];
    }

    public static int QuickPivotSortThing(int[] arr, int k) {
        return -1;
    }
}