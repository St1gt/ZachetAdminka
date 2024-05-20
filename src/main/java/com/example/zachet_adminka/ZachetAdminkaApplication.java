package com.example.zachet_adminka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ZachetAdminkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZachetAdminkaApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "I'm a live!";
    }

}
