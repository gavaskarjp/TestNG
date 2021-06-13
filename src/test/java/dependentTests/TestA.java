package dependentTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestA {
	
	@Test(groups = "TestA")
    public void executeTest() {
 
        System.out.println("Executing testA");
        assertTrue(Boolean.TRUE,
                "Test A failed to pass the assertions  ");
 
    }
 
public class TestB {
    @Test(groups = "TestB", dependsOnGroups = "TestA")
    public void execute() {
        System.out.println("Executing testB");
        assertTrue(Boolean.TRUE,
                "Test B failed to pass the assertions ");
    }

}
}
