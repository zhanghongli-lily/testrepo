package com.tmoney.cases;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCasesDemo1 {
    @Test
    @DisplayName("TestCasesDemo1-testCase1")
    public void testCase1(){
        RestAssured.given()
                .get("https://test.tengmoney.com/caizhi_web_manage/#/login")
                .then().statusCode(200);
    }
    @Test
    @DisplayName("TestCasesDemo1-testCase2")
    public void testCase2(){
        RestAssured.given()
                .get("https://test.tengmoney.com/caizhi_web_manage/#/login")
                .then().statusCode(200);
    }
}


