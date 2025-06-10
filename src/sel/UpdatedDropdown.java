package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	  driver.findElement(By.id("divpaxinfo")).click();
	  Thread.sleep(1000L);
	  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	  for(int i=1;i<=4;i++) {
		  driver.findElement(By.id("hrefIncAdt")).click();
	  }
	   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	   
		  driver.findElement(By.id("btnclosepaxoption")).click(); 
//		 driver.findElement(By.id("btnclosepaxoption")).click();



System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}
}
