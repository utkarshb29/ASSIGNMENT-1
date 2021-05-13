package com.capg.msc.myshoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.msc.myshoppingcart.beans.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	/*
	 * findAll
	 * save
	 * update
	 * read
	 * delete
	 * all added automatically
	 * */

}