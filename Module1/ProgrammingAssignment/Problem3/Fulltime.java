package Problem3;

public class Fulltime extends Faculty{
    private double salary;

    public Fulltime(String name, int empID, String rank, double salary) {
        super(name, empID, rank);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateMonthlyGrossPay() {
        return salary / (52 / 4);
    }

    public void displayPayInfo() {
        System.out.println("Pay is done on yearly basis");
        System.out.println("Salary: " + this.salary);
        System.out.println("Monthly salary: " + calculateMonthlyGrossPay());
    }
}
