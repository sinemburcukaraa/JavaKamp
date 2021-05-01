import javax.sql.rowset.Joinable;

public class StudentManager {
	
	public void join(Student student) {
		System.out.println(student.getFirstname() +" "+ student.getLastname() + " adlı öğrenci kampa katıldı. ");
	}
	
	public void exit(Student student) {
		System.out.println(student.getFirstname() +" "+ student.getLastname() +  " adlı öğrenci kamptan ayrıldı. ");
	}
}
