package org.example.ex_05_TestNGexamples;

import org.testng.annotations.Test;

public class APITesting018_testNG_DependsOnMethods {
    @Test
    public void serverstartok(){
        System.out.println("first Server Start");
    }
    @Test(dependsOnMethods = "serverstartok")
    public void test1(){
        System.out.println("Then test1 run");
    }
    @Test(dependsOnMethods = "serverstartok")
    public void test2(){
        System.out.println("in end test2 run");
    }
}
