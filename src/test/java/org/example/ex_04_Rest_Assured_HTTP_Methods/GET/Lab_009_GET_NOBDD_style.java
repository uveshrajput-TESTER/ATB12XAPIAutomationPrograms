package org.example.ex_04_Rest_Assured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_009_GET_NOBDD_style {
         RequestSpecification r ;
         Response response ;
         ValidatableResponse vr ;
         String pincode ;
         @Test
         public void test_Get_NON_BDD_Style_Positive(){
             pincode = "122001";
             //Divide them into 3 Parts
             // give() - part 1
             r = RestAssured.given();
             r.baseUri("https://api.postalpincode.in");
             r.basePath("/pincode/" + pincode);
             // when() part 2 -
             response = r.when().log().all().get();
             System.out.println(response.asString());

             //then() - part 3   - validation
             vr = response.then().log().all();
             vr.statusCode(200);
             //write the further Assertions or Test cases also here
         }
    @Test
    public void test_Get_NON_BDD_Style_Negative(){
        pincode = "@";
        //Divide them into 3 Parts
        // give() - part 1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/"+ pincode);
        // when() part 2 -
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //then() - part 3   - validation
        vr = response.then().log().all();
        vr.statusCode(404);
        //write the further Assertions or Test cases also here
    }
    @Test
    public void test_Get_NON_BDD_Style_Postive2(){
        pincode = "90210";
        //Divide them into 3 Parts
        // give() - part 1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/"+ pincode);
        // when() part 2 -
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //then() - part 3   - validation
        vr = response.then().log().all();
        vr.statusCode(200);
        //write the further Assertions or Test cases also here
    }
}
