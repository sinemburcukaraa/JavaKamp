import javax.sql.rowset.Joinable;

public class StudentManager {
	
	public void join(Student student) {
		System.out.println(student.getFirstname() +" "+ student.getLastname() + " adl� ��renci kampa kat�ld�. ");
	}
	
	public void exit(Student student) {
		System.out.println(student.getFirstname() +" "+ student.getLastname() +  " adl� ��renci kamptan ayr�ld�. ");
	}
}
