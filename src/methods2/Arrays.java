package methods2;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = scan.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the arrays  ");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Arrays are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("reverse of an array ");
	for (int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	System.out.println("length of an array is :"+a.length);
	}

}
