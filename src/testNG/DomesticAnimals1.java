package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DomesticAnimals1 {
	@BeforeSuite
	public void welcome() {
		System.out.println("Welcome too zoo ---> beforesuite");
	}
	@AfterSuite
	public void visitAgain() {
		System.out.println("Visit again ---> Aftersuite");
	}
	@Test(priority=1)
	public void cow() {
		System.out.println("DomesticAnimals1 ---> cow");
	}
	@Test(priority=2)
	public void dog() {
		System.out.println("DomesticAnimals1 ---> dog");
	}
}