package org.example.ex_04_Rest_Assured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.impl.execchain.RequestAbortedException;
import org.testng.annotations.Test;

public class Lab012_PUT_NON_BDDStyle {
    RequestSpecification r ;
    Response response ;
    ValidatableResponse vr ;
    @Test
    public void test_put_Non_Bdd(){
        String token = "a466df5e08a7d75";
        String bookingid = "2529";
        String payload = "{\n" +
                "    \"firstname\" : \"Saiaaaa\",\n" +
                "    \"lastname\" : \"Befew\",\n" +
                "    \"totalprice\" : 113432,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast and dinner\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload);
        response = r.when().log().all().put();

        vr = response.then();
        vr.statusCode(200);

    }
}
