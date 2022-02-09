package midterm1;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " earns a salary of " + salary;
    }

    public static String motto() {
        return "I am an Employee.";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee otherEmployee = (Employee) o;
            return this.name.equals(otherEmployee.name)
                    && this.salary == otherEmployee.salary;
        }
        return false;
    }

}
