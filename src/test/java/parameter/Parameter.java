package parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	
	@Test
	public void login() {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("gavaskarjp252@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Gowtham@170217");
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title is :"+ title);
		driver.quit();
		
	}

}
