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

    public boolean hasParent(int currentIndex) {
        if (currentIndex > 0)
            return true;
        else
            return false;
    }

    // Add the new element to the end of the array and swap upwards
    public void insert(int element) {
        this.heapArray[currentSize] = element;
        this.currentSize += 1;
        swapUp(this.currentSize - 1);
    }

    public void removeRoot() {

    }

    // After inserting a new element, see if we need to percolate it up the tree in orer
    // to maintain the heap property.
    public void swapUp() {
        while (hasParent(i)) {
            int pIndex = parentIndex(i);
            if (this.heapArray[i] < this.heapArray[pIndex]) {
                    int tmp = this.heapArray[pIndex];
                    this.heapArray[pIndex] = this.heapArray[i];
                    this.heapArray[i] = tmp;
            }
            i = pIndex;
        }
    }

    // After removing the root element, we need to put the next smallest element at the top.
    public void swapDown() {

    }

    public void printHeap() {
        for(int i = 0; i < this.currentSize; i++) {
            System.out.print(this.heapArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap myHeap = new MinHeap(10);

        myHeap.insert(6);
        myHeap.insert(10);
        myHeap.insert(8);
        myHeap.insert(7);
        myHeap.printHeap();
        myHeap.insert(3);
        myHeap.printHeap();
    }
}