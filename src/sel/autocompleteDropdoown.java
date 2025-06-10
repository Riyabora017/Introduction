package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompleteDropdoown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//LENOVO//Documents//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String choose = driver.findElement(By.id("autocomplete")).getAttribute("value");

		System.out.println("select:"+choose);
		driver.quit();
	}

}
