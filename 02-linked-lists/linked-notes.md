# Linked Lists - Notes

Much like an array a linked list is a linear data strcuture but with some better (and some worse) features. A linked list is dynamic and you can grow or shrink it on the fly.

## Linked List Basics

* **Nodes** - A link list is comprised of nodes, and each node has a piece of data and a pointer to the next node in the list.
* **Adding an element** - There are many ways to insert an element into the list, but the easy ways are either at the head or the tail. To insert at the head just make a new node and assign it to the head. As for inserting at the tail, loop through the list and once you get to the end add it.
* **Deleting an element** - To delete an element (say, the first occurrence of a value), maintain two pointers as you iterate through the list. A pointer for the current node and a pointer for the previous node. Once you get to the node to delete just set the previous nodes pointer to the current nodes next pointer and voila, the node is gone.

## Linked List Problems

### > Detecting Loops

### > Removing duplicates

### > Reverse a Linked List

### > Check if a list is a palindrome