import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import weather.Weather;

import static io.restassured.RestAssured.given;

public class GetWeather5DaysTest extends AccuweatherAbstractTest {

    @Test
    void getWeather5Day() {

        Weather weather = given().queryParam("apikey", getApiKey())
                .when().get(getBaseUrl()+"/forecasts/v1/daily/5day/50")
                .then().statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract().response().body().as(Weather.class);

        Assertions.assertEquals(5,weather.getDailyForecasts().size());
    }
}