package package_loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Selenium_Google {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		String path = "C:\\Users\\Geethika-Pc\\Downloads\\chromedriver_win32(1)";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethika-Pc\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.gooogle.com");
		System.out.println(driver.getTitle());*/
		
		//String path = "C:\\Users\\Geethika-Pc\\Downloads\\chromedriver_win32(1)";
		System.setProperty("webdriver.chrome.driver", "./server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
