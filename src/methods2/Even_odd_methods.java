package methods2;

import java.util.Scanner;

public class Even_odd_methods {
	public int scan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you want : ");
		int num = scan.nextInt();
		return num;
	}
	public String formula(int num) {
		String result;
		if(num%2==0) {
			result = (num+" is a even number");
		}
			else {
				result = (num+" is a odd number ");
			}
		
		return result;
	}
	public void display(String result) {
		System.out.println(result);
	}

	public static void main(String[] args) {
		Even_odd_methods obj = new Even_odd_methods();
		int num = obj.scan();
		String result = obj.formula(num);
		obj.display(result);

	}

}
