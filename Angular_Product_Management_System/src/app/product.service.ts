import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http : HttpClient) { }

  getAppProduct()
  {
    return this.http.get<Product []>("http://localhost:9090/product");
  }

  createProduct(product : Product)
  {
  return this.http.post<Product>("http://localhost:9090/product",product)
  }

}
