class Student
{
	String name;
	int rollno;
	int marks;
	String result;
	void Marksheet(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		System.out.println("Student name:"+name+" Student Roll no:"+rollno);
	}
	
	
}
class Marks extends Student{
	
	
	void Marksheet(int marks) {
		this.marks=marks;
		System.out.println("Student Marks:"+ marks+"%");
	}
	
}
class Result extends Marks{
	void Marksheet(String result){
		this.result=result;
		System.out.println("Result of Student:"+result);
	}
	
}
public class StudentOverrid {

	public static void main(String[] args) {
		Student s=new Student();
		s.Marksheet("OM",101);
		Marks m=new Marks();
		m.Marksheet(98);
		Result r=new Result();
		r.Marksheet("First class");
	}

}
