package org.example.ex_02_RA_Concepts;

public class APITesting_Lab_004 {
    public APITesting_Lab_004 Step1(){
        System.out.println("Step 1");
        return this ;
    }
    public APITesting_Lab_004 Step2(){
        System.out.println("Step 2");
        return this ;
    }
    public APITesting_Lab_004 Step3(String word ){
        System.out.println(word);
        return this ;
    }
    public static void main(String[] args) {
        APITesting_Lab_004 bp = new APITesting_Lab_004();
        bp.Step1().Step2().Step3("Uvesh");
    }
}
