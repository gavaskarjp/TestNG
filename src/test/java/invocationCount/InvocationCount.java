package invocationCount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {
	
	@Test(invocationCount = 5)
	
	public void lunchBrowser() {
	
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("appa", Keys.ENTER);
		List<WebElement> cricketWord = driver.findElements(By.xpath("//*[contains(text(),'appa') or contains(text(),'Appa')]"));
		System.out.println(cricketWord.size());
		driver.quit();
	}

}
