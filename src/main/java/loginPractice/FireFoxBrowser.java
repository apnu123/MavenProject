package loginPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anagha\\OneDrive\\Desktop\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/");
	}

}
