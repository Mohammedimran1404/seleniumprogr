package arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = scan.nextInt();
		int a[] = new int [size];
		System.out.println("Enter the arrays");
		for(int i=0; i<a.length;i++){
			a[i] = scan.nextInt();
				}
			System.out.println(" Arrays are");
			//for (int i=a.length-1;i>=0;i--) {
		   for(int i=0;i<a.length;i++) {
		   System.out.println(a[i]);
			}
	}
}



