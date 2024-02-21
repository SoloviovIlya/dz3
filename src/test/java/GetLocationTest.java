import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import location.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetLocationTest extends AccuweatherAbstractTest{

    @Test
    void getLocationAsStringTest() {
        Map<String, String> params = new HashMap<>();
        params.put("apikey", getApiKey());
        params.put("q", "Berlin");
        String json = given().queryParams(params)
                .when().get(getBaseUrl()+"/locations/v1/cities/search")
                .then().statusCode(200)
                .extract().asString();

        Assertions.assertAll(
                ()->Assertions.assertTrue(json.contains("Berlin")),
                ()->Assertions.assertTrue(json.contains("Germany"))
        );
    }
    @Test
    void getLocationAsLocation() {

        Map<String, String> params = new HashMap<>();
        params.put("apikey", getApiKey());
        params.put("q", "Berlin");
        List<Location> locations = given().queryParams(params)
                .when().get(getBaseUrl()+"/locations/v1/cities/search")
                .then().statusCode(200)
                .extract().body().jsonPath().getList(".", Location.class);

        Assertions.assertAll(
                ()->Assertions.assertEquals("Berlin",locations.get(0).getLocalizedName()),
                ()->Assertions.assertEquals("Germany",locations.get(0).getCountry().getLocalizedName()),
                ()->Assertions.assertEquals("DE",locations.get(0).getCountry().getId()),
                ()->Assertions.assertEquals("BE",locations.get(0).getAdministrativeArea().getId())
        );
    }
}
