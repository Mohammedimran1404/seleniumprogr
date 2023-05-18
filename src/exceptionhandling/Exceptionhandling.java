package exceptionhandling;

public class Exceptionhandling {
public static void main(String[] args) {
	System.out.println(" i am main method in java ");
	//int marks[]= {10,20};
	int b=10/0;
	try {
	//System.out.println(marks[5]);
	System.out.println("B = "+b);
}
	//catch(ArrayIndexOutOfBoundsException e) {
	//	System.out.println("there is no marks at position you have entered ");
		
	//}
	catch(ArithmeticException e) { //for example we have written two three catch method it takes one catch at a time
		System.out.println("we cannot didvide number with zero ");
	}

	//catch(Exception e) { // if we don't know what the error is the we write these is exception
	//	System.out.println(" kuch galat hogaya");
	//}
	System.out.println("main method is terminated");
	}
}
