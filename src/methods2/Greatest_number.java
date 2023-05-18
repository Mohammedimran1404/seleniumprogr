package methods2;

import java.util.Scanner;

public class Greatest_number {
	public int a() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the  first number : ");
	int num1= scan.nextInt();
	return num1;
	
	}
	public int b() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		return num2;
	}
	public String formula(int num1, int num2) {
		//String result;
		if (num1==num2) {
			 return "both r equal";
		}
			else if(num1>num2) {
				 return (num1+" is greater than "+num2);
			}
				else {
				return (num2+" is greater  than "+num1);
				}
	//return result;
	}
	public void display(String result) {
		System.out.println( result);
	}
	public static void main(String[] args) {
		Greatest_number obj = new Greatest_number();
		int num1 = obj.a();
		int num2 = obj.b();
		String result = obj.formula(num1, num2);
		obj.display(result);

	}

}
