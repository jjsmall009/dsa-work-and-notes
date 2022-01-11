/**
* A simple and iterative binary search tree implementation.

* Includes some basic functionality and some traversals and searching/sorting/etc.
**/
public class BinarySearchTree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    // Traverse the tree iteratively until you reach where you need to insert.
    // It uses a pointer to the most recently visited parent node in order to then
    // insert the new leaf node to either the left or right.
    public void insertNode(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (current.value < value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        if (parent.value < value) {
            parent.right = new Node(value);
        } else {
            parent.left = new Node(value);
        }
    }

    // Inorder traversal visits the left subtree, then the current node, and
    // then vists the right subtree.
    public void inorderTraversal() {


    }

    // Preorder traversal visits the current node, the left subtree, and then the right subtree.
    public void preorderTraversal() {

    }

    // Postorder visits the left, right, and then the current node.
    public void postorderTraversal() {

    }

    public void getRoot() {
        System.out.println(root.value);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insertNode(12);
        tree.insertNode(6);
        tree.insertNode(3);
        tree.insertNode(7);
        tree.insertNode(15);
        tree.insertNode(18);
        tree.insertNode(20);

        tree.getRoot();
    }
}