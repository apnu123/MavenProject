package loginPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginWithValidData {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\SeleniumScript\\Vtest\\chromedriver-win64\\chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.setBinary("E:\\Software Testing\\SeleniumScript\\Vtest\\chrome-win64\\chrome.exe");
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
//close program

}
