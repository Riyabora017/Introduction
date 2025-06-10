package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Seldropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        //driver.findElement(By.cssSelector("ui-state-default ui-state-active")).click();
//	        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
	        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//	        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
	         if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("")) {
	        	  
	        	   System.out.println("its enabled");
	        	   Assert.assertTrue(true);
	         }
	         else {
	        	 Assert.assertTrue(false);
	         }
	         
		}
	
	}
