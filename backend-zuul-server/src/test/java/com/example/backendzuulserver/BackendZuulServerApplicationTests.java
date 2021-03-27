package com.example.backendzuulserver;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackendZuulServerApplicationTests {
    @Test
    public void TestingWorkOfServerZuul() {
        Response responseServerHello = RestAssured
                .get("http://localhost:8079/api/backend-hello-server/rest/hello/server/");
        Response responseServerClient = RestAssured
                .get("http://localhost:8079/api/backend-client-server/rest/hello/client/");
        Assertions.assertEquals(200, responseServerHello.getStatusCode());
        Assertions.assertEquals(200, responseServerClient.getStatusCode());

    }
}
