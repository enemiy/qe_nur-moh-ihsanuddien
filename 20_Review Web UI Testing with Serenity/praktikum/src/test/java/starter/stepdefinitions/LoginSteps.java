package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AccountPage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    AccountPage accountPage;

    @Given("I am on home page")
    public void onTheHomePage(){
        homePage.openPage();
        homePage.validateHomePage();
    }

    @And("I am on login page")
    public void iAmOnLoginPage() {
        homePage.clickLoginButton();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void inputValidUsername(){
        loginPage.inputUsername("ihsan");
    }

    @And("i input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Qwerty12345!");
    }

    @And("I click login button")
    public void clickLoginBtn(){
        loginPage.clickLoginButton();
    }

    @Then("I am on the account page")
    public void onTheAccountPage(){
        accountPage.validateOnAccountPage();
    }

    @When("I input wrong password")
    public void iInputWrongPassword(){
        loginPage.inputPassword("Wertyq!12345");
    }

    @Then("I can see error message {string}")
    public void iCanSeeErrorMessage(String message) {
        loginPage.validateErrorMessageDisplayed();
        loginPage.validateEqualErrorMesage(message);
    }


}
