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
	boolean flag;
	//private String s="no";
	Scanner sc=new Scanner(System.in);
	Validate v = new Validate ();
	
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
			
			
			modify();
		}
		else if(emply.getName().equals(name)) {
			modify();
			
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){

			modify();
		}
		else if(emply.getKin_id().equals(kin_id)){

			modify();
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			
			modify();

		}
		else if(emply.getKin_id().equals(kin_id) && emply.getEmail_id().equals(email)){
			
			modify();
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name)){
			
			modify();
		}
		else if(emply.getKin_id().equals(kin_id) && emply.getName().equals(name) && emply.getEmail_id().equals(email)){

			modify();
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
	public void modify(){
		do{
			System.out.println("enter the name of the employee to be modify:");
			 String name1=sc.next();
			 flag= v.validateName(name1);
			 
			 if (flag){
				 emply.setName(name1);
			 }else{
					System.out.println("Error! Please enter the correct kin id......");
				}
				}while(flag==false);
		
		System.out.println("Enter the Kin Id:");
		String kin_id=sc.next();
		do{
			
			
			 flag= v.validateKinid(kin_id);
			 
			 if (flag){
				emply.setKin_id(kin_id);
			 }else{
					System.out.println("Error! Please enter the correct kin id......");
				}
				}while(flag==false);
		
		System.out.println("enter the phone no of the employee to be modify:");
		String phone_no=sc.next();
		do{
			
			 flag=v.validatephone(phone_no);
			 if (flag){
				 emply.setPhone_no(phone_no);
			 }else{
				 System.out.println("Error! Please enter the correct phone number......");
			 }}while(flag==false);
		
		System.out.println("enter the address of the employee to be modify:");
		String address=sc.next();
		emply.setAdd(address);
		System.out.println("enter the date of joining of the employee to be modify:");
		String j_date=sc.next();
		do{
			
			flag =v.valid_Date(j_date);
			if (flag){
				emply.setJ_date(j_date);
			}else {
				System.out.println("Error! Please enter the correct joining date......");
			}
			}while(flag==false);
		
		
		System.out.println("enter the date of birth of the employee to be modify:");
		String dateofbirth=sc.next();
		do{
			
			flag =v.valid_Date(dateofbirth);
			if (flag){
				emply.setdateofbirth(dateofbirth);
			}else {
				System.out.println("Error! Please enter the correct date of birth......");
			}
			}while(flag==false);
		
		System.out.println("enter the email_id of the employee to be modify:");
		String email_id=sc.next();
		do{
			
			flag =v.validateEmail(email_id);
			if (flag){
				emply.setEmail_id(email_id);
			}else {
				System.out.println("Error! Please enter the correct format of email id......");
			}
			}while(flag==false);
		
		System.out.println(arr);
	}
	
	

}
