package sel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
   	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://www.saucedemo.com/");
       //id locator
     driver.findElement(By.id("user-name")).sendKeys("riya");
    //name locator
	driver.findElement(By.name("password")).sendKeys("riya213");
	//css selector
	System.out.println(driver.findElement(By.cssSelector("h3[data-test='error']")).getText());
  //xpath
	driver.findElement(By.xpath("//input[@placeholder=Username]")).sendKeys("John");
	//LinkText
	driver.findElement(By.linkText("forgot your password")).click();
	
	//index
	driver.findElement(By.xpath("//input[@type='text']:[2]")).clear();
	driver.findElement(By.cssSelector("input[type='text']:nth-child(2")).sendKeys("john@213");
	//parent to child class
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9877336510");
	//user
	
	}
}
