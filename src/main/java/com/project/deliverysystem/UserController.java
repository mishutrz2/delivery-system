package com.project.deliverysystem;

import com.project.deliverysystem.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

    @GetMapping(path = "/hello")
    public String someData(){
        return "hello";
    }

    @GetMapping
    public User getUser(){
        return new User(14, "Vlad");
    }
}
