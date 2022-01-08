# Linked Lists - Notes

Much like an array a linked list is a linear data strcuture but with some better (and some worse) features. A linked list is dynamic and you can grow or shrink it on the fly.

## Linked List Basics

* **Nodes** - A link list is comprised of nodes, and each node has a piece of data and a pointer to the next node in the list.
* **Adding an element** - There are many ways to insert an element into the list, but the easy ways are either at the head or the tail. To insert at the head just make a new node and assign it to the head. As for inserting at the tail, loop through the list and once you get to the end add it.
* **Deleting an element** - To delete an element (say, the first occurrence of a value), maintain two pointers as you iterate through the list. A pointer for the current node and a pointer for the previous node. Once you get to the node to delete just set the previous nodes pointer to the current nodes next pointer and voila, the node is gone.

## Linked List Problems

### > Detecting Cycles (Cycles.java)

There are a few common ways to detect a loop in a linked list.

* **Hash table** - Traverse through the list and put each element into a hash table. If you get to an elemenet that's already in table then you have a cycle.
* **Two pointers** - Use two pointers, one fast and one slow. If the fast one is ever at the same node as the slow one then you have a cycle.

### > Removing duplicates

Use a hash set/map/etc. to store the values of nodes in the list. If you encounter a node that is already in the table then delete that node and move on.

### > Reverse a Linked List (Reverse.java)

An in place, no frills reversal is pretty straightfoward. All you need to do is reverse the direction of each pointer in the list? How to accomplish that?

* Maintain three pointers for the previous, current, and next nodes.
* Step through the list and set `current.next` to `previous`and then increment to the next nodes.

Doing it iteratively and in-place takes `O(n)` time (since we traverse the entire list) and `O(1)` extra space.

### > Check if a list is a palindrome
