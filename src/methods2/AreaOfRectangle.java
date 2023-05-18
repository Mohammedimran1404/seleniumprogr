package methods2;

import java.util.Scanner;

public class AreaOfRectangle {
	public int a() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length : ");
		int length = scan.nextInt();
		return length;
	}
	public int b() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter width : ");
		int width = scan.nextInt();
		return width;
	}
	public int result(int length,int width) {
		int area = length*width;
		return area;
	}
		public void display(int area) {
			System.out.print("area of rectangle is : "+area);
		}


	public static void main(String[] args) {
		AreaOfRectangle obj = new AreaOfRectangle();
		int length = obj.a();
		int width = obj.b();
		int area = obj.result(length,width);
		obj.display(area);
		 		

	}
		}


