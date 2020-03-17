package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
driver.manage().window().maximize();
driver.findElement(By.name("userName")).sendKeys("Rina");
WebElement e = driver.findElement(By.name("userName"));
System.out.println(e.getAttribute("type"));

//System.out.println(e.getText());
System.out.println(e.isDisplayed());
System.out.println(e.isEnabled());
System.out.println(e.isSelected());
	}

}
