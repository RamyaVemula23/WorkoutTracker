package com.dxc.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.workout.model.Category;
import com.dxc.workout.repo.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo categoryRepo;

	public List<Category> getAllCategories() {
		return categoryRepo.findAll();
	}

	public boolean addCategory(Category category) {
		if (findId(category.get_id()) != null) {
			return false;
		} else {
			categoryRepo.save(category);
			return true;
		}

	}

	public Category findCategory(String categoryName) {
		return categoryRepo.findBycategoryName(categoryName);
	}

	public Category findId(String _id) {
		return categoryRepo.findBy_id(_id);
	}

	public boolean deleteById(String id) {
		if (findId(id) != null) {
			categoryRepo.deleteById(id);
			return true;
		} else
			return false;

	}
	public boolean updateCategory(Category category) {
		
		if (findId(category.get_id()) != null) {
			categoryRepo.save(category);
			return true;
		} else {
			categoryRepo.save(category);
			return false;
		}
			
	}
	
	
}
