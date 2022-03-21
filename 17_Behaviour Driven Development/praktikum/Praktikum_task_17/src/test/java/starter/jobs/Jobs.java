package starter.jobs;

import net.thucydides.core.annotations.Step;

public class Jobs {

    @Step("I Am on the Home Page")
    public void onTheHomePage(){

        System.out.println("I Am on the Home Page");
    }

    @Step("I click jobs icon")
    public void clickJobsIcon(){

        System.out.println("I click jobs icon");
    }

    @Step("I am on jobs page")
    public void onTheJobsPage(){

        System.out.println("I am on jobs page");
    }
}