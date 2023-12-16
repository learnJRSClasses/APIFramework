package Utills;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class RestAssuredUtills {

    public static Response perfromPost(String endpoint, Map<String, Object> Body, Map<String, Object> Heards)
    {
        return RestAssured.given().log().all()
                .baseUri(endpoint).body(Body).headers(Heards).post()
                .then().log().all().extract().response() ;

    }

    public static Response perfromget(String endpoint)
    {
        return RestAssured.given().log().all()
                .baseUri(endpoint).get()
                .then().log().all().extract().response();

    }

   /* @Test
    public void createMap()
    {
        Map<String,String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer ACCESS-TOKEN");

    }*/
}

//Endpoint - URl
//Body
//Headers
//Cookies
//JWT


