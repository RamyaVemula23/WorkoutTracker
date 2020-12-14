package com.dxc.workout.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.workout.model.Workout;

public interface WorkoutRepo extends MongoRepository<Workout,String>{
	
	public Workout findByWorkoutTitle(String workoutTitle);
	
	public void deleteByWorkoutTitle(String workoutTitle);

}
