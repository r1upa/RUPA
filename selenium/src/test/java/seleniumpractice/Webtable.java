package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		int row=driver.findElements(By.xpath("table[@id='countries']/tbody/tr")).size();
		System.out.println(row);
		int coloum=driver.findElements(By.xpath("//table[@id='countries']//tr[1]td")).size();
		System.out.println(coloum);
		
		for (int i=2;i<=row;i++);
		{
			
			for(int j=2;j<=coloum;j++);
			{
				String value=driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]/td["+j+"]")).getText();
				if(value.contains("Ottawa"));
				{
					checkboxes(driver,i);
					break;
				}
				
			}
		}
		
	}	
	public static void checkboxes(WebDriver driver,int i)
	{
		driver.findElement(By.xpath("//table[@id='countries']//tr[1]td"));
	}
	

}