package SeleniumPractice.Selenium_Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTestWithGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com/");
		driver.get("https://www.google.com");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		

	}

}
