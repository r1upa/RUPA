package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("addBtn")).click();
		StringSelection path=new StringSelection("C:\\Users\\Admin\\Desktop\\JAVA ASSESSMENT 09.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Robot r=new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
