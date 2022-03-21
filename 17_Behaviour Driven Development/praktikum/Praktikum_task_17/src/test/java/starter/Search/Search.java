package starter.Search;

import net.thucydides.core.annotations.Step;

public class Search {

    @Step("I am on the home page")
    public void onHomePage(){

        System.out.println("I am on the home page");
    }

    @Step("I enter specific keywords")
    public void enterSpecificKeywords(){
        System.out.println("I enter specific keywords");
    }

    @Step("I click search")
    public void clickSearchButton(){

        System.out.println("I click search");
    }

    @Step("I am on result search page with keywords")
    public void onTheResultPage(){

        System.out.println("I am on result search page with keywords");
    }
}
