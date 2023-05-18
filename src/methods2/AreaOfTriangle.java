package methods2;

import java.util.Scanner;

public class AreaOfTriangle {
	public int triangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base of triangle : ");
		int base = scan.nextInt();
		return base;
	}
	public int tri() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of triangle : ");
		int height = scan.nextInt();
		return height;
	}
	public int formula(int base, int height) {
		int area= base*height/2;
		return area;
	}
	public void display(int area) {
		System.out.println("The area of triangle is :"+area);
		
	}

	public static void main(String[] args) {
		AreaOfTriangle obj = new AreaOfTriangle();
		int base = obj.triangle();
		int height = obj.tri();
		int area = obj.formula(base, height);
		obj.display(area);

	}

}
