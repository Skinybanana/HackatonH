package com.example.coursedemo.controller;

import com.example.coursedemo.entity.CourseEntity;
import com.example.coursedemo.entity.UserEntity;
import com.example.coursedemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<CourseEntity> getCourseList() {
        List<CourseEntity> employeeEntityList = courseService.getCourseList();
        return employeeEntityList;
    }

    @PostMapping("/courses/create")
    public CourseEntity createCourse(@RequestBody CourseEntity courseEntity){
        CourseEntity saveCourseEntity = courseService.createCourse(courseEntity);
        return saveCourseEntity;
    }
    @DeleteMapping("courses/delete/{courseId}")
    public CourseEntity deleteCourseById(@PathVariable(value="courseId") Integer courseId){
        CourseEntity FoundCourseEntity  = courseService.deleteCourse(courseId);
        return FoundCourseEntity;
    }




}
