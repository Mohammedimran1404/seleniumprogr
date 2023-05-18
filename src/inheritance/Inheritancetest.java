package inheritance;

public class Inheritancetest {

	public static void main(String[] args) {
		//Inheritance obj = new Inheritance();
		Newinheritance obj = new Newinheritance();
		int lw = obj.scanintvlues(" lower limit");
		int up = obj.scanintvlues(" upper limit");
		int n= obj.scanintvlues(" the table you want ");
		obj.displaymultiples(lw,up,n);

	}

}
