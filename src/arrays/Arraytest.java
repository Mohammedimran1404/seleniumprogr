package arrays;

public class Arraytest {

	public static void main(String[] args) {
		ArraysUsingMethods obj = new ArraysUsingMethods();
		int size = obj.arraysize();
		int a[] = obj.arrays(size);
		obj.displayarray(a);
	}
	

}
