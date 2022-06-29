package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {



    @GetMapping("/message")
    public String getMessage(){
        System.out.println(".....");
        return "Welcome to docker";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}
