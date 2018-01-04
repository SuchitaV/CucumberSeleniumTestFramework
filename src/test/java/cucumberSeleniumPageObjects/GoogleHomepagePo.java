package cucumberSeleniumPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumberSeleniumSupportingClassLibrary.ReusableClass;

public class GoogleHomepagePo extends ReusableClass {

	public GoogleHomepagePo() {

		driver = getWebdriver();

	}

	public void getHomepage() {
		URL = getUrl();

		driver.get(URL);
	
	}

	public void verifyLink(String cName, String lName) {
		assert (driver.findElement(By.xpath(cName)).getText().equals(lName));
	}

	public void verifyField(String selector) {
		driver.findElement(By.cssSelector(selector));
	}

}
