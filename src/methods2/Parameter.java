package methods2;

public class Parameter {
	public int result(int length, int width) {
		int peri= 2*length+2*width;
		return peri;
		
	}
	public void display(int peri) {
		System.out.println("perimeter of rectangle is : "+peri);	
	}

	public static void main(String[] args) {
		AreaOfRectangle obj = new AreaOfRectangle();
		int length = obj.a();
		int width = obj.b();
		Parameter obj2 = new Parameter();
		int peri =obj2.result(length,width);
		obj2.display (peri);
		

	}

}
