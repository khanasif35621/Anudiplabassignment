import java.util.ArrayList;
import java.util.List;

public class student2 {

	private String name;
	private int rollNo;
	private int marks;
	private int age;
	
	
	public student2(String name, int rollNo, int marks, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public int getRollNo() {
		return rollNo;
	}



	public int getMarks() {
		return marks;
	}


	public int getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "student2 [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", age=" + age + "]";
	}


	public static void main(String[] args)
	{
		student2 s1=new student2("Tom",1,95,15);
		student2 s2=new student2("peter",2,60,16);
		student2 s3=new student2("asif",3,86,17);
		student2 s4=new student2("kevinn",4,78,20);
		//add all the student object to ArrayList:
		List<student2> stud=new ArrayList<student2>();
		
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		
		stud.stream().forEach(e->System.out.println(e));
		
		//name whose mark is >80
		stud.stream().filter(e->e.getMarks()>80)
		.forEach(e->System.out.println(e.getName()+" : "+e.getMarks()));
		
		
		
		
		
		
		
	}
	
}
