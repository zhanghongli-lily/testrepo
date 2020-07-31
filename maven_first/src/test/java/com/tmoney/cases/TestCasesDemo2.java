package com.tmoney.cases;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCasesDemo2 {
    @Test
    @DisplayName("TestCasesDemo2-testCase1")
    public void testCase1(){
        System.out.println("");
        RestAssured.given()
                .get("https://test.tengmoney.com/caizhi_web_manage/#/login")
                .then().statusCode(200);
    }
    @Test
    @DisplayName("TestCasesDemo2-testCase2")
    public void testCase2(){
        RestAssured.given()
                .get("https://test.tengmoney.com/caizhi_web_manage/#/login")
                .then().statusCode(200);
    }
    @Test
    @DisplayName("TestCasesDemo2-testCase3")
    public void testCase3(){
        RestAssured.given()
                .get("https://test.tengmoney.com/caizhi_web_manage/#/login")
                .then().statusCode(200);
    }


}
