package sel;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//  WebElement dropdown=driver.findElement(By.id("page-menu"));
//  Select staticdropdown=new Select(dropdown);
//  staticdropdown.selectByVisibleText("20");
//click column
    driver.findElement(By.xpath("//tr/th[1]")).click();
    
    //capture all webelement into list
    List<WebElement>elementsList= driver.findElements(By.xpath("//tr/td[1]"));
    
    //capture text of all webelement into new originallist
    List<String>originallist=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
   
    //sort in the  list of step3 ->sortedList
   List<String>sortedList=originallist.stream().sorted().collect(Collectors.toList());
    
   //compare original List or sorted list
   Assert.assertTrue(originallist.equals(sortedList));
   List<Object>price;
   //scan the name column with getText->Beans>print the price of the element
 do {  
	List<WebElement>rows= driver.findElements(By.xpath("//tr/td[1]"));
	 price=rows.stream().filter(s->s.getText().contains("Rice"))
		 .map(s->getPriceVeggie(s)).collect(Collectors.toList());
	price.forEach(a->System.out.println(a));
	if(price.size()<1) {
		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
	}
 }
	while(price.size()<1);
 }

	
	
	
	private static Object getPriceVeggie(WebElement s) {
		String Pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Pricevalue;
	}	

}
