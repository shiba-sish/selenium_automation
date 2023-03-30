package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDetails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shibasish China\\eclipse-workspace\\selenium_automation\\all_necessary_file\\chromedriver.exe");
		//open the browser
		WebDriver driver = new ChromeDriver();
//		open the URL
//		driver.get("https://www.google.com");
		driver.navigate().to("https://www.flipkart.com");
//		get the title
		String title= driver.getTitle();
		System.out.println("title is ----->"+title);
//		get the URL
		String url = driver.getCurrentUrl();
		System.out.println("url is---->"+url);
//		get page source
		String ps = driver.getPageSource();
		System.out.println(ps);
//		wait for 5 sec
		Thread.sleep(1000);
//		close the browser
		driver.close();
	}

}
