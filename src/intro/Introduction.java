package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Introduction {

	public static void main(String[] args) {

// all type of browser openning
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shibasish China\\eclipse-workspace\\selenium_automation\\all_necessary_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shibasish China\\eclipse-workspace\\selenium_automation\\all_necessary_file\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");
		driver1.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shibasish China\\eclipse-workspace\\selenium_automation\\all_necessary_file\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.google.com");
		driver2.close();
		
//		WebDriver driver3 = new InternetExplorerDriver();
//		driver3.get("https://www.google.com");
//		driver3.close();
	}

}
