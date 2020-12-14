package com.dxc.workout.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Info {
	

	@JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
    private Date endDate;
	
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
     private Date startTime;
      
     @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
     private Date endTime;
     
     private float caloriesBurntPerDay;
     
     private boolean status;

	public Info(Date startDate, Date endDate, Date startTime, Date endTime, float caloriesBurntPerDay, boolean status) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.caloriesBurntPerDay = caloriesBurntPerDay;
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public float getCaloriesBurntPerDay() {
		return caloriesBurntPerDay;
	}

	public void setCaloriesBurntPerDay(float caloriesBurntPerDay) {
		this.caloriesBurntPerDay = caloriesBurntPerDay;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
     
 	

}
