package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Profile.Profile;

public class ProfileSteps {

    @Steps
    Profile profile;

    @Given("I am on home page")
    public void onTheHomePage(){

        profile.onTheHomePage();
    }
    @When("I click profile picture")
    public void clickProfilePicture(){

        profile.clickProfilePicture();
    }

    @Then("I am on the profile page")
    public void onTheProfilePage(){

        profile.onTheProfilePage();
    }
}