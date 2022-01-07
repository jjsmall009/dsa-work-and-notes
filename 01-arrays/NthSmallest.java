/**
* Given an array and a value n (that's no bigger than the length of the array) find
* the nth smallest element in the array.

* Each array value <= 100,000
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

    // Since each value in the array is unique and we know that maximum value of each element,
    // we can use each value as an index in a new array and use extra space but get it done
    // in O(n) time.
    public static int IndexTheValues(int[] arr, int k) {
        int[] sorted = new int[100000];
        int result = -1;

        for(int x: arr) {
            sorted[x] = x;
        }

        int counter = 0;
        for(int x: sorted) {
            if (x != 0) {
                counter += 1;
                if (counter == k) {
                    result = x;
                    break;
                }
            }
        }
        return result;
    }

    public static int QuickPivotSortThing(int[] arr, int k) {
        return -1;
    }
}