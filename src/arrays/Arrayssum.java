package arrays;

import java.util.Scanner;

public class Arrayssum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size = scan.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the arrays");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Reverse of an array is "); 
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		int sum=0;
		int count=0;
		System.out.println("Sum of an array is ");
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			count++;
		}
		System.out.println(sum);
		System.out.println("Count of an array is : "+count);


	}

}
