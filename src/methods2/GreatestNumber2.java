package methods2;

public class GreatestNumber2 {
	public String call(int num1, int num2) {   //i call the input methods from another Greatest_number program
		//String result;
		if (num1>num2) {
			 return num1+" is greater than "+num2;
		}
		else if (num1<num2) {
			return num2+" is greater than "+num1;
		}
		
		else {
			 return "both are equal";
		}
	//return result;
	}
	public void display(String result) {
		System.out.println(result);
	}

	public static void main(String[] args) {
		Greatest_number obj = new Greatest_number();
		int num1 = obj.a();
		int num2 = obj.b();
		GreatestNumber2 obj2 = new GreatestNumber2();
		String result = obj2.call(num1,num2);
		obj2.display(result);

	}

}
