package string;

public class ReverseString {

	public static void main(String[] args) {
		String ip="imran";
		String op = "";
		for(int i=ip.length()-1;i>=0;i--) {
			op=op+ip.charAt(i);
		}
			System.out.println(op);
		}

	}


