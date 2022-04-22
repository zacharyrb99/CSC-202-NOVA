import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProjectGroup implements Iterable<Student>{
	// instance variable
	private List<Student> list;

	/**
	 * Constructs an initially empty list representing a group project.
	 */
	public ProjectGroup() {
		//*** Task #1: add code here for the constructor
		this.list = new LinkedList<Student>(); 
	}
	
	/**
	 * Adds the specified student to the end of the student list.
	 *
	 * @param student as the student to add
	 */
	public void addStudent(Student student) {
		//*** Task #2: create the body of this method
		list.add(student);
    }

	/**
	 * Finds and returns the student matching the specified studentID
    * @param studentID, as the studentID of the target student
	 * @return the student, or null if not found
	 */
	public Student find(String studentID) {	
		//*** Task #3: fill in the body of method find
		Student studentToReturn = null;

		for (Student s : list) {
			if (s.getStudentID() == studentID) studentToReturn = s;
		}

		return studentToReturn;
    }

	/**
	 * Adds the specified student after the target student. 
    * Does nothing if either student is null or if the target is not found.
	 *
	 * @param target the student after which the new student will be added
	 * @param newStudent the student to add
	 */
	public void addStudentAfter(Student target, Student newStudent) {
		//*** Task #4: ill in the body of method addStudentAfter
		if (target == null || newStudent == null) return;
		if (find(target.getStudentID()) == null) return;

		int idx = list.indexOf(target);
		list.add(idx + 1, newStudent);
    }

	/**
	 * Replaces the specified target student with the new student. Does nothing if
	 * either student is null or if the target is not found.
	 *
	 * @param target the student to be replaced
	 * @param newStudent the new student to add
	 */
	public void replace(Student target, Student newStudent) {
		//*** Task #5: fill in the body of method replace
		if (target == null || newStudent == null) return;
		if (find(target.getStudentID()) == null) return;

		int idx = list.indexOf(target);
		list.remove(idx);
		list.add(idx, newStudent);		
    }

	/**
	 * Creates and returns a string representation of this ProjectGroup object.
	 *
	 * @return a string representation of the ProjectGroup object
	 */
	public String toString() {
        //*** Task #6: fill in the body of the method toString()
		String str = "";
		for (Student s : list) str += (s + "\n");

		return str;
    }

	/**
	 * Returns an iterator for this Program of Study.
	 *
	 * @return an iterator for the Program of Study
	 */
	public Iterator<Student> iterator() {
		return list.iterator();
	}
}
