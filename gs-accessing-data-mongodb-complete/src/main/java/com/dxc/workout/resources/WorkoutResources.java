package com.dxc.workout.resources;

import java.util.List;
import java.util.Optional;

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

import com.dxc.workout.model.Workout;
import com.dxc.workout.service.WorkoutServiceIntf;

@RestController
@RequestMapping("/api/v1/workout")
@CrossOrigin
public class WorkoutResources {
	
	@Autowired
	WorkoutServiceIntf workoutService;
	
	@GetMapping("/all")
	public List<Workout> getAllWorkouts() {
		return workoutService.getAllWorkouts();
	}
	
	@PostMapping("/add")
	public Workout addWorkout(@RequestBody Workout workout) {
		return workoutService.addWorkout(workout);
	}
	
	@PutMapping("/update")
	public Workout updateWorkout(@RequestBody Workout workout) {
		return workoutService.updateWorkout(workout);
	}
	
	@DeleteMapping("/delete/{name}")
	public void deleteWorkoutByName(@PathVariable("name") String name) {
		 workoutService.deleteWorkout(name);
	}
	
	@GetMapping("/find/{name}")
	public Workout findWorkoutByName(@PathVariable("name") String name) {
		return workoutService.getWorkoutByName(name);
	}
	
	@GetMapping("/id/{id}")
	public Optional<Workout> findWorkoutById(@PathVariable("id") String id) {
		return workoutService.getWorkoutById(id);
	}
	
	@DeleteMapping("/delete/id/{id}")
	public void deleteWorkoutById(@PathVariable("id") String id) {
		 workoutService.deleteWorkoutById(id);
	}



	
	

}