
public class InstructorManager {

	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstname() + " "+instructor.getLastname() 
		+ " adlý öðretmen " + instructor.getCampName() + " kursuna katýldý.");
	}
	
	public void students(Instructor instructor) {
		System.out.println(instructor.getFirstname() + " "+instructor.getLastname() 
		+ " adlý öðretmenin dersine " + instructor.getNumberofstudents() + " öðrenci katýldý.");

	}
}
