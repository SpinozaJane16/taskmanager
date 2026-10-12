package com.example.taskmanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")

    public String hello(){
        return "Hello, Spring Boot!";
    }

    @GetMapping("/status")
    public java.util.Map<String,Object> status(){
        return java.util.Map.of("service","taskmanager","status","UP");
    }
}
