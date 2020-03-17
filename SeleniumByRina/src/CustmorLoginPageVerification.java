import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustmorLoginPageVerification {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/");
	driver.findElement(By.linkText("login")).click();
	driver.findElement(By.name("email_address")).
	sendKeys("rinaverma1981@yahoo.co.in");
	driver.findElement(By.name("password")).sendKeys("monu8jun");
	driver.findElement(By.className("ui-button-text")).click();
	String Link = driver.getCurrentUrl();
	System.out.println(Link);
	if(Link.equals("http://www.gcrit.com/build3/shopping_cart.php")){
		System.out.println("login is successful- passed");
	}else{
		System.out.println("login is unsuccessful- failed");
	}
	}

}
