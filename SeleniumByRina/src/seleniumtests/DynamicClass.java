package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("java");
		Thread.sleep(2000);
		/*List<WebElement> li = driver.findElements(By.className("sbtc"));
		System.out.println(li.size());
		for(int i=0; i<li.size();i++){
			//System.out.println(li.get(i).getText());
			String s = li.get(i).getText();
			if(s.contains("snake")){
				li.get(i).click();
				System.out.println(li.get(i).getText());
				break;*/
		
			}
		/*driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hand");
		//twotabsearchtextbox
		List<WebElement> list = driver.findElements(By.className(className));
		*/
		
	
}

