import java.util.*;
import java.util.InputMismatchException;

import java.util.Scanner;

class Test{
	int id;
	String name;
	
	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class FourException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//nullPointerDemo();
		//arrayIndexDemo();
		//divideByzero();
		simpleExceptionDemo();
	}
	private static void nullPointerDemo() {
		try {
			Test f = null;
			System.out.println("Name of Test is "  + f.name);
		}catch(NullPointerException ex) {
			System.err.println("The Test info is not set properly");
		}
	}
	
	private static void arrayIndexDemo() {	
		int [] elements = new int[] {56,67,77,72,25};
		try {
			int index;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the index no to get the value in it");
			index=sc.nextInt();
			
			System.out.println(String.format("The value at position %d is %d" , index, elements[index]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(String.format("No element exists at position and value should be within %d" , (elements.length - 1)));
		}
	}
	private static void divideByzero() {
	try {
		Scanner s=new Scanner(System.in);
		int first,second,res;
		
		System.out.println("Enter the number to divide");
		first=s.nextInt();
		
		
		System.out.println("Enter the non zero dividend value");
		second=s.nextInt();
	 res = first / second;
		System.out.println("The quotient is " + res);
	} catch (ArithmeticException ex) {
		System.err.println("A number cannot be divided by 0, so please enter a valid Non Zero whole number");

	}
	}
	private static void simpleExceptionDemo() {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int no = sn.nextInt();
			System.out.println("The value: " + no);
		}catch(InputMismatchException miss) {
			System.err.println("Expected a number as input within the range of " + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE); 
		}
	}
}
