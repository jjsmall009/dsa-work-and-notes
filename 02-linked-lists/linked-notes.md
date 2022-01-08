# Linked Lists - Notes

Much like an array a linked list is a linear data strcuture but with some better (and some worse) features. A linked list is dynamic and you can grow or shrink it on the fly.

## Linked List Basics

* **Nodes** - A link list is comprised of nodes, and each node has a piece of data and a pointer to the next node in the list.
* **Adding an element** - There are many ways to insert an element into the list, but the easy ways are either at the head or the tail. To insert at the head just make a new node and assign it to the head. As for inserting at the tail, loop through the list and once you get to the end add it.
* **Deleting an element** - To delete an element (say, the first occurrence of a value), maintain two pointers as you iterate through the list. A pointer for the current node and a pointer for the previous node. Once you get to the node to delete just set the previous nodes pointer to the current nodes next pointer and voila, the node is gone.

## Linked List Problems

### > Detecting Cycles

There are a few common ways to detect a loop in a linked list.

- **Hash table** - Traverse through the list and put each element into a hash table. If you get to an elemenet that's already in table then you have a cycle.
- **Two pointers** - Use two pointers, one fast and one slow. If the fast one is ever at the same node as the slow one then you have a cycle.

### > Removing duplicates

Use a hash set/map/etc. to store the values of nodes in the list. If you encounter a node that is already in the table then delete that node and move on.

### > Reverse a Linked List

### > Check if a list is a palindrome