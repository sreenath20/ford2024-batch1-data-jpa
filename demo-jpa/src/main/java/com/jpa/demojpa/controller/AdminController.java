package com.jpa.demojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;
import com.jpa.demojpa.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("product")
	public Product addNewProduct(@RequestBody Product product) {
		return this.adminService.addProduct(product);
		
	}
	
	@GetMapping("products")
	public List<Product> getAllProducts() {
		return this.adminService.getAllProducts();
		
	}
	@GetMapping("customers")
	public List<Customer> getAllCustomers(){
		return this.adminService.getAllCustomers();
	}
	
}
