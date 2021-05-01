
public class Main {

	public static void main(String[] args) {

       StudentManager studentManager = new StudentManager();
       
       Student student=new Student("burcu@gmail.com", 123456789, "burcu", "kara", 1, 1234, 255,1);
       studentManager.join(student);
       studentManager.exit(student);
       
       InstructorManager instructorManager=new InstructorManager();
       Instructor instructor =new Instructor("engin@gmail.com", 987456321, "engin", "demiroğ", 2, 56478, 3500, "java");
       instructorManager.login(instructor);
       instructorManager.students(instructor);
       
       user[] users = {student,instructor};
       UserManager userManager=new UserManager();
       userManager.add(users);
       userManager.delete(users);
       
 
 }

}
