package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Search.Search;
import starter.login.Login;

public class SearchSteps {
    @Steps
    Search search;

    @Given("I am on the Home page")
    public void onHomePage(){

        search.onHomePage();
    }
    @When("I enter specific keywords")
    public void enterSpecificKeywords(){

        search.enterSpecificKeywords();
    }

    @And("I click search")
    public void clickSearchButton(){

        search.clickSearchButton();
    }

    @Then("I am on result search page with keywords")
    public void onTheResultPage(){

        search.onTheResultPage();
    }
}
