package midterm1;

public class StaticExample {
    private int instanceInt;

    private static int staticInt;

    public StaticExample(int instanceInt) {
        this.instanceInt = instanceInt;
        staticInt = instanceInt;
    }

    public void incrementInstanceInt() {
        instanceInt++;
    }

    public static void incrementStaticInt() {
        staticInt++;
    }

    public String toString() {
        return "instanceInt: " + instanceInt + " staticInt: " + staticInt;
    }
}
