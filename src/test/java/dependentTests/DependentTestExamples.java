package dependentTests;

import org.testng.annotations.Test;

public class DependentTestExamples extends ParentClassTest {
	
	@Test(dependsOnMethods = {"testOne1"})
	public void testThree3() {
		
		System.out.println("The Method Three");
	}
	@Test(dependsOnMethods = {"testTwo2"})
	public void testFour4() {
		System.out.println("The Method Four");
	}
}
