package org.example.ex_01_RA_Basic_Concepts;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {

    public static void main(String[] args) {
        System.out.println("Starting of program");
        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/pincode/560036")

                .when().get()

                .then().log().all().statusCode(200)
        ;
        System.out.println("End of program");
    }
}
