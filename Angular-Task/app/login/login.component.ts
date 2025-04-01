import { Component, OnInit } from '@angular/core';
import { AuthService } from '../services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {
  username: string = "";
  password: string = "";
  errormsg: string = "";
  
  constructor(private auth:AuthService,private router:Router) { }
  ngOnInit(): void {
    // throw new Error('Method not implemented.');
  }
  login() {
    if(this.username.trim().length===0){
      this.errormsg="Username is required";
    }
    else if(this.password.trim().length===0){
      this.errormsg="Password is required";}
     else {
      this.errormsg="";
      let res=this.auth.login(this.username,this.password);
      if(res===200){
        this.router.navigate(['home']);
      }
      else{
        this.errormsg="Invalid Credentials";
      }
    }
  }
}
