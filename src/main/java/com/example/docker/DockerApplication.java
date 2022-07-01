package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication extends SpringBootServletInitializer {
    @GetMapping("/message")
    public String getMessage(){
        System.out.println("....dddd.");
        return "Welcome to docker";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(DockerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }
}
