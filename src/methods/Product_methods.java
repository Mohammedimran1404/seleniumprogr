package methods; //without return type without parameter using static method;
import java.util.Scanner;

import methods2.Type2;

public class Product_methods {
	public static void mul() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the first value : ");
		double a = scan.nextDouble();
		System.out.print("Enter the second value : ");
		double b = scan.nextDouble();
		double c= a*b;
		System.out.println("Product of two values is : "+c);

	}

	public static void main(String[] args) {
		Product_methods.mul();
		
	}

}
