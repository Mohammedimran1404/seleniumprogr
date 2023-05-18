package abstractmethods;

import java.util.Scanner;

public class Banktest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the bank name : ");
		String bankname = scan.nextLine();
		   Reservebank rbi; 
		   if(bankname.equals("hdfc")) {
			   rbi = new hdfc();
		   }
		   else {
			   rbi = new Sbi();	   
		   }
		rbi.fdintrestrate();
	}

}// in abstract method we are creating a reference obj parent obj = new child
//reservebank is a parent and hdfc and sbi is child 
// Reservebank rbi = new hdfc;
// we can call obj using method   obj.methodname() ;that is fdintrestrate();