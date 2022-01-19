# Heaps - Notes

A heap is a tree type data structure that maintains the heap property. What is the heap property? Well, it can either be:

* Min-heap: For each parent node starting from the root, its value is less than/equal to either child.
* Max-heap: The same as above bit the value is greater than/equal to either child.

A heap is a kind of binary tree (since binary trees have really good insertion/deletion operations) that is also a **complete** binary tree.

* All levels are filled excepting the last level, and the last level is filled left to right.

By maintaining these constraints and invariants or whatever then the heap is a great data structure to use if you need to repeatedly find the min/max element for some sort of situation.

## Heap Implementation

Unlike other tree data structures with typically use a `Node` class a heap can be represented using a simple array. The first element in the array is the root of the tree, followed by its children, and so forth down the tree from left to right. Because arrays have constant lookup for a given index we can quickly find a nodes parent and/or children using some simple operations.

For any `i-th` node in the heap array we can represent the other nodes related to it with the following:

* Parent of node i: `A[(i - 1) / 2]`
* Left child of node i: `A[2i + 1]`
* Right child of node i: `A[2i + 2]`

## Heap Operationss

* **Insert** - Insertion works by adding the new element to the end of the array. From there we need a helper function `swapUp()` to maintain the heap property.
* **Remove** - This removes the root of the heap (first element in the array) and uses the helper function `swapDown()` to maintain the heap property.
* **swapUp** - After inserting a new element the the end of the array we may need to move it up the tree. Continually compare this element to its parent and swap it if needed (depending on if its a min or max heap).
* **swapDown** - After removing the root of the heap we need to set the next smallest/biggest element as the new root. To do this put the last element in the array as the root and then percolate down the heap until it is in the right spot. By continually swapping it down the tree, the next smallest element makes its way to the top.

There are some other helper functions for checking left nodes, getting certain indices, etc. Check the code for that.

## Heap Time Complexity

* Find min/max = `O(1)`. Constant time because the min/max is always at the top of the heap.
* Insertion = `O(logn)`. Since we insert a new node at the bottom of the tree, at worst we'll have to bubble it up to the very top and that is logarithmic.
* Removing the min/max = `O(logn)`. Same as insertion but we're moving from top to bottom instead.