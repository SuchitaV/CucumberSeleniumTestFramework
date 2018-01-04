package cucumberSeleniumSupportingClassLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReusableClass {

	public static WebDriver driver;
	static File file;
	Properties prop;

	public String URL;

	public void readProperties() {

		file = new File("global.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();

		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getUrl() {
		readProperties();
		URL = prop.getProperty("URL");		
		return URL;

	}

	public WebDriver getWebdriver() {
		readProperties();

		if (prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/browsers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (prop.getProperty("Browser").equals("IE")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/browsers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		return driver;

	}

	public static void quitdriver() {

		driver.quit();

	}

}
