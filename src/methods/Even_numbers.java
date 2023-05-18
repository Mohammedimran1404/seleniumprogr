package methods;
import java.util.Scanner; // (--)static
public class Even_numbers {
	public static void Even_odd() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number u want : ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.print(num+" is a even number ");
		}
			else {
				System.out.print(num+ " is a odd number ");
			}
	}
			
		

	public static void main(String[] args) {
		Even_odd();

	}

}

