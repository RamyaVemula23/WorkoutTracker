package com.dxc.workout.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Workout {
	
	@Id
	private String id;
	
	private String workoutTitle;
	
	private String workoutNote;
	
	private float caloriesBurntPerMin;
	
	private List<Category> categories;
	
	private List<Info> info;

	public Workout(String id, String workoutTitle, String workoutNote, float caloriesBurntPerMin,
			List<Category> categories, List<Info> info) {
		super();
		this.id = id;
		this.workoutTitle = workoutTitle;
		this.workoutNote = workoutNote;
		this.caloriesBurntPerMin = caloriesBurntPerMin;
		this.categories = categories;
		this.info = info;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWorkoutTitle() {
		return workoutTitle;
	}

	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}

	public String getWorkoutNote() {
		return workoutNote;
	}

	public void setWorkoutNote(String workoutNote) {
		this.workoutNote = workoutNote;
	}

	public float getCaloriesBurntPerMin() {
		return caloriesBurntPerMin;
	}

	public void setCaloriesBurntPerMin(float caloriesBurntPerMin) {
		this.caloriesBurntPerMin = caloriesBurntPerMin;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Info> getInfo() {
		return info;
	}

	public void setInfo(List<Info> info) {
		this.info = info;
	}
	
	

	
	
}
