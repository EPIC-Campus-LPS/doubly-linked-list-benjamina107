public class Node<E> {

    private Node<E> next;
    private Node<E> prev;
    public E item;

    public Node(E dat){
        item = dat;
        next = null;
        prev = null;
    }

    public Node(E dat,Node n,Node p){
        item = dat;
        next = n;
        prev = p;
    }

    public void setPreviousNode(Node n) {
        prev = n;
    }

    public void setNextNode(Node n) {
        next = n;
    }

    public Node getPreviousNode() { return prev; }

    public Node getNextNode() { return next; }

    public void setData(E dat) {item = dat;}
    public E getData() {return item;}

}
