package org.example.ex_05_TestNGexamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_015_BeforeTest_AfterTest_Annotations {
    //PUT Request -
    // 1. gettoken
    // 2.getBookingid
    // 3. test_PUT(Which will use above two methods   )
    // 4. closeAllthings
    @BeforeTest
    public void getToken(){
        System.out.println("Before Get Token ");
    }
    @BeforeTest
    public void getBookingid(){
        System.out.println("Before  Get Booking ");
    }
    @Test
    public void test_01(){
        System.out.println("actual test");
    }
    @AfterTest
    public void closeAllthings(){
        System.out.println("i will closed all the things ");
    }

}
