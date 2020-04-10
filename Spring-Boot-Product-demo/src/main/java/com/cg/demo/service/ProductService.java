package com.cg.demo.service;

import java.util.List;

import com.cg.demo.entity.Product;

public interface ProductService {

	public List<Product>  findAllProducts();
	public Product  createProduct(Product product);
}
