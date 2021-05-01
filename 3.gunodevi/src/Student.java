
public class Student extends user {

	private int StudentNumber;
	private int Numberofcamps;
	
	public Student(String email, int identityNumber, String firstname, String lastname, int id, int password,
			int studentNumber, int numberofcamps) {
		
		super(email, identityNumber, firstname, lastname, id, password);
		StudentNumber = studentNumber;
		Numberofcamps = numberofcamps;
	}

	public int getStudentNumber() {
		return StudentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		StudentNumber = studentNumber;
	}

	public int getNumberofcamps() {
		return Numberofcamps;
	}

	public void setNumberofcamps(int numberofcamps) {
		Numberofcamps = numberofcamps;
	}
	

	
}
