// // app.module.ts
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';
// import { AppComponent } from '../../app.component';
// import { FeatureModule } from '../feature.module'; // Import the module where StarRatingComponent is declared

// @NgModule({
//   declarations: [
//     AppComponent,
//     // Remove StarRatingComponent if it is declared here
//   ],
//   imports: [
//     BrowserModule,
//     FeatureModule // Import the module where StarRatingComponent is declared
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-star-rating',
  templateUrl: './star-rating.component.html',
  styleUrls: ['./star-rating.component.css']
})
export class StarRatingComponent implements OnInit {
  @Input() rating: any;
  @Input() isReadOnly:boolean=false;
  constructor() { }
  ngOnInit(): void { }
} // ✅ Make sure this class name matches
