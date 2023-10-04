package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametask2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement wb=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(wb);
		driver.findElement(By.id("firstName")).sendKeys("rupa");
		driver.findElement(By.id("lastName")).sendKeys("reddy");
		driver.findElement(By.id("femalerb")).click();
		List<WebElement>languages=(List<WebElement>) driver.findElement(By.className("bcCheckBox"));
		for(WebElement language:languages)
		
		{
			((WebElement) languages).click();
		}
		driver.findElement(By.id("email")).sendKeys("rupa.marolix@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("completed");

	}

}
