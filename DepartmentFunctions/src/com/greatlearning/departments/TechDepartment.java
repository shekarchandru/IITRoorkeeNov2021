package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment {
	
	// Method to Return the Department Name
	@Override
	public String departmentName()
	{
		return "Tech Department" ;
	}
	//Method to return info About Todays work
	@Override
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
	//Method to return info on WorkDeadline
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD  ";
	}
	
	//Method to Return Tech Stack info
	public String getTechStackInformation()
	{
		return "Core Java";
	}
	//Method to return about Holiday
	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}


}
