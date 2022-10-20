package com.example.coursedemo.service;

import com.example.coursedemo.entity.CourseEntity;
import com.example.coursedemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;


    @Override
    public List<CourseEntity> getCourseList() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity createCourse(CourseEntity courseEntity) {
        CourseEntity savedCourseEntity = courseRepository.save(courseEntity);
        return savedCourseEntity;
    }

    @Override
    public CourseEntity deleteCourse(Integer courseId) {
        CourseEntity deletedCourse = courseRepository.findByCourseId(courseId);
        courseRepository.delete(deletedCourse);
        return deletedCourse;
    }
}
