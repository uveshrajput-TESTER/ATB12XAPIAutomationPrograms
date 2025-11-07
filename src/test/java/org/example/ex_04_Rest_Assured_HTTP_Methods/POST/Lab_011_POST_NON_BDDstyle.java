package org.example.ex_04_Rest_Assured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class Lab_011_POST_NON_BDDstyle {
    RequestSpecification r ;
    Response response ;
    ValidatableResponse vr ;
    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    @Test
    public void test_Post_NON_BDDStyle_Create_Token(){
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.log().all();
        r.body(payload);

        response = r.when().log().all().post();
        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
