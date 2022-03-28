package Problem3;

public class Employee extends Person {
    private int empID;

    public Employee() {}

    public Employee(String name, int empID) {
        super(name);
        this.empID = empID;
    }

    public int getEmpID() {
        return this.empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String employeeStr = "Employee ID: " + this.empID;
        
        return parentStr + "\n" + employeeStr;
    }
}
