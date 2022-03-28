package Problem3;

public class Adjunct extends Faculty {
    private double perCreditRate;
    private int credits = 12;

    public Adjunct(String name, int empID, String rank, double perCreditRate) {
        super(name, empID, rank);
        this.perCreditRate = perCreditRate;
    }

    public double getCreditRate() {
        return this.perCreditRate;
    }

    public void setCreditRate(double perCreditRate) {
        this.perCreditRate = perCreditRate;
    }

    public double calculateMonthlyGrossPay() {
        return (perCreditRate * credits) / 2;
    }

    public void displayPayInfo() {
        System.out.println("Pay is done twice per semester.");
        System.out.println("Pay per credit: " + this.perCreditRate);
        System.out.println("Period pay: " + calculateMonthlyGrossPay());
    }
}
