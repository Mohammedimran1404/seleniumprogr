package encapsulation;

import java.util.Scanner;

public class OddNumbers {
	private int lw,up;
	private Scanner scan = new Scanner(System.in);
	private int sum,count;
	public void scan() {
		System.out.print("Enter the lower number : ");
		lw = scan.nextInt();	
		System.out.print("Enter the higher number : ");
		up = scan.nextInt();
	}
	public void displayeven() {
		this.scan();
		sum=0;
		count=0;
		System.out.println("Odd numbers are : ");
		for(int i=lw;i<=up;i++) {
			if(i%2==1) {
				System.out.print(i+ " ");
				sum=sum+i;
				count++;
			}
		}
	}
	public void displaysum() {
		System.out.println("\nSum of Odd numbers is : "+sum);
	}
	public void displaycount() {
		System.out.print("Count of Odd numbers is :"+count);
	}

}
