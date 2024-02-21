import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import weather.Weather;

import static io.restassured.RestAssured.given;

public class GetWeatherOneDayTest extends AccuweatherAbstractTest {

    @Test
    void getWeatherOneDay() {

        Weather weather = given().queryParam("apikey", getApiKey())
                .when().get(getBaseUrl()+"/forecasts/v1/daily/1day/30")
                .then().statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract().response().body().as(Weather.class);

        Assertions.assertEquals(1,weather.getDailyForecasts().size());
    }
}
