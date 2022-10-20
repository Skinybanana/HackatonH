package com.example.coursedemo.service;

import com.example.coursedemo.entity.CourseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    public List<CourseEntity> getCourseList();
    public CourseEntity createCourse(CourseEntity courseEntity);

    public CourseEntity deleteCourse(Integer courseId);




}
