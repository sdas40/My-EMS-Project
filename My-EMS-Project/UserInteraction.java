package com.flp.ems.view;


import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import com.flp.ems.dao.EmployeeDaoImplForList;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Project;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class UserInteraction {
	private String name;
	private String phone_no;
	private String add;
	private String j_date;
	private String dateofbirth;
	private String email_id;
	private String kin_id;
	private int emp_id=1000;
	private String proj;
	boolean flag;
	private String dept;
	Department Dept = new Department();
	Project pj = new Project();
	Scanner sc=new Scanner(System.in);
	private Map<Integer, Object> employee= new HashMap<>();
	EmployeeServiceImpl ES =new EmployeeServiceImpl();
	Validate v = new Validate ();
	
	
	
	public void AddEmployee(){
		emp_id++;
		do{
			System.out.println("enter the kin id of the employee:");
			 kin_id=sc.next();
			 flag= v.validateKinid(kin_id);
			 
			 if (flag){
				employee.put(6,kin_id);
			 }else{
					System.out.println("Error! Please enter the correct kin id......");
				}
				}while(flag==false);
		
		do{
		System.out.println("enter the name of the employee:");
		 name=sc.next();
		 flag= v.validateName(name);
		 
		 if (flag){
			employee.put(1,name);
		 }else{
				System.out.println("Error! Please enter the correct name......");
			}
			}while(flag==false);
		
		
		do{
		System.out.println("enter the phone no of the employee:");
		 phone_no=sc.next();
		 flag=v.validatephone(phone_no);
		 if (flag){
			 employee.put(2, phone_no);
		 }else{
			 System.out.println("Error! Please enter the correct phone number......");
		 }}while(flag==false);
		 
		 
		 
		 
		System.out.println("enter the address of the employee:");
		add=sc.next();
		
		
		do{
		System.out.println("enter the date of joining of the employee in dd/mm/yyyy format :");
		j_date=sc.next();
		flag =v.valid_Date(j_date);
		if (flag){
			employee.put(4, j_date);
		}else {
			System.out.println("Error! Please enter the correct joining date......");
		}
		}while(flag==false);
		
		
		
		do{
			System.out.println("enter the date of date of birth of the employee in dd/mm/yyyy:");
			dateofbirth=sc.next();
			flag =v.valid_Date(dateofbirth);
			if (flag){
				employee.put(5, dateofbirth);
			}else {
				System.out.println("Error! Please enter the correct date of birth......");
			}
			}while(flag==false);
		
		do{
			System.out.println("enter the email id of the employee:");
			email_id=sc.next();
			flag =v.validateEmail(email_id);
			if (flag){
				employee.put(7, email_id);
			}else {
				System.out.println("Error! Please enter the correct format of email id......");
			}
			}while(flag==false);
			/*System.out.println("choice of differnt department ");
			dept=Dept.getdepartment();
			System.out.println("choice of differnt Project");
			proj=pj.getproject();
	    */
		String empid=Integer.toString(emp_id);
		
		System.out.println("choice of differnt department ");
	    dept=Dept.getdepartment();
	    System.out.println("choice of differnt Project");
	    proj=pj.getproject();
	    
				  
	    
		
		
		employee.put(new Integer(1),name);
		employee.put(new Integer(2),phone_no);
		employee.put(new Integer(3),add);
		employee.put(new Integer(4),j_date);
		employee.put(new Integer(5),dateofbirth);
		employee.put(new Integer(6),kin_id);
		employee.put(new Integer(7),email_id);
		employee.put(new Integer(8),empid);
		employee.put(new Integer(9),dept);
	    employee.put(new Integer(10), proj);
		
		
		
		
		ES.AddEmployee((HashMap<Integer, Object>) employee);
		
		
	}
	public void ModifyEmployee(){
		String email;
		String name;
		String kin_id;
		while(true){
			System.out.println("0 for modify by email_id:");
			System.out.println("1 for modify by name:");
			System.out.println("2 for modify by Kin_Id:");
			System.out.println("3 for modify by name and email_id:");
			System.out.println("4 for modify by name and Kin_id:");
			System.out.println("5 for modify by Kin_id and email_id:");
			System.out.println("6 for modify by name ,email_id and Kin_id:");
			System.out.println("option 7 for Exit");
			int i=sc.nextInt();
			
			switch(i){
			case 0: 
				System.out.println("enter the email to be modified:");
				 email=sc.next();
				ES.ModifyEmployee(",", email,"");
			
				break;
			case 1:
				System.out.println("enter the name to be modified:");
				 name=sc.next();
				ES.ModifyEmployee(name,"*","");
				break;
			case 2:
				System.out.println("enter the Kin_Id to be modified:");
				kin_id=sc.next();
				ES.ModifyEmployee(",","*",kin_id);
				break;
			case 3:
				System.out.println("enter the name to be modified:");
				name=sc.next();
				System.out.println("enter the email to be modified:");
				email=sc.next();
				ES.ModifyEmployee(name,email,"");
				break;
			case 4:
				System.out.println("enter the name to be modified:");
				name=sc.next();
				System.out.println("enter the kin_id to be modified:");
				kin_id=sc.next();
				ES.ModifyEmployee(name,"",kin_id);
				break;
			case 5:
				System.out.println("enter the email to be modified:");
				email=sc.next();
				System.out.println("enter the kin_id to be modified:");
				kin_id=sc.next();
				ES.ModifyEmployee("",email,kin_id);
				break;
			case 6:
				System.out.println("enter the name to be modified");
				name=sc.next();
				System.out.println("enter the email to be modified:");
				email=sc.next();
				System.out.println("enter the kin_id to be modified:");
				kin_id=sc.next();
				ES.ModifyEmployee(name,email,kin_id);
				break;
			case 7 : return;
			
			}
		}
			
	}
	public void RemoveEmployee(){
		while(true){
			System.out.println("0 for removed by email_id:");
			System.out.println("1 for removed by name:");
			System.out.println("2 for removed by Kin_Id:");
			System.out.println("3 for removed by name and email_id:");
			System.out.println("4 for removed by name and Kin_id:");
			System.out.println("5 for removed by Kin_id and email_id:");
			System.out.println("6 for removed by name ,email_id and Kin_id:");
			System.out.println("option 7 for Exit");
			int i=sc.nextInt();
			
			switch(i){
			case 0: 
				System.out.println("enter the email to be removed:");
				String email=sc.next();
				ES.RemoveEmployee(",", email,"");
			
				break;
			case 1:
				System.out.println("enter the name to be removed:");
				String name=sc.next();
				ES.RemoveEmployee(name,"*","");
				break;
			case 2:
				System.out.println("enter the Kin_Id to be removed:");
				String kin_id=sc.next();
				ES.RemoveEmployee(",","*",kin_id);
				break;
			case 3:
				System.out.println("enter the name to be removed:");
				String name1=sc.next();
				System.out.println("enter the email to be removed:");
				String email1=sc.next();
				ES.RemoveEmployee(name1,email1,"");
				break;
			case 4:
				System.out.println("enter the name to be removed:");
				name=sc.next();
				System.out.println("enter the Kin_Id to be removed:");
				kin_id=sc.next();
				ES.RemoveEmployee(name,"",kin_id);
				break;
			case 5:
				System.out.println("enter the email to be removed:");
				email=sc.next();
				System.out.println("enter the Kin_Id to be removed:");
				kin_id=sc.next();
				ES.RemoveEmployee("",email,kin_id);
				break;
			case 6:
				System.out.println("enter the name to be removed:");
				name=sc.next();
				System.out.println("enter the email to be removed:");
				email=sc.next();
				System.out.println("enter the Kin_Id to be removed:");
				kin_id=sc.next();
				ES.RemoveEmployee(name,email,kin_id);
				break;
			case 7 : return;
			
			}
		}
		
		
		//ES.RemoveEmployee();
	
	}
	public void SearchEmployee(){
		while(true){
			System.out.println("0 for search by email_id:");
			System.out.println("1 for search by name:");
			System.out.println("2 for search by Kin_Id:");
			System.out.println("3 for search by name and email_id:");
			System.out.println("4 for search by name and Kin_id:");
			System.out.println("5 for search by Kin_id and email_id:");
			System.out.println("6 for search by name ,email_id and Kin_id:");
			System.out.println("option 7 for Exit");
			int i=sc.nextInt();
			
			switch(i){
			case 0: 
				System.out.println("enter the email to be searched:");
				String email=sc.next();
				ES.SearchEmployee("*",email,",");
			
				break;
			case 1:
				System.out.println("enter the name to be searched:");
				String name=sc.next();
				ES.SearchEmployee(name,"*",",");
				break;
			case 2:
				System.out.println("enter the Kin_Id to be searched:");
				String kin_id=sc.next();
				ES.SearchEmployee(",","*",kin_id);
				break;
				
			case 3:
				System.out.println("enter the name to be searched:");
				String name1=sc.next();
				System.out.println("enter the email to be searched:");
				String email1=sc.next();
				ES.SearchEmployee(name1,email1,"");
				break;
			case 4:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				ES.SearchEmployee(name,"",kin_id);
				break;
			case 5:
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				ES.SearchEmployee("",email,kin_id);
				break;
			case 6:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				ES.SearchEmployee(name,email,kin_id);
				break;
			case 7 : return;
			}
		
		}
		
	}
	public void getAllEmployee(){
		ES.getAllEmployee();
	}

}
