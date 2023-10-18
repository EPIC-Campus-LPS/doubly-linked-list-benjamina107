import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void getNode() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        int temp = list.getNode(1).getData();

        assertEquals(2, temp);
    }

    @Test
    void get() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        int temp = list.get(0) + list.get(2);

        assertEquals(4, temp);
    }

    @Test
    void add() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
    }

    @Test
    void testAdd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);

        int temp = list.get(1) + list.get(2);

        assertEquals(6, temp);
    }

    @Test
    void remove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove();

        int temp = list.remove();

        assertEquals(2, temp);
    }

    @Test
    void testRemove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(0);

        int temp = list.remove(0) + list.remove();

        assertEquals(6, temp);
    }

    @Test
    void set() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.set(3, 9);

        assertEquals(9, list.get(3));
    }

    @Test
    void tostring() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        String print = list.toString();

        assertEquals("1, 2, 3, 4", print);
    }
}