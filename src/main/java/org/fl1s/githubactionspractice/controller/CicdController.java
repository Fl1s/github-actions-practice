package org.fl1s.githubactionspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Cicd!";
    }
}