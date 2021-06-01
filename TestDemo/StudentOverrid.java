import java.util.Scanner;

class Student
{
	int rollno;
	int Std;
	
public	void Marksheet(int x,int y){
	rollno=x;
	Std=y;
		System.out.println("Student Roll No.:"+rollno+" Standard:"+Std+"th");
	}
	
	
}
class Marks extends Student{
	int Sci;
	int Maths;
	@Override
	public void Marksheet(int x, int y) {
		Sci=x;
		Maths=y;
		System.out.println("Marks in Science:"+Sci+" Marks in Maths:"+Maths);
	}
	
}
class Result extends Marks{
	int t;
	float p;
	public void Marksheet(int x,int y) {
Sci=x;
Maths=y;
		t=Sci+Maths;
System.out.println("Total Marks:"+t);
	
		p=t/2;
		System.out.println("Percentage:"+p+"%");
	}
}
public class StudentOverrid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the detail as Rollno and Standard");
		int rollno=sc.nextInt();
		int Std=sc.nextInt();
		System.out.println("Enter marks in Science and Math");
		int Sci=sc.nextInt();
		int Maths=sc.nextInt();
		Student s=new Student();
		s.Marksheet(rollno,Std);
		Marks m=new Marks();
		m.Marksheet(Sci, Maths);
		Result r=new Result();
		r.Marksheet(Sci, Maths);
	
	}

}
