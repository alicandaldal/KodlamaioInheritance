package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------Eğitmenler--------");
		Instructor instructor1 = new Instructor();
		
	    instructor1.setId(1);
	    instructor1.setUserId(1);
	    instructor1.setName("Engin");
	    instructor1.setLastName("Demiroğ");
	    instructor1.setEmail("engin@gmail.com");
	    instructor1.setBranch("Java");
		
		System.out.println(instructor1.getName());
		
		System.out.println("----------Öğrenciler--------");
        Student student1 = new Student();
		
	    student1.setId(1);
	    student1.setUserId(2);
	    student1.setName("Ali Can");
	    student1.setLastName("Daldal");
	    student1.setEmail("alican@gmail.com");
	        
	    
	    UserManager userManager1 = new UserManager();
	    userManager1.add(student1);
	    
	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.add(instructor1);
	    
	    StudentManager studentManager = new StudentManager();
	    studentManager.add(student1);
	    
	    
	    
	}
}
