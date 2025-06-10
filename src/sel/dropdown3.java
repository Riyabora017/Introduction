//Autosuggest
package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	        
	        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //count no.of checkboxes
	        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	        
	        driver.findElement(By.id("autosuggest")).sendKeys("ind");
      
      Thread.sleep(1000);
      List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
     for(WebElement option : options) {
	if(option.getText().equalsIgnoreCase("India")) {
		option .click();
		break;
	}
	
}
}
}