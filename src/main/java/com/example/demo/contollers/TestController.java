package com.example.demo.contollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @GetMapping("/test")
    public String hello() {
        return "Hello from Heroku";
    }

    @GetMapping("/")
    public String qwe() {
        return "QWEqwe qwe qw";
    }
}
