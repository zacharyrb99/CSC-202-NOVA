package Problem3;

public class Undergraduate extends Student {
    private String major;

    public Undergraduate() {}

    public Undergraduate(String name, int studentNumber, String major) {
        super(name, studentNumber);
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String undergradStr = "Undergraduate Major: " + this.major;

        return parentStr + "\n" + undergradStr;
    }
}
