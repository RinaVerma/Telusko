package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "C:/Users/Pankaj/Desktop/assignments/geckodriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.seleniumhq.org/");
				
				WebDriver driver1 = new FirefoxDriver();
			 
				driver1.get("https://www.seleniumhq.org/");
	}

}
