package midterm2;

public class Tester {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list);

        MyArrayList two = new MyArrayList();
        two.add(2);
        two.add(4);
        two.add(6);
        System.out.println(list.equals(two));
    }

}
