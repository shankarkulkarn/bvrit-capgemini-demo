import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-author',
  templateUrl: './author.component.html',
  styleUrls: ['./author.component.css']
})
export class AuthorComponent implements OnInit {

  authorName : string ="xyz";
  constructor(private route : ActivatedRoute) {

  this.route.params.subscribe( param =>
      this.authorName = param['aname']);

  }

  ngOnInit(): void {

  }

}
