package arrays;

public class ReverseOfArray extends ArraysUsingMethods{
	public void  reversearrayformula(int a[]) {
		System.out.println("Reverse of an array is ");
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
	}
	public static void main(String[] args) {
		ReverseOfArray obj = new ReverseOfArray();
		int size = obj.arraysize();
		int a[] = obj.arrays(size);
		obj.reversearrayformula(a);
	}

		
		

}
