import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { Course } from '../model/course.model';


@Injectable({
  providedIn: 'root'
})
export class CourseService {
  baseUrl: string = "http://localhost:9099/courses";
  constructor(private httpClient: HttpClient) { }

  getAllCourses(){
    return this.httpClient.get<Course[]>(this.baseUrl)
  }

  saveCourse(course: Course){
    return this.httpClient.post<Course>(this.baseUrl+"/create",course)

  }

  deleteCourse( courseId:number){
    return this.httpClient.delete(this.baseUrl+"/delete/" + courseId)
  }
}
