package com.example.coursedemo.repository;

import com.example.coursedemo.entity.CourseEntity;
import com.example.coursedemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity findByUsernameAndUserPassword(String email, String password);

}
