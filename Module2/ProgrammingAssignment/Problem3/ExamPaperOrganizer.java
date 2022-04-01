package ProgrammingAssignment.Problem3;

import java.util.Scanner;

public class ExamPaperOrganizer {
    public static void main(String[] args) {
        // Create stack and totalExamScore
        ExamPaperStack<ExamPaper> stack = new ExamPaperStack<ExamPaper>();
        int totalExamScores = 0;
        
        Scanner scan = new Scanner(System.in);
        String name = "";

        while (!name.equalsIgnoreCase("end")) {
            System.out.println("Enter the name of the student, or type end if you want to stop: ");
            name = scan.next();

            if(!name.equalsIgnoreCase("end")) {
                System.out.println("Enter the exam score for " + name + ": ");
                int score = scan.nextInt();
                totalExamScores += score;
                ExamPaper exam = new ExamPaper(name, score);
                stack.push(exam);
            }
        }
        
        // Display stack
        System.out.println();
        System.out.println(stack);

        // Average exam grades
        double averageScore = totalExamScores / stack.size();
        System.out.println("The number of exams graded: " + stack.size());
        System.out.println("Average score for the exam is: " + averageScore);
        System.out.println();

        // Take papers below and above avg score and split into two stacks
        ExamPaperStack<ExamPaper> aboveAvgStack = new ExamPaperStack<ExamPaper>();
        int aboveAvgCount = 0;
        ExamPaperStack<ExamPaper> belowAvgStack = new ExamPaperStack<ExamPaper>();
        int belowAvgCount = 0;
        
        while (stack.isEmpty() == false) {
            ExamPaper top = stack.top();

            if (top.getExamScore() >= averageScore) {
                aboveAvgStack.push(top);
                aboveAvgCount++;
            } else {
                belowAvgStack.push(top);
                belowAvgCount++;
            }

            stack.pop();
        }

        System.out.println("Papers that have average score or above: ");
        System.out.println(aboveAvgStack);
        System.out.println("There are " + aboveAvgCount + " papers with score >= above average.");
        System.out.println();
        System.out.println("Papers that have score below average: ");
        System.out.println(belowAvgStack);
        System.out.println("There are " + belowAvgCount + " papers with below average score.");
    }   
}
