import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user.model';

@Injectable({
  providedIn: 'root'
})

export class UserService {
  baseUrl: string = "http://localhost:9099/user/";

  constructor(private httpClient: HttpClient) { }

  getUserByUsernameAndPass(username:string, password:string){
    return this.httpClient.get<User[]>(this.baseUrl+username+"/"+password)
  }

}
