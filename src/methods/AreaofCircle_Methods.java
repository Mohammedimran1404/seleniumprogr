package methods; //without return type without parameter using static method;
import java.util.Scanner;

public class AreaofCircle_Methods {
	public static void circle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pi value, pi value is(3.14): ");
		float pi = scan.nextFloat();
		System.out.println("Enter radius value : ");
		int radius = scan.nextInt();
		float area = pi*radius*radius;
		 System.out.println("The area of radius is : "+area);
	}

	public static void main(String[] args) {
		AreaofCircle_Methods.circle();

	}

}
