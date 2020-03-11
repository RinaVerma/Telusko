import org.openqa.selenium.By;

public class WebdriverTests extends UserDefinedMethod{

	public static void main(String[] args) {
		// Test Case: Redirect to user interface from login interface.
		WebdriverTests obj = new WebdriverTests();
		obj.launchBrowser();
		obj.adminlog();
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
	}

}
