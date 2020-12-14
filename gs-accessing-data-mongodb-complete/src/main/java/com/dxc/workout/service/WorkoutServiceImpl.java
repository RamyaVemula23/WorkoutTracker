package com.dxc.workout.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.workout.model.Workout;
import com.dxc.workout.repo.WorkoutRepo;

@Service
public class WorkoutServiceImpl implements WorkoutServiceIntf{
	
	@Autowired
	WorkoutRepo workoutRepo;

	@Override
	public Workout addWorkout(Workout workout) {
		return workoutRepo.save(workout);
		
	}

	@Override
	public void deleteWorkout(String workoutTitle) {
		workoutRepo.deleteByWorkoutTitle(workoutTitle);
		
	}

	@Override
	public Workout updateWorkout(Workout workout) {
		return workoutRepo.save(workout);
		
	}

	@Override
	public List<Workout> getAllWorkouts() {
		return workoutRepo.findAll();
	}

	@Override
	public Workout getWorkoutByName(String workoutName) {
		return workoutRepo.findByWorkoutTitle(workoutName);
	}

	@Override
	public Optional<Workout>getWorkoutById(String id) {
		return workoutRepo.findById(id);
		
	}

	@Override
	public void deleteWorkoutById(String id) {
		 workoutRepo.deleteById(id);
		
	}
	

}
