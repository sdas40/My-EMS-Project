package com.flp.ems.dao;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Employee;
import com.flp.ems.util.Validate;

public class EmployeeDaoImplForList implements IemployeeDao {
	List<Employee> arr=new ArrayList<Employee>();
	Employee emply;
	//private String s="no";
	Scanner sc=new Scanner(System.in);
	@Override
	public void AddEmployee(Employee emp) {
		emply=emp;
		arr.add(emply);
		System.out.println(arr);
		
			
		}

	@Override
	public void getAllEmployee() {
		for(Object list: arr)
		{
			System.out.println(list);
		}
		
	}

	@Override
	public void ModifyEmployee(String name, String email, String kin_id) {
		for(Employee emply:arr)
		{		
	
		
		if(emply.getEmail_id().equals(email)){
			
			System.out.println("enter the name of the employee to be modify:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee to be modify:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee to be modify:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee to be modify:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee to be modify:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee to be modify:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);
		}
		else if(emply.getName().equals(name)) {
			
			System.out.println("enter the name of the employee to be modify:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee to be modify:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee to be modify:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee to be modify:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee to be modify:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee to be modify:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			System.out.println("enter the name of the employee to be modify:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee to be modify:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee to be modify:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee to be modify:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee to be modify:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee to be modify:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);

		}
		else if(emply.getKin_id().equals(kin_id)){
			System.out.println("enter the name of the employee to be modify:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee to be modify:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee to be modify:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee to be modify:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee to be modify:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee to be modify:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			
			System.out.println("enter the name of the employee to be modify:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee to be modify:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee to be modify:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee to be modify:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee to be modify:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee to be modified:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);

		}
		else if(emply.getKin_id().equals(kin_id) && emply.getEmail_id().equals(email)){
			
			System.out.println("enter the name of the employee employee to be modified:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee employee to be modified:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee employee to be modified:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee employee to be modified:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee employee to be modified:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee employee to be modified:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name)){
			
			System.out.println("enter the name of the employee employee to be modified:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee employee to be modified:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee employee to be modified:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee employee to be modified:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee employee to be modified:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee employee to be modified:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			System.out.println("enter the name of the employee employee to be modified:");
			String name1=sc.next();
			emply.setName(name1);
			System.out.println("enter the phone no of the employee employee to be modified:");
			String phone_no=sc.next();
			emply.setName(phone_no);
			System.out.println("enter the address of the employee employee to be modified:");
			String address=sc.next();
			emply.setName(address);
			System.out.println("enter the date of joining of the employee employee to be modified:");
			String j_date=sc.next();
			emply.setName(j_date);
			
			System.out.println("enter the date of birth of the employee employee to be modified:");
			String dateofbirth=sc.next();
			emply.setName(dateofbirth);
			System.out.println("enter the email_id of the employee employee to be modified:");
			String email_id=sc.next();
			emply.setName(email_id);
			System.out.println(arr);
		}
		else{
			System.out.println("employee not found");
		}
		
		}
		
	}


	@Override
	public void RemoveEmployee(String name, String email, String kin_id) {
		for(Employee emply:arr)
		{		
	
		
		if(emply.getEmail_id().equals(email)){
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);
		}
		else if(emply.getName().equals(name)) {
			
			
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);
		}
		else if(emply.getKin_id().equals(kin_id)){
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);

		}
		else if(emply.getKin_id().equals(kin_id) && emply.getEmail_id().equals(email)){
			
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name)){
			
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			
			arr.remove(emply);
			System.out.println("employee removed Successfully ");
			System.out.println(arr);
		}
		else{
			System.out.println("employee not found");
		}
		
		}
		
	}

	@Override
	public void SearchEmployee(String name, String email, String kin_id) {
		for(Employee emply:arr)
		{		
	
		
		if(emply.getEmail_id().equals(email)){
			System.out.println("email  found");
			System.out.println(emply.toString());
		}
		else if(emply.getName().equals(name)) {
			
			System.out.println("name  found");
			System.out.println(emply.toString());
		}
		else if(emply.getKin_id().equals(kin_id)){
			System.out.println("Kind_Id  found");
			System.out.println(emply.toString());
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			System.out.println("name and email found");
			System.out.println(emply.toString());

		}
		else if(emply.getKin_id().equals(kin_id) && emply.getEmail_id().equals(email)){
			System.out.println("employee  found");
			System.out.println(emply.toString());
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name)){
			System.out.println("employee found");
			System.out.println(emply.toString());
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			System.out.println("employee  found");
			System.out.println(emply.toString());
		}
		else{
			System.out.println("employee not found");
		}
		
	}


	}
	

}
