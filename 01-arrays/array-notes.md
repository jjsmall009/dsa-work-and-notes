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
