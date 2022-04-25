package model;

public class Node  {

    private int bf;
    private NodePerson value;
    private int height;
    private Node left, right;

    public Node(NodePerson value) {
        this.value = value;
    }

    public int getBf() {
        return bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
