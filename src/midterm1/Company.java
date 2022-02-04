package midterm1;

public class Company {

    public static void main(String[] args) {
        Employee eduardo = new Salesperson("Eduardo", 100000, 50000);
        Employee tyler = new Employee("Tyler", 45000);

        System.out.println(eduardo.getSalary());
    }
}
