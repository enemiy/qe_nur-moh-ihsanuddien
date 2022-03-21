package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Notification.Notifications;

public class NotificationSteps {
    @Steps
    Notifications notify;

    @Given("I am on the Home Page")
    public void onTheHomePage(){

        notify.onTheHomePage();
    }
    @When("I click notication icon")
    public void clickNotificationIcon(){

        notify.clickNotificationIcon();
    }

    @Then("I am on notifications page")
    public void onheNotificationPage(){

       notify.onTheNotificationPage();
    }
}