package org.example.ex_05_TestNGexamples;

import org.testng.annotations.Test;

public class APITesting022_TestNG_invocationTime {
    @Test(invocationCount = 1)
    public void test_t1(){
        System.out.println("1");
    }
    @Test(invocationCount = 2)
    public void test_t2(){
        System.out.println("2");
    }
    @Test(invocationCount = 3)
    public void test_t3(){
        System.out.println("3");
    }
    @Test(invocationCount = 4)
    public void test_t4(){
        System.out.println("4");
    }
}
