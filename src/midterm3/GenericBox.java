package midterm3;

import org.w3c.dom.Node;

public class GenericBox<E> {

    private E item;

    private Node front;

    public GenericBox(E item) {
        this.item = item;
    }

    public E get() {
        return item;
    }

    public void put(E item) {
        this.item = item;
    }

    public String toString() {
        return "This box contains: " + item;
    }

}
