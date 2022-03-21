package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.jobs.Jobs;

public class JobsSteps {
    @Steps
    Jobs jobs;

    @Given("I Am on the Home Page")
    public void onTheHomePage(){

        jobs.onTheHomePage();
    }
    @When("I click jobs icon")
    public void clickNotificationIcon(){

        jobs.clickJobsIcon();
    }

    @Then("I am on jobs page")
    public void onTheJobsPage(){

        jobs.onTheJobsPage();
    }
}