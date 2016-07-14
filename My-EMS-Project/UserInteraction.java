package com.flp.ems.view;


import java.util.HashMap;
import com.flp.ems.service.EmployeeServiceImpl;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

public class UserInteraction {
	
	
	Scanner sc=new Scanner(System.in);
	private Map<Integer, String> employee= new HashMap<>();
	
	
	
	
	public void AddEmployee(){
		
		employee.put(new Integer(1),"sunil Das");
		employee.put(new Integer(2),"9876543210");
		employee.put(new Integer(3),"L-301 deviindrani");
		employee.put(new Integer(4),"24/4/2014");
		employee.put(new Integer(5),"4/3/1994");
		
		/*System.out.println(" Employee detail  is : ");
		
		
		
		/*for( Entry<Integer, String> e: employee.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}*/
		
		
		EmployeeServiceImpl ES =new EmployeeServiceImpl();
		ES.AddEmployee(employee);
		
	}
	public void ModifyEmployee(){
			
			
	}
	public void RemoveEmployee(){
		
		
	}
	public void SearchEmployee(){
		
	}
	public void getAllEmployee(){
		
	}

}
