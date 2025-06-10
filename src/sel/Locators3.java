package sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//id
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//name
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//by class
		driver.findElement(By.className("submit")).click();
	//by cssSelector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	 //by LinkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("riya");
	   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("riya871@gmail.com");
	   driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

	   driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("riya@gmail.com");
	   driver.findElement(By.xpath("//form/input[3]")).sendKeys("893645525");
       driver.findElement(By.cssSelector("Button.reset-pwd-btn")).click();
     System.out.println(driver.findElement(By.cssSelector("form p")).getText());  
     driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
     driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
     driver.findElement(By.id("chkboxOne")).click();
     driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  
	}

}
