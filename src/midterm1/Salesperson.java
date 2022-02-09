package midterm1;

public class Salesperson extends Employee {

    private static final double COMMISSION = 0.25;
    private double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + salesAmount * COMMISSION;
    }

    public String getSalesPitch() {
        return "Buy buy buy - N'Sync";
    }

    public static String motto() {
        return "I am a Salesperson.";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Salesperson) {
            Salesperson other = (Salesperson) o;
            return super.equals(o)
                    && this.salesAmount == other.salesAmount;
        }
        return false;
    }

}
