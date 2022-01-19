/*
* Min Heap - Array based implementation
* A simple heap class that stores some integer values and maintains the smallest element as the root
*/
public class MinHeap {
    int[] heapArray;
    int currentSize;
    int capacity;

    // Default constructor - Initialize an empty heap for the specified capacity
    public MinHeap(int size) {
        this.capacity = size;
        this.heapArray = new int[this.capacity];
        this.currentSize = 0;
    }

    public int parentIndex(int currentIndex) {
        return (currentIndex - 1 ) / 2;
    }

    public int leftChildIndex(int currentIndex) {
        return (currentIndex * 2) + 1;
    }

    public int rightChildIndex(int currentIndex) {
        return (currentIndex * 2) + 2;
    }

    public void insert(int element) {

    }

    public void removeRoot() {

    }

    // After inserting a new element, see if we need to percolate it up the tree in orer
    // to maintain the heap property.
    public void swapUp() {

    }

    // After removing the root element, we need to put the next smallest element at the top.
    public void swapDown() {

    }


    public static void main(String[] args) {

    }
}