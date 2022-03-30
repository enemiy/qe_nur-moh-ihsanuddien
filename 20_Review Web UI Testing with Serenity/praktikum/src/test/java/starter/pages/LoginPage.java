package starter.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject{
    private By loginPageTitle() { return By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");}
    private By usernameField(){
             return By.id("userName");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    private By errorMessage(){
        return By.xpath("//*[@id=\"name\"]");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginPageTitle()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMesage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

}
