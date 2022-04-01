package ProgrammingAssignment.Problem3;

public class ExamPaper {
    private String name;
    private int examScore;

    public ExamPaper(String name, int examScore) {
        this.name = name;
        this.examScore = examScore;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getExamScore() { return examScore; }

    public void setExamScore(int examScore) { this.examScore = examScore; }

    @Override
    public String toString() {
        String examStr = name + ", Score: " + examScore;
        return examStr;
    }
}
