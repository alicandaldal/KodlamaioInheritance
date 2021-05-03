package kodlamaio;

public class StudentManager extends UserManager {

	
	public void add(Student student) {
		System.out.println("eklenen öğrenci : " + student.getName());
	}
}
