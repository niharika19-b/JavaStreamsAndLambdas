package lambda_ex;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Student> students = Arrays.asList(
		            new Student(1, "Alisa"),
		            new Student(2, "Boby"),
		            new Student(3, "Charu")
		        );

		   
		        Map<Integer, String> studentMap = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));

		        System.out.println(studentMap);
		    }

		 



	}


