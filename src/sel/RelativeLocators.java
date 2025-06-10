package sel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
  WebElement nameEditBox=driver.findElement(By.name("name"));
  System.out.print(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
  WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
    System.out.println(driver.findElement(By.className("alert-success")).getText());
	
    //driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();driver.findElement(By.cssSelector("label[for='exampleCheck1']")).click();
    WebElement rdb = driver.findElement(By.id("inlineRadio1"));
    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
	}

}
