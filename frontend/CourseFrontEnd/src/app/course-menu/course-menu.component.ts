import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-course-menu',
  templateUrl: './course-menu.component.html',
  styleUrls: ['./course-menu.component.css']
})
export class CourseMenuComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  goToCoursesList(){
    this.router.navigate(['/course-list']);
  }

  goToCoursesAdd(){
    this.router.navigate(['/course-add']);
  }

}
