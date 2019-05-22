package com.example.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController{

    @GetMapping("/hello")
    public Greet hello(){
        return new Greet("Bharath");
    }
}

class Greet {
    private String message = "Welcome to Spring Boot";
    private String name;

    public Greet(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Greet{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
