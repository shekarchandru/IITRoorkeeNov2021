package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HumanResourcesDepartment;
import com.greatlearning.departments.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking AdminDept Functionalities
		System.out.println("---------------Admin Department Functionalities-----------------");
		AdminDepartment adminDept = new AdminDepartment();
		String deptName = adminDept.departmentName();
		System.out.println("Welcome to "+deptName);
		
		System.out.println("Todays Work "+adminDept.getTodaysWork());
		System.out.println("Deadline is "+adminDept.getWorkDeadline());
		System.out.println("Holiday Info "+adminDept.isTodayAHoliday());
		
		//Invoking HRDept Functionalities
		System.out.println("---------------HR Department Functionalities-----------------");
		HumanResourcesDepartment hrDept = new HumanResourcesDepartment();
		System.out.println("Welcome to "+hrDept.departmentName());
		System.out.println("Activity "+hrDept.doActivity());
		System.out.println("Todays Work "+hrDept.getTodaysWork());
		System.out.println("Deadline is "+hrDept.getWorkDeadline());
		System.out.println("HolidayInfo "+hrDept.isTodayAHoliday());
		
		
		//Invoking TechDept Functionalities
		System.out.println("---------------Tech Department Functionalities-----------------");
		TechDepartment techDept = new TechDepartment();
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(" Todays Work "+techDept.getTodaysWork());
		System.out.println("Deadline is "+techDept.getWorkDeadline());
		System.out.println("Technology Stack "+techDept.getTechStackInformation());
		System.out.println("Holiday Info "+techDept.isTodayAHoliday());
		
		
		
		

	}

}
