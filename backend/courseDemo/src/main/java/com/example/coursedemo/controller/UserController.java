package com.example.coursedemo.controller;

import com.example.coursedemo.entity.UserEntity;
import com.example.coursedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

   @Autowired
    UserService userService;

    @GetMapping("user/{userEmail}/{userPass}")
    public UserEntity getUserByEmailAndPassword(@PathVariable(value="userEmail") String userEmail, @PathVariable(value="userPass") String userPass){
        UserEntity FoundUserEntity  = userService.getUserByEmailAndPassword(userEmail, userPass);
        return FoundUserEntity;
    }

}
