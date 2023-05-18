package constructors;


public class Checking{
	int x ;
	int a;
	float f;
	String s;
	Checking(){
		System.out.println("hello i am constructor without parameter with out values so default values is invoke ");
		System.out.println(a+ " , " +f+" , " +s);/* here we are not declare any value in obj so the 
		constructor automatically assign the  default value*/
	}
	Checking(int x, int y){
		int res= x+y;
		System.out.println("hello i am constructor with parameter with assign values ");
		System.out.println(res);

	}
	
		public static void main(String[] args) {
			//Class name object name = new constructor call
		Checking obj = new Checking();
		Checking obj2 = new Checking(12,34);

	}
}

