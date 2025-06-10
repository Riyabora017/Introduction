package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
	       driver.findElement(By.xpath("//[@value='MAA']")).click();
	}

}
