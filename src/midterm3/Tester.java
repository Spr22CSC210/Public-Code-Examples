package midterm3;

public class Tester {

    public static void main(String[] args) {
        Double x = 6.7;
        GenericBox<Double> box = new GenericBox<>(x);
        System.out.println(box);
        box.put(72.345);
        System.out.println(box);
        Double y = box.get() + 78.2345456;
    }

}
