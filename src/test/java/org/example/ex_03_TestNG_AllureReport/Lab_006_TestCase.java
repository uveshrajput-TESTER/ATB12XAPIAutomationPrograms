package org.example.ex_03_TestNG_AllureReport;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class Lab_006_TestCase {
    @Test
    public void test_GET_Positive_Testcase1(){
        String Pincode = "122001";
        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void test_GET_Positive_Testcase2(){
        Pincode = "@";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath( "/us/"+ Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
//        https://api.zippopotam.us/us/90210
    }
    @Test
    public void test_GET_Positive_Testcase3(){
        Pincode = "90210";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath( "/us/"+ Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
