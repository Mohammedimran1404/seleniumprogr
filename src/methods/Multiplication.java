package methods; //(--) non static
import java.util.Scanner;

public class Multiplication {
	public void mul() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value b value : ");
		int a = scan.nextInt(),b=scan.nextInt();
        System.out.print("Product of two numbers is : "+(a*b));
	}

	public static void main(String[] args) {
		Multiplication obj = new Multiplication();
		obj.mul();
		
		

	}

}
