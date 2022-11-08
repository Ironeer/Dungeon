package graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Node<T> {
    private final T value;

    public static Node<Void> NONE = new Node<>(null);

    // dot allows for the definition of attributes for each node, these will be stored in this
    // PropertyBag
    private final PropertyBag attributes = new PropertyBag();

    private final ArrayList<Edge> edges = new ArrayList<>();

    /**
     * @return the attributes associated with this node
     */
    public PropertyBag getAttributes() {
        return attributes;
    }

    /**
     * @return an iterator for the edges in which this node is used
     */
    public Iterator<Edge> edgeIterator() {
        return edges.iterator();
    }

    /**
     * @param edge the edge in which this node is use d
     * @return true, if adding succeeded, false otherwise
     */
    public boolean addEdge(Edge edge) {
        return this.edges.add(edge);
    }

    /**
     * Constructor
     *
     * @param value the value to store in the node
     */
    public Node(T value) {
        this.value = value;
    }

    /**
     * @return the value stored in this node
     */
    public T getValue() {
        return this.value;
    }
}
