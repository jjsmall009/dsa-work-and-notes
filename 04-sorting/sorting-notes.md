# Sorting Algorithms - Notes

You can't talk about data structures and algorithms without going over sorting algorithms. There's a lot of them out there but only a few come up in normal day to day programming (when you're not using a languages built in sorting of course).

## Selection Sort

Selection sort works by repeatedly iterating through the array, finding the smallest element, and swapping it with the left most element that hasn't been sorted yet.

You can really think of it as having two sub-arrays, where the left sub-array is sorted and the right sub-array is unsorted. We can implement this by using for loops and as we increment the outer for loop whatever is to the left of that index in the iteration is in fact sorted.

1. Create a variable `min_index` that is the pointer for the outer array.
2. Loop through the rest of the array and find the smallest value.
3. Swap that value with the value at `min_index` (the left most element).
4. Increment to the next element in the list.
5. Repeat until the end of the array and list is sorted.

**Time complexity** - In order to find the smallest element for each iteration, at worst you'd have to search the entire array. (n-1) + (n-2) +.... 1 = some math and ends up being `O(n^2)`. Generally when you have nested loops and have to scan the array multiple times you end up with that.

## Insertion Sort

Insertion sort works by iterating through an array and for each element, compare it to every other element in the array and inserting it where it belongs.

Just like selection sort we consider the array having two parts; a sorted and unsorted sub-array. The first element in the array is sorted (since it's only 1 number long). Then go to the next element and compare it to each previous element. Work backwards and as long as the current element is less than any other element in the sorted part keep track of the index and insert it where it belongs.

**Time complexity** - Since we're comparing each element in the array to a subset of every other element in the array (at worst), this will take `O(n^2)` time. There are `n` comparisons and `n` swaps, you get `n*n` and that's pretty slow compared to better sorting algorithms.

## Merge Sort

Merge sort is a top tier sorting algorithm and you'll see why later. To implement merge sort:

1. Recursively divide the starting array into smaller and smaller arrays until each array is one element long.
2. Merge each sub-array into one another as you go back up the chain until there's one left and then you'll have a sorted array.

In a slightly more verbose way:

1. Find the midpoint of the array.
2. Call mergeSort on the left sub-array.
3. Call mergeSort on the right sub-array.
4. Merge the two halves from the previous steps.

**Time complexity** - This divide and conquer approach is pretty fast because of some properties.

* Repeatedly dividing an array in half takes `O(logn)` time.
* Merging two arrays takes `O(n)` time because you only have to iterate through the arrays once to merge them together.

Thus the total time complexity is `O(n*logn)`, which beats the previous two sorting algorithms. There's some overhead from doing recursive calls but for the most part it's still very efficient.

## Quick Sort

## Radix Sort
