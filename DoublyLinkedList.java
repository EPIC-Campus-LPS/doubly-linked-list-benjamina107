public class DoublyLinkedList<E> {

    private int size = 0;
    private Node<E> headNode;
    private Node<E> tailNode;

    public E get(int index, boolean a) {
        //a means if true then return the node if false return value
        Node<E> current = headNode;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }

    }

    public void add(E element) {
        if (size == 0) {
            headNode =  new Node(element);
            headNode.setPreviousNode(null);
            tailNode = headNode;
        } else {
            Node<E> newN = new Node(element, tailNode, null);
            tailNode.setNextNode(newN);
            tailNode = newN;
        }
        size++;
    }

    public void add(int index, E element) {
        if(size == 0) {
            headNode =  new Node(element);
            headNode.setPreviousNode(null);
            tailNode = headNode;
        } else if (index == 0) {
            Node<E> nw = new Node(element, null, headNode);
            headNode.setPreviousNode(nw);
            headNode = nw;
        } else if (index == size) {
            Node<E> newN = new Node(element, tailNode, null);
            tailNode.setNextNode(newN);
            tailNode = newN;
        } else {
            Node<E> current = headNode;
            for (int i = 0; i < index; i++) {
                current = current.getNextNode();
            }
            Node<E> nw = new Node(element, current.getPreviousNode(), current);
            current.setPreviousNode(nw);
            nw.getNextNode().setNextNode(nw);
        }
        size++;
    }

    public E remove(int index) {

    }

    public E remove() {}

    public E set() {}

    public String tostring(){}
}
