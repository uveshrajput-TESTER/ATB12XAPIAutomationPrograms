package org.example.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab_005_Multiple_testCases {
    public static void main(String[] args) {
        String Pincode = "122001";
        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        Pincode = "@";
        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        Pincode = " ";
        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        Pincode = "90210";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath( "/us/"+ Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
        Pincode = "@";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath( "/us/"+ Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
//        https://api.zippopotam.us/us/90210

    }
}
