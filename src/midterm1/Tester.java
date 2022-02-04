package midterm1;

public class Tester {

    public static void main(String[] args) {
        Dinosaur dino = new Dinosaur("Eduardo", 20, "Now", "Dino Nuggets",
                "Red");

        StaticExample first = new StaticExample(10);
        System.out.println(first);

        first.incrementInstanceInt();
        StaticExample.incrementStaticInt();

        StaticExample second = new StaticExample(5);

        StaticExample.incrementStaticInt();

        System.out.println(first);
        System.out.println(second);
    }

}
