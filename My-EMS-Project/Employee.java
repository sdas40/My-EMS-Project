package com.flp.ems.domain;


public class Employee {

	private int emp_id=0;
	private String j_date;
	private String dateofbirth;
	private String Phone_no;
	private String Name;
	private String Add;
	private String email_id;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
		
	}
	public String getPhone_no() {
		return Phone_no;
	}
	
	public void setPhone_no(String l) {
		Phone_no = l;
	}
	
	public void setAdd(String add) {
		Add = add;
	}
	
	public String getAdd() {
		return Add;
	}
	public void setJ_date(String j_date) {
		this.j_date = j_date;
	}
	
	public String getJ_date() {
		return j_date;
	}
	public void setdateofbirth(String j_dateofbirth) {
		this.dateofbirth = j_dateofbirth;
	}

	public String getdateofbirth() {
		return dateofbirth;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	public String getEmail_id() {
		return email_id;
	}
	
		
 


		
	}
	


