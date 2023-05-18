package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DomesticAnimals2 {
	@BeforeClass
	public void domesticAnimalsStarts2() {
		System.out.println("domesticanimals2 starts here --> before class");
	}
	@AfterClass
	public void domesticAnimalsends2() {
		System.out.println("domesticanimals2 endss here ---> after classs");
	}
	@Test
	public void cat() {
		System.out.println("cat --> DomesticAnimals2");
	}
	@Test
	public void hen() {
		System.out.println("hen --> DomesticAnimals2");
	}

}
