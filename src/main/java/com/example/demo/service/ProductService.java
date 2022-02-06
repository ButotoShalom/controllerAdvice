package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.exceptions.NoDataFoundException;
import com.example.demo.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	private static List<Product> list = new ArrayList<>();
	
	static {
		list.add(new Product(1, "iPhone", 100.00));
		list.add(new Product(2, "computer", 200.00));
		list.add(new Product(3, "car", 300.00));
		list.add(new Product(5, "house", 400.00));
		list.add(new Product(6, "book", 600.00));
	}
	
	public List<Product> getList(){
		if (list.isEmpty()) {
			throw new NoDataFoundException("Products data is not available");

		}
		return list;
	}
	
	public Product getProduct(Integer id) {
		Optional<Product> theProduct = list.stream().filter(p -> p.getId() == id).findFirst();
		if (!theProduct.isPresent()) {
			throw new ResourceNotFoundException ("product is not found for the id ->" + id);
		}
		return theProduct.get();
	}
}
