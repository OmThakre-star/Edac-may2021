import java.util.*;
interface clock
{

	void dispTime_InSec();
	void dispTime_Inhrs();
}
class time implements clock
{
	Scanner sc=new Scanner(System.in);
	int a;
	public void dispTime_InSec()
	{
		
		System.out.println("Convert your Minutes into Sec: "+ a*60 );
	}
	@Override
	public void dispTime_Inhrs() {
		
		System.out.println("Convert your minutes into hour: "+ a/60);
		
	}
	public void Accept_min()
	{
		a=sc.nextInt();
		System.out.println("Enter number of minutes"+a);
	}
}
public class TimeinTime {

	public static void main(String[] args) {
		time t=new time();
		t.Accept_min();
		t.dispTime_InSec();
		t.dispTime_Inhrs();

	}

}
