package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WildAnimals1 {
	@BeforeTest
	public void wildAnimalsStart() {
		System.out.println("Wild animals starts here-->Before test");
	}
	@AfterTest
	public void wildAnimalsEnds() {
		System.out.println("Wild Animals ends Here --->After test");
	}
	@Test
	public void tiger() {
		System.out.println("WildAnimals1 ---> Tiger");
	}
	@Test
	public void lion() {
		System.out.println("WildAnimals1 ---> Lion");
	}

}
