package methods2;

import java.util.Scanner;

public class AreaOfCircle {
	public int areaOf() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int radius = scan.nextInt();
		return radius;
		
	}
	public double result(int radius) {
		double area = 3.14*radius*radius;
		return area;
	}
	public void display( double area) {
		System.out.println(area);
	}
	public static void main(String[] args) {
		AreaOfCircle obj = new AreaOfCircle();
		int radius = obj.areaOf();
		double area = obj.result(radius);
		obj.display(area);
	}

}
