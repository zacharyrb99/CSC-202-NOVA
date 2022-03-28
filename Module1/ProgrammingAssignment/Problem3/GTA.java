package Problem3;

public class GTA extends Graduate {
    private double hourlySalary;
    private int weeklyHours = 40;

    public GTA(String name, int studentNumber, String dept, double hourlySalary) {
        super(name, studentNumber, dept);
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return this.hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double calculateMonthlyGrossPay() {
        // weekly hours * 4 weeks in a month
        return this.hourlySalary * weeklyHours * 4;
    }

    public void displayPayInfo() {
        System.out.println("Pay is done on hourly basis.");
        System.out.println("Number of hours: " + this.weeklyHours);
        System.out.println("Pay per hour: " + this.hourlySalary);
        System.out.println("Monthly Salary: " + calculateMonthlyGrossPay());
    }
}
