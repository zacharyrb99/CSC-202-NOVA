public class ProjectGroupDriver {
    /**
	 * Creates and populates a group of students for a project.
    * It displays the list of students
	 */
	public static void main(String[] args) {
        ProjectGroup pg = new ProjectGroup();

        pg.addStudent(new Student("101", "Jim Sanders",23, "A-"));
        pg.addStudent(new Student("173", "Anna Prince", 18, "A"));
        pg.addStudent(new Student("301", "John Deer", 29 ));
        pg.addStudent(new Student("302", "John Doe", 33, "D"));
        
        System.out.println("Initial Project Group: ");
        System.out.println("***********************");
        System.out.println(pg);

        Student s1 = pg.find("301");
        pg.addStudentAfter(s1, new Student("999","Ella Fitz", 12));

        Student s2 = pg.find("301");
        s2.setGrade("B-");

        Student s3 = pg.find("173");
        pg.replace(s3, new Student("192", "Mimi Rose",33, "B+"));

        System.out.println("Final Project Group");
        System.out.println("*******************");
        System.out.println(pg);
    }
}
