package midterm2;

public class MyLinkedList {

    private Node front;
    private Node back;
    private int size;

    /* Constructor */
    public MyLinkedList() {
    }

    /* Copy Constructor */
    /* Leave as exercise */
    public MyLinkedList(MyLinkedList copy) {
    }

    /*
     * 1. Draw a picture!!
     * 2. Think about the different cases
     * Empty list
     * List with one node
     * A huge list
     * Adding to the very end of the list
     */
    public void add(int value) {
    }

    /* Leave as exercise */
    public void add(int index, int value) {
    }

    public void clear() {
    }

    public boolean contains(int value) {
    }

    public int get(int index) {
    }

    /* Leave as exercise */
    public void remove(int index) {
    }

    public int size() {
    }

    public boolean isEmpty() {
    }

    @Override
    public String toString() {
    }

    @Override
    public boolean equals(Object obj) {
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
