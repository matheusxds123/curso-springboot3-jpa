package com.matheusxavier.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusxavier.course.entities.Category;
import com.matheusxavier.course.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categotyService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categoryList = categotyService.findAll();
		return ResponseEntity.ok().body(categoryList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category category = categotyService.findById(id);
		return ResponseEntity.ok().body(category);
	}
	
}