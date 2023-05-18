package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WildAnimals2 {
	@BeforeMethod
	public void welcome() {
		System.out.println("Welcome to wild animals2 method");
	}
	@AfterMethod
	public void visitagain() {
		System.out.println("Visit again to wildanimals 2 after method");
	}
	@Test
	public void deer() {
		System.out.println("deer --> WildAnimals2");
	}
	@Test
	public void dinasour() {
		System.out.println("dinasour --> WildAnimals2");
	}
}
