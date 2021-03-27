package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonUtilities {

	public WebDriver driver;
	public String WebURL;
	public Properties prop;
	public WebDriver invokebrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Rahul Shetty\\AutomationFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		WebURL=prop.getProperty("url");

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Rahul Shetty\\WebDrivers\\ChromeDriver\\chromedriver.exe");
			driver =new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("Webdriver.gecko.driver",
					"C:\\Rahul Shetty\\WebDrivers\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		return driver;

	}
}
