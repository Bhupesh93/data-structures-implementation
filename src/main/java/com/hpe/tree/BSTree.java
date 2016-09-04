package com.hpe.tree;

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
        if (root.compareTo(data) == 0)
            return true;
        return findAnElement(root.getLeft(), data) || findAnElement(root.getRight(), data);
    }

    public boolean delete(T data) {
        Node parent = head;
        Node current = head;
        boolean isLeftChild = false;
        while (current != null && current.compareTo(data) != 0) {
            parent = current;
            if (current.compareTo(data) > 0) {
                isLeftChild = true;
                current = current.getLeft();
            } else if (current.compareTo(data) < 0) {
                current = current.getRight();
                isLeftChild = false;
            }
        }

        //System.out.println("The parent "+parent.getData() + " flag "+isLeftChild+ " current " +current.getData() +current.getLeft() +current.getRight());

        if (current == null)
            return false;

        if (current.getLeft() == null && current.getRight() == null) {
            if (head == current) {
                head = null;
                return true;
            } else if (isLeftChild) {
                parent.setLeft(null);
            } else if (!isLeftChild) {
                parent.setRight(null);
            }
            return true;
        } else if (current.getLeft() == null) {
            if (head == current) {
                head = current.getRight();
            } else if (isLeftChild) {
                parent.setLeft(current.getRight());
            } else if (!isLeftChild) {
                parent.setRight(current.getRight());
            }
            return true;
        } else if (current.getRight() == null) {
            if (head == current) {
                head = current.getLeft();
            } else if (isLeftChild) {
                parent.setLeft(current.getLeft());
            } else if (!isLeftChild) {
                parent.setRight(current.getLeft());
            }
            return true;
        } else if (current.getRight() != null && current.getLeft() != null) {
            Node successor = getSuccessor(current);
            if (head == current) {
                head = successor;
            } else if (isLeftChild) {
                parent.setLeft(successor);

            } else {
                parent.setRight(successor);
            }
            successor.setLeft(current.getLeft()); //dont forget
            return true;
        }
        return false;
    }

    public Node getSuccessor(Node deleteNode) {
        Node successor = null;
        Node successorParent = null;

        Node current = deleteNode;
        current = current.getRight();
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
        }

        if (deleteNode.getRight() != successor) {
            successorParent.setLeft(successor.getRight());
            successor.setRight(deleteNode.getRight());
        }

        return successor;
    }


}
