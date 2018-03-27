package SeleniumPractice.Selenium_Learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablePrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	List<WebElement> tablelist = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		
//		for(int i=0;i<tablelist.size();i++){
//			System.out.println(tablelist.get(i).getText());	
//		}
	
	//For each or enhanced for loop for table iteration
	for(WebElement names:tablelist ){
		System.out.println(names.getText());
	}
	}

}
