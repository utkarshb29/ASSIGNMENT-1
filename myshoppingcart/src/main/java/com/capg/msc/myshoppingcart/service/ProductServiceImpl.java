package com.capg.msc.myshoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.msc.myshoppingcart.beans.Product;
import com.capg.msc.myshoppingcart.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO repo;

	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}
	
	
	
	@Override
	@Transactional
	public Product saveProduct(Product p) {
		
		repo.save(p);
		return null;
		
		
	}

}