package com.greatlearning.departments;

public class HumanResourcesDepartment extends SuperDepartment {

	
	/*
	 * Welcome to HR Department
team Lunch
Fill today’s timesheet and mark your attendance
Complete by EOD 
Today is not a Holiday

	 */
	// Method to Return the Department Name
			@Override
			public String departmentName()
			{
				return "Human Resources Department " ;
			}
			//Method to return info About Todays work
			@Override
			public String getTodaysWork()
			{
				return "Fill today’s timesheet and mark your attendance";
			}
			//Method to return info on WorkDeadline
			@Override
			public String getWorkDeadline()
			{
				return " Complete by EOD  ";
			}
			//Method to Return Activity info
			public String doActivity()
			{
				return "Team Lunch";
			}
			//Method to return about Holiday
			public String isTodayAHoliday()
			{
				return "Today is not a holiday";
			}

}
