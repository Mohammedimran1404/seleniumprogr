package arrays;

public class Arraysum extends ArraysUsingMethods {
	public int sum(int a[]) {
		int sum = 0;
		for (int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}
	//public void display(  int sum) {
		//System.out.println("sum of array is : "+sum);
	//}
	public static void main(String[] args) {
		Arraysum obj = new Arraysum();
		int size = obj.arraysize();
		int a[] = obj.arrays(size);
		int sum = obj.sum(a);
		//obj.displayarray(a);
		obj.display("sum of array is: ",sum);


	}
	

}
