import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CourseService } from '../services/course.service';

@Component({
  selector: 'app-course-add',
  templateUrl: './course-add.component.html',
  styleUrls: ['./course-add.component.css']
})
export class CourseAddComponent implements OnInit {
  addCourseForm!: FormGroup;

  constructor(private formBuild: FormBuilder, private	courseService: CourseService, private router:Router) { }

  ngOnInit(): void {
    this.addCourseForm = this.formBuild.group({
      id: [],
      courseName: [],
      authorName: [],
      duration: [],
      availability: [],
    })
  }

  saveCourse(){

    if(this.addCourseForm.value.courseName == '' ||
      this.addCourseForm.value.authorName == '' ||
      this.addCourseForm.value.duration == ''){
        window.alert("Some of the fields are empty");
        return
    }

    if(this.addCourseForm.value.duration < 5 || this.addCourseForm.value.duration > 50){
      window.alert("the duration should be between 5 and 500 hours");
      return
    }

    this.courseService.saveCourse(this.addCourseForm.value).subscribe((data)=>{
      window.alert("course saved");
    })
  }
  goToCoursesMenu(){
    this.router.navigate(['/course-menu']);
  }

}
