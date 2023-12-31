package com.jatinkjunnu.Oauthresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public String[] getUser() {
        return new String[]{"Jatin", "Nikhil","Shivam"};
    }

    @GetMapping("/api/userid")
    public String hello(Principal principal) {
        return "Hello " +principal.getName()+", Welcome to PFMS!!";
    }

}
