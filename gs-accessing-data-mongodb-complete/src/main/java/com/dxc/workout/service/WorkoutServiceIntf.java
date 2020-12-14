package com.dxc.workout.service;

import java.util.List;
import java.util.Optional;

import com.dxc.workout.model.Workout;

public interface WorkoutServiceIntf {
	
	public Workout addWorkout(Workout workout);
	public void deleteWorkout(String workoutTitle);
	public Workout updateWorkout(Workout workout);
	public List<Workout> getAllWorkouts();
	public Workout getWorkoutByName(String workoutName);
	public Optional<Workout> getWorkoutById(String id);
	public void deleteWorkoutById(String id);


}
