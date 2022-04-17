package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class CalculatorScreen extends BasePageObject {

    private By NumberEightButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"8\"]");
    }

    private By NumberFourButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"4\"]");
    }

    private By EqualButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }

    private By AcButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"AC\"]");
    }

    private By AdditionButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\" + \"]");
    }

    private By SubtractionButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\" - \"]");
    }

    private By MultiplicationButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\" x \"]");
    }

    private By DivisionButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\" ÷ \"]");
    }

    private By calculatorLogo(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By result12() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"12\"]");
    }

    private By result4() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"4\"]");
    }

    @Step
    public boolean isOnPage() {
        return waitUntilPresence(calculatorLogo()).isDisplayed();
    }

    @Step
    public void tapACbtn() {
        onClick(AcButton());
    }

    @Step
    public void tapNumberEightButton() {
        onClick(NumberEightButton());
    }

    @Step
    public void tapNumberFourButton() {
        onClick(NumberFourButton());
    }


    @Step
    public void tapAdditionButton() {
        onClick(AdditionButton());
    }

    @Step
    public void tapSubtractionButton() {
        onClick(SubtractionButton());
    }


    @Step
    public void tapEqualButton() {
        onClick(EqualButton());
    }

    @Step
    public String getResultAddition() {
       return waitUntilPresence(result12()).getAttribute("content-desc");
    }

    @Step
    public String getResultSubtraction() {
        return waitUntilPresence(result4()).getAttribute("content-desc");
    }
}