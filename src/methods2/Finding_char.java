package methods2;

import java.util.Scanner;

public class Finding_char {
	char ch;
	String result;// global variable
	Scanner scan = new Scanner(System.in);
	public char scan1() {
		System.out.print("Enter any character : ");
		ch= scan.nextLine().charAt(0);
		return ch;
	}
public String charscan() {
	if(ch>='A'&&ch<='Z')
		result = ch+" Is a Upper case Alphabet";
	else if(ch>='a'&& ch<='z')
		result = ch+" Is a Lower case Alphabet ";
	else if (ch>='0'&& ch<='9')
		result = ch+" Is a Digit";
	else
		result = ch+" Is a special character";
	return result;
}
public void display() {
	System.out.println(result);
}
public static void main(String[] args) {
	Finding_char obj = new Finding_char();
	obj.scan1();
	obj.charscan();
	obj.display();
}
}