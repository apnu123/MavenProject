package loginPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RahulShettyAcademyLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anagha\\Downloads\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\Anagha\\Downloads\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.id("login")).click();
		String expectedTitle = "Let's Shop";
		String actualTitle = driver.getTitle();
		if (expectedTitle.contentEquals(actualTitle)) {
			System.out.println("User is successfully logged in app");
		} else {
			System.out.println("User is unable to login and some unexpected result is occured");
		}
		driver.close();

	}

}
