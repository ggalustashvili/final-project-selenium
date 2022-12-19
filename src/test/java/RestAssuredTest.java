import static io.restassured.RestAssured.*;
import org.testng.Assert;
import java.util.Collections;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class RestAssuredTest {

    @Test
    public void extractSingleValueFromResponse(){
         String extract1 = given()
                .when()
                .get("http://ergast.com/api/f1/2017/circuits.json")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .path("MRData.CircuitTable.Circuits.circuitId[1]");
        Assert.assertEquals(extract1 , "americas");
    }
    @Test
    public void extractSingleValueFromResponse1(){
        String  extract2 = given()
                .when()
                .get("http://ergast.com/api/f1/2017/circuits.json")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .path("MRData.CircuitTable.Circuits.circuitId[5]");

        Assert.assertEquals(extract2 , "hungaroring");

    }

    @DataProvider(name="circusId")
    public Object[][] createTestDataRecords(){
        return new Object[][]{
                {"americas"},
                {"hungaroring"}
        };
    }
    @Test (dataProvider="circusId")
    public void ValidateValues(String circusId){
        given().
                pathParam("circuitID" ,  circusId).
                when().
                get("http://ergast.com/api/f1/circuits/{circuitID}.json").
                then().
                log().body();
    }


}
