import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void getNode() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Create a list of 3 items.
        list.add(1);
        list.add(2);
        list.add(3);

        //Test for the second node.
        int temp = list.getNode(1).getData();

        assertEquals(2, temp);
    }

    @Test
    void get() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Create a list of 3 items.
        list.add(1);
        list.add(2);
        list.add(3);

        //Add together the first and third values.
        int temp = list.get(0) + list.get(2);

        assertEquals(4, temp);
    }

    @Test
    void add() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Create a list of 3 items.
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
    }

    @Test
    void testAdd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Make a list of 3 values and add a new one into the second spot (first index).
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);

        //Add new inserted value to another value.
        int temp = list.get(1) + list.get(2);

        assertEquals(6, temp);
    }

    @Test
    void remove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Make a list of 3 values and take out the last one.
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove();

        //Take out the new last value.
        int temp = list.remove();

        assertEquals(2, temp);
    }

    @Test
    void testRemove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Create a list, remove the first value.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(0);

        //Get the new first and last value and add them together.
        int temp = list.remove(0) + list.remove();

        assertEquals(6, temp);
    }

    @Test
    void set() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        //Create a list of numbers and set the last one to 9.
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

        //Create a list of 4 numbers to be made into a string separated by commas.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        String print = list.toString();

        assertEquals("1, 2, 3, 4", print);
    }
}