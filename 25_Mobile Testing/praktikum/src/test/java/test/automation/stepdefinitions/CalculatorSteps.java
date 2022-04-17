package test.automation.stepdefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.remote.server.handler.FindElement;
import test.automation.pages.CalculatorScreen;

public class CalculatorSteps {
    @Steps
    CalculatorScreen calculatorScreen;

    @Given("user on calculator page")
    public void userOnCalculatorPage() {
        Assert.assertTrue(calculatorScreen.isOnPage());
    }

    @When("user click number eight button")
    public void userClickNumberEightButton() {
        calculatorScreen.tapNumberEightButton();
    }

    @And("user click addition")
    public void userClickAddition() {
        calculatorScreen.tapAdditionButton();
    }

    @And("user click number four button")
    public void userClickNumberFourButton() {
        calculatorScreen.tapNumberFourButton();
    }

    @And("user click equal")
    public void userClickEqual() {
    calculatorScreen.tapEqualButton();
    }

    @Then("User see result addition is {string}")
    public void userSeeResult(String result) {
        Assert.assertEquals(result,calculatorScreen.getResultAddition());
    }


    @And("user click subtraction")
    public void userClickSubtraction() {
        calculatorScreen.tapSubtractionButton();
    }

    @Then("User see result Subtraction is {string}")
    public void userSeeResultSubtractionIs(String numb) {
        Assert.assertEquals(numb,calculatorScreen.getResultSubtraction());
    }

    @And("user click All Clear")
    public void userClickAllClear() {
        calculatorScreen.tapACbtn();

    }
}
