package com.flp.ems.service;

import java.util.HashMap;
import java.util.Map;

public interface IEmployeeService<V> {
	void AddEmployee(HashMap employee);
	void ModifyEmployee(String name,String email,String kin_id);
	void RemoveEmployee(String name,String email,String kin_id);
	void SearchEmployee(String name,String email,String kin_id);
	void getAllEmployee();
	
}
