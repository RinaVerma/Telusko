package seleniumtests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		//a.dismiss();
		/*driver.get("https://login.yahoo.com/account/create?authMechanism=primary&done=https%3A%2F%2Fwww.yahoo.com%2F&eid=100&add=1&src=fp-commerce&intl=us&lang=en-US&specId=yidReg");
		driver.findElement(By.id("reg-submit-button")).click();
		driver.manage().window().maximize();
		WebElement errmsg = driver.findElement(By.id("reg-error-lastName"));
		System.out.println(errmsg.getAttribute("Type"));
		System.out.println(errmsg.getText());
		WebElement msg = driver.findElement(By.id("usernamereg-altreg"));
		System.out.println(msg.getAttribute("Type"));
		System.out.println(msg.getText());
		System.out.println(msg.isDisplayed());
		System.out.println(msg.isEnabled());*/
		
	}

}
