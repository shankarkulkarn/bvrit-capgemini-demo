import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  book : Book = new Book();
  arr :  Book [] = [];
  constructor(private service : BookService,private route : Router) {
    this.arr = service.getAllBooks();
  }

  ngOnInit(): void {

  }

  add()
  {
    this.arr.push(this.book);
    alert(' Book Added ');
    this.route.navigate(['/','view']);
  }
}
