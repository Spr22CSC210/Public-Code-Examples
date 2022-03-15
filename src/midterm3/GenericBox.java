package midterm3;

public class GenericBox<E> {

    private E item;

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
