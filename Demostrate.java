/*Wap program to demostrate
a)class object
b)array object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method
*/
import java.util.Scanner;
 class Bank
{
	static Scanner sc=new Scanner(System.in);
	String name, actype;
	int accNo, bal, amt;
	void Bank(String name,String actype)
	{
		this.name=name;
		this.actype=actype;
		
	}
	void Bank(int accNo,int bal)
	{
		this.accNo=accNo;
		this.bal=bal;
	}
	
	int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = sc.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return amt=0;
		}
		bal = bal + amt;
		return 0;
	}
	int withdraw() {
		System.out.println("Your Balance=" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = sc.nextInt();
		if (bal < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal - amt;
		return 0;
	}
	void display() {
		System.out.println("Name:" + name + "Account No:" + accNo+ "Balance:" + bal);
	
	}


	  void OpenAccount() {
			System.out.println("Enter your Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Account Number: ");
			int accNo = sc.nextInt();
			System.out.println("Enter Account Type: ");
			String actype = sc.next();
			System.out.println("Enter Initial Balance: ");
			int bal = sc.nextInt();
			
		}
	}
public class Demostrate {
	
	
	
	public static void main(String[] args) {
		static Scanner sc=new Scanner(System.in);
	Bank b=new Bank();
	int menu;
	System.out.println("Menu");
	System.out.println("1. Opening Account");
	System.out.println("2. Deposit Amount");
	System.out.println("3. Withdraw Amount");
	System.out.println("4. Display Information");
	System.out.println("5. Exit");
	Boolean Exit=false;
	do {
		System.out.println("Please Enter your Choice");
		String choice=sc.next();
		switch(choice)
		{case "1":
			b.OpenAccount();
			break;
		case "2":
			b.deposit();
		break;
		case "3":
	
	b.withdraw();
	break;
		case "4":
	b.display();
		break;
		case "5":
		Exit=true;
		break;
		}
	}while(!Exit);

	}

}

