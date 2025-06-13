package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    //prueba233
    @GetMapping("/")
    public String index() {
        StringBuilder sb = new StringBuilder();
        sb.append("Las Url de los endpoints son: ");
        sb.append("http://localhost:8080/hello -- ");
        sb.append("http://localhost:8080/hello2 --  ");
        sb.append("http://localhost:8080/hello3");

        return sb.toString();
    }
    

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World1!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello, World2!";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "Hello, World3!";
    }
}
