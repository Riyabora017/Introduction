package sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowTestAssignment {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//LENOVO//Documents//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/windows");
    driver.findElement(By.linkText("Click Here")).click();
    Set<String> windows= driver.getWindowHandles();
   Iterator<String> it = windows.iterator();
   String parentId = it.next();
   String childId = it.next();
   driver.switchTo().window(childId);
   System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
   driver.switchTo().window(parentId);
   System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

	}

}
