package org.example.ex_05_TestNGexamples;

import org.testng.annotations.Test;

public class APITesting020_TestNG_Enabled {

    @Test
    public void test_t1(){
        System.out.println("1");
    }
    @Test(enabled = false)
    public void test_t2(){
        System.out.println("2");
    }
    @Test
    public void test_t3(){
        System.out.println("3");
    }
    @Test
    public void test_t4(){
        System.out.println("4");
    }
}
