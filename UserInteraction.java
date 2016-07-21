package com.flp.ems.view;


import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import java.util.Scanner;
//import com.flp.ems.dao.EmployeeDaoImplForList;

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
	Scanner sc=new Scanner(System.in);
	private Map<Integer, String> employee= new HashMap<>();
	EmployeeServiceImpl ES =new EmployeeServiceImpl();
	
	
	
	public void AddEmployee(){
		emp_id++;
		int r =(int) (Math.random() * 100000);
		
		
		System.out.println("enter the name of the employee:");
		 name=sc.next();
		 Validate.isvalidname(name);
		System.out.println("enter the phone no of the employee:");
		 phone_no=sc.next();
		System.out.println("enter the address of the employee:");
		add=sc.next();
		System.out.println("enter the date of joining of the employee:");
		j_date=sc.next();
		Validate.validate(j_date);
		System.out.println("enter the date of birth of the employee:");
		dateofbirth=sc.next();
		Validate.validate(dateofbirth);
		System.out.println("enter the email_id of the employee:");
		email_id=sc.next();
		Validate.isvalidEmail(email_id);
		//System.out.println("enter the Kin Id  of the employee:");
//		String kin_id=sc.nextInt();
		
		String empid=Integer.toString(emp_id);
		kin_id=Integer.toString(r);
		//System.out.println(kin_id);
		
		
		employee.put(new Integer(1),name);
		employee.put(new Integer(2),phone_no);
		employee.put(new Integer(3),add);
		employee.put(new Integer(4),j_date);
		employee.put(new Integer(5),dateofbirth);
		employee.put(new Integer(6),kin_id);
		employee.put(new Integer(7),email_id);
		employee.put(new Integer(8),empid);
		/*System.out.println(" Employee detail  is : ");
		/*for( Entry<Integer, String> e: employee.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}*/
		/*employee.put(new Integer(1),"sunil ");
		employee.put(new Integer(2),"98765433310");
		employee.put(new Integer(3),"L-301 deviindrani");
		employee.put(new Integer(4),"24/4/2014");
		employee.put(new Integer(5),"4/3/1994");*/
		
		
		ES.AddEmployee((HashMap<Integer, String>) employee);
		
		
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
				System.out.println("enter the email to be removed:");
				 email=sc.next();
				ES.ModifyEmployee(",", email,"");
			
				break;
			case 1:
				System.out.println("enter the name to be removed:");
				 name=sc.next();
				ES.ModifyEmployee(name,"*","");
				break;
			case 2:
				System.out.println("enter the Kin_Id to be searched:");
				kin_id=sc.next();
				ES.ModifyEmployee(",","*",kin_id);
				break;
			case 3:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the email to be searched:");
				email=sc.next();
				ES.ModifyEmployee(name,email,"");
				break;
			case 4:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the kin_id to be searched:");
				kin_id=sc.next();
				ES.ModifyEmployee(name,"",kin_id);
				break;
			case 5:
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the kin_id to be searched:");
				kin_id=sc.next();
				ES.ModifyEmployee("",email,kin_id);
				break;
			case 6:
				System.out.println("enter the name to be searched:");
				name=sc.next();
				System.out.println("enter the email to be searched:");
				email=sc.next();
				System.out.println("enter the kin_id to be searched:");
				kin_id=sc.next();
				ES.ModifyEmployee(name,email,kin_id);
				break;
			case 7 : System.exit(0);
			
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
			case 7 : System.exit(0);
			
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
			case 7 : System.exit(0);
			}
		
		}
		
	}
	public void getAllEmployee(){
		ES.getAllEmployee();
	}

}
