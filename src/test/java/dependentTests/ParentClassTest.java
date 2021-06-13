package dependentTests;

import org.testng.annotations.Test;

public class ParentClassTest {
	
	@Test(dependsOnMethods = {"testTwo2"})
	public void testOne1() {
		System.out.println("Test method one");
	}
	
	@Test
	public void testTwo2() {
			System.out.println("Test Method Two");
	}
}
