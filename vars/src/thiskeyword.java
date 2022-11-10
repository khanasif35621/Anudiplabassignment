class student
{
	int rollno;
		String name;
		float fee;
		student( int rollno,String name,float fee)
		{
			this.rollno=rollno;
			this.name=name;	
			this.fee=fee;
		}
		public void display()
		{
			System.out.println(rollno+" "+name+" "+fee);
		}
		
public class thiskeyword
{

	public static void main(String[] args)
	{
		student s1=new student(111,"ankit",5000f);
		student s2=new student(111,"ankit",5000f);
		s1.display();
		s2.display();
	}
}
}

		
