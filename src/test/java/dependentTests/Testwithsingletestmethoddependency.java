package dependentTests;

import org.testng.annotations.Test;

public class Testwithsingletestmethoddependency {

	
		
		@Test(dependsOnMethods = {"testTwo"})
		public void testOne() {
				System.out.println("Test Method One");
			
		}
		@Test
		public void testTwo() {
			System.out.println("Test method two");
		}
	

}
