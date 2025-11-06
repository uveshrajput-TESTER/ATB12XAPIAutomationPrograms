package org.example.ex_04_Rest_Assured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_008_GET_BDDstyle {
    //BDD Style
    @Test
    public void test_GET_Positive_Testcase1(){
        String Pincode = "122001";
        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
