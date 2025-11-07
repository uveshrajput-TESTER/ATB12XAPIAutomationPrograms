package org.example.ex_05_TestNGexamples;

import org.testng.annotations.Test;

public class APITesting017_TestNG_Groups {
    @Test(groups = {"sanity","reg"})
    public void test_Sanity(){
        System.out.println("Sanity");
    }
    @Test(groups = {"reg"})
    public void test_reg(){
        System.out.println("reg");
    }

    @Test(groups = {"smoke","reg"})
    public void test_smoke(){
        System.out.println("Smoke");
    }

}
