package arrays;

import java.util.Scanner;

public class ArraysUsingMethods {
private Scanner scan;
public ArraysUsingMethods() {
	scan = new Scanner(System.in);
}
	public int  arraysize(){
		System.out.println("Enter the size of array ");
		int size = scan.nextInt();
		return size;
	}
	public int[] arrays(int size) {
		int a[] = new int [size];
		System.out.println("Enter the arrays ");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		return a;
}
	public void displayarray(int a[]) {
		System.out.println("sze of array is :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public void display( String typeofvalue ,int value) {
		System.out.println(typeofvalue+ " " +value);
	}
}

