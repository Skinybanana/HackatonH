package com.example.coursedemo.service;

import com.example.coursedemo.entity.UserEntity;

public interface UserService {
    public UserEntity getUserByEmailAndPassword(String email, String password);

}
