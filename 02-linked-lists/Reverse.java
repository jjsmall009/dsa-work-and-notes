public class Reverse {
    // Given the head of a linked list, reverse the list in place
    public Node IterativeReverse(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // The previous pointer is now at the end of the list and the new head
        head = previous;
        return head;
    }

    public static void main(String[] args) {
        // Create a linked list
        // Put some data in it
        // Call the function
        reversedList = IterativeReverse(head);

        printList(reversedList);

        // And that's it. The list is reversed.
    }
}