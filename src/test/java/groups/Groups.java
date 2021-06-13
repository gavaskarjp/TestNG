package groups;

import org.testng.annotations.Test;

public class Groups {
	@Test(priority = 1,groups = "smoke")
	public void signUp() {
		System.out.println("signUp");
	}
	@Test(priority = 2,groups = "sanity")
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 3,groups = "regression")
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(priority = 4,groups = "smoke")
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(priority = 5,groups = "regression")
	public void signOut() {
		System.out.println("signOut");
	}
	
}
