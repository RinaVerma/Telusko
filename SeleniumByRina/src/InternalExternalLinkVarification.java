import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternalExternalLinkVarification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver.", "C:/Users/Pankaj/Desktop/assignments/chromedriver.exe");
WebDriver driver = new ChromeDriver();
//launch the browser
driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");

 driver.findElement(By.linkText("Create account")).click();
 String CurrentURL = driver.getCurrentUrl();
 System.out.println(CurrentURL);
 if(CurrentURL.contains("wikipedia")){
	 System.out.println("It is internal link redirected to another page in same application then it is internal link");
 }else{
	 System.out.println("If it is not contains wikipedia , then it is not an internal link");
 }
 driver.navigate().back();
 driver.findElement(By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody/tr[10]/td/span/a")).click();
 String CurrentURL1 = driver.getCurrentUrl();
 System.out.println(CurrentURL1);
 if(!(CurrentURL1.contains("wikipedia"))){
	 System.out.println("It is External link redirected to another page in other application then it is External link");
 }else{
	 System.out.println("If it is not contains wikipedia , then it is not an external link");
 }
driver.close();
	}

}
