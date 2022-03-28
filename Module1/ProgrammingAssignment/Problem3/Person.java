package Problem3;

public class Person implements Payroll {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    public void displayPayInfo() {

    }

    public double calculateMonthlyGrossPay() {
        // Had to return double to implement calculateMonthlyGrossPay
        return 0.0;
    }
}
