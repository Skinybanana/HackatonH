import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { User } from '../model/user.model';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // UserForm?: FormGroup;
  users?: User[];
  
  constructor(private userService: UserService) { }

  ngOnInit(): void {
  
  }

  checkLogin(){
    const username =  document.getElementById('user') as HTMLInputElement
    const password =  document.getElementById('user') as HTMLInputElement
    if(username != null ){
      this.userService.getUserByUsernameAndPass(username.value, password.value).subscribe((data) =>{
        console.log(data);
        this.users = data;
        if (data == null){
          window.alert("Wrong username or password");
        } else{
          window.alert("logged in");
          
        }
      })
    } 

   
  }

}
