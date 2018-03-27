package SeleniumPractice.Selenium_Learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListProgram1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		//To print all the company names
		
		List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		//To Print all the current Price
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
			System.out.println("Total Companies List Size is" +companynames.size());
		
		for(int i=0;i<companynames.size();i++){
			
//			System.out.println("Company is "+companynames.get(i).getText()+",and Price is "+currentprice.get(i).getText());
			if(companynames.get(i).getText().equals("HCL Technologies")){
				System.out.println("Your Comapny name is "+companynames.get(i).getText()+"and current price is "+currentprice.get(i).getText());
				break;
			}
			
		}
	}

}
	