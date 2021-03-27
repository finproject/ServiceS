package com.example.backendclientserver;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackendClientServerApplicationTests {
    @Test
    public void TestingWorkOfServerClient() {
        Response response = RestAssured.get("http://localhost:8072/rest/hello/client/");
 Assertions.assertEquals(200, response.getStatusCode());
    }
}
