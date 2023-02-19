package com.example.test_aruze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestAruzeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAruzeApplication.class, args);
    }

    @GetMapping("/hello")
    public String message(){
        return "Hello Hungle";
    }
}
