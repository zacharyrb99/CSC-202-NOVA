package Problem3;

public class Graduate extends Student {
    private String department;
    
    public Graduate(String name, int studentNumber, String dept) {
        super(name, studentNumber);
        this.department = dept;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String gradStr = "Graduate Department: " + this.department;

        return parentStr + "\n" + gradStr;
    }
}
