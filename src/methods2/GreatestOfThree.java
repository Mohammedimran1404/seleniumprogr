package methods2;

import java.util.Scanner;

public class GreatestOfThree {
	private int num1,num2,num3; // i am declaring a global variable
	private Scanner scan = new Scanner(System.in);
	private void scan1() {
		System.out.print("Enter the  first number : ");
		num1 = scan.nextInt();
		System.out.print("Enter the second number : ");
		num2 = scan.nextInt();
		System.out.print("Enter the  third number : ");
		num3 = scan.nextInt();
	}
	
	public void formula() {
		this.scan1();
		if(num1>num2 && num1>num3) 
			System.out.println(num1+" is greater than "+num2+ " and " +num3);
		else if (num2>num3)
			System.out.println(num2+" is greater than "+num1+" and "+num3);
		else if (num1==num2 && num2==num3)
			 System.out.println("all are equal ");
		else 
			System.out.println(num3+ " is greater than "+num2+" and "+num1);	 
	}
	public static void main(String[] args) {
		GreatestOfThree obj = new GreatestOfThree();
		obj.formula();
	}
	}
		
		
	


