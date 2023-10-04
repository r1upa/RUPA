package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://testautomationpractice.blogspot.com/");		
		
		driver.findElement(By.id("name")).sendKeys("Rupa");
		driver.findElement(By.id("email")).sendKeys("rupa.marolix@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("6305972177");
		driver.findElement(By.id("textarea")).sendKeys("Hyderabad");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("thursday")).click();
		
	}

}
