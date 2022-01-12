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
        Node current = this.root;
        inorderHelper(current);
    }

    private void inorderHelper(Node current) {
        if (current != null) {
            inorderHelper(current.left);
            System.out.print(current.value + " ");
            inorderHelper(current.right);
        }
    }

    public void iterativeInorder() {
        Stack<Node> stack = new Stack<>();
        Node current = this.root;

        while(current != null || !stack.isEmpty()) {
            // Go as far left as we can
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }
    }

    // Preorder visits the current node, then the left subtree, and finally the right subtree
    public void preorderTraversal() {
        Node current = this.root;
        preorderHelper(current);
    }

    private void preorderHelper(Node current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preorderHelper(current.left);
            preorderHelper(current.right);
        }
    }   

    // Use a stack to do the stuff 
    public void iterativePreorder() {
        Stack<Node> stack = new Stack<>();

        stack.push(this.root);
        while(!stack.isEmpty()) {
            Node current = stack.pop();

            if (current != null) {
                System.out.print(current.value + " ");
                stack.push(current.right);
                stack.push(current.left);
            }
        }
    }

    // Postorder visits the left, right, and then the current node.
    public void postorderTraversal() {
        Node current = this.root;
        postorderHelper(current);
    }

    private void postorderHelper(Node current) {
        if (current != null) {
            postorderHelper(current.left);
            postorderHelper(current.right);
            System.out.print(current.value + " ");
        }
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
        tree.insertNode(17);
        tree.insertNode(20);

        tree.getRoot();

        tree.inorderTraversal();
        System.out.println();
        tree.preorderTraversal();
        System.out.println();
        tree.postorderTraversal();
    }
}