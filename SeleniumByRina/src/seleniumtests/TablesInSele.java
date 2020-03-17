 package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesInSele {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://elsasoft.com/samples/sqlserver_adventureworks/SqlServer.SPRING.KATMAI.AdventureWorks/allTables.htm");
		Thread.sleep(2000);
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='nstext']/table[1]/tbody/tr[7]/td[15]/span/span")).getText());
		WebElement table = driver.findElement(By.xpath("//*[@id='nstext']/table[1]"));
		List <WebElement> rows = table.findElements(By.tagName("td"));
		int s = rows.size();
		System.out.println(s);
		List <WebElement> col = table.findElements(By.tagName("tr"));
		int t = col.size();
		System.out.println(rows.indexOf(rows));
		System.out.println(t);
		List <WebElement> header = table.findElements(By.tagName("th"));
		int h = header.size();
		System.out.println(h);
		WebElement htmltable =  driver.findElement(By.xpath("//*[@id='nstext']/table[2]"));
		List <WebElement> rows1 = htmltable.findElements(By.tagName("tr"));
		System.out.println(rows1.size());
		List <WebElement> col1 = htmltable.findElements(By.tagName("th"));
		System.out.println(col1.size());
		List <WebElement> head = htmltable.findElements(By.tagName("td"));
		System.out.println(head.size());
		System.out.println(driver.findElement(By.xpath("//*[@id='nstext']/table[2]/tbody/tr[3]/td[1]/a")).getText());
		
		
		driver.close();
	}

}
