package starter.books;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;

public class GET {

    public static String url ="https://demoqa.com/";

    @Step("I set GET api endpoints")
    public String setApiEndpoints(){
        return url + "BookStore/v1/Books";
    }

    @Step("I send GET HTTP request")
    public void sendHttpRequest(){
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail books")
    public void validateDataDetailBooks(){
        restAssuredThat(response->response.body("'books'[0].'title'", equalTo("Git Pocket Guide")));
    }
}
