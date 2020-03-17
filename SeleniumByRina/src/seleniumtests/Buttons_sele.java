package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buttons_sele {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pizzahut.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div/a/picture/img")).click();
		driver.findElement(By.id("find-occasion-carryout")).click();
		driver.findElement(By.id("user-location")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ph-localization-id > div.row.ph-syo-results > div:nth-child(3) > div.ng-scope.ph-stores-group.ph-scrollbar > div > div:nth-child(1) > div > div > div > div.col-xs-12.ph-margin-top-15 > a > span")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[1]/div/ph-gfm-select/div/div[1]/i")).click();
		WebElement e1 = driver.findElement(By.id("crusts-option-H"));
		e1.click();
		System.out.println(e1.getAttribute("type"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		System.out.println(e1.isSelected());
		WebElement e2 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[4]/div/ph-gfm-select/div/div[1]/i"));
		e2.click();
		System.out.println(e2.getAttribute("type"));
		System.out.println(e2.isDisplayed());
		System.out.println(e2.isEnabled());
		System.out.println(e2.isSelected());
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[4]/div/ph-gfm-select/div/div[2]/ph-gfm-options/mat-selection-list/mat-list-option[1]/div")).click();;
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[4]/div/ph-gfm-select/div/div[2]/ph-gfm-options/mat-selection-list/mat-list-option[6]/div")).click();;
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[4]/div/ph-gfm-select/div/div[2]/ph-gfm-options/mat-selection-list/mat-list-option[8]/div")).click();;
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[4]/div/ph-gfm-select/div/div[2]/ph-gfm-options/mat-selection-list/mat-list-option[9]/div")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[6]/div/label/div")).click();;
		Select list = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div[2]/div/ph-go-for-more/div/div/div[3]/div/ph-gfm-pizza-tile/div/div/div[2]/div/div[2]/div[5]/div/div/div/label/select")));
		list.deselectByIndex(5);
		list.getFirstSelectedOption();
	list.getAllSelectedOptions();
	System.out.println(list.getOptions());
		list.selectByIndex(3);
		//list.selectByVisibleText("3");
	}	
}