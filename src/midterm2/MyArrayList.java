package midterm2;

public class MyArrayList {

    private static final int DEFAULT_SIZE = 10;
    private int[] array;
    private int size;

    public MyArrayList() {
        array = new int[DEFAULT_SIZE];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int value) {
        if (size >= array.length) {
            growArray();
        }
        array[size] = value;
        size++;
    }

    public void add(int index, Integer element) {
        if (size >= array.length) {
            growArray();
        }
        // TODO Auto-generated method stub

    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        // TODO Auto-generated method stub

    }

    public Integer get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public Integer set(int index, Integer element) {
        // TODO Auto-generated method stub
        return null;
    }

    public Integer remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    private void growArray() {

    }

}
