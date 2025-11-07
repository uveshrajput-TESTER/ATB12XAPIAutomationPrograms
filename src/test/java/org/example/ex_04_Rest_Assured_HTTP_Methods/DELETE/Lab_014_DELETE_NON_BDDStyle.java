package org.example.ex_04_Rest_Assured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_014_DELETE_NON_BDDStyle {
    RequestSpecification r ;
    Response response ;
    ValidatableResponse vr ;
    @Test
    public void test_Delete_non_BDD_STYLE(){
        String token = "56d26716053cf49";
        String bookingid ="584";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);

        response = r.when().log().all().delete();
        System.out.println(response.asString());
        vr = response.then();
        vr.statusCode(201);
    }
}
