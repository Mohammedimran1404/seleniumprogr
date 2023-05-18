package methods;
import java.util.Scanner;

public class Methods_product {
	public static int products(int a, int b , int c){
		int product = a*b*c;
        return product;
	}
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int a = scan.nextInt();
	System.out.print("Enter the number : ");
	int b = scan.nextInt();
	System.out.print("Enter the number : ");
	int c = scan.nextInt();
	int product = Methods_product.products(a,b,c);
	System.out.print("The product of given numbers is : " +product);




}
}
