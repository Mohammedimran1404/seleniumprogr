package methods2;

import java.util.Scanner;

public class Trapezium {
	public static int a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lengthA of trapezium : ");
		int lengthA = scan.nextInt();
		return lengthA;
	}
	public static int b() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lengthB of trapezium : ");
		int lengthB = scan.nextInt();
		return lengthB;
	}
	public static int c() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of trapezium : ");
		int height= scan.nextInt();
		return height;
	}
	public static int result(int lengthA,int lengthB,int height) {
		int area = (lengthA+lengthB)/2*height;
		return area;
	}
	public static void display(int area) {
		System.out.println("The area of trapezium is : "+area);
		
	}

	public static void main(String[] args) {     // i have done using static method
	int lengthA =	Trapezium.a();
	int lengthB = 	Trapezium.b();
	int height = Trapezium.c();
	int area =Trapezium.result(lengthA,lengthB,height);
	display(area);
		

	}

}
