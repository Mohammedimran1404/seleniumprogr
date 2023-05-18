package encapsulation;

import java.util.Scanner;

public class ReverseNumber {
	private Scanner scan;
	public ReverseNumber() {
		scan = new Scanner(System.in);		
	}
	public int  scanvalue() {
		System.out.print("Enter the value :");
		int n = scan.nextInt();
		return n;
	}
	public int reversenumber(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		return rev;
	} 
	public void display(int rev,int n) {
		System.out.println(rev+" is a reverse number of "+n);
	}
public boolean ispalindrome(int rev,int n) {
	boolean status;
	status = rev==n;
	return status;
}
public void displaypalindrome( boolean status) {
	if(status) {
		System.out.println("is palindrome");
	}
	else
		System.out.println("not a palindrome");
		
	}
}

