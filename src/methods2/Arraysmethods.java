package methods2;

import java.util.Scanner;

public class Arraysmethods {
	private Scanner scan;
	public Arraysmethods() {
		scan = new Scanner(System.in);
	}
	public int scanarraysize() {
		System.out.println("Enter array size ");
		return scan.nextInt();
	}
	public int []scanvalue(int size) {
		System.out.println("Enter the arrays ");
		int a[] = new int[size];
		for (int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		return a;
	}
	public void displayarraysize(int a[]) {
		System.out.println("size of array is ");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);	
	}
}
	public static void main(String[] args) {
		Arraysmethods obj = new Arraysmethods();
		int size = obj.scanarraysize();
		int a[] = obj.scanvalue(size);
		obj.displayarraysize(a);
		
		
	}
}
