package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		List<WebElement> lis=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
				
				System.out.println(lis.size());
				for( WebElement l:lis) {
					
					String i=l.getText();
						if(i.contains("iphone 14")) {
							l.click();
							break;
						
					}
				}
		
		
		

	}

}
