# Binary Search and Binary Search Trees - Notes

Binary search and binary search trees are pretty closely related so this section will involve both
of them.

## Binary Search Basics

The binary search is one of the fastest searching algorithms, albeit it only works if your data
is sorted already. But since the data is sorted you can do the following to quickly search in
`O(log(n))` time.

1. Find the middle of the array.
2. If the value you're looking for is less than the middle value, search the left side. Else search
the right side.
3. Repeat until you find what you're looking for.

Since you're dividing the array in half in each iteration of the search it ends up being very quick
regardless of how big the input is.

## Binary Search Tree Basics
