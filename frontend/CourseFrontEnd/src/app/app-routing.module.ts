import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from "@angular/router";
import { LoginComponent } from './login/login.component';
import { CourseListComponent } from './course-list/course-list.component';
import { CourseMenuComponent } from './course-menu/course-menu.component';
import { CourseAddComponent } from './course-add/course-add.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'course-list', component:CourseListComponent},
  {path:'course-menu', component:CourseMenuComponent},
  {path:'course-add', component:CourseAddComponent}
]

@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { }
