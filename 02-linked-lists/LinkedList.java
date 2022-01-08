/**
* A basic implementation of a single linked list.
 */

public class LinkedList{
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;

    public LinkedList(int data) {
        this.head = new Node(data);
    }

    public void addFirst(int data) {

    }

    public void addLast(int data) {
        
    }

    public void getHead() {
        System.out.println(this.head.data);
    }

    public static void main(String[] args) {
        myList = new LinkedList(12);
        myList.getHead();
    }
}