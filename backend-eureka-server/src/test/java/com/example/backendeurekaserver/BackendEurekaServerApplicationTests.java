package com.example.backendeurekaserver;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackendEurekaServerApplicationTests {
    @Test
    public void TestingWorkServerEureka() {
        Response response = RestAssured.get("http://localhost:8761/");
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
