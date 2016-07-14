package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {

	@Override
	public void AddEmployee(Employee emp) {
		
		List arr=new ArrayList();
		arr.add(0, emp.getName());
		arr.add(1, emp.getPhone_no());
		arr.add(2, emp.getAdd());
		
		arr.add(3, emp.getJ_date());
		arr.add(4, emp.getdateofbirth());
		System.out.println(arr);
		
		
	}

	@Override
	public void ModifyEmployee() {
		
		
	}

	@Override
	public void RemoveEmployee() {
		
		
	}

	@Override
	public void SearchEmployee() {
		
		
	}

	@Override
	public void getAllEmployee() {
		
		
	}

	@Override
	public void AddEmployee() {
		
		
	}

}
