# Arrays - Notes

Ah the array, the simplest and most quintessential data structure of them all. 

Arrays store data sequentially and you can access specific elements in an array by using an index. Say you have 10 items in an array (and your programming language uses 0-based indexing), to access the first element you'd use `array[0]`, the second element `array[1]`, and so forth. Can't get much simpler than that. 

## Java Array Basics

Arrays in Java are pretty straightforward. Here's a few ways to declare an array.

```java
String[] names;
names = new String[5];
int[] myArray = new int[10];
int[] numbers = {1,2,3,4,5};
```

All arrays in Java are fixed in size. You can use `array.length` to get the number of elements that the array can hold.

## Array Based Problems and Explanations

### > Reversing an Array (ReverseArray.java)

Reversing an array is a common problem when it comes to learning data structures, though I'm not sure of too many real world use cases where you'd be doing it that often.

The two approaches I used are as follows:

1. **Out of place** - This version creates a new array and works backwards through the original to populate it. It uses an additional `O(n)` memory so it may not be the best if you're handling very large arrays.
2. **In place** - This second version is generally the better solution. It's just as fast but doesn't use any extra memory since is does it all in place. Using two pointers for the start and end of the array, walk through towards the middle and swap as you go. How neat!

Now, in a real world scenario you'd just use something like the built-in `Collections` package or thereabouts but that's not what this repo is about.

### > Nth Smallest Element (NthSmallest.java)

Given an array of distinct values return the Nth smallest element of the array (where `1 <= N <= Array.length`).

At first glance this problem seems pretty simple, and indeed it is just a few lines of code if you're not too concerned with performance (though it's still pretty fast). Here are a few ways to go about solving this problem.

1. **Sort It** - Sort the array and just return or get the Nth element from the sorted array. Most languages will have built-in sorting algorithms that are `O(n*log(n))` and thus be pretty good for most situations. But there are faster ways to go about it.
2. **Pivots / Quicksort Variation** - A more efficient solution is to realize that if you're going to try sorting the array then you only need to sort it until you are `N` elements sorted. There's no point in going beyond that because at that point you've already found what you're looking for. The code for this solution will have the nitty gritty details but on average it can be done in `O(n)` time, which is what the problem is looking for.
3. **Index Each Element** - This method uses an extra `O(n)` space so it's not ideal, but it's also very simple and clever. Since each element in the array is distinct by definition, we can scan through the array and put each element into a new array at index of its value. That is, if the value is 4 then put it into the array at index 4. Finally, just loop through the new array and find your N.
4. **Min/Max Heaps** - After working on this for awhile and seeing what other solutions were out there I came across some methods involving heaps. I'm super rusty on heaps so I'll probably come back later and work on it some more.
