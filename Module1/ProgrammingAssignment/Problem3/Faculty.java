package Problem3;

public class Faculty extends Employee {
    private String rank;

    public Faculty() {}

    public Faculty(String name, int empID, String rank) {
        super(name, empID);
        this.rank = rank;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String facultyStr = "Faculty Rank: " + this.rank;
        
        return parentStr + "\n" + facultyStr;
    }
}
