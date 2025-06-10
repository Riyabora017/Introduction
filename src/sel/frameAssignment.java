package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameAssignment {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C://Users//LENOVO//Documents//chromedriver.exe");
     WebDriver driver = new ChromeDriver();	
   driver.get("https://the-internet.herokuapp.com/nested_frames");
   System.out.println(driver.findElements(By.tagName("frame")).size());
   driver.switchTo().frame("frame-top");
   driver.switchTo().frame("frame-middle");
  System.out.println(driver.findElement(By.id("content")).getText());
	}
}
