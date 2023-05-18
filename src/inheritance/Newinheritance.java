package inheritance;

public class Newinheritance extends Inheritance { //inheritance 
	public void displaymultiples(int lw,int up,int n) { // method over riding --> means  the method name and parameter of child class
		                                                 // and parent class is same is called method over riding
		for(int i=lw;i<=up;i++) {                        
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}
public void displaymultiples(int n) { // just for showing purpose
	for(int i=1;i<=10;i++) {
	System.out.println(n+"x"+i+"="+n*i);
	}
	
}

}

