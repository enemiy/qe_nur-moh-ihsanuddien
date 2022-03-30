package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {
    private By userNameDisplay() {
        return By.id("userName-value");
    }

    @Step
    public boolean validateOnAccountPage(){

        return $(userNameDisplay()).isDisplayed();
    }
}
