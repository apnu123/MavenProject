package loginPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anagha\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.setBinary("C:\\Users\\Anagha\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	boolean result=driver.getPageSource().contains("Dashboard");
	if(result)
	{
		System.out.println("Successfully logged in app and user is on home page");}
	else
	{
		System.out.println("Some error occured");}
	driver.close();	
		}
}


