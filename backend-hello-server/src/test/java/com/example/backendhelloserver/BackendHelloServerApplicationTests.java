package com.example.backendhelloserver;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackendHelloServerApplicationTests {
    @Test
    public void TestingWorkOfServerHello() {
        Response response = RestAssured.get("http://localhost:8071/rest/hello/server");
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
