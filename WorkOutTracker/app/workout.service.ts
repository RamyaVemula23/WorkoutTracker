import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 
    'Access-Control-Allow-Origin':'*',
  })
};
@Injectable({
  providedIn: 'root'
})

export class WorkoutService {

  constructor(private http:HttpClient) { }
  api="http://localhost:8095/api/v1/workout";

  getAllWorkouts():Observable<any>{
    return this.http.get(this.api+"/all");
  }

  addWorkout(workout : any):Observable<any>{
    let result:Observable<Object>;
    result = this.http.post(this.api+"/add",workout);
    return result;
  }
  updateWorkout(workout : any):Observable<any>{
    let result:Observable<Object>;
    result = this.http.put(this.api+"/update",workout);
    return result;
  }


  getWorkoutByTitle(title:any):Observable<any>{
    return this.http.get(this.api+"/find/"+title);
  }

  getWorkoutById(id:any):Observable<any>{
    return this.http.get(this.api+"/id/"+id);
  }
  deleteWorkout(id:any):Observable<any>{
    return this.http.delete(this.api+"/delete/id/"+id);
  }



}
