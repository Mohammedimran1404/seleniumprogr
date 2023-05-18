package string;

import java.util.Scanner;

public class ReverseStringsc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s =scan.next();
		String op ="";
		System.out.print("Reverse of a String is :");
     	for(int i=s.length()-1;i>=0;i--) {
     	op=op+s.charAt(i);
     	}
		System.out.print(op);
	}
}
