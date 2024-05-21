package com.example.zachet_adminka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        String message = "Я живая!!!!!";
        return ResponseEntity.ok(message);
    }

}
