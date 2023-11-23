package loginPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginToSwagLabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\SeleniumScript\\Vtest\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("E:\\Software Testing\\SeleniumScript\\Vtest\\chrome-win64\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//List<WebElement>ls=(List<WebElement>) driver.findElement(By.xpath("//div[@class='inventory_item_name ']"));
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		
		for(WebElement a:product)
		{
			if(a.getText().equalsIgnoreCase("Test.allTheThings() T-Shirt (Red)"))
					{
				a.click();
				driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
				driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
				driver.findElement(By.xpath("//button[@id='checkout']")).click();
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Anagha");
				driver.findElement(By.id("last-name")).sendKeys("Patil");
				driver.findElement(By.id("postal-code")).sendKeys("456789");
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				driver.findElement(By.xpath("//button[@id='finish']")).click();
				String expectResult="Thank you for your order!";
				String actualResult=driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
				System.out.println(actualResult);
				if(expectResult.equals(actualResult))
				{
					System.out.println("Order is placed successfully");
				}
				else
				{
					System.out.println("Order is not placed and some error is occured");
				}
					}
		}

	}

}
