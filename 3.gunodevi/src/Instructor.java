
public class Instructor extends user{
	
  private int numberofstudents;
  private String campName;
  
public Instructor(String email, int identityNumber, String firstname, String lastname, int id, int password,
		int numberofstudents, String campName) {
	super(email, identityNumber, firstname, lastname, id, password);
	this.numberofstudents = numberofstudents;
	this.campName = campName;
}
public int getNumberofstudents() {
	return numberofstudents;
}
public void setNumberofstudents(int numberofstudents) {
	this.numberofstudents = numberofstudents;
}
public String getCampName() {
	return campName;
}
public void setCampName(String campName) {
	this.campName = campName;
}
  

}