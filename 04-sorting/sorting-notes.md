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

## Merge Sort

## Quick Sort

## Radix Sort
