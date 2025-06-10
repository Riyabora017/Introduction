package sel;

import java.time.Duration;
import java.util.NoSuchElementException;
import com.google.common.base.Function;  // Correct one


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C://Users//LENOVO//Documents//chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    driver.findElement(By.cssSelector("[id='start'] button")).click();
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
//find just variable, in place of find we choose any variable
    	WebElement find = wait.until(new Function<WebDriver, WebElement>() {
    	    public WebElement apply(WebDriver driver) {
    	        WebElement element = driver.findElement(By.cssSelector("[id='finish'] h4"));
    	        if (element.isDisplayed()) {
    	            return element;
    	        } else {
    	            return null;
    	        }
    	    }
    	});
    	System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}

}
