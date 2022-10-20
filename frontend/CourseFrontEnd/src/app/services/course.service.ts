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
}
