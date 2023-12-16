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

    public static Response perfromPut(String endpoint, Map<String, Object> Body, Map<String, Object> Heards)
    {
        return RestAssured.given().log().all()
                .baseUri(endpoint).body(Body).headers(Heards).put()
                .then().log().all().extract().response() ;

    }


}

//Endpoint - URl
//Body
//Headers
//Cookies
//JWT


