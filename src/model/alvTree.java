package model;

import java.util.*;
public class alvTree  {

    // The root node of the AVL tree.
    private Node root;
    private int nodeCount = 0;
    private Node newNode;
    private Node TOKENNull = null;

    public alvTree(Node newNode) {
        this.newNode = newNode;
    }

    public int height() {
        if (root == null) return 0;
        return root.getHeight();
    }

    public void addRoot(){
        if(root==null){
            root=newNode;
            System.out.println("se crea raiz");
        }else{
            System.out.println("se agrega hojas");
            Node newRoot = addsheets(root, newNode);

        }
    }

    public Node addsheets(Node node,Node nodeNew){

        int r1= nodeNew.compareTo(node);

        // Insert node in left subtree.
        if (r1 < 0) {
            Node newLeftNode = addsheets(node.getLeft(), nodeNew);
            if (newLeftNode == TOKENNull) {
                return TOKENNull;
            }
            node.setLeft(newLeftNode);

        // Insert node in right subtree.
        } else if (r1 > 0) {
            Node newRightNode = addsheets(node.getRight(), nodeNew);
            if (newRightNode == TOKENNull){
                return TOKENNull;
            }
            node.setRight(newRightNode);


        // Return 'TOKEN' to indicate a duplicate value in the tree.
        } else{
            return TOKENNull;
        }
        update(node);

        return balance(node);
    }

    public void update(Node node) {

        int leftNodeHeight  = (node.getLeft()  == null) ? -1 : node.getLeft().getHeight();
        int rightNodeHeight = (node.getRight() == null) ? -1 : node.getRight().getHeight();

        node.setHeight(1 + Math.max(leftNodeHeight, rightNodeHeight));
        node.setBf(rightNodeHeight - leftNodeHeight);
    }

    public Node balance(Node node){

        if (node.getBf()==-2){
            if (node.getLeft().getBf()<=0){
                return leftLeftCase(node);
            }else {
                return rightLeftCase(node);
            }
        }

        return node;
    }
    public Node leftLeftCase(Node node) {
        return rightRotation(node);
    }

    private Node rightRightCase(Node node) {
        return leftRotation(node);
    }

    private Node rightLeftCase(Node node) {
        node.setRight(rightRotation(node.getRight()));
        return rightRightCase(node);
    }
    private Node leftRotation(Node node) {
        Node newParent = node.getRight();
        node.setRight(newParent.getLeft());
        newParent.setLeft(node);
        update(node);
        update(newParent);
        return newParent;
    }

    private Node rightRotation(Node node) {
        Node newParent = node.getLeft();
        node.setLeft(newParent.getRight());
        newParent.setRight(node);
        update(node);
        update(newParent);
        return newParent;
    }

    public boolean remove(Node elem) {

        Node newRoot = remove(root, elem);
        boolean removedNode = (newRoot != TOKENNull) || (newRoot == null);
        if (removedNode) {
            root = newRoot;
            nodeCount--;
            return true;
        }
        return false;
    }

    private Node remove(Node node, Node elem) {

        if (node == null) return TOKENNull;

        int cmp = elem.compareTo(node);


        if (cmp < 0) {
            Node newLeftNode = remove(node.getLeft(), elem);
            if (newLeftNode == TOKENNull) return TOKENNull;
            node.setLeft(newLeftNode);


        } else if (cmp > 0) {
            Node newRightNode = remove(node.getRight(), elem);
            if (newRightNode == TOKENNull) return TOKENNull;
            node.setRight(newRightNode);

        } else {

            if (node.getLeft() == null) {

                Node rightChild = node.getRight();
                node.setValue(null);
                node = null;
                return rightChild;

            } else if (node.getRight() == null) {

                Node leftChild = node.getLeft();
                node.setValue(null);
                node = null;

                return leftChild;


            } else {

                Node tmp = findMin(node.getRight());
                node.setValue(tmp.getValue());
                Node newRightNode = remove(node.getRight(), tmp);

                if (newRightNode == TOKENNull) {
                    return TOKENNull;
                }
                node.setRight(newRightNode);
            }
        }
        update(node);
        return balance(node);
    }
        private Node findMin (Node node) {
            while(node.getLeft() != null){
                node = node.getLeft();
            }
            return node;
        }

        private Node findMax(Node node) {
            while(node.getRight() != null){
                node = node.getRight();
            }
            return node;
        }
}
