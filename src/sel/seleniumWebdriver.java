package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWebdriver {

	public static void main (String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//LENOVO//	Documents//ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
