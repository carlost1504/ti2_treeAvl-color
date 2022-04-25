package model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class alvTree<T extends Comparable<T>> implements Iterable<T> {

    // The root node of the AVL tree.
    private Node root;
    private int nodeCount = 0;
    private Node TOKENNull = new Node(null);

    public int height() {
        if (root == null) return 0;
        return root.getHeight();
    }

    public int size() {
        return nodeCount;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int compareTo(){

        return 0;
    }














    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

}
