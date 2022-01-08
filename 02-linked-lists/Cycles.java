/**
* Various ways of detecting a cycle in a linked list.
*
* Note - this won't actually compile and it's more of an example than functioning code.
 */

public class Cycles {
    public static void main(Strings[] args) {
        // Create a list
        // Add a cycle
        cycle = TwoPointers(list);
        System.out.println("Does the list have a cycle? " + cycle);
    }

    // Maintain a slow and fast pointer to traverse the list. If the fast pointer is ever
    // at the same spot as the slow pointer then you have a cycle.
    public boolean TwoPointers(LinkedList list) {
        Node head = list.getHead();
        
        if (head == null || head.next == null) {
            return false;
        }

        Node fast = head.next;        
        while (fast != null && fast.next != null) {
            if (head == fast) {
                return true;
            } else {
                head = head.next;
                fast = fast.next.next;
            }
        }
        return false;
    }

    // Store each node in the list in a hash set. If a node is already in the table when
    // you check another one then you have a cycle.
    public boolean DetectCycleWithHash(LinkedList list) {
        HashSet<Node> set = new HashSet<Node>();
        Node current = list.getHead();

        while (current != null) {
            if (set.contains(current)) {
                return true;
            }

            set.add(current);
            current = current.next;
        }

        return false;
    }
}