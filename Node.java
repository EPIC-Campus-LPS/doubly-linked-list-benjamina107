/**
 * A value with a connection to a previous and next value.
 *
 * @param <E> The data type being used in the node.
 */
public class Node<E> {

    private Node<E> next;
    private Node<E> prev;
    public E item;


    /**
     * Creates a node with both connections set to null.
     *
     * @param dat The item being stored in the node.
     */
    public Node(E dat){
        item = dat;
        next = null;
        prev = null;
    }

    /**
     * Creates a node with two specified connections to next and previous values.
     *
     * @param dat The item being stored in the node.
     * @param n The next value connected to the node.
     * @param p The previous value connected to the node.
     */
    public Node(E dat,Node<E> n,Node<E> p){
        item = dat;
        next = n;
        prev = p;
    }

    /**
     * Creates the connection from current node to next.
     *
     * @param n The node being connected to.
     */
    public void setPreviousNode(Node n) {
        prev = n;
    }

    /**
     * Creates the connection from current node to previous.
     *
     * @param n The node being connected to.
     */
    public void setNextNode(Node n) {
        next = n;
    }

    /**
     * Gets the previous node that the current node is connected to.
     *
     * @return The previous node.
     */
    public Node getPreviousNode() { return prev; }

    /**
     * Gets the next node that the current node is connected to.
     *
     * @return The next node.
     */
    public Node getNextNode() { return next; }

    /**
     * Sets the value in the node to a new value.
     *
     * @param dat The value to be stored inside the node.
     */
    public void setData(E dat) {item = dat;}

    /**
     * Gets the value inside the node.
     *
     * @return The value inside the node.
     */
    public E getData() {return item;}

}
