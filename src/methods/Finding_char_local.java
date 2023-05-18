package methods;

import java.util.*;

 class Finding_char_local { // i have used local variable and default access modifier
      char scan1() {
    	    Scanner sc = new Scanner(System.in);
			System.out.print("Enter any character : ");
			char ch = sc.next().charAt(0);
			return ch;
		}
	  String charscan(char ch) {
		 String result;
		if(ch>='A'&& ch<='Z')
			result = ch+" Is a Upper case Alphabet";
		else if(ch>='a'&& ch<='z')
			result = ch+" Is a Lower case Alphabet ";
		else if (ch>='0'&& ch<='9')
			result = ch+" Is a Digit";
		else
			result = ch+" Is a special character";
		return result;
	}
	 void display(String result) {
		System.out.println(result);
	}
	public static void main(String[] args) {
		Finding_char_local obj = new Finding_char_local();
		char ch = obj.scan1();
		String result = obj.charscan(ch);
		obj.display(result);
	}
	}


