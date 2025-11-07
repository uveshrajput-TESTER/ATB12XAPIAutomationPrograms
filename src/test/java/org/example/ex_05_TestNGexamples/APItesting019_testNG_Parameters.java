package org.example.ex_05_TestNGexamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APItesting019_testNG_Parameters {
    @Parameters("Browser")
    @Test
    public void demo1(String value){
        if(value.equalsIgnoreCase("firefox")) {
            System.out.println("Start firefox");
        }
        if(value.equalsIgnoreCase("chrome")) {
            System.out.println("Start Chrome");
        }

    }
}
