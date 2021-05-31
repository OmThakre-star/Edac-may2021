import java.util.*;
class Employee{
	int EmpID;
	String EmpName;
	int EmpSalary;
	Employee(int EmpID ,String EmpName,int EmpSalary)
	{
		this.EmpID=EmpID;
		this.EmpName=EmpName;
		this.EmpSalary=EmpSalary;
	}
}
public class ArraylistEmp {

	public static void main(String[] args) {
		Employee e1=new Employee(100,"Om Thakre",40000);
		Employee e2=new Employee(101,"Prakash Mulik ",20000);
		Employee e3=new Employee(102,"Onkar Thakre",50000);
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
	    list.add(e3);
	    
  for(Employee d:list)
{
	System.out.println("Employee ID="+d.EmpID+" Employee Name="+d.EmpName+"  Employee Salary=" +d.EmpSalary);
}
	}

}
