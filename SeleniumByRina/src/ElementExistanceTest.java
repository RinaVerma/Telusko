import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExistanceTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver.", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Gmail"));
		try{if(driver.findElement(By.linkText("Gmail")).isDisplayed()){
			System.out.println("Gmail link exists");
		}}catch(NoSuchElementException e){
			System.out.println("Gmail link is not exists");
		}
		
		
		
	}

}
