package com.example.zachet_adminka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        String message = "Через час вы будете смеяться по-иному. А те из вас, кто останется в живых, позавидуют мертвым!";
        return ResponseEntity.ok(message);
    }

}
