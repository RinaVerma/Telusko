import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminlogin {

	public static void main(String[] args) {
		WebdriverManager.ChromeDriver.setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id='tdb1']/span[1]")).click();
		/*String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		if(CurrentUrl.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Adminlogin successful:- passed");
		}else{
			System.out.println("Adminlogin unsuccessful:- failed");*/
			//
			//Error Error: Invalid administrator login attempt.
			String url = driver.getCurrentUrl();
			
			if(url.contains("http://www.gcrit.com/build3/admin/login.php?action=process")){
				String errormsg = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
			
			System.out.println(errormsg);
			if(errormsg.contains("Invalid")){
				System.out.println("Handeling invalid inputs -- passed");
			}}else{
				System.out.println("Not Handeling invalid inputs -- failed");
			}
			driver.close();
		}
	}


