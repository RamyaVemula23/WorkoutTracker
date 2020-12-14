package com.dxc.workout.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.workout.model.Category;
import com.dxc.workout.service.CategoryService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class CategoryResources {

	@Autowired
	CategoryService categoryService;
	@GetMapping("category/all")
	public List<Category> getAll(){
		return categoryService.getAllCategories();
	}
	
	@PostMapping("category/add")
	public String addCategory(@RequestBody Category category) {
		if(categoryService.addCategory(category)) {
			return "Added Successfully";
		}else {
			return "Id already exists";
		}
	}
	
	@GetMapping("category/find/{category}")
	public Category findCategory(@PathVariable("category") String categoryName) {
		return categoryService.findCategory(categoryName);
	}
	
	@GetMapping("category/find/id/{id}")
	public Category findCategoryById(@PathVariable("id") String id) {
		return categoryService.findId(id);
	}
	
	@DeleteMapping("category/delete/{id}")
	public String deleteCategoryById(@PathVariable("id") String id) {
		 if(categoryService.deleteById(id))
			 return "success";
		 else
			 return "failure";
	}
	
	@PutMapping("category/update")
	public String updateCategory(@RequestBody Category category) {
		if(categoryService.updateCategory(category)) {
			return "Updating Data";
		}else {
			return "Inserting New Entry";
		}
	}

	
}
