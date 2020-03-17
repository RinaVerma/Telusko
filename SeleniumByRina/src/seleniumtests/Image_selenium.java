package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_selenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement e = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/img"));
		e.click();
		System.out.println(e.getAttribute("type"));
		
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		System.out.println(e.isSelected());
		driver.navigate().to("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//*[@id='choice']/tbody/tr/td[1]/center/a[1]/img"));
		
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		System.out.println(e1.isSelected());
		
		System.out.println(e1.getAttribute("tag"));
		e1.click();
		driver.navigate().to("http://newtours.demoaut.com/");
		WebElement e2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		System.out.println(e2.getAttribute("type"));
		
		System.out.println(e2.isDisplayed());
		System.out.println(e2.isEnabled());
		e2.click();
		WebElement e3 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		System.out.println(e3.isDisplayed());
		System.out.println(e3.isEnabled());
		System.out.println(e3.getAttribute("name"));
		e3.click();
		
	}

	
}
