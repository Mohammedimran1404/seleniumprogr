package encapsulation;
//Encapsulation program
import java.util.Scanner;

public class Calculator {
	private Scanner scan = new Scanner(System.in);
	private int a , b; // data hiding
	private char operator;
	public void getvalues() {
		System.out.print("Enter the number :");
		a= scan.nextInt();
		System.out.print("Enter the another number :");
		b=scan.nextInt();
	}
	public void scanoperator() {
		System.out.println("enter the operator : \nADD + \nSUB -\nMUL * \ndiv / \nmod %");
		operator= scan.next().charAt(0);	
	}
	public void display() { 
		this.getvalues();
		this.scanoperator();
		if(operator=='+')
			System.out.println("sum = "+(a+b));
		else if(operator=='-')
			System.out.println("sub = "+(a-b));
		else if(operator=='*')
			System.out.println("mul = "+(a*b));
		else if(operator=='/')
			System.out.println("div = "+(a/b));
		else if (operator=='%')
			System.out.println("mod = "+(a%b));
		else
			System.out.println("invalid operator");
	}

}
