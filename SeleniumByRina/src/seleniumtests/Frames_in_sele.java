package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_in_sele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		/*driver.switchTo().frame(0);
		 driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.switchTo().frame(2);
		 driver.findElement(By.linkText("org.openqa.selenium")).click();*/
		 //window 2-  classFrame
		 //window 1- packageFrame
		 //window 0- packageListFrame
		 
		// driver.switchTo().defaultContent();
		 driver.switchTo().frame("packageListFrame");
		 driver.findElement(By.linkText("org.openqa.selenium")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("classFrame");
		 driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 driver.switchTo().frame("packageFrame");
		 driver.findElement(By.xpath("/html/body/div/ul[1]/li[3]/a/span")).click();
		 
	}

}
