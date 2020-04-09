import { Component, OnInit, AfterViewInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewbook',
  templateUrl: './viewbook.component.html',
  styleUrls: ['./viewbook.component.css']
})
export class ViewbookComponent implements OnInit {

  arr : Book [] = [];
  sarr : Book [] = [];
  bname : string ="";
  book : Book = new Book();
  flag = false;
  constructor(private service : BookService,private route : Router)
  {
          this.arr = service.getAllBooks();
          this.sarr = this.arr.slice();
  }

  ngOnInit(): void {

  }
  update(book : Book)
  {
         this.book = book;
         this.flag = true;
  }
  updateBook()
  {
        this.arr = this.arr.filter(p => p.id!=this.book.id);
        this.arr.push(this.book);
        this.sarr = this.arr.slice();
        this.flag = false ;
  }
  search()
  {
   console.log(this.sarr.length);
   this.arr=this.sarr.filter(p => p.title.toUpperCase().startsWith(this.bname.toUpperCase()));
  }
  delete(index : number)
  {
    console.log(" Length = "+this.arr.length);
    if(confirm(' Want to Delete '))
    {
     this.arr.splice(index,1);
     this.sarr.splice(index,1);
    }
  }

}
