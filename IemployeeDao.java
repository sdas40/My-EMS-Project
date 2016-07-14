package com.flp.ems.dao;



import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	void AddEmployee(Employee emp);
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void getAllEmployee();
	void AddEmployee();
}
