import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Course } from '../model/course.model';
import { CourseService } from '../services/course.service';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {

  courses?: Course[];


  constructor(private courseService:CourseService, private router:Router) { }

  ngOnInit(): void {
    this.updateCourses()
  }
  deleteCourse(courseId: number){
    console.log(courseId)
    if (window.confirm("Do you really want to Delete the course")) {
      this.courseService.deleteCourse(courseId).subscribe((data) =>{
        window.alert("Course deleted")
        this.updateCourses()
      })
    }
    
  }

  updateCourses(){
    this.courseService.getAllCourses().subscribe( 
      (data) => {
        this.courses = data;
        console.log(this.courses)
    })
  }
  goToCoursesAdd(){
    this.router.navigate(['/course-menu']);
  }
  goToCoursesMenu(){
    this.router.navigate(['/course-menu']);
  }

}
