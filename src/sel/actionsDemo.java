package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C://Users//LENOVO//Documents//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://amazon.com/");
         Actions a = new Actions(driver);
         WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); 
        a.moveToElement((WebElement) driver.findElements(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
         a.moveToElement(move).contextClick().build().perform();
	}

}


