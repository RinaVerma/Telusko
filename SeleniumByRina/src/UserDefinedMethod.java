import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDefinedMethod {
	//public static WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	public static WebDriver driver ;
	public void launchBrowser(){
		driver = new ChromeDriver();
	}
	public void adminlog(){
	System.setProperty("webdriver.chrome.driver","C:/Users/Pan	kaj/Desktop/assignments/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@	123");
	driver.findElement(By.id("tdb1")).click();
	}
	public void adminlog1(String username, String Password){
		System.setProperty("webdriver.chrome.driver","C:/Users/Pan	kaj/Desktop/assignments/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.id("tdb1")).click();
		}
	public void closeBrowser(){
		if(!driver.toString().contains("null")){
			driver.close();
		}
	}
	public static void main(String[] args) {
		UserDefinedMethod var1 = new UserDefinedMethod();
		var1.launchBrowser();
		var1.adminlog();
		var1.closeBrowser();
		var1.launchBrowser();
		var1.adminlog1("admin","admin@123");
		var1.closeBrowser();
	}

}
