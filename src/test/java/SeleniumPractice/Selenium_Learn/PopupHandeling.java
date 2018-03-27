
//This code is written by Raghvendra to practic Selenium Program

package SeleniumPractice.Selenium_Learn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Iterators;

public class PopupHandeling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows.size());
	
		Iterator itr = windows.iterator();
		
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		
		while(itr.hasNext()){ 
			
			System.out.println(itr.next());
		}
		

	}

}
