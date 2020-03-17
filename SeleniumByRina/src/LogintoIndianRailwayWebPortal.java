import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoIndianRailwayWebPortal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.irctc.co.in");
	driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='loginText']")).click();
		driver.findElement(By.id("userId")).sendKeys("RinaPVerma");
		driver.findElement(By.id("pwd")).sendKeys("Pankajk1rani");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Captcha");
		String Captcha = scan.nextLine();
		driver.findElement(By.xpath("//*[@id='nlpAnswer']")).sendKeys(Captcha);
		driver.findElement(By.xpath("//*[@id='login_header_disable']/div/div[2]/app-login/div[2]/div/div[2]/div[3]/div[2]/form/button")).click();
		//driver.close();
	}

}
