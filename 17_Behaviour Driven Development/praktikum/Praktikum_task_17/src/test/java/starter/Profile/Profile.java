package starter.Profile;

import net.thucydides.core.annotations.Step;

public class Profile {

        @Step("I am on home page")
        public void onTheHomePage(){

            System.out.println("I am on the home page");
        }

        @Step("I click profile picture")
        public void clickProfilePicture(){

            System.out.println("I click profile picture");
        }

        @Step("I am on the profile page")
        public void onTheProfilePage(){

            System.out.println("I am on the profile page");
        }
}
