package methods;  //without return type and without parameter (--)
import java.util.Scanner;
    public class Addition {
	public static void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		System.out.println("Enter the number : ");
		int b = scan.nextInt();
		int c = a+b;
		System.out.println("sum of two number is : "+c );
		
	}
	

	public static void main(String[] args) {
		Addition.add();
		//Methods_percentage.percentage();


	}
    

    }
    
