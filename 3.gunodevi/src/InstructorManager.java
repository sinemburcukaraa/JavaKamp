
public class InstructorManager {

	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstname() + " "+instructor.getLastname() 
		+ " adl� ��retmen " + instructor.getCampName() + " kursuna kat�ld�.");
	}
	
	public void students(Instructor instructor) {
		System.out.println(instructor.getFirstname() + " "+instructor.getLastname() 
		+ " adl� ��retmenin dersine " + instructor.getNumberofstudents() + " ��renci kat�ld�.");

	}
}
