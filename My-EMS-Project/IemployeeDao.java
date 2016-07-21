package com.flp.ems.dao;



import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	void AddEmployee(Employee emp);
	void ModifyEmployee(String name,String email,String kin_id);
	void RemoveEmployee(String name,String email,String kin_id);
	void SearchEmployee(String name,String email,String kin_id);
	void getAllEmployee();
	
}
