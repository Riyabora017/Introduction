import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Invoking webdriver
		//ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new safariDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
	
//		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
		
		   //Firefox launch 
		//geckdriver
//	       System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Documents\\geckodriver.exe");
//	       WebDriver driver = new FirefoxDriver();
			//Microsoft Edge driver
	       System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Documents\\msedgedriver.exe");
	       WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:3000");
		System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
//       driver.close();
//       driver.quit();	
		
       
    
	}

}
