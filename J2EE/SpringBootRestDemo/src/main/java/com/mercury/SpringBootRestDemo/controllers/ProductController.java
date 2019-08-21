package com.mercury.SpringBootRestDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.SpringBootRestDemo.beans.Product;
import com.mercury.SpringBootRestDemo.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public List<Product> getAll() {
		return productService.getAll();
	}
	
//	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/name/{name}")
	public Product getProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}
	
	@GetMapping("/price/{price}")
	public Product getProductByPrice(@PathVariable Integer price) {
		return productService.getProductByPrice(price);
	}
	
	@PostMapping
	public void save(@RequestBody Product product) {
		productService.save(product);
	}
	
	@GetMapping("/pdf")
	public ResponseEntity<InputStreamResource> getProductsInPDF() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=products.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(productService.getProductsInPDF()));
	}
}