package com.lab.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @RestController
    static class InfoController {

        @GetMapping("/")
        public String home() {
            return "Lab GitOps - Spring Boot rodando no KIND!";
        }

        @GetMapping("/info")
        public String info() {
            return "versao=" + AppApplication.class.getPackage().getImplementationVersion();
        }
    }
}