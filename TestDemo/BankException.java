import java.util.Scanner;

class Bank
{
	static Scanner sc=new Scanner(System.in);
	String name;
	int accNo, bal, amt;
	void Bank(String name,int accNo,int bal)
	{
		this.name=name;
		this.accNo=accNo;
		this.bal=bal;

	}
	 void OpenAccount() {
		 
			System.out.println("Enter your Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Account Number: ");
			int accNo = sc.nextInt();	
//			System.out.println("Enter Initial Balance: ");
//			int bal = sc.nextInt();
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
	int withdraw() throws Exception{
		System.out.println("Your Balance=" + bal);
		if(bal<=1000)
		{
			throw new Exception("Your Balance is less than 1000 Withdraw money not possible");
		}	
		else
		{
			System.out.print("Enter amount to withdraw:");
			amt = sc.nextInt();
			if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
			bal = bal - amt;
			if(bal<1000)
			{
				bal=bal+amt;
				throw new Exception("Your Balance is less than 1000 Withdraw money not possible");
			}
			else {
				
				System.out.println("Your Balance in your Accout:"+bal);
			}
			
		}
		return 0;
	}
}
public class BankException {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		Bank b=new Bank();
		int menu;
		System.out.println("Menu");
		System.out.println("1. Opening Account");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdraw Amount");
		System.out.println("4. Exit");
		Boolean Exit=false;
		do {
			System.out.println("Please Enter your Choice");
			String choice=s.next();
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
			Exit=true;
			break;
			}
		}while(!Exit);

		}
}
