
public class TestCourse {
	public static void main(String [] args){
		Course course1=new Course("Data Structures");
		Course course2=new Course("Database Systems");
		course1.addStudent("peter");
		course1.addStudent("brian");
		course1.addStudent("anne");
		
		course2.addStudent("peter");
		course2.addStudent("steve");
		
		System.out.println("number of students in coursel: "+course1.getNumberOfStudents());
		String [] students=course1.getStudents();
		for(int i=0;i<course1.getNumberOfStudents();i++){
			System.out.println(students[i]+", ");
		}
		
		System.out.println();
		System.out.println("number of students in course2: "+course2.getNumberOfStudents());
	}

}
