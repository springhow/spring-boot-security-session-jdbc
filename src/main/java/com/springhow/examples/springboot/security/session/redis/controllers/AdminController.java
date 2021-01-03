package com.springhow.examples.springboot.security.session.redis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!";
    }
}
