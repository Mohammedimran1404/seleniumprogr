package encapsulation;

import java.util.Scanner;

public class EvenNumbers {
	private int lw;
	private int up;
	private Scanner scan = new Scanner(System.in);
    private int sum,count;
	public int scanlw() {
		System.out.println("enter the lower number :");
		lw=scan.nextInt();
		return lw;
	}
	public int scanup() {
		System.out.println("Enter the upper number :");
		up = scan.nextInt();
		return up;
	}
	public void geteven() {
		sum=0;
		count=0;
		System.out.println("The even numbers are : ");

		for(int i=lw;i<=up;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			sum=sum+i;
			count++;
			}
		}
	}
	public void displaysum() {
		System.out.println("\nsum of even numbers is : "+sum);
	}
	public void displaycount() {
		System.out.println("count of even numbers is : "+count);
	}
				
	
}
			
			
			
			
		
	


