import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  trendingGames: any;
  populargames: any;
  playstoregames: any;
  rating:number=0;
  constructor(private http:HttpClient) { }
  ngOnInit():void {
    this.getTrendingGames();
    this.getPopularGames();
    this.getPlayStoreGames();
  }
  getTrendingGames():void {
    // Get the trending games
    this.http.get('http://localhost:60360/assets/data/trending-games.json')
    .subscribe((games) => {
    this.trendingGames = games;
    console.log(this.trendingGames);
    });
  }
  getPopularGames():void {
    // Get the popular games
    this.http.get('http://localhost:61124/assets/data/popular-games.json')
    .subscribe((games) => {
    this.populargames = games;
    console.log(this.populargames);
    });
  }
  getPlayStoreGames():void {
    // Get the play store games
    this.http.get('http://localhost:60360/assets/data/play-store-games.json')
    .subscribe((games) => {
    this.playstoregames = games;
    console.log(this.playstoregames);
    });
  }

}