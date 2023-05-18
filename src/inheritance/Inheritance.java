package inheritance;

import java.util.Scanner;

public class Inheritance {
	private Scanner scan; // encapsulation --> wrapping up of data under a single unit called
							// encapsulation

	public Inheritance() {
		scan = new Scanner(System.in);
	}

	public int scanintvlues(String typeofvalue) {
		System.out.println("Enter" + typeofvalue);
		return scan.nextInt();
	}

	public void displaymultiples(int lw, int up, int n) {  // method over loading --> means in a class if we found 
															// more than one method with same method name and  different parameters
															// is called method overloading.
		for (int i = lw; i <= up; i++) {
			System.out.println(n * i);
		}
	}

	public void displaymultiples(int n) {// method over loading just for showing we are not calling this one
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}
}
