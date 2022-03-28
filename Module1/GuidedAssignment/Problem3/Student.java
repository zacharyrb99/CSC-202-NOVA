package Problem3;

public class Student extends Person {
    private int studentNumber;

    public Student() {}

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String studentStr = "Student Number: " + this.studentNumber;

        return parentStr + "\n" + studentStr;
    }
}
