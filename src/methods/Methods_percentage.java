package methods;
import java.util.Scanner;
public class Methods_percentage {
	public  float percentage() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Hindi marks : ");
		float hindi = scan.nextFloat();
		System.out.print("Enter the English marks : ");
		float english = scan.nextFloat();
		System.out.print("Enter the Telugu marks : ");
		 float telugu = scan.nextFloat();
		System.out.print("Enter the Maths marks : ");
		 float maths = scan.nextFloat();
		System.out.print("Enter the Science marks : ");
		 float science = scan.nextFloat();
		System.out.print("Enter the Social marks : ");
		float social = scan.nextFloat();
		float totalmarks = hindi+english+telugu+maths+science+social;
		int maxmarks=600;
		float	percen= totalmarks/maxmarks*100;

		if(percen<=45 ) {
			System.out.println("fail:- "+percen);
		}
		else {
			System.out.println("pass:- "+percen);
		}
		return totalmarks;
			
		


	}
	public static void main(String[] args) {
		Methods_percentage obj = new Methods_percentage();
		obj.percentage();
		

	}

}
