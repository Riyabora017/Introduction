package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
  driver.findElement(By.className("top")).sendKeys("rahul");
  driver.findElement(By.id("root")).sendKeys("hell01243");
  driver.findElement(By.name("root")).sendKeys("you");
  driver.findElement(By.className("signbtn")).click();
	}

}
