package com.example.coursedemo.service;

import com.example.coursedemo.entity.UserEntity;
import com.example.coursedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserEntity getUserByEmailAndPassword(String email, String password) {
        UserEntity foundUserEntitity = userRepository.findByUsernameAndUserPassword(email, password);
        return foundUserEntitity;
    }
}
