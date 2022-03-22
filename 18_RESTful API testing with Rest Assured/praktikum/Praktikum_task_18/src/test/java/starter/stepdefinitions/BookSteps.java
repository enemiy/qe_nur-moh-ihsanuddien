package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.book.GET;

public class BookSteps {
    @Steps
    GET get;

    @Given("I set GET api Endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP Request")
    public void sendGetHttpRequest(){
        get.sendHttpRequest();
    }

    @Then("I receive valid HTTP Response Code 200")
    public void receiveValidHttpResponse(){
        get.validateHttpResponse200();
    }

    @And("I receive valid data for detail book")
    public void receiveValidDataForDetailBooks(){
        get.validateDataDetailBooks();
    }

}