/**
* A basic implementation of a single linked list.
*/

public class LinkedList{
    // A node is just a piece of data and a pointer to the next node in the chain
    private class Node {
        private int data;
        private Node next;

        public Node(int data, Node n) {
            this.data = data;
            this.next = n;
        }
    }

    public Node head;
    private int size;

    // For simplicity the only kind of linked list has at least one element in it
    public LinkedList(int data) {
        this.head = new Node(data, null);
        size += 1;
    }

    public void addFirst(int data) {
        head = new Node(data, head);
        size += 1;
    }

    public void addLast(int data) {
        Node p = head;

        while(p.next != null) {
            p = p.next;
        }

        p.next = new Node(data, null);
        size += 1;
    }

    // Deletes the first occurrence of the key, if found
    public void deleteNode(int key) {
        Node current = head;
        Node previous = null;

        // Edge case if the list has only 1 element
        if (current.next == null) {
            System.out.println("Cannot delete a node from a one element list");
            return;
        }

        // Edge case for if the head of the list is the key
        if (current.data == key && current.next != null) {
            head = current.next;
            return;
        }

        while (current != null) {
            if (current.data == key) {
                previous.next = current.next;
                size -= 1;
                return;
            } else {
                previous = current;
                current = current.next;
            }
        }
    }

    // Returns the index of the first matching value, if found
    public int searchList(int key) {
        Node current = head;
        int index = 0;

        while(current != null) {
            if (current.data == key) {
                return index;
            }
            index += 1;
            current = current.next;
        }

        return -1;
    }

    public void getHead() {
        System.out.println(this.head.data);
    }

    public int getSize() {
        return this.size;
    }

    public void printList() {
        Node p = head;

        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList myList = new LinkedList(12);
        myList.addFirst(8);
        myList.addFirst(2);
        myList.addFirst(6);
        myList.addLast(18);
        myList.addLast(27);

        myList.printList();
        int size = myList.getSize();
        System.out.println(size);

        myList.deleteNode(12);
        myList.printList();
        int size1 = myList.getSize();
        System.out.println(size1);

        System.out.println(myList.searchList(18));
    }
}