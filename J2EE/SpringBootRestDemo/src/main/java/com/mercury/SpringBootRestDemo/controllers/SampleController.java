package com.mercury.SpringBootRestDemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.SpringBootRestDemo.beans.Sample;

//@RestController = @Controller + @ResponseBody

@RestController
@RequestMapping("/samples")
public class SampleController {
	
	// http://localhost:8080/samples/Greg
	
	@GetMapping
	public List<Sample> getAll() {
		return null;
	}
	
	@GetMapping("/{name}")
	public Sample getById(@PathVariable("name") String name) {
		return null;
	}

	// http://localhost:8080/samples/age/23
	@GetMapping("/age/{age}")
	public List<Sample> getByAge(@PathVariable("age") int age) {
		return null;
	}

	@PostMapping
	public void save(@RequestBody Sample sample) {
		
	}
	
	@PutMapping
	public void update(@RequestBody Sample sample) {
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		
	}
}
