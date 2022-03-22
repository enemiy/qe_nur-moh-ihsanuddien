package starter.book;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;

public class GET {

    public static String url ="https://demoqa.com/";

    @Step("I set GET api Endpoints")
    public String setApiEndpoints(){
        return url + "BookStore/v1/Book?ISBN=9781449325862";
    }

    @Step("I send GET HTTP Request")
    public void sendHttpRequest(){
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP Response Code 200")
    public void validateHttpResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail book")
    public void validateDataDetailBooks(){
        restAssuredThat(response->response.body("'author'", equalTo("Richard E. Silverman")));
    }
}