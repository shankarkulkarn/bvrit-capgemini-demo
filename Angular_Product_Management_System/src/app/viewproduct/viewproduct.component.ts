import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent implements OnInit {

  arr : Observable<Product[]> ;

  constructor(private service : ProductService) { }

  ngOnInit(): void {
    this.getAllProduct();
  }

  getAllProduct()
  {
    this.arr=this.service.getAppProduct();
  }
}
