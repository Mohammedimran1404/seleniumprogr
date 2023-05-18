package methods;

import methods2.AreaOfRectangle;

public class Callingmethods {
	public static void main(String[] args) {
		//Methods_percentage.percentage();
		//Addition.add();
		//Nonstatic_areaofcircle obj = new Nonstatic_areaofcircle();
		//obj.circlee();
		//Multiplication obj = new Multiplication();
		//obj.mul();
	AreaOfRectangle obj = new AreaOfRectangle();
		 int length = obj.a();
		 int width = obj.b();
		int area = obj.result(length,width);
		obj.display(area);

		



	}

}
