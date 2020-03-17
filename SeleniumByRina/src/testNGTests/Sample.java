package testNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
@Test
	public void VerifyTitle(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
	/*String s = driver.getTitle();
	System.out.println(s);*/
	}
	}


