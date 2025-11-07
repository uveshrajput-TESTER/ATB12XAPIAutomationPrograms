package org.example.ex_04_Rest_Assured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_013_Patch_Non_BDD {
    RequestSpecification r ;
    Response response ;
    ValidatableResponse vr ;
    @Test
    public void test_patch_Non_Bdd(){
        String token = "0397a63d868dc41";
        String bookingid = "1353";
        String payload = "{\n" +

                "    \"lastname\" : \"Befew\",\n" +
                "    \"totalprice\" : 113432,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"additionalneeds\" : \"Breakfast and dinner\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload);
        response = r.when().log().all().patch();
        System.out.println(response.asString());
        vr = response.then();
        vr.statusCode(200);

    }
}
