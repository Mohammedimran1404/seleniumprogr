package constructors;

public class Checking2 {
	int a;
	public   Checking2(){ // without parameter
		a=100;
		System.out.println(a);
	}
	public Checking2(int a){ // with parameter
		this.a=a;/* "this" keyword is used to eliminate the confusion b/w class attributes and parameters 
		this.a means class level variable we are declaring*/
		System.out.println(a);
	}
public static void main(String[] args) {
	Checking2 obj = new Checking2();
	Checking2 obj2 = new Checking2();

}
}
