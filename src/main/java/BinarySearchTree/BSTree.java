package BinarySearchTree;

/**
 * Created by Boobesh S on 9/3/2016.
 */
public class BSTree<T extends Comparable<T>> {
    private Node<T> head;

    public BSTree(T data) {
        this.head = new Node<T>(data);
    }

    public BSTree() {
        head = null;
    }

    public boolean insert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            return true;
        } else {
            Node<T> current = head;
            Node<T> parent = null;
            while (true) {
                parent = current;
                if (current.compareTo(data) > 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return true;
                    }
                } else if (current.compareTo(data) < 0) {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return true;
                    }
                } else
                    return false;
            }
        }
    }


    public int countNoOfNodes() {
        return countNoOfNodesWithHead(head);
    }

    private int countNoOfNodesWithHead(Node root) {
        if (root == null) return 0;
        return countNoOfNodesWithHead(root.getLeft()) + 1 + countNoOfNodesWithHead(root.getRight());
    }


    public void display() {
        System.out.println("The elements in the tree (in ascending order) ....");
        displayWithHead(head);
    }

    private void displayWithHead(Node root) {
        if (root == null)
            return;
        displayWithHead(root.getLeft());
        System.out.println(root.getData());
        displayWithHead(root.getRight());
    }

    public boolean find(T data) {
        return findAnElement(head, data);
    }

    private boolean findAnElement(Node root, T data) {
        if (root == null)
            return false;
        if (root.getData().compareTo(data) == 0)
            return true;
        return findAnElement(root.getLeft(), data) || findAnElement(root.getRight(), data);
    }

}
