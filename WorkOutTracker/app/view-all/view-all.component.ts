import { Component, OnInit } from '@angular/core';
import { WorkoutService } from '../workout.service';
import { Workout } from './Workout';

@Component({
  selector: 'app-view-all',
  templateUrl: './view-all.component.html',
  styleUrls: ['./view-all.component.css']
})
export class ViewAllComponent implements OnInit {

  constructor(private workoutService:WorkoutService) { 

    console.log("inside");
    this.search=false;
  }
  workouts : Workout[];
  optionalWorkouts:Workout[];
  search:boolean=false;
  text;
  ngOnInit() {
    
    this.workoutService.getAllWorkouts().subscribe((result)=>{
      this.workouts=result;
    });
  }
  
  deleteWorkout(workout:any){
    this.workoutService.deleteWorkout(workout).subscribe((result)=>{
      this.workoutService.getAllWorkouts().subscribe((result)=>{this.workouts=result});
    });
  }

  show(val1 : any,val2:any) {
    console.log(val1 +""+val2 );
    document.getElementById(val1).disabled=true;
    document.getElementById(val2).disabled=false;

    //document.getElementByName("val").disabled = true;
  }
  findByWorkout(){
    this.search=true;
    this.workoutService.getWorkoutByTitle(this.text).subscribe((result)=>{
      console.log(result);
      this.optionalWorkouts=[];
      this.optionalWorkouts.push(result);
    });
  }


}
