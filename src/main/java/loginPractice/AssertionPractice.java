package loginPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssertionPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anagha\\Downloads\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\Anagha\\Downloads\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)", "");
boolean result = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).isDisplayed();
if(result)
{
	System.out.println("Product is visible on screen");}
else
{
	System.out.println("Product is not visible on screen");}
driver.close();

		

	}

}
