package loginPractice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class OpenCart_Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anagha\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\Anagha\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).click();
		driver.findElement(By.xpath("(//a[text()='Register'])[1]")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Hushar");
		driver.findElement(By.id("input-firstname")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-lastname")).sendKeys("Atishahana");
		driver.findElement(By.id("input-lastname")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-email")).sendKeys("husharAtishana@gmail.com");
		driver.findElement(By.id("input-email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-password")).sendKeys("MiEktachshana@123");
		driver.findElement(By.id("input-password")).sendKeys(Keys.TAB);
		boolean value = driver.findElement(By.id("input-newsletter-no")).isSelected();
		  driver.findElement(By.name("agree")).click();
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
