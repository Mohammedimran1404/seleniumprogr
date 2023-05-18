package methods;
import java.util.Scanner;
public class Nonstatic_areaofcircle {
	public void circlee() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the pi value (3.14) : ");
		double pi = scan.nextDouble();
		System.out.print("Enter the radius value : ");
		int radius = scan.nextInt();
		double area = pi*radius*radius;
		System.out.println("the area of circle is : "+area);	
	}

	public static void main(String[] args) {
		Nonstatic_areaofcircle obj = new Nonstatic_areaofcircle();
		obj.circlee();

	}

}
