package com.example.coursedemo.repository;

import com.example.coursedemo.entity.CourseEntity;
import com.example.coursedemo.service.CourseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {

    CourseEntity findByCourseId(Integer courseId);

}
