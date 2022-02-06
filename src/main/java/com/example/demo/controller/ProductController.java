package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {


	@Autowired
	ProductService pService;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		
		return pService.getList();
		
	}
}
