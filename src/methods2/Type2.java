package methods2;

import java.util.Scanner;//(+-) with return type without parameter2

public class Type2 {
	public  int add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a and b values : ");
		int a =scan.nextInt(), b=scan.nextInt();
		int c = a+b;
		System.out.println(+c);

		return c;

	}

	public static void main(String[] args) {
		Type2 obj = new Type2();
		int c = obj.add();
		//System.out.println(+c);

	}

}
