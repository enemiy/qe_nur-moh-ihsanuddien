package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By loginButton(){
        return By.id("login");
    }
    private By title() {
        return By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    }

    @Step
    public void validateHomePage(){
        $(title()).isDisplayed();
    }

    @Step
    public void openPage() {
        openUrl("https://demoqa.com/books");
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
}
