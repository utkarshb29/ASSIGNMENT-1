package com.capg.msc.myshoppingcart.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.msc.myshoppingcart.beans.Product;
import com.capg.msc.myshoppingcart.service.ProductService;

@RestController
@RequestMapping("/api")
public class MyRestController {
	
	@Autowired
	private ProductService service;
		
	@GetMapping("/home")
	public String homeRequest()
	{
		return " Welcome User! : My Shopping App1 " + LocalDateTime.now();
		
	}

	
	public MyRestController() {
		System.out.println("---> Inside the ProductRestController Constructor");
		
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {
		
		service.saveProduct(product);
		return product;
		
	}
	
	
	@GetMapping("/products")
	public List<Product> insertAllProduct(@RequestBody Product product) {
		
		
		return service.getAllProducts();
		
	}
	
}