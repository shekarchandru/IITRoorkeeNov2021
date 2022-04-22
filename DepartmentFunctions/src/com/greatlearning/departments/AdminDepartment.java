package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment{
	
		// Method to Return the Department Name
		@Override
		public String departmentName()
		{
			return "Admin Department " ;
		}
		//Method to return info About Todays work
		@Override
		public String getTodaysWork()
		{
			return "Complete your documents Submission";
		}
		//Method to return info on WorkDeadline
		@Override
		public String getWorkDeadline()
		{
			return " Complete by EOD  ";
		}
		//Method to return about Holiday
		public String isTodayAHoliday()
		{
			return "Today is not a holiday";
		}


}
