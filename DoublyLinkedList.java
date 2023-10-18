import java.util.List;
public class DoublyLinkedList<E> {
    private int size = 0;
    private Node<E> headNode;
    private Node<E> tailNode;


    /**
     * Returns the node at the specified index in the list.
     *
     * @param index The index value of the node being retrieved.
     * @return The node being read.
     */
    public Node<E> getNode(int index) {
        Node<E> current = headNode;

        //Loops through to specified index.
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        return current;
    }

    /**
     * Returns the data at the specified index in the list.
     *
     * @param index The index value of the data being retrieved.
     * @return The data being read.
     */
    public E get(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<E> current = headNode;

        //Loops through to specified index.
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        return current.getData();
    }

    /**
     * Inserts an element to the end of the list.
     *
     * @param element The element being inserted into the list.
     */
    public void add(E element) {
        if (size == 0) {
            // If size is equal to 0, set both tail node and head node to the specified element.
            headNode =  new Node(element);
            headNode.setPreviousNode(null);
            headNode.setNextNode(null);
            tailNode = headNode;
        } else {
            //Otherwise, add it to the end of the list, replacing the existing tailNode.
            Node<E> temp = getNode(size - 1);
            tailNode = new Node<E>(element, temp, null);
            temp.setNextNode(tailNode);
            tailNode.setNextNode(null);
            tailNode.setPreviousNode(temp);
        }
        size++;
    }

    /**
     * Inserts an element into the list at the specified index, pushing the value already there to the next index.
     *
     * @param index The index to push the value into.
     * @param element The element being inserted into the list.
     */
    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if(size == 0) {
            //If the size is equal to 0, treat it the same as being added to the end using add().
            headNode =  new Node(element);
            headNode.setPreviousNode(null);
            tailNode = headNode;
        } else if (index == 0) {
            //If the index specified is 0, replace the headNode and attach new headNode to old headNode.
            Node<E> nw = new Node(element, null, headNode);
            headNode.setPreviousNode(nw);
            headNode = nw;
        } else if (index == size) {
            //If the index is specified at the end, replace the tailNode and set the previous value to old tailNode.
            Node<E> newN = new Node(element, tailNode, null);
            tailNode.setNextNode(newN);
            tailNode = newN;
        } else {
            //Otherwise, carry on as normal moving forward the specified index and connecting to the next value.
            Node<E> current = headNode;
            for (int i = 0; i < index; i++) {
                current = current.getNextNode();
            }
            Node<E> nw = new Node(element, current.getPreviousNode(), current);
            current.setPreviousNode(nw);
            current.setNextNode(nw);
        }
        size++;
    }

    /**
     * Removes the item at the specified index and reconnects the surrounding values to fill in the space.
     *
     * @param index The specific index to take the value out of.
     * @return The item that was just removed.
     */
    public E remove(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (size == 1) {
            // If there's only one element in the list, clear the list and return the data.
            E temp = headNode.getData();
            headNode = null;
            tailNode = null;
            size = 0;
            return temp;
        }

        if (index == 0) {
            // If removing the first element, update the headNode.
            E temp = headNode.getData();
            headNode = headNode.getNextNode();
            headNode.setPreviousNode(null);
            size--;
            return temp;
        }

        if (index == size - 1) {
            // If removing the last element, update the tailNode.
            E temp = tailNode.getData();
            tailNode = tailNode.getPreviousNode();
            tailNode.setNextNode(null);
            size--;
            return temp;
        }

        // Removing an element from the middle simply reconnects either side to each other.
        Node<E> curr = getNode(index);
        Node<E> next = curr.getNextNode();
        Node<E> prev = curr.getPreviousNode();

        next.setPreviousNode(prev);
        prev.setNextNode(next);
        size--;
        return curr.getData();
    }

    /**
     *
     * @return
     */
    public E remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }

        //Removes the value and connects the surrounding values to each other.
        E temp = tailNode.getData();
        tailNode = tailNode.getPreviousNode();
        tailNode.setNextNode(null);
        size--;
        return temp;
    }
    public E set(int index, E element) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        //Just change the value
        E temp = get(index); getNode(index).setData(element); return temp;
    }
    public String toString(){
        String s = "";
        Node<E> temp = headNode;
        //run through the list, add each value with a comma and space to the string.
        for (int i = 0; i < size; i++) {
            s += (temp.getData());
            if (i != size - 1) {
                s += ", ";
            }
            temp = temp.getNextNode();
        }
        return s;
    }
}
