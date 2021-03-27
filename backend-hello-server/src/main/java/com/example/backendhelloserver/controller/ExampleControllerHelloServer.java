package com.example.backendhelloserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class ExampleControllerHelloServer {
    @GetMapping
    public String hello() {
        return "Hello World!!!";
    }
}
