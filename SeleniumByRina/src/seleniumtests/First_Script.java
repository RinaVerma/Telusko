package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Script {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("selenium_(software)");
		driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button/i")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create account")).click();
		String s = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		/*if(s.equals("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29")){
			System.out.println("Script is right");
		}else{System.out.println("Script is wrong");}
		*/
		if(s.endsWith("28software%29")){
			System.out.println("Script is right");
		}else{System.out.println("Script is wrong");}
		driver.findElement(By.id("wpName2")).sendKeys("ChandravatiDevi");
		driver.findElement(By.id("wpPassword2")).sendKeys("xxxx");
		driver.findElement(By.id("wpRetype")).sendKeys("xxxx");
		driver.findElement(By.id("wpEmail")).sendKeys("sejalverma2006@gmail.com");
		String s2 = driver.findElement(By.className("fancycaptcha-image")).getText();
		System.out.println(s2);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody/tr[10]/td/span/a")).click();
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		if(s1.equals("https://www.seleniumhq.org/")){
			System.out.println("We are on correct page ");
			
		}else{
			System.out.println("We are on wrong page ");
		}
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1400)", "");
		
	}

}
