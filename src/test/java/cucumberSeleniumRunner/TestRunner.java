package cucumberSeleniumRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import cucumberSeleniumSupportingClassLibrary.ReusableClass;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "cucumberSeleniumStepDef" }, features = "src/test/resources/featurefiles", format = {
		"json:target/Destination/cucumber.json" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })
public class TestRunner {

	@AfterClass
	public static void setup() {
		ReusableClass.quitdriver();
	}

}
