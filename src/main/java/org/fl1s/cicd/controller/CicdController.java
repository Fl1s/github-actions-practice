package org.fl1s.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {
    @GetMapping("/welcome")

//    echo "# github-actions-practice" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Fl1s/github-actions-practice.git
//    git push -u origin main
    public String welcome(){
        return "Welcome to Cicd!";
    }
}
