package SeleniumPractice.Selenium_Learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElemntsTEST {

//Conclusion: If the specified element does not find driver.find element give the exception no such element present 
// in this case driver.findelements does not give exception it returns list<WebElement> with size 0. 
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
//		WebElement a = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a"));
//		System.out.println(a.toString());
		
		List<WebElement> list = driver.findElements(By.xpath("//a1"));
		
		for(int i =0;i<list.size();i++){
			
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("Siaze of retrive list is"+list.size());
		
		driver.quit();
		

	}

}
