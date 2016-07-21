package com.flp.ems.domain;


public class Employee {

	private String emp_id;
	private String j_date;
	private String dateofbirth;
	private String Phone_no;
	private String Name;
	private String Add;
	private String email_id;
	private String Kin_id;

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
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", j_date=" + j_date + ", dateofbirth=" + dateofbirth +", Kin id=" + Kin_id  +" Phone_no="
				+ Phone_no + ", Name=" + Name + ", Add=" + Add + ", email_id=" + email_id + "]";
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
	
	public void setKin_id(String kin_id) {
		this.Kin_id = kin_id;
	}
	
	public String getKin_id() {
		return Kin_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_id() {
		return emp_id;
	}
		
 


		
	}
	


