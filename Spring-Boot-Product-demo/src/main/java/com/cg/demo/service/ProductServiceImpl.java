package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.dao.ProductDao;
import com.cg.demo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private  ProductDao  productDao;
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public Product createProduct(Product product) {
		
		return productDao.saveAndFlush(product);
	}

}
