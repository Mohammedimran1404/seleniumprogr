package encapsulation;

public class Reversenumbertest {

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		int n=obj.scanvalue();
		int rev=obj.reversenumber( n);
		obj.display(rev, n);
		boolean status=obj.ispalindrome(rev, n);
		obj.displaypalindrome(status);

	}

}
