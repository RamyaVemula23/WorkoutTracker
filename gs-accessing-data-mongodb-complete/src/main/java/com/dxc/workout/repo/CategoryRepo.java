package com.dxc.workout.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.workout.model.Category;

public interface CategoryRepo extends MongoRepository<Category,String> {
	
	public Category findBycategoryName(String categoryName);
	
	public Category findBy_id(String _id);
	
	//public boolean deleteBy_id(int _id);

}
