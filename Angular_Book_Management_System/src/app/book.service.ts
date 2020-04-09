import { Injectable } from '@angular/core';
import { Book } from './book';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  url = "assets/booklist.json";
  books :  Book [] = [];

  constructor(private http : HttpClient)
  {
    this.http.get<Book []>(this.url).subscribe( data => this.books=data);

  }

  getAllBooks()
  {

     return this.books;
  }

}
