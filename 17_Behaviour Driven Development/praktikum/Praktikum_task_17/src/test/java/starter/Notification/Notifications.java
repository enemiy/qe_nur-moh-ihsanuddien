package starter.Notification;

import net.thucydides.core.annotations.Step;

public class Notifications {

    @Step("I am on the Home Page")
    public void onTheHomePage(){

        System.out.println("I am on the Home Page");
    }

    @Step("I click notication icon")
    public void clickNotificationIcon(){

        System.out.println("I click notication icon");
    }

    @Step("I am on notifications page")
    public void onTheNotificationPage(){

        System.out.println("I am on notifications page");
    }
}