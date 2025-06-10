package sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScopeAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//LENOVO//Documents//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://qaclickacademy.com/practice.php");

        // Click checkbox
        WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
        checkbox.click();

        // Get label text using XPath
        String optionText = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();

        // Select from static dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(optionText);

        // Enter the same text in the input box
        driver.findElement(By.name("enter-name")).sendKeys(optionText);
driver.findElement(By.id("alertbtn")).click();
String text=  driver.switchTo().alert().getText();
if(text.contains(optionText)) {
	System.out.println("Alert-message-successful");
}else {
	System.out.println("Someting error");
}
    }
}
