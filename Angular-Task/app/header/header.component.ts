import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit {
  constructor(private router:Router, private auth:AuthService) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  gotoHome() {
    this.router.navigate(['home']);
  }
  logout(){
    this.router.navigate(['login']);
  }


}
