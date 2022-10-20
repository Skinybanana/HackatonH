package com.example.coursedemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "COURSE")
public class CourseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "COURSE_ID")
    private Integer courseId;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "AUTHOR_NAME")
    private String authorName;

    @Column(name = "DURATION")
    private String duration;

    @Column(name = "AVAILABILITY")
    private String availability;

    public CourseEntity(){

    }

    public CourseEntity(Integer courseId, String courseName, String authorName, String duration, String availability) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.duration = duration;
        this.availability = availability;
    }

    public CourseEntity(Integer courseId, String courseName, String authorName, String duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.duration = duration;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
