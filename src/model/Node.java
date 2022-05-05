package model;

public class Node implements Comparable<Node>  {

    private int bf;
    private NodePerson value;
    private int height;
    private Node left, right;
    private String key;

    public Node(NodePerson value,String key) {
        this.key=key;
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

    public NodePerson getValue() {
        return value;
    }

    public void setValue(NodePerson value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    @Override
    public int compareTo(Node o) {
        int salida;
        if(o.getKey().compareTo(this.key)==0){
            salida = 0;
        }else if(o.getValue().getCodigo().compareTo(this.value.getCodigo())>0){
            salida = -1;
        }else salida=1;
        return 0;
    }
}
