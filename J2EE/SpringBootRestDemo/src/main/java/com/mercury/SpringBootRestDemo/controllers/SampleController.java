package com.mercury.SpringBootRestDemo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
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

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Cacheable("abc")
	@GetMapping("/foo/{x}/{y}")
	public int foo(@PathVariable("x") int x, @PathVariable("y") int y) {
		logger.debug("foo() received: {}, {}", x, y);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return  x + y;
	}

	@Cacheable("abc")
	@GetMapping("/bar/{x}/{y}")
	public int bar(@PathVariable("x") int x, @PathVariable("y") int y) {
		logger.info("foo() received: {}, {}", x, y);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return  x * y;
	}

	// http://localhost:8080/samples/Greg
	
	@GetMapping
	public List<Sample> getAll() {
		try {
			throw new Exception("getAll exception...");
		} catch (Exception e) {
			logger.error("got exception in getAll() " , e);
		}
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
