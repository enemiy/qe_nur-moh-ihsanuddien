package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.books.GET;

public class BooksSteps {
    @Steps
    GET get;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
        get.validateHttpResponse200();
    }

    @And("I receive valid data for detail books")
    public void receiveValidDataForDetailBooks(){
        get.validateDataDetailBooks();
    }

    }
