package cucumberSeleniumStepDef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberSeleniumPageObjects.GoogleHomepagePo;

public class GoogleStepDef {
	GoogleHomepagePo gp;

	public GoogleStepDef() {
		gp = new GoogleHomepagePo();
	}

	@Given("^I am on Google homepage$")
	public void i_am_on_Google_homepage() throws Throwable {
		gp.getHomepage();
	}

	@Then("^I should verify links below$")
	public void i_should_verify_links_below(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();

		gp.verifyLink(data.get(1).get(0), data.get(1).get(1));
		gp.verifyLink(data.get(2).get(0), data.get(2).get(1));

	}

	@Then("^I verify Google search \\\"(.*?)\\\"field$")
	public void i_verify_field(String arg1) throws Throwable {
		gp.verifyField(arg1);

	}

}
