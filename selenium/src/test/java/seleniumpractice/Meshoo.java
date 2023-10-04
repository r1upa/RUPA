package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Meshoo {

	public static void main(String[] args) throws InterruptedException{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().refresh();
	driver.get("https://www.meesho.com/");
	
		driver.findElement(By.xpath("/input[/contains(@placeholder,'Product')]")).sendKeys("shirts");
		driver.findElement(By.xpath("/input[/contains(@placeholder,'Product')]")).click();
				
				
				
				}
			

		 
}		 
