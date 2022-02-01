package midterm1;

public class Dinosaur {

    private String name;
    private int age;
    private String timePeriod;
    private String favoriteFood;
    private String color;

    public Dinosaur(String name, int age, String timePeriod,
            String favoriteFood,
            String color) {
        this.name = name;
        this.age = age;
        this.timePeriod = timePeriod;
        this.favoriteFood = favoriteFood;
        this.color = color;
    }

    public String toString() {
        return "Hi, I'm " + name + " and I am " + age + " years old. I love "
                + favoriteFood;
    }

}
