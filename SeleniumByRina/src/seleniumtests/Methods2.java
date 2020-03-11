package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("http://www.Yahoo.com");
 driver.manage().window().maximize();
 driver.findElement(By.id("uh-signin")).click();
 Thread.sleep(2000);
 driver.navigate().to("http://newtours.demoaut.com/");
 Thread.sleep(3000);
 driver.navigate().back();
 driver.navigate().forward();
 driver.navigate().refresh();

 WebElement e = driver.findElement(By.linkText("Cruises"));
 System.out.println(e.isDisplayed());
 System.out.println(e.isEnabled());
 System.out.println(e.isSelected());
 System.out.println(e.getAttribute("type"));
 e.click();
 System.out.println(e.isSelected());
 Thread.sleep(3000);
 driver.close();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
