package com.flp.ems.service;

import java.util.Map;

public interface IEmployeeService<V> {
	void AddEmployee(Map<Integer,String> E);
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void getAllEmployee();
	void AddEmployee();

}
